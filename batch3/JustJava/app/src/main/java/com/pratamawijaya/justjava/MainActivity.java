package com.pratamawijaya.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  // global
  int priceOfCoffe = 5;
  private int quantity = 0;
  private int total = 0;
  private Button btnTambah, btnKurang;
  private TextView txtPrice;
  private CheckBox cbWhippedCream, cbChocolate;
  private EditText inputNama;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    txtPrice = (TextView) findViewById(R.id.price);
    cbWhippedCream = (CheckBox) findViewById(R.id.cbWhippedCream);
    btnKurang = (Button) findViewById(R.id.btnKurang);
    btnTambah = (Button) findViewById(R.id.btnTambah);
    inputNama = (EditText) findViewById(R.id.inputNama);
    cbChocolate = (CheckBox) findViewById(R.id.cbChocolate);

    btnKurang.setOnClickListener(this);
    btnTambah.setOnClickListener(this);
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
    if (cbWhippedCream.isChecked()) {
      total = total + 1;
    }

    if (cbChocolate.isChecked()) {
      total = total + 1;
    }
    txtPrice.setText(String.format(
        "Name : %s\n"
            + "Add whiped cream : %s\n"
            + "Add chocolate: %s\n"
            + "Quantity: %d\n"
            + "Total: "+ NumberFormat.getCurrencyInstance().format(total) + "\nThank You!!!",
        inputNama.getText(), cbWhippedCream.isChecked(), cbChocolate.isChecked(), quantity, total));
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
    txtPrice.setText("" + NumberFormat.getCurrencyInstance().format(i));
  }

  /**
   * @param number text for display
   * @deprecated dont use these method gaess
   */
  private void display(int number) {

  }

  @Override public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnTambah:
        quantity = quantity + 1;
        displayQuantity(quantity);
        break;
      case R.id.btnKurang:
        if (quantity > 0) {
          quantity = quantity - 1;
          displayQuantity(quantity);
        }
        break;
    }
    total = quantity * priceOfCoffe;
    displayPrice(total);
  }
}
