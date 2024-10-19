package com.entity.vo;

import com.entity.ZuoyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 作业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zuoye")
public class ZuoyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 作业唯一编号
     */

    @TableField(value = "zuoye_uuid_number")
    private String zuoyeUuidNumber;


    /**
     * 作业名称
     */

    @TableField(value = "zuoye_name")
    private String zuoyeName;


    /**
     * 作业类型
     */

    @TableField(value = "zuoye_types")
    private Integer zuoyeTypes;


    /**
     * 班级类型
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 作业发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 作业文件
     */

    @TableField(value = "zuoye_file")
    private String zuoyeFile;


    /**
     * 作业详情
     */

    @TableField(value = "zuoye_content")
    private String zuoyeContent;


    /**
     * 创建时间
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
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：作业唯一编号
	 */
    public String getZuoyeUuidNumber() {
        return zuoyeUuidNumber;
    }


    /**
	 * 获取：作业唯一编号
	 */

    public void setZuoyeUuidNumber(String zuoyeUuidNumber) {
        this.zuoyeUuidNumber = zuoyeUuidNumber;
    }
    /**
	 * 设置：作业名称
	 */
    public String getZuoyeName() {
        return zuoyeName;
    }


    /**
	 * 获取：作业名称
	 */

    public void setZuoyeName(String zuoyeName) {
        this.zuoyeName = zuoyeName;
    }
    /**
	 * 设置：作业类型
	 */
    public Integer getZuoyeTypes() {
        return zuoyeTypes;
    }


    /**
	 * 获取：作业类型
	 */

    public void setZuoyeTypes(Integer zuoyeTypes) {
        this.zuoyeTypes = zuoyeTypes;
    }
    /**
	 * 设置：班级类型
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级类型
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：作业发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：作业发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：作业文件
	 */
    public String getZuoyeFile() {
        return zuoyeFile;
    }


    /**
	 * 获取：作业文件
	 */

    public void setZuoyeFile(String zuoyeFile) {
        this.zuoyeFile = zuoyeFile;
    }
    /**
	 * 设置：作业详情
	 */
    public String getZuoyeContent() {
        return zuoyeContent;
    }


    /**
	 * 获取：作业详情
	 */

    public void setZuoyeContent(String zuoyeContent) {
        this.zuoyeContent = zuoyeContent;
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

}
