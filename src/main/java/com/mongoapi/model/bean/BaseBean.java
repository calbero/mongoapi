package com.mongoapi.model.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigInteger;

/**
 * <b>Proyect: mongoapi</b><br>
 * File: BaseBean.java<br>
 * Date: 05/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@MappedSuperclass
@Getter
@Setter
public abstract class BaseBean {

    @Id private BigInteger id;
}
