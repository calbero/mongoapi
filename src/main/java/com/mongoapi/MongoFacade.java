package com.mongoapi;

import com.mongoapi.model.bean.mongo.AuthorMongoBean;
import com.mongoapi.model.bean.mongo.BookMongoBean;
import com.mongoapi.model.service.mongo.AuthorMongoService;
import com.mongoapi.model.service.mongo.BookMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: MongoFacade.java<br>
 * Date: 06/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Component
public class MongoFacade {

    private final AuthorMongoService authorMongoService;
    private final BookMongoService bookMongoService;

    @Autowired
    public MongoFacade(AuthorMongoService authorMongoService, BookMongoService bookMongoService) {
        this.authorMongoService = authorMongoService;
        this.bookMongoService = bookMongoService;
    }

    public List<BookMongoBean> findAllBook() {
        return bookMongoService.findAll();
    }

    public BookMongoBean saveBook(BookMongoBean bean) {
        return bookMongoService.save(bean);
    }

    public List<AuthorMongoBean> findAllAuthor() {
        return authorMongoService.findAll();
    }

    public AuthorMongoBean saveAuthor(AuthorMongoBean bean) {
        return authorMongoService.save(bean);
    }

}
