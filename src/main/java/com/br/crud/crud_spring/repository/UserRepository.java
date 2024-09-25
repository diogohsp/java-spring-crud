package com.br.crud.crud_spring.repository;

import com.br.crud.crud_spring.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

//<entidade, tipo-chave-primaria>
public interface UserRepository extends MongoRepository <User, String> {



}

