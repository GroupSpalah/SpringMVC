package org.homeworks.misha.service;

import org.example.domain.Car;
import org.homeworks.misha.domain.CalculatorM;

public interface CalculatorService {
    public void calcMethod(double valueOne, double valueTwo,String sign) throws Exception;
    CalculatorM findById(int id);
}
