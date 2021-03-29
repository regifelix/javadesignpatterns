package br.com.regifelix.designpatterns.bridge.example1.platforms;

public interface IPlatform {
    void configureRMTP();
    void authToken();
    String getName();

}
