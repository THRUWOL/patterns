package com.company.factory;

import com.company.product.*;

public class RussianFactory implements AbstractFactory{
    @Override
    public Chair createChair() {
        return new RussianChair();
    }

    @Override
    public Sofa createSofa() {
        return new RussianSofa();
    }

    @Override
    public Table createTable() {
        return new RussianTable();
    }
}
