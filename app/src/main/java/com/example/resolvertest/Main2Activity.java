package com.example.resolvertest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    ((TextView) findViewById(R.id.text)).setText("Resolver 2: " + getIntent().getParcelableExtra("parcelable"));
  }
}
