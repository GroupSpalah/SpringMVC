package org.homeworks.misha.dao;

import org.example.domain.Car;
import org.homeworks.misha.domain.CalculatorM;

import java.sql.SQLException;

public interface CalculatorDao {
    public void calcMethod(double valueOne,double valueTwo,String sign) throws SQLException;
    CalculatorM findById(int id);
}
