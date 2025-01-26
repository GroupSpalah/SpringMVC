package org.homeworks.misha.dao.impl;

import org.example.domain.Car;
import org.homeworks.misha.dao.CalculatorDao;
import org.homeworks.misha.domain.CalculatorM;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Repository
@Transactional
public class CalculatorDaoImpl implements CalculatorDao {

    @Override
    public void calcMethod(double valueOne, double valueTwo, String sign) throws SQLException {

        double result = switch (sign) {
            case "+" -> valueOne + valueTwo;
            case "-" -> valueOne - valueTwo;
            case "*" -> valueOne * valueTwo;
            case "/" -> valueOne / valueTwo;

            default -> 0;

        };
        System.out.println(result);
    }

    @Override
    public CalculatorM findById(int id) {
        return null;
    }
}
