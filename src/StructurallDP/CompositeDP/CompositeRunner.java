package StructurallDP.CompositeDP;

import java.util.Arrays;


public class CompositeRunner {
    public static void main(String[] args) {
compositDemo();

    }
    public static void compositDemo(){
        Department FinanceDepartment=new Finance();
        Department SalesDepartment=new Sales();
        Department regionalDepartment=new RegionalDepartment( Arrays.asList(FinanceDepartment,SalesDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("*********************");
        System.out.println(regionalDepartment.getEmployees());
    }
}
