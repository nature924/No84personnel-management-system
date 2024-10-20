package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.RenshidiaodongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 人事调动
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("renshidiaodong")
public class RenshidiaodongView extends RenshidiaodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 人事调动类型的值
	*/
	@ColumnInfo(comment="人事调动类型的字典表值",type="varchar(200)")
	private String renshidiaodongValue;
	/**
	* 部门的值
	*/
	@ColumnInfo(comment="部门的字典表值",type="varchar(200)")
	private String bumenValue;
	/**
	* 职位的值
	*/
	@ColumnInfo(comment="职位的字典表值",type="varchar(200)")
	private String zhiweiValue;

	//级联表 员工
		/**
		* 员工姓名
		*/

		@ColumnInfo(comment="员工姓名",type="varchar(200)")
		private String yuangongName;
		/**
		* 员工手机号
		*/

		@ColumnInfo(comment="员工手机号",type="varchar(200)")
		private String yuangongPhone;
		/**
		* 员工身份证号
		*/

		@ColumnInfo(comment="员工身份证号",type="varchar(200)")
		private String yuangongIdNumber;
		/**
		* 员工头像
		*/

		@ColumnInfo(comment="员工头像",type="varchar(200)")
		private String yuangongPhoto;
		/**
		* 员工邮箱
		*/

		@ColumnInfo(comment="员工邮箱",type="varchar(200)")
		private String yuangongEmail;
		/**
		* 学历状态
		*/
		@ColumnInfo(comment="学历状态",type="int(11)")
		private Integer xueliTypes;
			/**
			* 学历状态的值
			*/
			@ColumnInfo(comment="学历状态的字典表值",type="varchar(200)")
			private String xueliValue;
		/**
		* 教育经历
		*/

		@ColumnInfo(comment="教育经历",type="longtext")
		private String yuangongJiaoyuContent;
		/**
		* 工作经历
		*/

		@ColumnInfo(comment="工作经历",type="longtext")
		private String yuangongGongzuoContent;
		/**
		* 实习经历
		*/

		@ColumnInfo(comment="实习经历",type="longtext")
		private String shangpinShixiContent;
		/**
		* 所获荣誉
		*/

		@ColumnInfo(comment="所获荣誉",type="longtext")
		private String shangpinRonguContent;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;

	//重复字段


	public RenshidiaodongView() {

	}

	public RenshidiaodongView(RenshidiaodongEntity renshidiaodongEntity) {
		try {
			BeanUtils.copyProperties(this, renshidiaodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 人事调动类型的值
	*/
	public String getRenshidiaodongValue() {
		return renshidiaodongValue;
	}
	/**
	* 设置： 人事调动类型的值
	*/
	public void setRenshidiaodongValue(String renshidiaodongValue) {
		this.renshidiaodongValue = renshidiaodongValue;
	}
	//当前表的
	/**
	* 获取： 部门的值
	*/
	public String getBumenValue() {
		return bumenValue;
	}
	/**
	* 设置： 部门的值
	*/
	public void setBumenValue(String bumenValue) {
		this.bumenValue = bumenValue;
	}
	//当前表的
	/**
	* 获取： 职位的值
	*/
	public String getZhiweiValue() {
		return zhiweiValue;
	}
	/**
	* 设置： 职位的值
	*/
	public void setZhiweiValue(String zhiweiValue) {
		this.zhiweiValue = zhiweiValue;
	}


	//级联表的get和set 员工

		/**
		* 获取： 员工姓名
		*/
		public String getYuangongName() {
			return yuangongName;
		}
		/**
		* 设置： 员工姓名
		*/
		public void setYuangongName(String yuangongName) {
			this.yuangongName = yuangongName;
		}

		/**
		* 获取： 员工手机号
		*/
		public String getYuangongPhone() {
			return yuangongPhone;
		}
		/**
		* 设置： 员工手机号
		*/
		public void setYuangongPhone(String yuangongPhone) {
			this.yuangongPhone = yuangongPhone;
		}

		/**
		* 获取： 员工身份证号
		*/
		public String getYuangongIdNumber() {
			return yuangongIdNumber;
		}
		/**
		* 设置： 员工身份证号
		*/
		public void setYuangongIdNumber(String yuangongIdNumber) {
			this.yuangongIdNumber = yuangongIdNumber;
		}

		/**
		* 获取： 员工头像
		*/
		public String getYuangongPhoto() {
			return yuangongPhoto;
		}
		/**
		* 设置： 员工头像
		*/
		public void setYuangongPhoto(String yuangongPhoto) {
			this.yuangongPhoto = yuangongPhoto;
		}

		/**
		* 获取： 员工邮箱
		*/
		public String getYuangongEmail() {
			return yuangongEmail;
		}
		/**
		* 设置： 员工邮箱
		*/
		public void setYuangongEmail(String yuangongEmail) {
			this.yuangongEmail = yuangongEmail;
		}
		/**
		* 获取： 学历状态
		*/
		public Integer getXueliTypes() {
			return xueliTypes;
		}
		/**
		* 设置： 学历状态
		*/
		public void setXueliTypes(Integer xueliTypes) {
			this.xueliTypes = xueliTypes;
		}


			/**
			* 获取： 学历状态的值
			*/
			public String getXueliValue() {
				return xueliValue;
			}
			/**
			* 设置： 学历状态的值
			*/
			public void setXueliValue(String xueliValue) {
				this.xueliValue = xueliValue;
			}

		/**
		* 获取： 教育经历
		*/
		public String getYuangongJiaoyuContent() {
			return yuangongJiaoyuContent;
		}
		/**
		* 设置： 教育经历
		*/
		public void setYuangongJiaoyuContent(String yuangongJiaoyuContent) {
			this.yuangongJiaoyuContent = yuangongJiaoyuContent;
		}

		/**
		* 获取： 工作经历
		*/
		public String getYuangongGongzuoContent() {
			return yuangongGongzuoContent;
		}
		/**
		* 设置： 工作经历
		*/
		public void setYuangongGongzuoContent(String yuangongGongzuoContent) {
			this.yuangongGongzuoContent = yuangongGongzuoContent;
		}

		/**
		* 获取： 实习经历
		*/
		public String getShangpinShixiContent() {
			return shangpinShixiContent;
		}
		/**
		* 设置： 实习经历
		*/
		public void setShangpinShixiContent(String shangpinShixiContent) {
			this.shangpinShixiContent = shangpinShixiContent;
		}

		/**
		* 获取： 所获荣誉
		*/
		public String getShangpinRonguContent() {
			return shangpinRonguContent;
		}
		/**
		* 设置： 所获荣誉
		*/
		public void setShangpinRonguContent(String shangpinRonguContent) {
			this.shangpinRonguContent = shangpinRonguContent;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}

	//重复字段

	@Override
	public String toString() {
		return "RenshidiaodongView{" +
			", renshidiaodongValue=" + renshidiaodongValue +
			", bumenValue=" + bumenValue +
			", zhiweiValue=" + zhiweiValue +
			", yuangongName=" + yuangongName +
			", yuangongPhone=" + yuangongPhone +
			", yuangongIdNumber=" + yuangongIdNumber +
			", yuangongPhoto=" + yuangongPhoto +
			", yuangongEmail=" + yuangongEmail +
			", yuangongJiaoyuContent=" + yuangongJiaoyuContent +
			", yuangongGongzuoContent=" + yuangongGongzuoContent +
			", shangpinShixiContent=" + shangpinShixiContent +
			", shangpinRonguContent=" + shangpinRonguContent +
			"} " + super.toString();
	}
}
