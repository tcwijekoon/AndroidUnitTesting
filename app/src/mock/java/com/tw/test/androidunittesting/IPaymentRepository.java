package com.tw.test.androidunittesting.data;

public interface IPaymentRepository {

    interface IPaymentSuccessCallBack{
        void onPaymentSuccess(PaymentSuccess paySuccess);
    }
}
