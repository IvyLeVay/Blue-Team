/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recommendation;

/**
 *
 * @author chris
 */
public class BookRating {

    private float fictionRating;
    private float nonFictRating;
    private float shortStryRating;
    private float longStryRating;
    private float modernBookRating;
    private float classicBookRating;

    //other implementation
    float[][] ratingMatrix;

    public BookRating() {
        clearRatings();
    }
    
    public BookRating(float initialRating){
        setRating(initialRating);
    }
    
    public BookRating(float[][] ratingMatrix){
        this.ratingMatrix = ratingMatrix;
        setRating(ratingMatrix);
    }

    private void clearRatings() {
        setFictionRating(0);
        setNonFictRating(0);
        setModernBookRating(0);
        setClassicBookRating(0);
        setShortStryRating(0);
        setLongStryRating(0);
    }
    
    public void setRating(float rating) {
        setFictionRating(rating);
        setNonFictRating(rating);
        setModernBookRating(rating);
        setClassicBookRating(rating);
        setShortStryRating(rating);
        setLongStryRating(rating);
    }

    public void setRating(float[][] ratingMatrix) {
        setFictionRating(ratingMatrix[0][0]);
        setNonFictRating(ratingMatrix[1][0]);
        setModernBookRating(ratingMatrix[0][1]);
        setClassicBookRating(ratingMatrix[1][1]);
        setShortStryRating(ratingMatrix[0][2]);
        setLongStryRating(ratingMatrix[1][2]);
        printRatings();
    }
    
    public void printRatings(){
        System.out.println("Fict Rating" + this.fictionRating);
        System.out.println("Non Fict rating " + this.nonFictRating);
        System.out.println("Long Rating" + this.shortStryRating);
        System.out.println("Short Rating " + this.longStryRating);
        System.out.println("New Rating " + this.modernBookRating);
        System.out.println("Classic Rating " + this.classicBookRating);
        
    }

    /**
     * @return the fictionRating
     */
    public float getFictionRating() {
        return fictionRating;
    }

    /**
     * @param fictionRating the fictionRating to set
     */
    public void setFictionRating(float fictionRating) {
        this.fictionRating = fictionRating;
    }

    /**
     * @return the nonFictRating
     */
    public float getNonFictRating() {
        return nonFictRating;
    }

    /**
     * @param nonFictRating the nonFictRating to set
     */
    public void setNonFictRating(float nonFictRating) {
        this.nonFictRating = nonFictRating;
    }

    /**
     * @return the shortStryRating
     */
    public float getShortStryRating() {
        return shortStryRating;
    }

    /**
     * @param shortStryRating the shortStryRating to set
     */
    public void setShortStryRating(float shortStryRating) {
        this.shortStryRating = shortStryRating;
    }

    /**
     * @return the longStryRating
     */
    public float getLongStryRating() {
        return longStryRating;
    }

    /**
     * @param longStryRating the longStryRating to set
     */
    public void setLongStryRating(float longStryRating) {
        this.longStryRating = longStryRating;
    }

    /**
     * @return the modernBookRating
     */
    public float getModernBookRating() {
        return modernBookRating;
    }

    /**
     * @param modernBookRating the modernBookRating to set
     */
    public void setModernBookRating(float modernBookRating) {
        this.modernBookRating = modernBookRating;
    }

    /**
     * @return the classicBookRating
     */
    public float getClassicBookRating() {
        return classicBookRating;
    }

    /**
     * @param classicBookRating the classicBookRating to set
     */
    public void setClassicBookRating(float classicBookRating) {
        this.classicBookRating = classicBookRating;
    }
    
    public float[][] getRatingMatrix(){
        return this.ratingMatrix;
    }

}
