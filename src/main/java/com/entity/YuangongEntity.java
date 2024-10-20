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
 * 员工
 *
 * @author 
 * @email
 */
@TableName("yuangong")
public class YuangongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuangongEntity() {

	}

	public YuangongEntity(T t) {
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
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 员工姓名
     */
    @ColumnInfo(comment="员工姓名",type="varchar(200)")
    @TableField(value = "yuangong_name")

    private String yuangongName;


    /**
     * 员工手机号
     */
    @ColumnInfo(comment="员工手机号",type="varchar(200)")
    @TableField(value = "yuangong_phone")

    private String yuangongPhone;


    /**
     * 员工身份证号
     */
    @ColumnInfo(comment="员工身份证号",type="varchar(200)")
    @TableField(value = "yuangong_id_number")

    private String yuangongIdNumber;


    /**
     * 员工头像
     */
    @ColumnInfo(comment="员工头像",type="varchar(200)")
    @TableField(value = "yuangong_photo")

    private String yuangongPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


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
     * 员工邮箱
     */
    @ColumnInfo(comment="员工邮箱",type="varchar(200)")
    @TableField(value = "yuangong_email")

    private String yuangongEmail;


    /**
     * 学历状态
     */
    @ColumnInfo(comment="学历状态",type="int(11)")
    @TableField(value = "xueli_types")

    private Integer xueliTypes;


    /**
     * 教育经历
     */
    @ColumnInfo(comment="教育经历",type="longtext")
    @TableField(value = "yuangong_jiaoyu_content")

    private String yuangongJiaoyuContent;


    /**
     * 工作经历
     */
    @ColumnInfo(comment="工作经历",type="longtext")
    @TableField(value = "yuangong_gongzuo_content")

    private String yuangongGongzuoContent;


    /**
     * 实习经历
     */
    @ColumnInfo(comment="实习经历",type="longtext")
    @TableField(value = "shangpin_shixi_content")

    private String shangpinShixiContent;


    /**
     * 所获荣誉
     */
    @ColumnInfo(comment="所获荣誉",type="longtext")
    @TableField(value = "shangpin_rongu_content")

    private String shangpinRonguContent;


    /**
     * 账户状态
     */
    @ColumnInfo(comment="账户状态",type="int(11)")
    @TableField(value = "jinyong_types")

    private Integer jinyongTypes;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：员工姓名
	 */
    public String getYuangongName() {
        return yuangongName;
    }
    /**
	 * 设置：员工姓名
	 */

    public void setYuangongName(String yuangongName) {
        this.yuangongName = yuangongName;
    }
    /**
	 * 获取：员工手机号
	 */
    public String getYuangongPhone() {
        return yuangongPhone;
    }
    /**
	 * 设置：员工手机号
	 */

    public void setYuangongPhone(String yuangongPhone) {
        this.yuangongPhone = yuangongPhone;
    }
    /**
	 * 获取：员工身份证号
	 */
    public String getYuangongIdNumber() {
        return yuangongIdNumber;
    }
    /**
	 * 设置：员工身份证号
	 */

    public void setYuangongIdNumber(String yuangongIdNumber) {
        this.yuangongIdNumber = yuangongIdNumber;
    }
    /**
	 * 获取：员工头像
	 */
    public String getYuangongPhoto() {
        return yuangongPhoto;
    }
    /**
	 * 设置：员工头像
	 */

    public void setYuangongPhoto(String yuangongPhoto) {
        this.yuangongPhoto = yuangongPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
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
	 * 获取：员工邮箱
	 */
    public String getYuangongEmail() {
        return yuangongEmail;
    }
    /**
	 * 设置：员工邮箱
	 */

    public void setYuangongEmail(String yuangongEmail) {
        this.yuangongEmail = yuangongEmail;
    }
    /**
	 * 获取：学历状态
	 */
    public Integer getXueliTypes() {
        return xueliTypes;
    }
    /**
	 * 设置：学历状态
	 */

    public void setXueliTypes(Integer xueliTypes) {
        this.xueliTypes = xueliTypes;
    }
    /**
	 * 获取：教育经历
	 */
    public String getYuangongJiaoyuContent() {
        return yuangongJiaoyuContent;
    }
    /**
	 * 设置：教育经历
	 */

    public void setYuangongJiaoyuContent(String yuangongJiaoyuContent) {
        this.yuangongJiaoyuContent = yuangongJiaoyuContent;
    }
    /**
	 * 获取：工作经历
	 */
    public String getYuangongGongzuoContent() {
        return yuangongGongzuoContent;
    }
    /**
	 * 设置：工作经历
	 */

    public void setYuangongGongzuoContent(String yuangongGongzuoContent) {
        this.yuangongGongzuoContent = yuangongGongzuoContent;
    }
    /**
	 * 获取：实习经历
	 */
    public String getShangpinShixiContent() {
        return shangpinShixiContent;
    }
    /**
	 * 设置：实习经历
	 */

    public void setShangpinShixiContent(String shangpinShixiContent) {
        this.shangpinShixiContent = shangpinShixiContent;
    }
    /**
	 * 获取：所获荣誉
	 */
    public String getShangpinRonguContent() {
        return shangpinRonguContent;
    }
    /**
	 * 设置：所获荣誉
	 */

    public void setShangpinRonguContent(String shangpinRonguContent) {
        this.shangpinRonguContent = shangpinRonguContent;
    }
    /**
	 * 获取：账户状态
	 */
    public Integer getJinyongTypes() {
        return jinyongTypes;
    }
    /**
	 * 设置：账户状态
	 */

    public void setJinyongTypes(Integer jinyongTypes) {
        this.jinyongTypes = jinyongTypes;
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
        return "Yuangong{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yuangongName=" + yuangongName +
            ", yuangongPhone=" + yuangongPhone +
            ", yuangongIdNumber=" + yuangongIdNumber +
            ", yuangongPhoto=" + yuangongPhoto +
            ", sexTypes=" + sexTypes +
            ", bumenTypes=" + bumenTypes +
            ", zhiweiTypes=" + zhiweiTypes +
            ", yuangongEmail=" + yuangongEmail +
            ", xueliTypes=" + xueliTypes +
            ", yuangongJiaoyuContent=" + yuangongJiaoyuContent +
            ", yuangongGongzuoContent=" + yuangongGongzuoContent +
            ", shangpinShixiContent=" + shangpinShixiContent +
            ", shangpinRonguContent=" + shangpinRonguContent +
            ", jinyongTypes=" + jinyongTypes +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
