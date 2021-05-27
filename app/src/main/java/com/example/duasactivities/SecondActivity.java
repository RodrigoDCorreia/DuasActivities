package com.example.duasactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.duasactivities.extra.REPLY";

    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mReply = findViewById(R.id.editText_second);
        Intent intent = getIntent(); // pega o intent
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);// recebe a menssagem
        TextView textView = findViewById(R.id.text_message); // referencia textview
        textView.setText(message);
    }

    public void returnReply(View view) {
        Intent replyintent = new Intent();
        String reply = mReply.getText().toString();
        replyintent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyintent);
        finish();
    }
}