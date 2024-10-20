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
 * 培训
 *
 * @author 
 * @email
 */
@TableName("peixun")
public class PeixunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public PeixunEntity() {

	}

	public PeixunEntity(T t) {
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
     * 培训编号
     */
    @ColumnInfo(comment="培训编号",type="varchar(200)")
    @TableField(value = "peixun_uuid_number")

    private String peixunUuidNumber;


    /**
     * 培训标题
     */
    @ColumnInfo(comment="培训标题",type="varchar(200)")
    @TableField(value = "peixun_name")

    private String peixunName;


    /**
     * 培训类型
     */
    @ColumnInfo(comment="培训类型",type="int(11)")
    @TableField(value = "peixun_types")

    private Integer peixunTypes;


    /**
     * 培训开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="培训开始时间",type="date")
    @TableField(value = "kaishi_time")

    private Date kaishiTime;


    /**
     * 培训结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="培训结束时间",type="date")
    @TableField(value = "jieshu_time")

    private Date jieshuTime;


    /**
     * 培训内容
     */
    @ColumnInfo(comment="培训内容",type="longtext")
    @TableField(value = "peixun_content")

    private String peixunContent;


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
	 * 获取：培训编号
	 */
    public String getPeixunUuidNumber() {
        return peixunUuidNumber;
    }
    /**
	 * 设置：培训编号
	 */

    public void setPeixunUuidNumber(String peixunUuidNumber) {
        this.peixunUuidNumber = peixunUuidNumber;
    }
    /**
	 * 获取：培训标题
	 */
    public String getPeixunName() {
        return peixunName;
    }
    /**
	 * 设置：培训标题
	 */

    public void setPeixunName(String peixunName) {
        this.peixunName = peixunName;
    }
    /**
	 * 获取：培训类型
	 */
    public Integer getPeixunTypes() {
        return peixunTypes;
    }
    /**
	 * 设置：培训类型
	 */

    public void setPeixunTypes(Integer peixunTypes) {
        this.peixunTypes = peixunTypes;
    }
    /**
	 * 获取：培训开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }
    /**
	 * 设置：培训开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 获取：培训结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }
    /**
	 * 设置：培训结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 获取：培训内容
	 */
    public String getPeixunContent() {
        return peixunContent;
    }
    /**
	 * 设置：培训内容
	 */

    public void setPeixunContent(String peixunContent) {
        this.peixunContent = peixunContent;
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
        return "Peixun{" +
            ", id=" + id +
            ", yuangongId=" + yuangongId +
            ", peixunUuidNumber=" + peixunUuidNumber +
            ", peixunName=" + peixunName +
            ", peixunTypes=" + peixunTypes +
            ", kaishiTime=" + DateUtil.convertString(kaishiTime,"yyyy-MM-dd") +
            ", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
            ", peixunContent=" + peixunContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
