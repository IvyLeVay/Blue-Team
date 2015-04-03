package com.company;

/**
 * Created by Christopher on 4/2/2015.
 */
public class BookRating {

    float fltRating; // Float number of a rating. 0.0-5.0 Range.
    float fltLongRating; // Float long book rating. 0.0-5.0 Range. 0 for short, 5 for long.
    float fltFicNonFicRating; // Float of fiction/non-fiction rating. 0.0-5.0 Range.
    float fltGenreRating; // Float of Genre Rating. 0.0-5.0 Range.
    float[][] arrRating = new float[2][2];

    BookRating(){
        fltRating = 0.0f;
        fltLongRating = 0.0f;
        fltFicNonFicRating = 0.0f;
        fltGenreRating = 0.0f;

    }

    BookRating(float pRating, float pLongRating, float FicNonFicRating, float GenreRating) {
        fltRating = pRating;
        fltLongRating = pLongRating;
        fltFicNonFicRating = FicNonFicRating;
        fltGenreRating = GenreRating;

    }

    public float getFltRating() {
        return fltRating;
    }

    public void setFltRating(float fltRating) {
        this.fltRating = fltRating;
    }

    public float getFltLongRating() {
        return fltLongRating;
    }

    public void setFltLongRating(float fltLongRating) {
        this.fltLongRating = fltLongRating;
    }

    public float getFltFicNonFicRating() {
        return fltFicNonFicRating;
    }

    public void setFltFicNonFicRating(float fltFicNonFicRating) {
        this.fltFicNonFicRating = fltFicNonFicRating;
    }

    public float getFltGenreRating() {
        return fltGenreRating;
    }

    public void setFltGenreRating(float fltGenreRating) {
        this.fltGenreRating = fltGenreRating;
    }

    public float[][] getArrRating() {
        return arrRating;
    }

    public void setArrRating(int row, int col, float arrRating) {
        this.arrRating[row][col] = arrRating;
    }

    public String toString(){
        return this.getFltRating() + ", " + this.fltLongRating + ", " + this.getFltFicNonFicRating() + ", " + this.getFltGenreRating();
    }

    public String toString(Books pBook){
        float[] rtnRatingsArr = this.getRatings(pBook);
        return rtnRatingsArr[0] + ", " + rtnRatingsArr[1] + ", " + rtnRatingsArr[2] + ", " + rtnRatingsArr[3];
    }

    public void setRatings(Books pBook, float pRating, float pLongRating, float pFicNonFicRating, float pGenreRating) {
        this.setFltRating(pRating);
        this.setFltLongRating(pLongRating);
        this.setFltFicNonFicRating(pFicNonFicRating);
        this.setFltGenreRating(pGenreRating);
        if (pBook.isBookLong(pBook)) {
            this.setArrRating(1, 0, pLongRating);
        } else {
            this.setArrRating(0, 0, pLongRating);
        }
        if (pBook.getBoolFicNonFic()){
            this.setArrRating(1, 1, pFicNonFicRating);
        }
        else {
            this.setArrRating(0, 1, pFicNonFicRating);
        }
    }

    public float[] getRatings(Books pBook){
        float[] rtnArrRating = new float[4];
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
        rtnArrRating[3] = this.getFltGenreRating();

        return rtnArrRating;
    }
}
