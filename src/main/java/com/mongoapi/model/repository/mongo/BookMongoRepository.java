package com.mongoapi.model.repository.mongo;

import com.mongoapi.model.bean.mongo.AuthorMongoBean;
import com.mongoapi.model.bean.mongo.BookMongoBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.math.BigInteger;
import java.util.List;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: BookMongoRepository.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@RepositoryRestController
public interface BookMongoRepository extends MongoRepository<BookMongoBean, BigInteger> {

    @Query(value = "{ 'author' : ?0 }")
    List<BookMongoBean> findAllBookByAuthor(AuthorMongoBean bean);
}
