package top.kuangc;

import top.kuangc.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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
            /*ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E:\\a.txt"));
            outputStream.writeObject(userList);
            outputStream.close();*/
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("E:\\a.txt"));
            List<User> list = (List<User>)inputStream.readObject();
            for(User user : list){
                System.out.println(user.getName());
            }
            inputStream.close();
        }catch (Exception e){

        }
    }
}
