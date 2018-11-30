package com.tw.test.androidunittesting.payment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.tw.test.androidunittesting.R;
import com.tw.test.androidunittesting.util.EmailValidator;

public class ActPayment extends AppCompatActivity implements IPayementContract.View{

    IPayementContract.UserActionsListener iPayUserAction;

    private EmailValidator mEmailValidator;
    private EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmailValidator = new EmailValidator();
        etEmail = findViewById(R.id.etEmail);
        etEmail.addTextChangedListener(mEmailValidator);
        iPayUserAction = new PaymentPresenter(this);
    }

    public void clickEmail(View v){
        if (!mEmailValidator.isValid()) {
            etEmail.setError("Invalid email");
            Toast.makeText(ActPayment.this, "Not saving personal information: Invalid email",Toast.LENGTH_SHORT).show();
            return;
        }
    }
    public void clickPayment(View v){
        iPayUserAction.clickPay();
    }

    public static int  getSum(int x, int y){
        return x+y;
    }

    @Override
    public void showPaymentUi() {
         Toast.makeText(ActPayment.this,"ActPayment - showPaymentUi",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPinUi() {

    }
}
