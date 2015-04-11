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
