<<<<<<< HEAD
import java.util.*;
import java.util.Scanner;
/*********************************************
        UserPreference Class 20 options added should there be more or less? .
**********************************************/
 class UserPreference 
{
        /** 19 Field declarations **/
        private float fiction;
        private float nonFiction;
        private float newBooks;
        private float oldBooks;
        private float longBooks;
        private float shortStory;
        /*private float adventure;
        private float classic;
        private float comics;
        private float historical;
        private float horror;
        private float humor;
        private float mystery;
        private float poetry;
        private float scienceFiction;
        private float biography;
        private float essay;
        private float textbook;
        private float reference;
        private float children;*/


        /** GETTERS **/
        public float getFiction()
        {
            return fiction;
        }
        public float getNonFiction()
        {
            return nonFiction;
        }
        public float getNewBooks()
        {
            return newBooks;
        }
        public float getOldBooks()
        {
            return oldBooks;
        }
        public float getLongBooks()
        {
            return longBooks;
        }
        public float getShortStory()
        {
            return shortStory;
        }  
        /*public float getAdventure()
        {
            return adventure;
        }
        public float getClassic()
        {
            return classic;
        }
        public float getComics()
        {
            return comics;
        }
        public float getHistorical()
        {
            return historical;
        }
        public float getHorror()
        {
            return horror;
        }
        public float getHumor()
        {
            return humor;
        }
        public float getMystery()
        {
            return mystery;
        }
          public float getPoetry()
        {
            return poetry;
        } 
         public float getScienceFiction()
        {
            return scienceFiction;
        }  
        public float getBiography()
        {
            return biography;
        }  
        public float getEssay()
        {
            return essay;
        }  
        public float getTextbook()
        {
            return textbook;
        }  
        public float getReference()
        { 
            return reference;
        }
        public float getChildren()
        { 
            return children;
        }*/


        /** SETTERS **/
        public void setFiction(float fiction)
        {
            this.fiction = fiction;
        }
        public void setNonFiction(float nonFiction)
        {
            this.nonFiction = nonFiction;
        } 
         public void setNewBooks(float newBooks)
        {
            this.newBooks = newBooks;
        }  
         public void setOldBooks(float oldBooks)
        {
            this.oldBooks = oldBooks;
        }    
         public void setLongBooks(float longBooks)
        {
            this.longBooks = longBooks;
        }  
         public void setShortStory(float shortStory)
        {
            this.shortStory = shortStory;
        }      
         /*public void setAdventure(float adventure)
        {
            this.adventure = adventure;
        }    
         public void setClassic(float classic)
        {
            this.classic = classic;
        }    
         public void setComics(float comics)
        {
            this.comics = comics;
        }    
         public void setHistorical(float historical)
        {
            this.historical = historical;
        }    
         public void setHorror(float horror)
        {
            this.horror = horror;
        }    
         public void setHumor(float humor)
        {
            this.humor = humor;
        }    
         public void setMystery(float mystery)
        {
            this.mystery = mystery;
        }    
         public void setPoetry(float poetry)
        {
            this.poetry = poetry;
        } 
        public void setScienceFiction(float scienceFiction)
        {
            this.scienceFiction = scienceFiction;
        }      
         public void setBiography(float biography)
        {
            this.biography = biography;
        } 
         public void setEssay(float essay)
        {
            this.essay = essay;
        }       
         public void setTextbook(float textbook)
        {
            this.textbook = textbook;
        }    
         public void setReference(float reference)
        {
            this.reference = reference;
        } 
        public void setChildren(float children)
        {
            this.children = children;
        }        
*/
}
   /*********************************************
        User Class 
    **********************************************/

class User
{
    /*********************************************
            Field declarations 
    **********************************************/
    private String name;
    
    private static float idGen = 0001;

    /*********************************************
            Getters
    **********************************************/
    public String getName() 
    {
        return name;//field return
    }
    public float getIdGen()
    {
        return idGen;
    }
    /*********************************************
            Setters 
    **********************************************/
    public void setName(String name)
    {
        this.name = name;
    }
    public void setIdGen(float idGen)
    {
        this.idGen = idGen++;    
    }
    /*********************************************
        Main Method
    **********************************************/
    public static void main (String[] args)
    {
        /*********************************************
            Get user name and set ID for user 
        **********************************************/

/*╭━━━━┳━━━┳━━━┳━━━━╮
  ┃╭╮╭╮┃╭━━┫╭━╮┃╭╮╭╮┃
  ╰╯┃┃╰┫╰━━┫╰━━╋╯┃┃╰╯
  ╱╱┃┃╱┃╭━━┻━━╮┃╱┃┃
  ╱╱┃┃╱┃╰━━┫╰━╯┃╱┃┃
╱  ╱╰╯╱╰━━━┻━━━╯╱╰╯
*/

        String name;
        System.out.println("Enter your name: ");
        Scanner userName = new Scanner(System.in);
        name = userName.nextLine();
        User getNameObject = new User ();
        getNameObject.setName(name);
        getNameObject.setIdGen(idGen);

        String[][] preference ={{"fiction","nonFiction"},{"newBooks","oldBooks"},{"longBooks","shortStory"}};//,{"classic","comics"},{"historical","horror"},{"humor","mystery"},{"poetry","scienceFiction"},{"adventure","biography"},{"essay","textbook"},{"reference", "children"}};
        int size = preference.length;

        Scanner rating = new Scanner(System.in);
        float[] numbers = new float[3];//if modifing preference array this must be changed as well

        for (int i = 0; i < numbers.length; i++)
        {
        System.out.println("Please enter number for " + preference[i][0] + " or " + preference[i][1]);
        numbers[i] = rating.nextFloat();   
        }
        for (int i = 0; i < numbers.length; i++)
        {   
            System.out.println("For " + preference[i][0] + " or " + preference[i][1] + "You entered " + numbers[i] );
        }
        /*********************************************
            Display User name, ID, and user preferences 
        **********************************************/
        System.out.println("\n\n\n\t\t\tUser info: \nName: " + name + "\nId: " + idGen);

        for (int i = 0; i < numbers.length; i++)
        {
        /*if (numbers[i] == -1.0f)
        {
            System.out.println("Choice is " + preference[i][0]);
        }
        if (numbers[i] == -2.0f)
        {
            System.out.println("Choice is " + preference[i][0]);
        }
        if (numbers[i] == -3.0f)
        {
            System.out.println("You like " + preference[i][0]);
        }
        if (numbers[i] == -4.0f)
        {
            System.out.println("You really like " + preference[i][0]);
        }*/
        if (numbers[i] == -5.0f)
        {
            System.out.println("Your choice was " + preference[i][0]);
        }
        /*if (numbers[i] == 0.0f)
        {
            System.out.println("We will add " + preference[i][0] + " and  " + preference[i][1] + " as you had no preference");
        }
        if (numbers[i] == 1.0f)
        {
            System.out.println("Choice is " + preference[i][1]);
        }
        if (numbers[i] == 2.0f)
        {
            System.out.println("Choice is " + preference[i][1]);
        }
        if (numbers[i] == 3.0f)
        {
            System.out.println("You like " + preference[i][1]);
        }
        if (numbers[i] == 4.0f)
        {
            System.out.println("You really like " + preference[i][1]);
        }*/
        if (numbers[i] == 5.0f)
        {
            System.out.println("Your choice was " + preference[i][1]);
        }
    }
       
}

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes.userClass;

/**
 *
 * @author chris
 */
public class User {
    static int primaryKeyGen = 0;
    int id;
    int age;
    private char gender;
    
    private float fictOrNonPref;
    private float shrtOrLongPref;
    private float newOrClasicPref;
    
    float[] userPref;
    
    public User(){
        this.id = primaryKeyGen++;
        age = 18;
        gender = 'n';
        setRating(0.0f);
        for(int i = 0; i < 3; i++){
            userPref[i] = 0.0f;
        }
    }
    public User(float initialRating){
        this.id = primaryKeyGen++;
        age = 18;
        gender = 'n';
        setRating(initialRating);
        for(int i = 0; i < 3; i++){
            userPref[i] = initialRating;
        }
    }
    
    public User(float[] initialRatingMatrix){
        this.id = primaryKeyGen++;
        age = 18;
        gender = 'n';
        userPref = new float[initialRatingMatrix.length];
        for( int i = 0 ; i < initialRatingMatrix.length; i++){
            userPref[i] = initialRatingMatrix[i];
        }
    }
    
    public void printUserPrefs(){
        for(float i : userPref){
            System.out.println("  " + i + "  ");
        }   
    }  
    
    public float[] getUserPref (){
        return this.userPref;
    }
    
    private void setRating(float input){
        setFictOrNonPref(input);
        setNewOrClasicPref(input);
        setShrtOrLongPref(input);
    }
    
    
    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the fictOrNonPref
     */
    public float getFictOrNonPref() {
        return fictOrNonPref;
    }

    /**
     * @param fictOrNonPref the fictOrNonPref to set
     */
    public void setFictOrNonPref(float fictOrNonPref) {
        if(fictOrNonPref < 5.0){
            fictOrNonPref = -5.0f;
        }else if( fictOrNonPref > 5){
            fictOrNonPref = 5.0f;
        }
        this.fictOrNonPref = fictOrNonPref;
    }

    /**
     * @return the shrtOrLongPref
     */
    public float getShrtOrLongPref() {
        return shrtOrLongPref;
    }

    /**
     * @param shrtOrLongPref the shrtOrLongPref to set
     */
    public void setShrtOrLongPref(float shrtOrLongPref) {
        this.shrtOrLongPref = shrtOrLongPref;
    }

    /**
     * @return the newOrClasicPref
     */
    public float getNewOrClasicPref() {
        return newOrClasicPref;
    }

    /**
     * @param newOrClasicPref the newOrClasicPref to set
     */
    public void setNewOrClasicPref(float newOrClasicPref) {
        this.newOrClasicPref = newOrClasicPref;
    }
    
    
}
>>>>>>> e8d353e7d6c1cd39a519ece2c71d3a50970149e1
