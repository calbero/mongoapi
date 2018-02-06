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
 * File: AuthorMongoBean.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Document(collection = "author")
@Getter
@Setter
public class AuthorMongoBean extends BaseBean implements Serializable {

    @NotNull private String firstName;
    @NotNull private String lastName;
    @Temporal(TemporalType.DATE) private Date birthDate;
    private String placeBirth;
}
