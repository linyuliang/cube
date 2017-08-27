package com.lyl.cube.entity;

import com.lyl.cube.core.base.BaseModel;
import lombok.Data;

@Data
public class City extends BaseModel {
  private Long id;
  private String name;
  private String state;
  private String country;
}
