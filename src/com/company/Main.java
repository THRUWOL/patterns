package com.company;

import com.company.factory.AbstractFactory;
import com.company.factory.RussianFactory;
import com.company.product.Chair;
import com.company.product.Sofa;
import com.company.product.Table;

public class Main {

    public static void clientCode(AbstractFactory factory) {
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        table.putOn();
        sofa.relaxOn();
    }

    public static void main(String[] args) {
        System.out.println("Russian furniture:");
        clientCode(new RussianFactory());
    }
}
