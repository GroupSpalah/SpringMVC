package org.homeworks.anton.service.impl;

import lombok.AllArgsConstructor;
import org.homeworks.anton.dao.CalculatorDao;
import org.homeworks.anton.dao.impl.CalculatorDaoImpl;
import org.homeworks.anton.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@AllArgsConstructor
public class CalculatorServiceImpl implements CalculatorService {
    CalculatorDao dao;
    public CalculatorServiceImpl() {dao = new CalculatorDaoImpl();}
    @Override
    public void calcMethod(double valueOne, double valueTwo,String sign) throws SQLException{
      dao.calcMethod(valueOne,valueTwo,sign);
    }
}
