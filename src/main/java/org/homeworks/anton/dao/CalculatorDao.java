package org.homeworks.anton.dao;

import java.sql.SQLException;

public interface CalculatorDao {
    public void calcMethod(double valueOne,double valueTwo,String sign) throws SQLException;
}
