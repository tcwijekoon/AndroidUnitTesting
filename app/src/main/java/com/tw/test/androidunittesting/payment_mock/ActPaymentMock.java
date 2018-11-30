package com.tw.test.androidunittesting.payment_mock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.tw.test.androidunittesting.R;

public class ActPaymentMock extends AppCompatActivity implements IPayementContractMock.View{

    IPayementContractMock.UserActionsListener iPayUserAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iPayUserAction = new PaymentPresenterMock(this);
    }

    public void clickPayment(View v){
        iPayUserAction.clickPay();
    }

    public static int  getSum(int x, int y){
        return x+y;
    }

    @Override
    public void showPaymentUi() {
         Toast.makeText(ActPaymentMock.this,"ActPaymentMock - showPaymentUi",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPinUi() {

    }
}
