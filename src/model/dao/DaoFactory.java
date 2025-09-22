package model.dao;

import db.DB;
import model.dao.impl.SellerDoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDoJDBC(DB.getConnection());

    }
}
