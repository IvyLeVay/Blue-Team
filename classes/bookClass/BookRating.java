package recommendation.classes.bookClass;

/**
 * Created by Christopher on 4/2/2015.
 */
public class BookRating {

    /* Properties */
    private float fltFictionRating; // Float of fiction rating. 0.0-5.0 Range.
    private float fltNonFictionRating; // Float of fiction rating. 0.0-5.0 Range.
    private float fltShortRating; //  Float short book rating. .0-5.0 Range.
    private float fltLongRating; // Float long book rating. 0.0-5.0 Range.
    private float fltModernBookRating;
    private float fltClassicBookRating;

    private float[][] ratingMatrix; // Float 2D array.

    /* Default Constructor */
    public BookRating(){
        clearRatings();
    }

    public BookRating(float initialRating) {
        setRating(initialRating);
    }

    /* Full Constructor Without Ratings Specified */
    public BookRating(float[][] ratingMatrix) {
        setRating(ratingMatrix);
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
    public String toString(){
        return String.format("Fiction Rating: %f\n" +
                "     Non-Fiction Rating: %f\n" +
                "     Modern Rating: %f\n" +
                "     Classic Rating: %f\n" +
                "     Short Rating: %f\n" +
                "     Long Rating: %f",
                this.getFltFictionRating(),
                this.getFltNonFictionRating(),
                this.getFltModernBookRating(),
                this.getFltClassicBookRating(),
                this.getFltShortRating(),
                this.getFltLongRating());
    }

    /* setRatings(float, float, float, float, float) this sets the rating for a book and depending on the
       properties of the book (short/long, fiction/non-fiction), it will place the results in ratingMatrix.
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

    public void setRating(float[][] ratingMatrix) {
        setFltFictionRating(ratingMatrix[0][0]);
        setFltNonFictionRating(ratingMatrix[1][0]);
        setFltModernBookRating(ratingMatrix[0][1]);
        setFltClassicBookRating(ratingMatrix[1][1]);
        setFltShortRating(ratingMatrix[0][2]);
        setFltLongRating(ratingMatrix[1][2]);
        setRatingMatrix(ratingMatrix);
    }

    /* getRatings(Book) this method will return an array with each rating depending on the properties of the book.
         * The array would look like this: [bookRating, short/long rating, fiction/non-fiction rating]
         */

}
