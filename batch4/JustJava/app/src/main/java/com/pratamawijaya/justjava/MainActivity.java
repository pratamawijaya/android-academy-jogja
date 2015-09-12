package com.pratamawijaya.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  // 1. deklarasi button
  Button btnOrder;
  Button btnPlus;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // 2. inisiasi
    btnOrder = (Button) findViewById(R.id.btn_order);
    btnPlus = (Button) findViewById(R.id.btn_plus);

    btnOrder.setOnClickListener(this);
    btnPlus.setOnClickListener(this);

    //btnOrder.setOnClickListener(new View.OnClickListener() {
    //  @Override public void onClick(View view) {
    //    submitOrder();
    //  }
    //});
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  /**
   * method yang dijalankan ketika button order di klik
   */
  public void submitOrder() {
    displayPrice(100);
  }

  /**
   * menampilkan text atau angka
   *
   * @param i angka
   */
  private void displayPrice(int i) {
    Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @Override public void onClick(View view) {
    //if (view == btnOrder) {
    //  submitOrder();
    //} else if (view == btnPlus) {
    //  Toast.makeText(MainActivity.this, "button plus", Toast.LENGTH_SHORT).show();
    //}

    switch (view.getId()) {
      case R.id.btn_order:
        submitOrder();
        break;
      case R.id.btn_plus:
        Toast.makeText(MainActivity.this, "btn plus", Toast.LENGTH_SHORT).show();
        break;
    }
  }
}
