package com.pratamawijaya.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private Button btn3PointA, btn2PointA, btnFreeA;
  private Button btn3PointB, btn2PointB, btnFreeB;
  private Button btnReset;
  private TextView txtPointA, txtPointB;

  private int currentPointA = 0;
  private int currentPointB = 0;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // initialize view
    btn3PointA = (Button) findViewById(R.id.btnPoint3A);
    btn2PointA = (Button) findViewById(R.id.btnPoint2A);
    btnFreeA = (Button) findViewById(R.id.btnPointFreeA);

    btn3PointB = (Button) findViewById(R.id.btnPoint3B);
    btn2PointB = (Button) findViewById(R.id.btnPoint2B);
    btnFreeB = (Button) findViewById(R.id.btnPointFreeB);

    btnReset = (Button) findViewById(R.id.btnReset);

    txtPointA = (TextView) findViewById(R.id.txtPointA);
    txtPointB = (TextView) findViewById(R.id.txtPointB);

    // set listener
    btn3PointA.setOnClickListener(this);
    btn2PointA.setOnClickListener(this);
    btnFreeA.setOnClickListener(this);

    btn3PointB.setOnClickListener(this);
    btn2PointB.setOnClickListener(this);
    btnFreeB.setOnClickListener(this);

    btnReset.setOnClickListener(this);
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

  @Override public void onClick(View view) {
    // percabangan

    switch (view.getId()) {
      case R.id.btnPoint3A:
        changePointA(3);
        break;
      case R.id.btnPoint2A:
        changePointA(2);
        break;
      case R.id.btnPointFreeA:
        changePointA(1);
        break;
      case R.id.btnPoint3B:
        changePointB(3);
        break;
      case R.id.btnPoint2B:
        changePointB(2);
        break;
      case R.id.btnPointFreeB:
        changePointB(1);
        break;
      case R.id.btnReset:
        resetPoint();
        break;
    }
  }

  /**
   * reset point untuk kedua team
   */
  private void resetPoint() {
    currentPointA = 0;
    currentPointB = 0;
    txtPointA.setText("" + currentPointA);
    txtPointB.setText("" + currentPointB);
  }

  /**
   * merubah point untuk team B
   */
  private void changePointB(int i) {
    currentPointB += i;
    txtPointB.setText("" + currentPointB);
  }

  /**
   * merubah point untuk team A
   */
  private void changePointA(int i) {
    currentPointA += i;
    txtPointA.setText("" + currentPointA);
  }
}
