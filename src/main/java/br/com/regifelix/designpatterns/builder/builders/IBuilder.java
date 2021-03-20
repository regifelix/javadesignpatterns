package br.com.regifelix.designpatterns.builder.builders;

import br.com.regifelix.designpatterns.builder.components.CarType;
import br.com.regifelix.designpatterns.builder.components.Color;
import br.com.regifelix.designpatterns.builder.components.Engine;
import br.com.regifelix.designpatterns.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(Color color);


}
