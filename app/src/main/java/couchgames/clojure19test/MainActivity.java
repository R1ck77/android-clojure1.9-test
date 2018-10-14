package couchgames.clojure19test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import clojure.java.api.Clojure;
import test.library.ClojureLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("MainActivity.onStart");
        TextView textView = (TextView) findViewById(R.id.output);
        System.out.println("Clojure code executing...");
        textView.setText(ClojureLibrary.sayHello());
        System.out.println("...executed");
    }
}
