package br.com.regifelix.designpatterns.adpter.adapters;

import br.com.regifelix.designpatterns.adpter.mercadopago.IMercadoPagoPayments;
import br.com.regifelix.designpatterns.adpter.paypal.IPayPalPayments;
import br.com.regifelix.designpatterns.adpter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private IMercadoPagoPayments mercadoPagoPayments;

    public MercadoPagoAdapter(IMercadoPagoPayments mercadoPagoPayments) {
        this.mercadoPagoPayments = mercadoPagoPayments;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPagoPayments.sendPaymentMP();

    }

    @Override
    public void paypalReceive() {
        mercadoPagoPayments.receivePaymentMP();

    }
}
