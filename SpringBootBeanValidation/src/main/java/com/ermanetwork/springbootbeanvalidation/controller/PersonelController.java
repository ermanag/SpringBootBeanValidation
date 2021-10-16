package com.ermanetwork.springbootbeanvalidation.controller;

import com.ermanetwork.springbootbeanvalidation.model.Personel;
import com.ermanetwork.springbootbeanvalidation.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonelController {

    @Autowired
    PersonelService personelService;

    @PostMapping("/save")
    ResponseEntity<String> addStudent(@Valid @RequestBody Personel personel) {
        personelService.save(personel);
        return ResponseEntity.ok("Personel Ekleme Başarılı");
    }
}
