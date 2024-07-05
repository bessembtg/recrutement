package com.sancella.recrutement.service;

import com.sancella.recrutement.entity.ListeDeCv;
import com.sancella.recrutement.repositry.ListeDeCvRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class    ListeDeCvService {

    @Autowired
    private ListeDeCvRepository listeDeCvRepository;


    public void submitCv(ListeDeCv cv) {
        listeDeCvRepository.save(cv);
    }



        public byte[] getCvContentById(Integer cvId) {
            Optional<ListeDeCv> optionalCv = listeDeCvRepository.findById(cvId);
            return optionalCv.map(ListeDeCv::getCv).orElse(null);
        }
    }


