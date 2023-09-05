package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("===TEST 1: seller findById===");
        SellerDao sellerDao = DaoFactory.creatSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.print(seller);
    }
}