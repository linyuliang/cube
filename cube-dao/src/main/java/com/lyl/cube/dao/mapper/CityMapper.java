package com.lyl.cube.dao.mapper;

import com.lyl.cube.entity.City;
import com.lyl.cube.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper extends BaseMapper<City> {

  @Select("select * from city where state = #{state}")
  List<City> findByState(@Param("state") String state);
}