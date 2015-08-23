package com.android.example.justjavax.model;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 8/23/15
 * Project : JustJavax
 */
public class Car {
  // attribute
  private String color;
  private String platnomor;

  // empty contructor
  public Car() {
  }

  // constructor with parameter
  public Car(String color, String platnomor) {
    this.color = color;
    this.platnomor = platnomor;
  }

  // constructor with single paramter
  public Car(String color) {
    this.color = color;
  }

  // method
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getPlatnomor() {
    return platnomor;
  }

  public void setPlatnomor(String platnomor) {
    this.platnomor = platnomor;
  }
}
