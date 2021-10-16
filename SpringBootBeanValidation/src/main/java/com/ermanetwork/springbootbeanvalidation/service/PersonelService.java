package com.ermanetwork.springbootbeanvalidation.service;

import com.ermanetwork.springbootbeanvalidation.model.Personel;
import com.ermanetwork.springbootbeanvalidation.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonelService {

    @Autowired
    PersonelRepository personelRepository;

    public void save(Personel personel){
        personelRepository.save(personel);
    }
}
