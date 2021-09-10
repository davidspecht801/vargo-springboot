package com.example.vargo.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EducationRelationMapper implements RowMapper<EducationRelation> {
    @Override
    public EducationRelation mapRow(ResultSet rs, int i) throws SQLException {
        EducationRelation relation = new EducationRelation();
        relation.setPersonName(rs.getString("FirstName") + " " + rs.getString("LastName"));
        relation.setEducationLevel(rs.getString("EducationLevel"));
        return relation;
    }
}
