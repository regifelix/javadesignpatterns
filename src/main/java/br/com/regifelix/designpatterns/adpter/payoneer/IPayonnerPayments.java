package br.com.regifelix.designpatterns.adpter.payoneer;

import br.com.regifelix.designpatterns.adpter.utils.Token;

public interface IPayonnerPayments {
    Token authToken();

    void sendPayment();

    void receivePayment();

}
