package com.sancella.recrutement.controller;


import com.sancella.recrutement.repositry.PlanningDesEntretiensRepository;
import com.sancella.recrutement.service.ListeDeCvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlanningDesEntretiensController {

    @Autowired
    PlanningDesEntretiensRepository planningDesEntretiensRepository;

}
