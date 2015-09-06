package com.pratamawijaya.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView txtStatus;
  private ImageView imgCookie;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    txtStatus = (TextView) findViewById(R.id.status_text_view);
    imgCookie = (ImageView) findViewById(R.id.android_cookie_image_view);

    txtStatus.setText("I'm so hungry");
    imgCookie.setImageResource(R.drawable.before_cookie);
  }

  /**
   * Called when the cookie should be eaten.
   */
  public void eatCookie(View view) {
    // TODO: Find a reference to the ImageView in the layout. Change the image.

    // TODO: Find a reference to the TextView in the layout. Change the text.

    txtStatus.setText("I'm so full");
    imgCookie.setImageResource(R.drawable.after_cookie);

    Log.d("MainActivity", "Button eat click ");
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
