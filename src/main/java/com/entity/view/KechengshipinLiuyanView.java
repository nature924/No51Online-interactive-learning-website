package com.entity.view;

import com.entity.KechengshipinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kechengshipin_liuyan")
public class KechengshipinLiuyanView extends KechengshipinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kechengshipin
			/**
			* 视频名称
			*/
			private String kechengshipinName;
			/**
			* 视频照片
			*/
			private String kechengshipinPhoto;
			/**
			* 视频
			*/
			private String kechengshipinVideo;
			/**
			* 课程资料
			*/
			private String kechengshipinFile;
			/**
			* 视频简介
			*/
			private String shangpinContent;

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

	public KechengshipinLiuyanView() {

	}

	public KechengshipinLiuyanView(KechengshipinLiuyanEntity kechengshipinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, kechengshipinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





































				//级联表的get和set kechengshipin
					/**
					* 获取： 视频名称
					*/
					public String getKechengshipinName() {
						return kechengshipinName;
					}
					/**
					* 设置： 视频名称
					*/
					public void setKechengshipinName(String kechengshipinName) {
						this.kechengshipinName = kechengshipinName;
					}
					/**
					* 获取： 视频照片
					*/
					public String getKechengshipinPhoto() {
						return kechengshipinPhoto;
					}
					/**
					* 设置： 视频照片
					*/
					public void setKechengshipinPhoto(String kechengshipinPhoto) {
						this.kechengshipinPhoto = kechengshipinPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getKechengshipinVideo() {
						return kechengshipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setKechengshipinVideo(String kechengshipinVideo) {
						this.kechengshipinVideo = kechengshipinVideo;
					}
					/**
					* 获取： 课程资料
					*/
					public String getKechengshipinFile() {
						return kechengshipinFile;
					}
					/**
					* 设置： 课程资料
					*/
					public void setKechengshipinFile(String kechengshipinFile) {
						this.kechengshipinFile = kechengshipinFile;
					}
					/**
					* 获取： 视频简介
					*/
					public String getShangpinContent() {
						return shangpinContent;
					}
					/**
					* 设置： 视频简介
					*/
					public void setShangpinContent(String shangpinContent) {
						this.shangpinContent = shangpinContent;
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






}
