package com.example.vargo.dao;

import com.example.vargo.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@Component
public class CustomerJdbcDAO implements DAO<Customer> {
    private static final Logger log = LoggerFactory.getLogger(CustomerJdbcDAO.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Customer> rowMapper = (rs, rowNum) -> {
        Customer customer = new Customer();
        customer.setCustomerId(rs.getInt("ID"));
        customer.setFirstName(rs.getString("FirstName"));
        customer.setLastName(rs.getString("LastName"));
        customer.setRewardPoints(rs.getInt("RewardPoints"));
        return customer;
    };

    public CustomerJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Customer> list() {
        String sql = "SELECT ID, FirstName, LastName, RewardPoints from customers";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create(Customer customer) {
        String sql = "insert into customers(FirstName,LastName,RewardPoints) values (?,?,?)";
        int insert = jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getRewardPoints());
        if (insert == 1){
            log.info("New course created: " + customer.getLastName());
        }
    }

    @Override
    public Optional<Customer> get(int id) {
        String sql = "SELECT ID, FirstName, LastName, RewardPoints from customers where ID = ?";
        Customer customer = null;
        try {
            customer = jdbcTemplate.queryForObject(sql, new Object[]{id},rowMapper);
        } catch (DataAccessException ex){
            log.info("Customer not found: " + id);
        }
        return Optional.ofNullable(customer);
    }

    @Override
    public void update(Customer customer, int id) {
        String sql = "update customers set FirstName = ?, LastName = ?, RewardPoints = ? where ID = ?";
        int update = jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getRewardPoints(), id);
        if ( update == 1 ){
            log.info("Customer updated: " + customer.getLastName());
        }
    }

    @Override
    public void delete(int id) {

    }
}
