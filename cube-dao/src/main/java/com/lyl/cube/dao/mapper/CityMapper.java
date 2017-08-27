package com.lyl.cube.dao.mapper;

import com.lyl.cube.dao.SuperMapper;
import com.lyl.cube.entity.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CityMapper extends SuperMapper<City> {

  @Select("select * from city where state = #{state}")
  City findByState(@Param("state") String state);
}