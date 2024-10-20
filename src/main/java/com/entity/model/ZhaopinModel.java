package com.entity.model;

import com.entity.ZhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 招聘
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhaopinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 招聘编号
     */
    private String zhaopinUuidNumber;


    /**
     * 招聘标题
     */
    private String zhaopinName;


    /**
     * 招聘图片
     */
    private String zhaopinPhoto;


    /**
     * 招聘地点
     */
    private String zhaopinAddress;


    /**
     * 招聘附件
     */
    private String zhaopinFile;


    /**
     * 招聘类型
     */
    private Integer zhaopinTypes;


    /**
     * 招聘人数
     */
    private Integer zhaopinNumber;


    /**
     * 招聘时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhaopinTime;


    /**
     * 招聘详情
     */
    private String zhaopinContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
