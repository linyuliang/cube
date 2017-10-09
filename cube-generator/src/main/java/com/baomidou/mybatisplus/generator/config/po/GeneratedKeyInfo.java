package com.baomidou.mybatisplus.generator.config.po;

import org.apache.commons.lang.StringUtils;

/**
 * Created by linyu on 2017/9/26.
 */
public class GeneratedKeyInfo {

  /**
   * 将返回新值的 SQL 语句。如果这是一个identity列，您可以使用其中一个预定义的的特殊值。预定义值如下： Cloudscape DB2 DB2_MF Derby HSQLDB
   * Informix MySql SqlServer SYBASE JDBC:这会配置MBG使用MyBatis3支持的JDBC标准的生成key来生成代码。
   * 这是一个独立于数据库获取标识列中的值的方法。 重要: 只有当目标运行为MyBatis3时才会产生正确的代码。 如果与iBATIS2一起使用目标运行时会产生运行时错误的代码。
   */
  private String sqlStatement;
  /**
   * :当设置为true时,该列会被标记为identity列， 并且<selectKey>元素会被插入在insert后面。
   * 当设置为false时， <selectKey>会插入到insert之前（通常是序列）。
   * 重要:
   * 即使您type属性指定为post，您仍然需要为identity列将该参数设置为true。 这将标志MBG从插入列表中删除该列。
   * 默认值是false。
   */
  private boolean identity;
  /**
   * type=post and identity=true的时候生成的<selectKey>中的order=AFTER,
   * 当type=pre的时候，identity只能为false，生成的<selectKey>中的order=BEFORE。
   * 可以这么理解，自动增长的列只有插入到数据库后才能得到ID，所以是AFTER,
   * 使用序列时，只有先获取序列之后，才能插入数据库，所以是BEFORE
   */
  private String type;

  public String getSqlStatement() {
    return sqlStatement;
  }

  public void setSqlStatement(String sqlStatement) {
    this.sqlStatement = sqlStatement;
  }

  public boolean isIdentity() {
    return identity;
  }

  public void setIdentity(boolean identity) {
    this.identity = identity;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getGeneratedValue() {
    String strategy = null;
    String generator = null;
    switch (StringUtils.lowerCase(sqlStatement)) {
      case "dloudscape":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "db2":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "db2_mf":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "derby":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "hsqldb":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "informix":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "mysql":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "sqlserver":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "sybase":
        strategy = "GenerationType.IDENTITY";
        generator = null;
        break;
      case "jdbc":
        strategy = null;
        generator = null;
        break;
      case "uuid":
        strategy = null;
        generator = "UUID";
        break;
      default:
        strategy = "GenerationType.IDENTITY";
        generator = sqlStatement;
        break;
    }
    StringBuilder generatedValue = new StringBuilder();
    if (strategy != null) {
      generatedValue.append("strategy = ").append(strategy);
    }
    if (generator != null) {
      if (strategy != null) {
        generatedValue.append(", ");
      }
      generatedValue.append("generator = ").append("\"").append(generator).append("\"");
    }
    return generatedValue.toString();
  }
}
