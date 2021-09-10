package com.example.vargo.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@Component
public class OrderJdbcDAO implements DAO {
    @Override
    public List list() {
        return null;
    }

    @Override
    public void create(Object o) {

    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
