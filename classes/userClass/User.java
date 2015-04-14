package classes.userClass;

public class User {
    //Properties
    
    static int primaryKeyGen = 0;
    int id;
    int age;
    private char gender;
    private String education;
    private String previousBooks; //Dont know if we will be needing this here 
    private float fictOrNonPref;
    private float shrtOrLongPref;
    private float newOrClasicPref;
    
    float[] userPref;
    
    /** CONSTRUCTORS **/
    public User(){
        this.id = primaryKeyGen++;
        age = 18;
        gender = 'F';
        education="None";
        previousBooks="None";
        setRating(0.0f);
        userPref = new float[3];
        for(int i = 0; i < 3; i++){
            userPref[i] = 0.0f;
        }
    }
    
    public User(int id, int age, char gender, String education, String previousBooks, float rating)
    {
        this.id=id;
        this.age=age;
        this.gender=gender;
        this.education=education;
        this.previousBooks=previousBooks;
        setRating(rating);
        userPref = new float[3];
        for(int i = 0; i < 3; i++){
            userPref[i] = rating;
        }
        
    }

    public User(float initialRating){
        this.id = primaryKeyGen++;
        age = 18;
        gender = 'F';
        education="None";
        previousBooks="None";
        setRating(initialRating);
        userPref = new float[3];
        for(int i = 0; i < 3; i++){
            userPref[i] = initialRating;
        }
    }
    
    public User(float[] initialRatingMatrix){
        this.id = primaryKeyGen++;
        age = 18;
        gender = 'n';
        education="None";
        previousBooks="None";
        userPref = new float[initialRatingMatrix.length];
        for( int i = 0 ; i < initialRatingMatrix.length; i++){
            userPref[i] = initialRatingMatrix[i];
        }
    }

    /** GETTERS AND SETTERS **/
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
    
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getFictOrNonPref() {
        return fictOrNonPref;
    }

    public void setFictOrNonPref(float fictOrNonPref) {
        if(fictOrNonPref < 5.0){
            fictOrNonPref = -5.0f;
        }else if( fictOrNonPref > 5){
            fictOrNonPref = 5.0f;
        }
        this.fictOrNonPref = fictOrNonPref;
    }

    public float getShrtOrLongPref() {
        return shrtOrLongPref;
    }

    public void setShrtOrLongPref(float shrtOrLongPref) {
        this.shrtOrLongPref = shrtOrLongPref;
    }

    public float getNewOrClasicPref() {
        return newOrClasicPref;
    }

    public void setNewOrClasicPref(float newOrClasicPref) {
        this.newOrClasicPref = newOrClasicPref;
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
    
    
    public void printUserPrefs(){
        for(float i : userPref){
            System.out.println("  " + i + "  ");
        }   
    }  
    
    public float[] getUserPref (){
        return this.userPref;
    }
    
    /** METHODS **/
    private void setRating(float input){
        setFictOrNonPref(input);
        setNewOrClasicPref(input);
        setShrtOrLongPref(input);
    }
    
    @Override
    public String toString(){
    return "Id is: "+id+"\n"+
           "Gender is: "+gender+"\n"+
           "Age is: "+age+"\n"+
           "Education is: "+education+"\n"+
           "Previous Books are: "+previousBooks+"\n"+
            "Rating: "+userPref[0]+"\n"; 
    }
    
    public static void main(String[] args)  //Testing
    {
        
        /*╭━━━━┳━━━┳━━━┳━━━━╮
          ┃╭╮╭╮┃╭━━┫╭━╮┃╭╮╭╮┃
          ╰╯┃┃╰┫╰━━┫╰━━╋╯┃┃╰╯
          ╱╱┃┃╱┃╭━━┻━━╮┃╱┃┃
          ╱╱┃┃╱┃╰━━┫╰━╯┃╱┃┃
        ╱╱╱╰╯╱╰━━━┻━━━╯╱╰╯
        */
        System.out.println("\n\n***** Testing User Class *****\n");
        User user1= new User(1,10,'F',"high school","Lord of the Ring",4.7f);
        System.out.print(user1);
    }
}
