package com.entity.vo;

import com.entity.ZhaopinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 招聘
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaopin")
public class ZhaopinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 招聘编号
     */

    @TableField(value = "zhaopin_uuid_number")
    private String zhaopinUuidNumber;


    /**
     * 招聘标题
     */

    @TableField(value = "zhaopin_name")
    private String zhaopinName;


    /**
     * 招聘图片
     */

    @TableField(value = "zhaopin_photo")
    private String zhaopinPhoto;


    /**
     * 招聘地点
     */

    @TableField(value = "zhaopin_address")
    private String zhaopinAddress;


    /**
     * 招聘附件
     */

    @TableField(value = "zhaopin_file")
    private String zhaopinFile;


    /**
     * 招聘类型
     */

    @TableField(value = "zhaopin_types")
    private Integer zhaopinTypes;


    /**
     * 招聘人数
     */

    @TableField(value = "zhaopin_number")
    private Integer zhaopinNumber;


    /**
     * 招聘时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhaopin_time")
    private Date zhaopinTime;


    /**
     * 招聘详情
     */

    @TableField(value = "zhaopin_content")
    private String zhaopinContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：招聘编号
	 */
    public String getZhaopinUuidNumber() {
        return zhaopinUuidNumber;
    }


    /**
	 * 获取：招聘编号
	 */

    public void setZhaopinUuidNumber(String zhaopinUuidNumber) {
        this.zhaopinUuidNumber = zhaopinUuidNumber;
    }
    /**
	 * 设置：招聘标题
	 */
    public String getZhaopinName() {
        return zhaopinName;
    }


    /**
	 * 获取：招聘标题
	 */

    public void setZhaopinName(String zhaopinName) {
        this.zhaopinName = zhaopinName;
    }
    /**
	 * 设置：招聘图片
	 */
    public String getZhaopinPhoto() {
        return zhaopinPhoto;
    }


    /**
	 * 获取：招聘图片
	 */

    public void setZhaopinPhoto(String zhaopinPhoto) {
        this.zhaopinPhoto = zhaopinPhoto;
    }
    /**
	 * 设置：招聘地点
	 */
    public String getZhaopinAddress() {
        return zhaopinAddress;
    }


    /**
	 * 获取：招聘地点
	 */

    public void setZhaopinAddress(String zhaopinAddress) {
        this.zhaopinAddress = zhaopinAddress;
    }
    /**
	 * 设置：招聘附件
	 */
    public String getZhaopinFile() {
        return zhaopinFile;
    }


    /**
	 * 获取：招聘附件
	 */

    public void setZhaopinFile(String zhaopinFile) {
        this.zhaopinFile = zhaopinFile;
    }
    /**
	 * 设置：招聘类型
	 */
    public Integer getZhaopinTypes() {
        return zhaopinTypes;
    }


    /**
	 * 获取：招聘类型
	 */

    public void setZhaopinTypes(Integer zhaopinTypes) {
        this.zhaopinTypes = zhaopinTypes;
    }
    /**
	 * 设置：招聘人数
	 */
    public Integer getZhaopinNumber() {
        return zhaopinNumber;
    }


    /**
	 * 获取：招聘人数
	 */

    public void setZhaopinNumber(Integer zhaopinNumber) {
        this.zhaopinNumber = zhaopinNumber;
    }
    /**
	 * 设置：招聘时间
	 */
    public Date getZhaopinTime() {
        return zhaopinTime;
    }


    /**
	 * 获取：招聘时间
	 */

    public void setZhaopinTime(Date zhaopinTime) {
        this.zhaopinTime = zhaopinTime;
    }
    /**
	 * 设置：招聘详情
	 */
    public String getZhaopinContent() {
        return zhaopinContent;
    }


    /**
	 * 获取：招聘详情
	 */

    public void setZhaopinContent(String zhaopinContent) {
        this.zhaopinContent = zhaopinContent;
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
