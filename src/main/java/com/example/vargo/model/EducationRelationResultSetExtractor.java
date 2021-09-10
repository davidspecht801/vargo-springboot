package com.example.vargo.model;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EducationRelationResultSetExtractor implements ResultSetExtractor<Map<EducationRelation.RelationType, List<EducationRelation>>> {
    @Override
    public Map<EducationRelation.RelationType, List<EducationRelation>> extractData(ResultSet rs) throws SQLException, DataAccessException {
        Map<EducationRelation.RelationType, List<EducationRelation>> relations = new HashMap<EducationRelation.RelationType, List<EducationRelation>>();
        List<EducationRelation> relationList = new ArrayList<EducationRelation>();
        while (rs.next()){
            relationList.add(extractRelation(rs));
        }
        relations.put(EducationRelation.RelationType.CUSTOMER, relationList);
        return relations;
    }

    private EducationRelation extractRelation(ResultSet rs) throws SQLException {
        EducationRelation educationRelation = new EducationRelation();
        educationRelation.setEducationLevel(rs.getString("EducationLevel"));
        educationRelation.setPersonName(rs.getString("FirstName") + " " + rs.getString("LastName"));
        return educationRelation;
    }
}
