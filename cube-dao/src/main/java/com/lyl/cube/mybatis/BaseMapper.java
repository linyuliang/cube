package com.lyl.cube.mybatis;

import com.lyl.cube.core.base.BaseEntity;
import com.lyl.cube.mybatis.provider.InsertBatchProvider;
import java.util.List;
import org.apache.ibatis.annotations.InsertProvider;
import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<T extends BaseEntity> extends Mapper<T> {

  /**
   * 批量插入所有字段，包含id，insertList是id不插入，由数据库自生成
   */
  @InsertProvider(type = InsertBatchProvider.class, method = "dynamicSQL")
  int insertListWithAllColumns(List<T> recordList);
}