package com.entity.model;

import com.entity.RenshidiaodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 人事调动
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RenshidiaodongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 人事调动编号
     */
    private String renshidiaodongUuidNumber;


    /**
     * 人事调动类型
     */
    private Integer renshidiaodongTypes;


    /**
     * 调动时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date diaodongTime;


    /**
     * 原部门
     */
    private String yuanBumen;


    /**
     * 原职位
     */
    private String yuanZhiwei;


    /**
     * 部门
     */
    private Integer bumenTypes;


    /**
     * 职位
     */
    private Integer zhiweiTypes;


    /**
     * 调动缘由
     */
    private String renshidiaodongContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：人事调动编号
	 */
    public String getRenshidiaodongUuidNumber() {
        return renshidiaodongUuidNumber;
    }


    /**
	 * 设置：人事调动编号
	 */
    public void setRenshidiaodongUuidNumber(String renshidiaodongUuidNumber) {
        this.renshidiaodongUuidNumber = renshidiaodongUuidNumber;
    }
    /**
	 * 获取：人事调动类型
	 */
    public Integer getRenshidiaodongTypes() {
        return renshidiaodongTypes;
    }


    /**
	 * 设置：人事调动类型
	 */
    public void setRenshidiaodongTypes(Integer renshidiaodongTypes) {
        this.renshidiaodongTypes = renshidiaodongTypes;
    }
    /**
	 * 获取：调动时间
	 */
    public Date getDiaodongTime() {
        return diaodongTime;
    }


    /**
	 * 设置：调动时间
	 */
    public void setDiaodongTime(Date diaodongTime) {
        this.diaodongTime = diaodongTime;
    }
    /**
	 * 获取：原部门
	 */
    public String getYuanBumen() {
        return yuanBumen;
    }


    /**
	 * 设置：原部门
	 */
    public void setYuanBumen(String yuanBumen) {
        this.yuanBumen = yuanBumen;
    }
    /**
	 * 获取：原职位
	 */
    public String getYuanZhiwei() {
        return yuanZhiwei;
    }


    /**
	 * 设置：原职位
	 */
    public void setYuanZhiwei(String yuanZhiwei) {
        this.yuanZhiwei = yuanZhiwei;
    }
    /**
	 * 获取：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 设置：部门
	 */
    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 获取：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 设置：职位
	 */
    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 获取：调动缘由
	 */
    public String getRenshidiaodongContent() {
        return renshidiaodongContent;
    }


    /**
	 * 设置：调动缘由
	 */
    public void setRenshidiaodongContent(String renshidiaodongContent) {
        this.renshidiaodongContent = renshidiaodongContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
