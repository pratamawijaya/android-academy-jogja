package com.pratamawijaya.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  // coffee price
  private static final int HARGA_KOPI = 5;
  // topping price
  private static final int PRICE_CHOCO = 1;
  private static final int PRICE_VANILLA = 1;
  // 1. deklarasi button
  private Button btnOrder;
  private Button btnPlus, btnMinus;
  private TextView txtQuantity, txtPrices;
  private CheckBox cbChoco, cbVanilla;
  private int quantityTotal = 0;
  private int totalPrice;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // 2. inisiasi
    btnOrder = (Button) findViewById(R.id.btn_order);
    btnPlus = (Button) findViewById(R.id.btn_plus);
    btnMinus = (Button) findViewById(R.id.btn_min);
    txtQuantity = (TextView) findViewById(R.id.text_counter);
    txtPrices = (TextView) findViewById(R.id.text_price);
    cbChoco = (CheckBox) findViewById(R.id.cb_choco);
    cbVanilla = (CheckBox) findViewById(R.id.cb_vanilla);

    btnOrder.setOnClickListener(this);
    btnPlus.setOnClickListener(this);
    btnMinus.setOnClickListener(this);

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
    totalPrice = quantityTotal * HARGA_KOPI;

    if (cbChoco.isChecked()) {
      totalPrice = totalPrice + (PRICE_CHOCO * quantityTotal);
    }

    if (cbVanilla.isChecked()) {
      totalPrice = totalPrice + (PRICE_VANILLA * quantityTotal);
    }

    displayPrice(totalPrice);
  }

  /**
   * menampilkan text atau angka
   *
   * @param i angka
   */
  private void displayPrice(int i) {
    String text = "Total : " + NumberFormat.getCurrencyInstance().format(i);
    text += "\nAdd Choco : " + cbChoco.isChecked();
    text += "\nAdd Vanilla : " + cbVanilla.isChecked();
    text += "\n\nThanks Mr Pratama !!!";

    txtPrices.setText("" + text);
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
    if (view == btnOrder) {
      submitOrder();
    } else if (view == btnPlus) {
      incrementQuantity(1);
    } else if (view == btnMinus) {
      decreamentQuantity(1);
    }
  }

  /**
   * mengurangi jumlah quantity
   *
   * @param i nilai
   */
  private void decreamentQuantity(int i) {
    // decreament
    if (quantityTotal > 0) {
      quantityTotal = quantityTotal - i;
      txtQuantity.setText("" + quantityTotal);
    }
  }

  /**
   * menambah jumlah quantity
   *
   * @param i nilai
   */
  private void incrementQuantity(int i) {
    // increment
    quantityTotal = quantityTotal + i;
    txtQuantity.setText("" + quantityTotal);
  }
}
