package com.pratamawijaya.androidoop.model;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 9/6/15
 * Project : AndroidOOP
 */
public class CoffeMachine {
  private String method;

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String brewing(String method, Coffee coffee) {
    return "Brewing with normal machine, metode : " + method + " jenis kopi : " + coffee.getNama();
  }
}
