package com.lyl.cube.mybatis.provider;

import java.util.Set;
import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

/**
 * 插入单表全部列批量插入
 * Created by linyu on 2017/9/30.
 */
public class InsertBatchProvider extends MapperTemplate {

  public InsertBatchProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
    super(mapperClass, mapperHelper);
  }

  /**
   * 批量插入
   */
  public String insertListWithAllColumns(MappedStatement ms) {
    final Class<?> entityClass = getEntityClass(ms);
    // 开始拼sql
    StringBuilder sql = new StringBuilder();
    sql.append(SqlHelper.insertIntoTable(entityClass, tableName(entityClass)));
    sql.append(SqlHelper.insertColumns(entityClass, false, false, false));
    sql.append(" VALUES ");
    sql.append("<foreach collection=\"list\" item=\"record\" separator=\",\" >");
    sql.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">");
    //获取全部列
    Set<EntityColumn> columnList = EntityHelper.getColumns(entityClass);
    for (EntityColumn column : columnList) {
      if (column.isInsertable()) {
        sql.append(column.getColumnHolder("record") + ",");
      }
    }
    sql.append("</trim>");
    sql.append("</foreach>");
    return sql.toString();
  }

}