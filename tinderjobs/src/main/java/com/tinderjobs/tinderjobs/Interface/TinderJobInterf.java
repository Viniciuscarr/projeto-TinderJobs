package com.tinderjobs.tinderjobs.Interface;

import com.tinderjobs.tinderjobs.Model.DadosPessoais;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TinderJobInterf extends CrudRepository<DadosPessoais, Integer> {
    
}
