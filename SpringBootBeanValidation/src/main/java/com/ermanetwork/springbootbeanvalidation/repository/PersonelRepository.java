package com.ermanetwork.springbootbeanvalidation.repository;

import com.ermanetwork.springbootbeanvalidation.model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {
}
