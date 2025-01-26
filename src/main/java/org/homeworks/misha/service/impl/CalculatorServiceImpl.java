package org.homeworks.misha.service.impl;

import lombok.AllArgsConstructor;
import org.example.domain.Car;
import org.homeworks.misha.dao.CalculatorDao;
import org.homeworks.misha.dao.impl.CalculatorDaoImpl;
import org.homeworks.misha.domain.CalculatorM;
import org.homeworks.misha.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@AllArgsConstructor
public class CalculatorServiceImpl implements CalculatorService {
    CalculatorDao dao;
    public CalculatorServiceImpl() {dao = new CalculatorDaoImpl();}
    @Override
    public void calcMethod(double valueOne, double valueTwo, String sign) throws SQLException{
      dao.calcMethod(valueOne,valueTwo,sign);
    }

    @Override
    public CalculatorM findById(int id) {
        return dao.findById(id);
    }
}
