package ui_reccomendationengine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

/**
 *
 * @author Stephen
 *
 * // -------- User Data Access Object --------//
 */
public class UserDao {

    private final static String userFileList = "C:/users.txt";
    
    private String getUserFromRecord(User user){
        return user.getUserName(); 
    }
    private User getRecordFromUser(String record) {//private helper method
        User ret = null;
        StringTokenizer stringTokenizer = new StringTokenizer(record);
        String username = stringTokenizer.nextToken();
        ret = new User(username);
        return ret;
    }
    public List<User> getUserList(){     
        ArrayList<User> registeredUserList = new ArrayList<User>();    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFileList));
            String record;
            while ((record = reader.readLine()) != null) { //read untill null(end of file)
                User user = getRecordFromUser(record);
                registeredUserList.add(user);
            }
            reader.close();
        }//try//try
        catch (Exception e) {
            System.out.println("Error opening");
        }
        return registeredUserList;
    }
    public boolean verifyUser(String userName) {
         boolean retVal = false;
        for(User user: getUserList()){ //For each user in the Registered User List
            if(user.getUserName().equals(userName)){
                retVal = true;
                break;
            }
        }
        return retVal; 
    }

    public boolean addUser(User user) {

        try {
            Writer writer = new FileWriter(userFileList, true);
            writer.write(getUserFromRecord(user));
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public void removeUser(User user) {
        //To be determined ....
    }

}
