package com.mongoapi.model.bean.mongo;

import com.mongoapi.model.bean.BaseBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: BookMongoBean.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Document(collection = "books")
@Getter
@Setter
public class BookMongoBean extends BaseBean implements Serializable {

    @NotNull private String name;
    @NotNull private AuthorMongoBean author;
    @NotNull private String isbn;
    @NotNull @Temporal(TemporalType.DATE) private Date date;


}
