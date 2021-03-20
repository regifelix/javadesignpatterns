package br.com.regifelix.designpatterns.adpter.mercadopago;

import br.com.regifelix.designpatterns.adpter.utils.Token;

public interface IMercadoPagoPayments {

    Token authToken();
    void sendPaymentMP();
    void receivePaymentMP();
}
