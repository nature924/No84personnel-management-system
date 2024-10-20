package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 人事调动
 *
 * @author 
 * @email
 */
@TableName("renshidiaodong")
public class RenshidiaodongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RenshidiaodongEntity() {

	}

	public RenshidiaodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 员工
     */
    @ColumnInfo(comment="员工",type="int(11)")
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 人事调动编号
     */
    @ColumnInfo(comment="人事调动编号",type="varchar(200)")
    @TableField(value = "renshidiaodong_uuid_number")

    private String renshidiaodongUuidNumber;


    /**
     * 人事调动类型
     */
    @ColumnInfo(comment="人事调动类型",type="int(11)")
    @TableField(value = "renshidiaodong_types")

    private Integer renshidiaodongTypes;


    /**
     * 调动时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="调动时间",type="timestamp")
    @TableField(value = "diaodong_time")

    private Date diaodongTime;


    /**
     * 原部门
     */
    @ColumnInfo(comment="原部门",type="varchar(200)")
    @TableField(value = "yuan_bumen")

    private String yuanBumen;


    /**
     * 原职位
     */
    @ColumnInfo(comment="原职位",type="varchar(200)")
    @TableField(value = "yuan_zhiwei")

    private String yuanZhiwei;


    /**
     * 部门
     */
    @ColumnInfo(comment="部门",type="int(11)")
    @TableField(value = "bumen_types")

    private Integer bumenTypes;


    /**
     * 职位
     */
    @ColumnInfo(comment="职位",type="int(11)")
    @TableField(value = "zhiwei_types")

    private Integer zhiweiTypes;


    /**
     * 调动缘由
     */
    @ColumnInfo(comment="调动缘由",type="longtext")
    @TableField(value = "renshidiaodong_content")

    private String renshidiaodongContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Renshidiaodong{" +
            ", id=" + id +
            ", yuangongId=" + yuangongId +
            ", renshidiaodongUuidNumber=" + renshidiaodongUuidNumber +
            ", renshidiaodongTypes=" + renshidiaodongTypes +
            ", diaodongTime=" + DateUtil.convertString(diaodongTime,"yyyy-MM-dd") +
            ", yuanBumen=" + yuanBumen +
            ", yuanZhiwei=" + yuanZhiwei +
            ", bumenTypes=" + bumenTypes +
            ", zhiweiTypes=" + zhiweiTypes +
            ", renshidiaodongContent=" + renshidiaodongContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
