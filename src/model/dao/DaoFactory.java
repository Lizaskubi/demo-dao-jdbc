package model.dao;

import model.dao.impl.SellerDoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDoJDBC();

    }
}
