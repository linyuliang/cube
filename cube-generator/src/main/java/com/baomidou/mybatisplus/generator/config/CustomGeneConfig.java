package com.baomidou.mybatisplus.generator.config;

import com.baomidou.mybatisplus.generator.InjectionConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by linyu on 2017/9/22.
 */
public class CustomGeneConfig extends InjectionConfig {

  /**
   * 作者
   */
  private String author;

  /**
   * 邮箱
   */
  private String email;

  /**
   * 创建时间
   */
  private String createTime;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  @Override
  public void initMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("author", author);
    map.put("email", email);
    if (null == createTime || "".equals(createTime)) {
      String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
      map.put("createTime", date);
    } else {
      map.put("createTime", createTime);
    }
    this.setMap(map);
  }
}
