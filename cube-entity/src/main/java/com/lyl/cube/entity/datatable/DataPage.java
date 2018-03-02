package com.lyl.cube.entity.datatable;

import com.lyl.cube.core.base.BaseEntity;
import java.util.List;


public class DataPage<T> extends BaseEntity {

  /**
   * 序列号
   */
  private static final long serialVersionUID = 1L;

  /**
   * 操作次数，需要原样返回
   */
  private Integer draw;

  /**
   * 总记录数目
   */
  private long recordsTotal = 0;

  /**
   * 过滤获取的总数
   */
  private long recordsFiltered = 0;

  /**
   * 查询结果集合
   */
  private List<T> data = null;

  private String error;


  /**
   * 构造函数 Creates a new instance of Page.
   */
  public DataPage() {
    super();
  }

  /**
   * 构造函数 Creates a new instance of Page.
   *
   * @param recordsTotal 记录数目
   * @param data 查询结果集合
   */
  public DataPage(final long recordsTotal, final List<T> data) {
    super();
    this.recordsTotal = recordsTotal;
    this.recordsFiltered = recordsTotal;
    this.data = data;
  }

  /**
   * Title: Description:
   *
   * @param recordsTotal 总记录数
   * @param recordsFiltered 过滤后的总数
   * @param data 数据集合
   */
  public DataPage(final long recordsTotal, final long recordsFiltered, final List<T> data) {
    super();
    this.recordsTotal = recordsTotal;
    this.recordsFiltered = recordsFiltered;
    this.data = data;
  }

  /**
   * @return draw
   */
  public Integer getDraw() {
    return draw;
  }

  /**
   * @param draw 要设置的 Draw
   */
  public void setDraw(final Integer draw) {
    this.draw = draw;
  }

  /**
   * @return recordsTotal
   */
  public long getRecordsTotal() {
    return recordsTotal;
  }

  /**
   * @param recordsTotal 要设置的 recordsTotal
   */
  public void setRecordsTotal(final long recordsTotal) {
    this.recordsTotal = recordsTotal;
  }

  /**
   * @return recordsFiltered
   */
  public long getRecordsFiltered() {
    return recordsFiltered;
  }

  /**
   * @param recordsFiltered 要设置的 recordsFiltered
   */
  public void setRecordsFiltered(final long recordsFiltered) {
    this.recordsFiltered = recordsFiltered;
  }

  /**
   * @return data
   */
  public List<T> getData() {
    return data;
  }

  /**
   * @param data 要设置的 data
   */
  public void setData(final List<T> data) {
    this.data = data;
  }

  /**
   * @return error
   */
  public String getError() {
    return error;
  }

  /**
   * @param error 要设置的 error
   */
  public void setError(final String error) {
    this.error = error;
  }

}
