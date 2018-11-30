package com.tw.test.androidunittesting;

import com.tw.test.androidunittesting.payment.IPayementContract;
import com.tw.test.androidunittesting.payment.PaymentPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

public class PaymentUnitTest {

    @Mock
    private IPayementContract.View iPayementView ;

    private PaymentPresenter payPresenter ;

    @Before
    public void setupPaymentPresenter(){
        MockitoAnnotations.initMocks(this);
        payPresenter = new PaymentPresenter(iPayementView);
    }

    @Test
    public void clickOnPayButton(){
        payPresenter.clickPay();
        verify(iPayementView).showPaymentUi();
//        verify(iPayementView).showPinUi();
    }
}
