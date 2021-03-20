package br.com.regifelix.designpatterns.adpter.mercadopago;

import br.com.regifelix.designpatterns.adpter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPaymentMP() {
        System.out.println("Enviando pagamento via mercado pago!");

    }

    @Override
    public void receivePaymentMP() {
        System.out.println("Recebendo pagamento via mercado pago!");

    }
}
