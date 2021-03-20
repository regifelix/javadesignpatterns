package br.com.regifelix.designpatterns.builder;

import br.com.regifelix.designpatterns.builder.builders.CarBuilder;
import br.com.regifelix.designpatterns.builder.builders.TruckBuilder;
import br.com.regifelix.designpatterns.builder.cars.Car;
import br.com.regifelix.designpatterns.builder.cars.Truck;
import br.com.regifelix.designpatterns.builder.director.Director;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * No design pattern Builder teremos o Produtos (Car Truck), o Builder que tem os metodos e propriedades para construir carro,
 * e o director que sabe os passos para gerar o produto
 *
 * O design pattern builder é usado principalmente quando se um objeto cheio de parametros e que se tem que criar diversos tipos d
 * desse objeto, cada um com alguns tipos de parâmetros, e para nao criar diversos construtores desse objeto fazemos uso da padrão Builder
 *
 */
public class ManClass {
    public static void main(String[] args) {
        Director director = new Director();

        //criando carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();

        System.out.println("Carro " + car.getCartype() + " produzido com sucesso!");


        //criando caminhao
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Truck " + truck.getCartype() + " produzido com sucesso");

        //criando carro sport
        CarBuilder sportBuilder = new CarBuilder();
        director.constructCarSport(sportBuilder);
        Car carSport = sportBuilder.getResult();
        System.out.println(carSport.getResult());




    }
}
