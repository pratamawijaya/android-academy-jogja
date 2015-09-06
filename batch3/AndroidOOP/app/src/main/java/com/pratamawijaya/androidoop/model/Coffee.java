package com.pratamawijaya.androidoop.model;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 9/6/15
 * Project : AndroidOOP
 */
public class Coffee {
  // attribute
  private int harga;
  private String nama;

  // constructor
  public Coffee() {
  }

  public Coffee(int harga, String nama) {
    this.harga = harga;
    this.nama = nama;
  }

  // getter and setter
  public int getHarga() {
    return harga;
  }

  public void setHarga(int harga) {
    this.harga = harga;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
}
