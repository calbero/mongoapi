package com.mongoapi.model.service.mongo;

import com.mongoapi.model.bean.mongo.AuthorMongoBean;
import com.mongoapi.model.bean.mongo.BookMongoBean;
import com.mongoapi.model.repository.mongo.BookMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: BookMongoService.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Service
public class BookMongoService {

    private final BookMongoRepository repository;

    @Autowired
    public BookMongoService(BookMongoRepository repository) {
        this.repository = repository;
    }

    public List<BookMongoBean> findAll() {
        return repository.findAll();
    }

    public BookMongoBean save(BookMongoBean bean) {
        return repository.save(bean);
    }

}
