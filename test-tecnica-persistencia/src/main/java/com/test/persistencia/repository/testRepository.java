package com.test.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.persistencia.models.Test;


@Repository
public interface testRepository extends JpaRepository<Test, Integer>{

}
