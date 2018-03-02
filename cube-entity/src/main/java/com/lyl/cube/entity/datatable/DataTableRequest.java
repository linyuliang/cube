package com.lyl.cube.entity.datatable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Sort;


public class DataTableRequest {

  private int draw;
  private int start;
  private int length;
  private List<Column> columns = new ArrayList<Column>();
  private List<Order> order = new ArrayList<Order>();
  private Search search = new Search();
  private Map<String, Object> params = new HashMap<String, Object>();

  public int getDraw() {
    return draw;
  }

  public void setDraw(int draw) {
    this.draw = draw;
  }

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public List<Column> getColumns() {
    return columns;
  }

  public void setColumns(List<Column> columns) {
    this.columns = columns;
  }

  public List<Order> getOrder() {
    return order;
  }

  public void setOrder(List<Order> order) {
    this.order = order;
  }

  public Search getSearch() {
    return search;
  }

  public void setSearch(Search search) {
    this.search = search;
  }

  public String getOrderStr() {
    String orderStr = "";
    for (Order orderobj : order) {
      orderStr = orderStr
          .concat("," + columns.get(orderobj.getColumn()).getName() + " " + orderobj.getDir());
    }
    return orderStr.length() > 0 ? orderStr.substring(1) : orderStr;
  }

  public Sort getMongoSort() {
    Sort sort = null;
    for (Order orderobj : order) {
      if (sort == null) {
        sort = new Sort(Sort.Direction.fromString(orderobj.getDir()),
            columns.get(orderobj.getColumn()).getName());
      } else {
        sort = sort.and(new Sort(Sort.Direction.fromString(orderobj.getDir()),
            columns.get(orderobj.getColumn()).getName()));
      }
    }
    return sort;
  }

  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }
}
