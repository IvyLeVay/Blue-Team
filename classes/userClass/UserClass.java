

package classes.userClass;


public class UserClass {

public static void main(String[] args)  //Testing
{
    //TESTING
  UserClass user1= new UserClass(1,10,"woman","high school","Lord of the Ring");
  System.out.print(user1);
}

    //Properties
    
    private int id;
    private int age;
    private String gender;
    private String education;
    private String previousBooks; //Dont know if we will be needing this here 

    //constructor
    UserClass(int id, int age, String gender,String education, String previousBooks)
    {
        this.id=id;
        this.age=age;
        this.gender=gender;
        this.education=education;
        this.previousBooks=previousBooks;
    }

    
    
    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        this.age = age;
    }

    
    public String getGender() {
        return gender;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public String getEducation() {
        return education;
    }

    
    public void setEducation(String education) {
        this.education = education;
    }

    
    public String getPreviousBooks() {
        return previousBooks;
    }

   
    public void setPreviousBooks(String previousBooks) {
        this.previousBooks = previousBooks;
    }
    
    public String toString(){
    return "Id is: "+id+"\n"+
           "Gender is: "+gender+"\n"+
           "Age is: "+age+"\n"+
           "Education is: "+education+"\n"+
           "Previous Books are: "+previousBooks+"\n"; 
    }
    
    
}
