package com.tw.test.androidunittesting.payment_mock;

public class PaymentPresenterMock implements IPayementContractMock.UserActionsListener {

    IPayementContractMock.View iPayUi;

    public PaymentPresenterMock(IPayementContractMock.View iPayUi) {
        this.iPayUi = iPayUi;
    }

    @Override
    public void clickPay() {
        iPayUi.showPaymentUi();
    }
}
