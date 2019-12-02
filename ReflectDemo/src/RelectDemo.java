import Model.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Function RelectDemo
 * @Decription
 * @Author Administrator
 * @Date 2019/11/27 16:49
 * @Param
 * @Return
 **/
public class RelectDemo {


    public static void main(String args[]){
        try{
            String strA = "1990-1-1";
            String strB = "1988-1-1";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date dateA = sdf.parse(strA);
            Date dateB = sdf.parse(strB);
            User userA = new User(1,"lucas",dateA);
            User userB = new User(2,"dembele",dateB);

            List<User> userList = new ArrayList<>();
            userList.add(userA);
            userList.add(userB);

            for(User user : userList){
                Class userClazz = user.getClass();
                Field[] fields = userClazz.getDeclaredFields();
                Method[] methods = userClazz.getMethods();
                for(Method method : methods){
                    //System.out.println(method.getName());
                }
                for(Field field : fields){
                    //获取私有变量的访问权限
                    field.setAccessible(true);
                    if(field.getType().getName().equals(String.class.getName())){
                        System.out.println("string");
                    }
                    Object obj = field.get(user);
                    System.out.println(field.getName() +"-----"+obj.toString());
                }
            }

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
