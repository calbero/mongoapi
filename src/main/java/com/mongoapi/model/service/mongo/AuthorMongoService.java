package com.mongoapi.model.service.mongo;

import com.mongoapi.model.bean.mongo.AuthorMongoBean;
import com.mongoapi.model.repository.mongo.AuthorMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: AuthorMongoService.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Service
public class AuthorMongoService {

    private final AuthorMongoRepository repository;

    @Autowired
    public AuthorMongoService(AuthorMongoRepository repository) {
        this.repository = repository;
    }

    public List<AuthorMongoBean> findAll() {
        return repository.findAll();
    }

    public AuthorMongoBean save(AuthorMongoBean bean) {
        return repository.save(bean);
    }
}
