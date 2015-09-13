package com.pratamawijaya.myapplication1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private LinearLayout container;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    container = (LinearLayout) findViewById(R.id.container);

    TextView teks = new TextView(this);
    teks.setText("Hello");
    teks.setTextSize(22);
    teks.setTextColor(Color.RED);

    container.addView(teks);

    // proses instance
    //MonsterLaut monster1 = new MonsterLaut();
    //monster1.setHp(100);
    //monster1.setStrenght(250);
    //monster1.setMp(100);
    //
    //MonsterLaut monster2 = new MonsterLaut(100, 150, 200);
    //
    //Gyarados gyarados1 = new Gyarados();
    //gyarados1.setHp(1000);
    //gyarados1.setMp(100);
    //gyarados1.setStrenght(250);
    //
    //Toast.makeText(MainActivity.this, "" + gyarados1.attackSkillOne(), Toast.LENGTH_SHORT).show();
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
}
