package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); //Injeçao de independencia

        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TEST 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller x : list) {
            System.out.println(x);
        }

        System.out.println("\n==== TEST 3: seller findAll ====");
        list = sellerDao.findAll();

        for (Seller x : list) {
            System.out.println(x);
        }
    }
}
