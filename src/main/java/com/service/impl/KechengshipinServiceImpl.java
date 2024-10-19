package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.KechengshipinDao;
import com.entity.KechengshipinEntity;
import com.service.KechengshipinService;
import com.entity.view.KechengshipinView;

/**
 * 课程视频 服务实现类
 */
@Service("kechengshipinService")
@Transactional
public class KechengshipinServiceImpl extends ServiceImpl<KechengshipinDao, KechengshipinEntity> implements KechengshipinService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KechengshipinView> page =new Query<KechengshipinView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
