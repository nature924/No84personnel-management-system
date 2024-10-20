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
 * 招聘
 *
 * @author 
 * @email
 */
@TableName("zhaopin")
public class ZhaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaopinEntity() {

	}

	public ZhaopinEntity(T t) {
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
     * 招聘编号
     */
    @ColumnInfo(comment="招聘编号",type="varchar(200)")
    @TableField(value = "zhaopin_uuid_number")

    private String zhaopinUuidNumber;


    /**
     * 招聘标题
     */
    @ColumnInfo(comment="招聘标题",type="varchar(200)")
    @TableField(value = "zhaopin_name")

    private String zhaopinName;


    /**
     * 招聘图片
     */
    @ColumnInfo(comment="招聘图片",type="varchar(200)")
    @TableField(value = "zhaopin_photo")

    private String zhaopinPhoto;


    /**
     * 招聘地点
     */
    @ColumnInfo(comment="招聘地点",type="varchar(200)")
    @TableField(value = "zhaopin_address")

    private String zhaopinAddress;


    /**
     * 招聘附件
     */
    @ColumnInfo(comment="招聘附件",type="varchar(200)")
    @TableField(value = "zhaopin_file")

    private String zhaopinFile;


    /**
     * 招聘类型
     */
    @ColumnInfo(comment="招聘类型",type="int(11)")
    @TableField(value = "zhaopin_types")

    private Integer zhaopinTypes;


    /**
     * 招聘人数
     */
    @ColumnInfo(comment="招聘人数",type="int(11)")
    @TableField(value = "zhaopin_number")

    private Integer zhaopinNumber;


    /**
     * 招聘时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="招聘时间",type="timestamp")
    @TableField(value = "zhaopin_time")

    private Date zhaopinTime;


    /**
     * 招聘详情
     */
    @ColumnInfo(comment="招聘详情",type="longtext")
    @TableField(value = "zhaopin_content")

    private String zhaopinContent;


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
	 * 获取：招聘编号
	 */
    public String getZhaopinUuidNumber() {
        return zhaopinUuidNumber;
    }
    /**
	 * 设置：招聘编号
	 */

    public void setZhaopinUuidNumber(String zhaopinUuidNumber) {
        this.zhaopinUuidNumber = zhaopinUuidNumber;
    }
    /**
	 * 获取：招聘标题
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }
    /**
	 * 设置：招聘标题
	 */

    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 获取：招聘图片
	 */
    public String getZhaopinPhoto() {
        return zhaopinPhoto;
    }
    /**
	 * 设置：招聘图片
	 */

    public void setZhaopinPhoto(String zhaopinPhoto) {
        this.zhaopinPhoto = zhaopinPhoto;
    }
    /**
	 * 获取：招聘地点
	 */
    public String getZhaopinAddress() {
        return zhaopinAddress;
    }
    /**
	 * 设置：招聘地点
	 */

    public void setZhaopinAddress(String zhaopinAddress) {
        this.zhaopinAddress = zhaopinAddress;
    }
    /**
	 * 获取：招聘附件
	 */
    public String getZhaopinFile() {
        return zhaopinFile;
    }
    /**
	 * 设置：招聘附件
	 */

    public void setZhaopinFile(String zhaopinFile) {
        this.zhaopinFile = zhaopinFile;
    }
    /**
	 * 获取：招聘类型
	 */
    public Integer getZhaopinTypes() {
        return zhaopinTypes;
    }
    /**
	 * 设置：招聘类型
	 */

    public void setZhaopinTypes(Integer zhaopinTypes) {
        this.zhaopinTypes = zhaopinTypes;
    }
    /**
	 * 获取：招聘人数
	 */
    public Integer getZhaopinNumber() {
        return zhaopinNumber;
    }
    /**
	 * 设置：招聘人数
	 */

    public void setZhaopinNumber(Integer zhaopinNumber) {
        this.zhaopinNumber = zhaopinNumber;
    }
    /**
	 * 获取：招聘时间
	 */
    public Date getZhaopinTime() {
        return zhaopinTime;
    }
    /**
	 * 设置：招聘时间
	 */

    public void setZhaopinTime(Date zhaopinTime) {
        this.zhaopinTime = zhaopinTime;
    }
    /**
	 * 获取：招聘详情
	 */
    public String getZhaopinContent() {
        return zhaopinContent;
    }
    /**
	 * 设置：招聘详情
	 */

    public void setZhaopinContent(String zhaopinContent) {
        this.zhaopinContent = zhaopinContent;
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
        return "Zhaopin{" +
            ", id=" + id +
            ", zhaopinUuidNumber=" + zhaopinUuidNumber +
            ", zhaopinName=" + zhaopinName +
            ", zhaopinPhoto=" + zhaopinPhoto +
            ", zhaopinAddress=" + zhaopinAddress +
            ", zhaopinFile=" + zhaopinFile +
            ", zhaopinTypes=" + zhaopinTypes +
            ", zhaopinNumber=" + zhaopinNumber +
            ", zhaopinTime=" + DateUtil.convertString(zhaopinTime,"yyyy-MM-dd") +
            ", zhaopinContent=" + zhaopinContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
