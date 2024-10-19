package com.entity.view;

import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 讨论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 讨论类型的值
		*/
		private String forumValue;
		/**
		* 讨论状态的值
		*/
		private String forumStateValue;



		//级联表 laoshi
			/**
			* 老师姓名
			*/
			private String laoshiName;
			/**
			* 老师手机号
			*/
			private String laoshiPhone;
			/**
			* 老师头像
			*/
			private String laoshiPhoto;
			/**
			* 电子邮箱
			*/
			private String laoshiEmail;

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学生头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;

		//级联表 users
			/**
			* 角色
			*/
			private String urole;
			/**
			* 新增时间
			*/
			private Date uaddtime;

	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 讨论类型的值
			*/
			public String getForumValue() {
				return forumValue;
			}
			/**
			* 设置： 讨论类型的值
			*/
			public void setForumValue(String forumValue) {
				this.forumValue = forumValue;
			}
			/**
			* 获取： 讨论状态的值
			*/
			public String getForumStateValue() {
				return forumStateValue;
			}
			/**
			* 设置： 讨论状态的值
			*/
			public void setForumStateValue(String forumStateValue) {
				this.forumStateValue = forumStateValue;
			}





















































				//级联表的get和set laoshi
					/**
					* 获取： 老师姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 老师姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}
					/**
					* 获取： 老师手机号
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 老师手机号
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}
					/**
					* 获取： 老师头像
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 老师头像
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getLaoshiEmail() {
						return laoshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setLaoshiEmail(String laoshiEmail) {
						this.laoshiEmail = laoshiEmail;
					}



				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 学生头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}










			//级联表的get和set users
					/**
					* 获取： 角色
					*/
					public String getUrole() {
						return urole;
					}
					/**
					* 设置： 角色
					*/
					public void setUrole(String urole) {
						this.urole = urole;
					}
					/**
					* 获取： 新增时间
					*/
					public Date getUaddtime() {
						return uaddtime;
					}
					/**
					* 设置： 新增时间
					*/
					public void setUaddtime(Date uaddtime) {
						this.uaddtime = uaddtime;
					}
}
