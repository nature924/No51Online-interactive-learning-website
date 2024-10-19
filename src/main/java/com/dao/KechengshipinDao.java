package com.dao;

import com.entity.KechengshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengshipinView;

/**
 * 课程视频 Dao 接口
 *
 * @author 
 */
public interface KechengshipinDao extends BaseMapper<KechengshipinEntity> {

   List<KechengshipinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
