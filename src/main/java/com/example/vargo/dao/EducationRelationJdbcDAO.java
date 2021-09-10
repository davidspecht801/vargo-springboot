package com.example.vargo.dao;

import com.example.vargo.model.Customer;
import com.example.vargo.model.EducationRelation;
import com.example.vargo.model.EducationRelationResultSetExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Component
public class EducationRelationJdbcDAO implements DAO {

    private static final Logger log = LoggerFactory.getLogger(EducationRelationJdbcDAO.class);
    private JdbcTemplate jdbcTemplate;

    public EducationRelationJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    RowMapper<EducationRelation> rowMapper = (rs, rowNum) -> {
        EducationRelation relation = new EducationRelation();
        relation.setPersonName(rs.getString("FirstName") + " " + rs.getString("LastName"));
        relation.setEducationLevel(rs.getString("EducationLevel"));
        return relation;
    };

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

    public Map<EducationRelation.RelationType, List<EducationRelation>> findCustomerByRelation(int id){
        String sql = "select customers.FirstName, " +
                "customers.LastName, " +
                "education.EducationLevel " +
                "from customers " +
                "LEFT OUTER JOIN " +
                "education_relation ON " +
                "customers.ID = education_relation.CustomerID " +
                "LEFT OUTER JOIN education ON " +
                "education_relation.EducationID = education.EducationID WHERE " +
                "customers.ID = ?";
        return jdbcTemplate.query(sql, new Object[] {id}, new EducationRelationResultSetExtractor());
    }
}
