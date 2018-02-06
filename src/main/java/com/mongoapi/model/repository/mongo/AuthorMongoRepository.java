package com.mongoapi.model.repository.mongo;

import com.mongoapi.model.bean.mongo.AuthorMongoBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: AuthorMongoRepository.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@RepositoryRestResource
public interface AuthorMongoRepository extends MongoRepository<AuthorMongoBean, BigInteger> {
}
