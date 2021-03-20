package br.com.regifelix.designpatterns.adpter.payoneer;

import br.com.regifelix.designpatterns.adpter.utils.Token;

public class Payonner implements IPayonnerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via payonneer!");

    }

    @Override
    public void receivePayment() {

        System.out.println("Recebendo pagamentos via payonner!");

    }
}
