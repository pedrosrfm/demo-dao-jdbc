package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===TEST 1: department insert===");
        Department department = new Department(null, "Design");
        departmentDao.insert(department);
        System.out.println("Department inserted! Id = " + department.getId());

        System.out.println("\n===TEST 2: department findById===");
        System.out.print("Type ID to search: ");
        int id = sc.nextInt();
        Department department1 = departmentDao.findById(id);
        System.out.println(department1);

        System.out.println("\n===TEST 3: department findAll===");
        List<Department> list = departmentDao.findAll();
        for (Department department2 : list){
            System.out.println(department2);
        }

        System.out.println("\n===TEST 4: department update===");
        Department department3 = departmentDao.findById(3);
        department3.setName("Music");
        departmentDao.update(department3);
        System.out.println("Department updated!");

        System.out.println("\n===TEST 5: department delete===");
        System.out.print("Type department id: ");
        int testFiveId = sc.nextInt();
        departmentDao.deleteById(testFiveId);
        System.out.println("Department deleted");
    }
}
