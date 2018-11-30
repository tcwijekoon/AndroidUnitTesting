package com.tw.test.androidunittesting.payment;

public interface IPayementContract {
    interface View {
        void showPaymentUi();
        void showPinUi();
    }

    interface UserActionsListener{
        void clickPay();
    }
}
