package com.lyl.cube.dao.service;

import com.lyl.cube.entity.City;
import com.lyl.cube.entity.dataTable.DataPage;
import com.lyl.cube.entity.dataTable.DataTableRequest;
import com.lyl.cube.mybatis.IService;

public interface ICityService extends IService<City> {

  DataPage<City> findByState(String state, DataTableRequest dtr);
}
