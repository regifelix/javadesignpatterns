package br.com.regifelix.designpatterns.adpter.adapters;

import br.com.regifelix.designpatterns.adpter.payoneer.Payonner;
import br.com.regifelix.designpatterns.adpter.paypal.IPayPalPayments;
import br.com.regifelix.designpatterns.adpter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner) {
        this.payonner = payonner;
        System.out.println("Adaptando o payonner usando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();

    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
