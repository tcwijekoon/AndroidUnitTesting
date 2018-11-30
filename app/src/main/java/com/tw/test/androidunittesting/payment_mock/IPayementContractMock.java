package com.tw.test.androidunittesting.payment_mock;

public interface IPayementContractMock {
    interface View {
        void showPaymentUi();
        void showPinUi();
    }

    interface UserActionsListener{
        void clickPay();
    }
}
