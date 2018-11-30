package com.tw.test.androidunittesting.payment;

public class PaymentPresenter implements IPayementContract.UserActionsListener {

    IPayementContract.View iPayUi;

    public PaymentPresenter(IPayementContract.View iPayUi) {
        this.iPayUi = iPayUi;
    }

    @Override
    public void clickPay() {
        iPayUi.showPaymentUi();
    }
}
