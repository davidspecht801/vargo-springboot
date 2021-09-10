package com.example.vargo;

import com.example.vargo.dao.DAO;
import com.example.vargo.model.Customer;
import com.example.vargo.model.EducationRelation;
import com.example.vargo.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class VargoApplication {

    //private static DAO<Customer> dao;
    private static DAO<EducationRelation> dao;

    public VargoApplication(DAO<EducationRelation> dao){
        this.dao = dao;
        //this.e_dao = e_dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(VargoApplication.class, args);

        //System.out.println("\n Create Customer -------------------------\n");
        //Customer customer = new Customer("Joe", "Rogers", 2000);
        //dao.create(customer);

        //System.out.println("\n One Customer -----------------\n");
        //Optional<Customer> firstOne = dao.get(1);
        //System.out.println(firstOne.get());

        //Order order = new Order(200, 2);



        //springVue.setDescription("Learn to build Vue apps that talk to Spring Boot");
        //dao.update(springVue, 6);

        //dao.delete(4);


        //System.out.println("\n All Customers -------------------------\n");
        //List<Customer> courses = dao.list();
        //courses.forEach(System.out::println);
    }

}
