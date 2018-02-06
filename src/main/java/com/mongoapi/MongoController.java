package com.mongoapi;

import com.mongoapi.MongoFacade;
import com.mongoapi.model.bean.BaseBean;
import com.mongoapi.model.bean.mongo.AuthorMongoBean;
import com.mongoapi.model.bean.mongo.BookMongoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: MongoController.java<br>
 * Date: 06/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@RestController
public class MongoController {

    private final MongoFacade facade;

    @Autowired public MongoController(MongoFacade facade) {
        this.facade = facade;
    }

    @GetMapping("/books")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public Collection<BookMongoBean> getBooks() {
        return facade.findAllBook();
    }

    @GetMapping("/authors")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public Collection<AuthorMongoBean> getAuthors() {
        return facade.findAllAuthor();
    }
}
