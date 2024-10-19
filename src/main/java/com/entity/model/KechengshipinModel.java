package com.entity.model;

import com.entity.KechengshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengshipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程
     */
    private Integer kechengId;


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


    /**
     * 创建时间 show2 photoShow
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
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：视频名称
	 */
    public String getKechengshipinName() {
        return kechengshipinName;
    }


    /**
	 * 设置：视频名称
	 */
    public void setKechengshipinName(String kechengshipinName) {
        this.kechengshipinName = kechengshipinName;
    }
    /**
	 * 获取：视频照片
	 */
    public String getKechengshipinPhoto() {
        return kechengshipinPhoto;
    }


    /**
	 * 设置：视频照片
	 */
    public void setKechengshipinPhoto(String kechengshipinPhoto) {
        this.kechengshipinPhoto = kechengshipinPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getKechengshipinVideo() {
        return kechengshipinVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setKechengshipinVideo(String kechengshipinVideo) {
        this.kechengshipinVideo = kechengshipinVideo;
    }
    /**
	 * 获取：课程资料
	 */
    public String getKechengshipinFile() {
        return kechengshipinFile;
    }


    /**
	 * 设置：课程资料
	 */
    public void setKechengshipinFile(String kechengshipinFile) {
        this.kechengshipinFile = kechengshipinFile;
    }
    /**
	 * 获取：视频简介
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 设置：视频简介
	 */
    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
