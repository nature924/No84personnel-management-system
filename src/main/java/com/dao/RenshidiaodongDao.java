package com.dao;

import com.entity.RenshidiaodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshidiaodongView;

/**
 * 人事调动 Dao 接口
 *
 * @author 
 */
public interface RenshidiaodongDao extends BaseMapper<RenshidiaodongEntity> {

   List<RenshidiaodongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
