package com.lyl.cube.dao.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lyl.cube.dao.mapper.CityMapper;
import com.lyl.cube.dao.service.ICityService;
import com.lyl.cube.entity.City;
import com.lyl.cube.entity.datatable.DataPage;
import com.lyl.cube.entity.datatable.DataTableRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements ICityService {

  @Autowired
  CityMapper cityMapper;

  public DataPage<City> findByState(String state, DataTableRequest dtr) {
    Page<City> page = PageHelper.offsetPage(dtr.getStart(), dtr.getLength(), true);
    page.setOrderBy(dtr.getOrderStr());
    page.doSelectPage(() -> cityMapper.findByState(state));
    DataPage<City> results = new DataPage<City>(page.getTotal(), page.getResult());
    return results;
  }
}
