package com.example.vargo.web;

import com.example.vargo.dao.CustomerJdbcDAO;
//import com.example.vargo.model.Course;
//import com.example.vargo.model.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class WebController {
    private static final Logger log = LoggerFactory.getLogger(WebController.class);
    @GetMapping
    String getHome(Model model){
        return "index";
    }
}
