package model.dao;

import model.dao.impl.SellerDaoJDBC;

//Instancia DAOS
public class DaoFactory {

    public static SellerDao createSellerDao(){

        return new SellerDaoJDBC();
    }
}
