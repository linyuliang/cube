package com.lyl.cube.core.base;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author linyl linyuliang.85@gmail.com
 * @ClassName:BaseModel
 * @Description: 实体类的基础父类，定义基本的toString，hashcode，equals等
 */
public abstract class BaseModel implements Serializable {

  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
