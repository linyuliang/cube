package com.lyl.cube.dao.service;

import com.baomidou.mybatisplus.service.IService;
import com.lyl.cube.entity.City;

public interface ICityService extends IService<City> {
  City findByState(String state);
}
