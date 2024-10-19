package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课程视频
 *
 * @author 
 * @email
 */
@TableName("kechengshipin")
public class KechengshipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengshipinEntity() {

	}

	public KechengshipinEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程
     */
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 视频名称
     */
    @TableField(value = "kechengshipin_name")

    private String kechengshipinName;


    /**
     * 视频照片
     */
    @TableField(value = "kechengshipin_photo")

    private String kechengshipinPhoto;


    /**
     * 视频
     */
    @TableField(value = "kechengshipin_video")

    private String kechengshipinVideo;


    /**
     * 课程资料
     */
    @TableField(value = "kechengshipin_file")

    private String kechengshipinFile;


    /**
     * 视频简介
     */
    @TableField(value = "shangpin_content")

    private String shangpinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：视频名称
	 */
    public String getKechengshipinName() {
        return kechengshipinName;
    }


    /**
	 * 获取：视频名称
	 */

    public void setKechengshipinName(String kechengshipinName) {
        this.kechengshipinName = kechengshipinName;
    }
    /**
	 * 设置：视频照片
	 */
    public String getKechengshipinPhoto() {
        return kechengshipinPhoto;
    }


    /**
	 * 获取：视频照片
	 */

    public void setKechengshipinPhoto(String kechengshipinPhoto) {
        this.kechengshipinPhoto = kechengshipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getKechengshipinVideo() {
        return kechengshipinVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setKechengshipinVideo(String kechengshipinVideo) {
        this.kechengshipinVideo = kechengshipinVideo;
    }
    /**
	 * 设置：课程资料
	 */
    public String getKechengshipinFile() {
        return kechengshipinFile;
    }


    /**
	 * 获取：课程资料
	 */

    public void setKechengshipinFile(String kechengshipinFile) {
        this.kechengshipinFile = kechengshipinFile;
    }
    /**
	 * 设置：视频简介
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 获取：视频简介
	 */

    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kechengshipin{" +
            "id=" + id +
            ", kechengId=" + kechengId +
            ", kechengshipinName=" + kechengshipinName +
            ", kechengshipinPhoto=" + kechengshipinPhoto +
            ", kechengshipinVideo=" + kechengshipinVideo +
            ", kechengshipinFile=" + kechengshipinFile +
            ", shangpinContent=" + shangpinContent +
            ", createTime=" + createTime +
        "}";
    }
}
