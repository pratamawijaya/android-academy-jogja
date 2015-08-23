package com.android.example.justjavax;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

  private static final int DEFAULT_NUMBER_COFFEE = 2;
  private static final int PRICES = 5;// $5
  private static final int DEFAULT_ORDER = 1;

  private int currentOrder = 0;

  // 1. Definisikan view
  private Button btnOrder, btnPlus, btnMinus;
  private TextView quantityOrder;
  private TextView pricesTextView;

  // ini method yang pertama kali dijalankan
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // 2.
    // inisiasi button
    btnOrder = (Button) findViewById(R.id.btnOrder);
    quantityOrder = (TextView) findViewById(R.id.quantity_text_view);
    pricesTextView = (TextView) findViewById(R.id.prices_text_view);
    btnMinus = (Button) findViewById(R.id.btnMinus);
    btnPlus = (Button) findViewById(R.id.btnPlus);

    // beri event listener
    btnOrder.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {

        Toast.makeText(MainActivity.this, "btn order click", Toast.LENGTH_SHORT).show();
        // panggil method
        displayPrices(DEFAULT_NUMBER_COFFEE * PRICES);
      }
    });

    // ketika tombol plus ditekan
    btnPlus.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        displayOrderTambah(DEFAULT_ORDER);
      }
    });

    // ketika tombol minus ditekan
    btnMinus.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        displayOrderMinus(DEFAULT_ORDER);
      }
    });
  }


  /**
   * Method set angka ke textview quantityOrder
   */
  private void displayOrderTambah(int i) {
    // set angka ke variable
    currentOrder = currentOrder + i;
    //currentOrder += i;
    quantityOrder.setText("" + currentOrder);
  }

  /**
   *
   * @param i
   */
  private void displayOrderMinus(int i) {
    if (currentOrder > 0) {
      currentOrder = currentOrder - i;
      quantityOrder.setText("" + currentOrder);
    } else {
      Toast.makeText(MainActivity.this, "Order tidak dapat negatif", Toast.LENGTH_SHORT).show();
    }
  }

  private void displayPrices(int number) {
    pricesTextView.setText(NumberFormat.getCurrencyInstance().format(number));
  }

  // ini method untuk generate menu
  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  /**
   * acess modifier
   * - private
   * - protected
   * - public
   */

  // ketika menunya di klik
  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
      return true;
    } else if (id == R.id.action_help) {
      Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
    }

    return super.onOptionsItemSelected(item);
  }
}