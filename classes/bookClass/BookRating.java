package com.company;

/**
 * Created by Christopher on 4/2/2015.
 */
public class BookRating {

    /* Properties */
    float fltRating; // Float number of a rating. 0.0-5.0 Range.
    float fltShortRating; //  Float short book rating. .0-5.0 Range.
    float fltLongRating; // Float long book rating. 0.0-5.0 Range.
    float fltFictionRating; // Float of fiction rating. 0.0-5.0 Range.
    float fltNonFictionRating; // Float of fiction rating. 0.0-5.0 Range.
    float[][] arrRating; // Float 2D array.

    /* Default Constructor */
    BookRating(){
        fltRating = 0.0f;
        fltShortRating = 0.0f;
        fltLongRating = 0.0f;
        fltFictionRating = 0.0f;
        fltNonFictionRating = 0.0f;
        arrRating = new float[2][2];
    }

    /* Full Constructor Without Ratings Specified */
    BookRating(float pRating, float pShortRating, float pLongRating, float pFictionRating, float pNonFictionRating) {
        fltRating = pRating;
        fltShortRating = pShortRating;
        fltLongRating = pLongRating;
        fltFictionRating = pFictionRating;
        fltNonFictionRating = pNonFictionRating;
        arrRating = new float[2][2];
    }

    /* Getters and Setters */
    public float getFltRating() {
        return fltRating;
    }

    public void setFltRating(float fltRating) {
        this.fltRating = fltRating;
    }

    public float getFltShortRating() {
        return fltShortRating;
    }

    public void setFltShortRating(float fltShortRating) {
        this.fltShortRating = fltShortRating;
    }

    public float getFltLongRating() {
        return fltLongRating;
    }

    public void setFltLongRating(float fltLongRating) {
        this.fltLongRating = fltLongRating;
    }

    public float getFltFictionRating() {
        return fltFictionRating;
    }

    public void setFltFictionRating(float fltFictionRating) {
        this.fltFictionRating = fltFictionRating;
    }

    public float getFltNonFictionRating() {
        return fltNonFictionRating;
    }

    public void setFltNonFictionRating(float fltNonFictionRating) {
        this.fltNonFictionRating = fltNonFictionRating;
    }

    public float[][] getArrRating() {
        return arrRating;
    }

    public void setArrRating(int row, int col, float arrRating) {
        this.arrRating[row][col] = arrRating;
    }

    /* Methods */

    /* toString() will print in the console the ratings objects properties. */
    public String toString(){
        return this.getFltRating() + ", " + this.getFltShortRating() + ", " + this.getFltLongRating() + ", " + this.getFltFictionRating() + ", " + this.getFltNonFictionRating();
    }

    /* toString(Books) will print in the console the ratings objects properties based on book specified. */
    public String toString(Books pBook){
        float[] rtnRatingsArr = this.getRatings(pBook);
        return rtnRatingsArr[0] + ", " + rtnRatingsArr[1] + ", " + rtnRatingsArr[2];
    }

    /* setRatings(Books, float, float, float, float, float) this sets the rating for a book and depending on the
       properties of the book (short/long, fiction/non-fiction), it will place the results in arrRating.
   */
    public void setRatings(Books pBook, float pRating, float pShortRating, float pLongRating, float pNonFictionRating, float pFictionRating) {
        this.setFltRating(pRating);
        this.setFltShortRating(pShortRating);
        this.setFltLongRating(pLongRating);
        this.setFltNonFictionRating(pNonFictionRating);
        this.setFltFictionRating(pFictionRating);
        if (pBook.isBookLong(pBook)) {
            this.setArrRating(1, 0, pShortRating);
        } else {
            this.setArrRating(0, 0, pLongRating);
        }
        if (pBook.getBoolFicNonFic()){
            this.setArrRating(1, 1, pFictionRating);
        }
        else {
            this.setArrRating(0, 1, pNonFictionRating);
        }
    }

    /* getRatings(Books) this method will return an array with each rating depending on the properties of the book.
     * The array would look like this: [bookRating, short/long rating, fiction/non-fiction rating]
     */
    public float[] getRatings(Books pBook){
        float[] rtnArrRating = new float[3];
        rtnArrRating[0] = this.getFltRating();
        if (pBook.isBookLong(pBook)) {
            rtnArrRating[1] = this.getArrRating()[1][0];
        }
        else {

            rtnArrRating[1] = this.getArrRating()[0][0];
        }
        if (pBook.getBoolFicNonFic()){
            rtnArrRating[2] = this.getArrRating()[1][1];
        }
        else {
            rtnArrRating[2] = this.getArrRating()[0][1];
        }

        return rtnArrRating;
    }
}
