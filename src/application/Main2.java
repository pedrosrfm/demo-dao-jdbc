package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Scanner;

public class Main2 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===TEST 1: department insert===");
        Department department = new Department(null, "Design");
        departmentDao.insert(department);
        System.out.println("Department inserted! Id = " + department.getId());

        System.out.println("===TEST 2: department findById===");
        System.out.print("Type ID to search: ");
        int id = sc.nextInt();
        Department obj = departmentDao.findById(id);
        System.out.println(obj);

        System.out.println("===TEST 3: department update===");
        Department department1 = departmentDao.findById(3);
        department1.setName("Music");
        departmentDao.update(department1);
        System.out.println("Department updated!");
    }
}
