package org.homeworks.anton.dao.impl;

import org.homeworks.anton.dao.CalculatorDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
@Repository
@Transactional
public class CalculatorDaoImpl implements CalculatorDao  {

    @Override
    public void calcMethod(double valueOne,double valueTwo,String sign) throws SQLException {

        double result = switch (sign) {
            case "+" -> valueOne + valueTwo;
            case "-" -> valueOne - valueTwo;
            case "*" -> valueOne * valueTwo;
            case "/" -> valueOne / valueTwo;
            default -> 0;

        };
        System.out.println(result);
    }
}
