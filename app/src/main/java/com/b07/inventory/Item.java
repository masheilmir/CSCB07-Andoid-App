package com.b07.inventory;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * This is an interface to show the item
 */
public interface Item extends Serializable {
  public int getId();

  public void setId(int id);

  public String getName();

  public void setName(String name);

  public BigDecimal getPrice();

  public void setPrice(BigDecimal price);
}
