package br.com.regifelix.designpatterns.adpter.paypal;

import br.com.regifelix.designpatterns.adpter.utils.Token;

public class PayPal implements IPayPalPayments{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via paypal!");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via paypal!");

    }
}
