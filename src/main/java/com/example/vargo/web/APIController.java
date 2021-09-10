package com.example.vargo.web;

import com.example.vargo.dao.CustomerJdbcDAO;
import com.example.vargo.dao.EducationRelationJdbcDAO;
import com.example.vargo.dao.OrderJdbcDAO;
import com.example.vargo.model.Customer;
import com.example.vargo.model.EducationRelation;
import com.example.vargo.model.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class APIController {
    private CustomerJdbcDAO customerJdbcDAO;
    private OrderJdbcDAO orderJdbcDAO;
    private EducationRelationJdbcDAO educationRelationJdbcDAO;

    public APIController(EducationRelationJdbcDAO educationRelationJdbcDAO)
    {
        //this.customerJdbcDAO = customerJdbcDAO;
        //this.orderJdbcDAO = orderJdbcDAO;
        this.educationRelationJdbcDAO = educationRelationJdbcDAO;
    }

    //@RequestMapping(path = "api/customers/{id}", method = RequestMethod.GET)
    //public Optional<Customer> find_customer(@PathVariable int id){
        //return customerJdbcDAO.get(id);
    //}

    //@RequestMapping(path = "api/orders/{id}", method = RequestMethod.GET)
    //public Optional<Order> find_order(@PathVariable int id){
    //    return orderJdbcDAO.get(id);
    //}

    @RequestMapping(path = "api/relations/{id}", method = RequestMethod.GET)
    public Map<EducationRelation.RelationType, List<EducationRelation>> get_relations(@PathVariable int id){
        return educationRelationJdbcDAO.findCustomerByRelation(id);
    }

}
