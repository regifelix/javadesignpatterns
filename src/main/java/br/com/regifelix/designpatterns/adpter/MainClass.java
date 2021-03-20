package br.com.regifelix.designpatterns.adpter;

import br.com.regifelix.designpatterns.adpter.adapters.MercadoPagoAdapter;
import br.com.regifelix.designpatterns.adpter.adapters.PayonnerAdapter;
import br.com.regifelix.designpatterns.adpter.mercadopago.MercadoPago;
import br.com.regifelix.designpatterns.adpter.payoneer.Payonner;
import br.com.regifelix.designpatterns.adpter.paypal.IPayPalPayments;

/**
 * O adapter permite implementar interfaces incompatíveis e fazer com que o código continue funcionando
 * Sem precisar de alterar muito no codigo legado
 */
public class MainClass {

    public static void main(String[] args) {
        // Antes no método antigo:
        // IPayPalPayments payment = new PayPal();

        //Agora usando o adapter
        //IPayPalPayments payment = new PayonnerAdapter(new Payonner());

        //Exemplo usado com o mercado pago
        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());

        //Os métodos que estavam anteriormente continuam os mesmo
        payment.paypalPayment();
        payment.paypalReceive();
    }
}
