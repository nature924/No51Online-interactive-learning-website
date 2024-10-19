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
 * 回答
 *
 * @author 
 * @email
 */
@TableName("huida")
public class HuidaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuidaEntity() {

	}

	public HuidaEntity(T t) {
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
     * 作业
     */
    @TableField(value = "zuoye_id")

    private Integer zuoyeId;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 回答文件
     */
    @TableField(value = "huifu_file")

    private String huifuFile;


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
	 * 设置：作业
	 */
    public Integer getZuoyeId() {
        return zuoyeId;
    }


    /**
	 * 获取：作业
	 */

    public void setZuoyeId(Integer zuoyeId) {
        this.zuoyeId = zuoyeId;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：回答文件
	 */
    public String getHuifuFile() {
        return huifuFile;
    }


    /**
	 * 获取：回答文件
	 */

    public void setHuifuFile(String huifuFile) {
        this.huifuFile = huifuFile;
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
        return "Huida{" +
            "id=" + id +
            ", zuoyeId=" + zuoyeId +
            ", yonghuId=" + yonghuId +
            ", huifuFile=" + huifuFile +
            ", createTime=" + createTime +
        "}";
    }
}
