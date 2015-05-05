package classes.bookClass;

/* Class: BookRating
*  Author: Christopher Nellis
*  Description: Stores information about the ratings for a book.
*
*/
public final class BookRating {

    /* Properties */
    private float fltFictionRating; // Float of fiction rating. 0.0-5.0 Range.
    private float fltNonFictionRating; // Float of fiction rating. 0.0-5.0 Range.
    private float fltShortRating; //  Float short book rating. .0-5.0 Range.
    private float fltLongRating; // Float long book rating. 0.0-5.0 Range.
    private float fltModernBookRating; // Float modern book rating. 0.0-5.0 Range.
    private float fltClassicBookRating; // Float classic book rating. 0.0-5.0 Range.

    private float[][] ratingMatrix; // Float 2D array.

    /* Default Constructor */
    public BookRating() {
        clearRatings();
    }

    public BookRating(float initialRating) {
        setRating(initialRating);
    }

    /* Full Constructor Without Ratings Specified */
    public BookRating(float[][] ratingMatrix) {
        setRating(ratingMatrix);
    }

    public int getArrayLength() {
        return ratingMatrix[0].length;
    }
    /* Getters and Setters */

    public float getFltModernBookRating() {
        return fltModernBookRating;
    }

    public void setFltModernBookRating(float fltModernBookRating) {
        this.fltModernBookRating = fltModernBookRating;
    }

    public float getFltClassicBookRating() {
        return fltClassicBookRating;
    }

    public void setFltClassicBookRating(float fltClassicBookRating) {
        this.fltClassicBookRating = fltClassicBookRating;
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

    public void setRatingMatrix(float[][] ratingMatrix) {
        this.ratingMatrix = ratingMatrix;
    }

    public float[][] getRatingMatrix() {
        return this.ratingMatrix;
    }

    /* Methods */
    private void clearRatings() {
        setFltFictionRating(0);
        setFltNonFictionRating(0);
        setFltModernBookRating(0);
        setFltClassicBookRating(0);
        setFltShortRating(0);
        setFltLongRating(0);
        setRatingMatrix(new float[][]{{0.0f}});
    }

    /* toString() will print in the console the ratings objects properties. */
    @Override
    public String toString() {
        return String.format("Fiction Rating: %f\n"
                + "     Non-Fiction Rating: %f\n"
                + "     Modern Rating: %f\n"
                + "     Classic Rating: %f\n"
                + "     Short Rating: %f\n"
                + "     Long Rating: %f",
                this.getFltFictionRating(),
                this.getFltNonFictionRating(),
                this.getFltModernBookRating(),
                this.getFltClassicBookRating(),
                this.getFltShortRating(),
                this.getFltLongRating());
    }

    /* setRatings(float) this sets all the ratings for a book to one value.
     */
    public void setRating(float rating) {
        setFltFictionRating(rating);
        setFltNonFictionRating(rating);
        setFltModernBookRating(rating);
        setFltClassicBookRating(rating);
        setFltShortRating(rating);
        setFltLongRating(rating);
        setRatingMatrix(new float[][]{});
    }

    /* setRatings(float[][]) this sets the rating for a book and depending on the
     properties of the book (short/long, fiction/non-fiction), it will place the results in ratingMatrix.
     This is expected to be used by the GUI I think.
     */
    public void setRating(float[][] ratingMatrix) {
        setFltFictionRating(ratingMatrix[0][0]);
        setFltNonFictionRating(ratingMatrix[1][0]);
        setFltModernBookRating(ratingMatrix[0][1]);
        setFltClassicBookRating(ratingMatrix[1][1]);
        setFltShortRating(ratingMatrix[0][2]);
        setFltLongRating(ratingMatrix[1][2]);
        setRatingMatrix(ratingMatrix);
    }
}
