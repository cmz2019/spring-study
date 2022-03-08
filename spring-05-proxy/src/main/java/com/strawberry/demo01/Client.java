package com.strawberry.demo01;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(landlord);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
