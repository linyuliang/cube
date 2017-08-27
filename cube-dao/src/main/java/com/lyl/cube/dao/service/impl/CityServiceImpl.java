package com.lyl.cube.dao.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lyl.cube.dao.mapper.CityMapper;
import com.lyl.cube.dao.service.ICityService;
import com.lyl.cube.entity.City;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {
  @Override
  public City findByState(String state) {
    return baseMapper.findByState(state);
  }
}
