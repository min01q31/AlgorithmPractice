package com.iu.algorithmpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/*
문제. 두개의 숫자를 입력받아서 버튼을 누르면 합을 띄워주자
 */
public class Question01Activity extends BaseActivity {

    private android.widget.EditText firstNumEdt;
    private android.widget.EditText secondNumEdt;
    private android.widget.Button calculateBtn;
    private android.widget.TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question01);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //계산한 버튼이 눌리면 숫자 두개를 int로 따내서 result로 출력

                //첫번째 숫자를 String형태로 따냄, 그후 String형태를 Int로 변환
                String firstNumStr = firstNumEdt.getText().toString();
                int firstNum = Integer.parseInt(firstNumStr);

                //두번째 숫자를 (~)
                String secondNumstr = secondNumEdt.getText().toString();
                int secondNum = Integer.parseInt(secondNumstr);

                int result = firstNum + secondNum;
                resultTxt.setText(String.valueOf(result));
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.resultTxt = (TextView) findViewById(R.id.resultTxt);
        this.calculateBtn = (Button) findViewById(R.id.calculateBtn);
        this.secondNumEdt = (EditText) findViewById(R.id.secondNumEdt);
        this.firstNumEdt = (EditText) findViewById(R.id.firstNumEdt);
    }
}
