package Model;

import java.util.Date;

/**
 * @Function User
 * @Decription
 * @Author Administrator
 * @Date 2019/11/27 16:47
 * @Param
 * @Return
 **/

public class User {

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
