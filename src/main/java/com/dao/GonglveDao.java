package com.dao;

import com.entity.GonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GonglveView;

/**
 * 攻略 Dao 接口
 *
 * @author 
 */
public interface GonglveDao extends BaseMapper<GonglveEntity> {

   List<GonglveView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
