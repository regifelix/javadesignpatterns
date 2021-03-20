package br.com.regifelix.designpatterns.adpter.paypal;

import br.com.regifelix.designpatterns.adpter.utils.Token;

public interface IPayPalPayments {

    Token authToken();

    void paypalPayment();

    void paypalReceive();


}
