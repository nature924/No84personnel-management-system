package com.entity.vo;

import com.entity.RenshidiaodongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 人事调动
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("renshidiaodong")
public class RenshidiaodongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 人事调动编号
     */

    @TableField(value = "renshidiaodong_uuid_number")
    private String renshidiaodongUuidNumber;


    /**
     * 人事调动类型
     */

    @TableField(value = "renshidiaodong_types")
    private Integer renshidiaodongTypes;


    /**
     * 调动时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "diaodong_time")
    private Date diaodongTime;


    /**
     * 原部门
     */

    @TableField(value = "yuan_bumen")
    private String yuanBumen;


    /**
     * 原职位
     */

    @TableField(value = "yuan_zhiwei")
    private String yuanZhiwei;


    /**
     * 部门
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 职位
     */

    @TableField(value = "zhiwei_types")
    private Integer zhiweiTypes;


    /**
     * 调动缘由
     */

    @TableField(value = "renshidiaodong_content")
    private String renshidiaodongContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：人事调动编号
	 */
    public String getRenshidiaodongUuidNumber() {
        return renshidiaodongUuidNumber;
    }


    /**
	 * 获取：人事调动编号
	 */

    public void setRenshidiaodongUuidNumber(String renshidiaodongUuidNumber) {
        this.renshidiaodongUuidNumber = renshidiaodongUuidNumber;
    }
    /**
	 * 设置：人事调动类型
	 */
    public Integer getRenshidiaodongTypes() {
        return renshidiaodongTypes;
    }


    /**
	 * 获取：人事调动类型
	 */

    public void setRenshidiaodongTypes(Integer renshidiaodongTypes) {
        this.renshidiaodongTypes = renshidiaodongTypes;
    }
    /**
	 * 设置：调动时间
	 */
    public Date getDiaodongTime() {
        return diaodongTime;
    }


    /**
	 * 获取：调动时间
	 */

    public void setDiaodongTime(Date diaodongTime) {
        this.diaodongTime = diaodongTime;
    }
    /**
	 * 设置：原部门
	 */
    public String getYuanBumen() {
        return yuanBumen;
    }


    /**
	 * 获取：原部门
	 */

    public void setYuanBumen(String yuanBumen) {
        this.yuanBumen = yuanBumen;
    }
    /**
	 * 设置：原职位
	 */
    public String getYuanZhiwei() {
        return yuanZhiwei;
    }


    /**
	 * 获取：原职位
	 */

    public void setYuanZhiwei(String yuanZhiwei) {
        this.yuanZhiwei = yuanZhiwei;
    }
    /**
	 * 设置：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：调动缘由
	 */
    public String getRenshidiaodongContent() {
        return renshidiaodongContent;
    }


    /**
	 * 获取：调动缘由
	 */

    public void setRenshidiaodongContent(String renshidiaodongContent) {
        this.renshidiaodongContent = renshidiaodongContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
