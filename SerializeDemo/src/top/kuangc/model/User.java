package top.kuangc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Function User
 * @Decription TODO
 * @Author lucas.k
 * @Version 1.0.0
 * @Date 2019年11月28日 10:57
 **/
public class User implements Serializable {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    private Date birthDate;

    public User (Integer id,String name,Date birthDate){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
