package com.pratamawijaya.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

  // global
  int priceOfCoffe = 5;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
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

  /**
   * event klik untuk button order
   *
   * @param v view button order
   */
  public void submitOrder(View v) {
    // do something
    displayPrice(5 * priceOfCoffe);
    displayQuantity(5);
  }

  /**
   * display quantity of coffe
   *
   * @param i quantity
   */
  private void displayQuantity(int i) {
    TextView quantity = (TextView) findViewById(R.id.quantity);
    quantity.setText("" + i);
  }

  /**
   * Menampilkhan harga product ke textview
   *
   * @param i harga produk
   */
  private void displayPrice(int i) {
    TextView txtPrice = (TextView) findViewById(R.id.price);
    txtPrice.setText("" + NumberFormat.getCurrencyInstance().format(i));
  }

  /**
   * @param number text for display
   * @deprecated dont use these method gaess
   */
  private void display(int number) {

  }
}
