package com.baomidou.mybatisplus.generator.config.po;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by linyu on 2017/9/26.
 */
public class GeneratedTableInfo {


  //生成表名
  private String tableName;

  //需要生成key的字段列表
  private Map<String, GeneratedKeyInfo> generatedKeyInfoMap = new HashMap<>();


  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public Map<String, GeneratedKeyInfo> getGeneratedKeyInfoMap() {
    return generatedKeyInfoMap;
  }

  public void setGeneratedKeyInfoMap(
      Map<String, GeneratedKeyInfo> generatedKeyInfoMap) {
    this.generatedKeyInfoMap = generatedKeyInfoMap;
  }
}
