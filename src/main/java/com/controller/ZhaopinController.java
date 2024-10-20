
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 招聘
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhaopin")
public class ZhaopinController {
    private static final Logger logger = LoggerFactory.getLogger(ZhaopinController.class);

    private static final String TABLE_NAME = "zhaopin";

    @Autowired
    private ZhaopinService zhaopinService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private JixiaoService jixiaoService;//绩效
    @Autowired
    private PeixunService peixunService;//培训
    @Autowired
    private RenshidiaodongService renshidiaodongService;//人事调动
    @Autowired
    private XinziService xinziService;//薪资
    @Autowired
    private YuangongService yuangongService;//员工
    @Autowired
    private YuangongKaoqinService yuangongKaoqinService;//员工考勤
    @Autowired
    private YuangongKaoqinListService yuangongKaoqinListService;//员工考勤详情
    @Autowired
    private YuangongqingjiaService yuangongqingjiaService;//员工请假
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = zhaopinService.queryPage(params);

        //字典表数据转换
        List<ZhaopinView> list =(List<ZhaopinView>)page.getList();
        for(ZhaopinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhaopinEntity zhaopin = zhaopinService.selectById(id);
        if(zhaopin !=null){
            //entity转view
            ZhaopinView view = new ZhaopinView();
            BeanUtils.copyProperties( zhaopin , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaopinEntity zhaopin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhaopin:{}",this.getClass().getName(),zhaopin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhaopinEntity> queryWrapper = new EntityWrapper<ZhaopinEntity>()
            .eq("zhaopin_name", zhaopin.getZhaopinName())
            .eq("zhaopin_address", zhaopin.getZhaopinAddress())
            .eq("zhaopin_types", zhaopin.getZhaopinTypes())
            .eq("zhaopin_number", zhaopin.getZhaopinNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhaopinEntity zhaopinEntity = zhaopinService.selectOne(queryWrapper);
        if(zhaopinEntity==null){
            zhaopin.setInsertTime(new Date());
            zhaopin.setCreateTime(new Date());
            zhaopinService.insert(zhaopin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhaopinEntity zhaopin, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zhaopin:{}",this.getClass().getName(),zhaopin.toString());
        ZhaopinEntity oldZhaopinEntity = zhaopinService.selectById(zhaopin.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(zhaopin.getZhaopinFile()) || "null".equals(zhaopin.getZhaopinFile())){
                zhaopin.setZhaopinFile(null);
        }

            zhaopinService.updateById(zhaopin);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZhaopinEntity> oldZhaopinList =zhaopinService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        zhaopinService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yuangongId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<ZhaopinEntity> zhaopinList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ZhaopinEntity zhaopinEntity = new ZhaopinEntity();
//                            zhaopinEntity.setZhaopinUuidNumber(data.get(0));                    //招聘编号 要改的
//                            zhaopinEntity.setZhaopinName(data.get(0));                    //招聘标题 要改的
//                            zhaopinEntity.setZhaopinAddress(data.get(0));                    //招聘地点 要改的
//                            zhaopinEntity.setZhaopinFile(data.get(0));                    //招聘附件 要改的
//                            zhaopinEntity.setZhaopinTypes(Integer.valueOf(data.get(0)));   //招聘类型 要改的
//                            zhaopinEntity.setZhaopinNumber(Integer.valueOf(data.get(0)));   //招聘人数 要改的
//                            zhaopinEntity.setZhaopinTime(sdf.parse(data.get(0)));          //招聘时间 要改的
//                            zhaopinEntity.setZhaopinContent("");//详情和图片
//                            zhaopinEntity.setInsertTime(date);//时间
//                            zhaopinEntity.setCreateTime(date);//时间
                            zhaopinList.add(zhaopinEntity);


                            //把要查询是否重复的字段放入map中
                                //招聘编号
                                if(seachFields.containsKey("zhaopinUuidNumber")){
                                    List<String> zhaopinUuidNumber = seachFields.get("zhaopinUuidNumber");
                                    zhaopinUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhaopinUuidNumber = new ArrayList<>();
                                    zhaopinUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zhaopinUuidNumber",zhaopinUuidNumber);
                                }
                        }

                        //查询是否重复
                         //招聘编号
                        List<ZhaopinEntity> zhaopinEntities_zhaopinUuidNumber = zhaopinService.selectList(new EntityWrapper<ZhaopinEntity>().in("zhaopin_uuid_number", seachFields.get("zhaopinUuidNumber")));
                        if(zhaopinEntities_zhaopinUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhaopinEntity s:zhaopinEntities_zhaopinUuidNumber){
                                repeatFields.add(s.getZhaopinUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [招聘编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhaopinService.insertBatch(zhaopinList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }


    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = zhaopinService.queryPage(params);

        //字典表数据转换
        List<ZhaopinView> list =(List<ZhaopinView>)page.getList();
        for(ZhaopinView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Integer id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhaopinEntity zhaopin = zhaopinService.selectById(id);
        if(zhaopin !=null){


            //entity转view
            ZhaopinView view = new ZhaopinView();
            BeanUtils.copyProperties( zhaopin , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaopinEntity zhaopin, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhaopin:{}",this.getClass().getName(),zhaopin.toString());
        Wrapper<ZhaopinEntity> queryWrapper = new EntityWrapper<ZhaopinEntity>()
                .eq("zhaopin_uuid_number", zhaopin.getZhaopinUuidNumber())
                .eq("zhaopin_name", zhaopin.getZhaopinName())
                .eq("zhaopin_address", zhaopin.getZhaopinAddress())
                .eq("zhaopin_types", zhaopin.getZhaopinTypes())
                .eq("zhaopin_number", zhaopin.getZhaopinNumber())
//            .notIn("zhaopin_types", new Integer[]{102})
                ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhaopinEntity zhaopinEntity = zhaopinService.selectOne(queryWrapper);
        if(zhaopinEntity==null){
            zhaopin.setInsertTime(new Date());
            zhaopin.setCreateTime(new Date());
            zhaopinService.insert(zhaopin);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



}

