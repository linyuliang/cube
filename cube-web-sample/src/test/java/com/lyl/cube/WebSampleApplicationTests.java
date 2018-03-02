package com.lyl.cube;

import com.lyl.cube.dao.service.ICityService;
import com.lyl.cube.entity.City;
import com.lyl.cube.entity.datatable.DataPage;
import com.lyl.cube.entity.datatable.DataTableRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebSampleApplicationTests {

	@Autowired
	private ICityService cityService;

	@Test
	public void contextLoads() {
    DataTableRequest dtr = new DataTableRequest();
    dtr.setStart(0);
    dtr.setLength(10);
    DataPage<City> citys = cityService.findByState("CA", dtr);
    citys.getData().forEach(city -> {
      System.out.println(city);
    });
  }
}
