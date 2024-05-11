package com.company.factory;

import com.company.product.Chair;
import com.company.product.Sofa;
import com.company.product.Table;

public interface AbstractFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
