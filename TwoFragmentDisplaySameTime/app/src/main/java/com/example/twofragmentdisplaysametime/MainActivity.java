package com.example.twofragmentdisplaysametime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SendTextListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.send_fragment_container, SendFragment.getInstance()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.receive_fragment_container, ReceivedFragment.getInstance()).commit();
        
	/** https://viettuts.vn/java-new-features/toan-tu-dau-2-cham-trong-java-8
         * Toán tử dấu 2 chấm (::) trong Java hay còn được gọi là toán tử tham chiếu phương thức trong java.
         * */
	SendFragment.getInstance().setSendTextListener(this::sendText);
    }

    @Override
    public void sendText(String text) {
        ReceivedFragment.getInstance().getText(text);
    }
}