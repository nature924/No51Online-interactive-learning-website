package com.dao;

import com.entity.KechengshipinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengshipinLiuyanView;

/**
 * 课程留言 Dao 接口
 *
 * @author 
 */
public interface KechengshipinLiuyanDao extends BaseMapper<KechengshipinLiuyanEntity> {

   List<KechengshipinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
