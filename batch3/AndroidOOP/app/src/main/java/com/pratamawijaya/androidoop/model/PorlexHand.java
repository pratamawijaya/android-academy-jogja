package com.pratamawijaya.androidoop.model;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 9/6/15
 * Project : AndroidOOP
 */
public class PorlexHand extends CoffeMachine {
  //@Override public String brewing(String method, Coffee coffee) {
  //  return "Brewing with porlex, metode : " + method + " jenis kopi : " + coffee.getNama();
  //}

  @Override public String brewing(String method, Coffee coffee) {
    return super.brewing(method, coffee);
  }
}
