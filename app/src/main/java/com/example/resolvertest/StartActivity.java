package com.example.resolvertest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);
  }

  public void onStart(View view) {
    Intent intent = new Intent("com.clover.TEST");
    intent.putExtra("parcelable", new AParcelable("Hello, parcel", 42));
    startActivity(intent);
  }
}
