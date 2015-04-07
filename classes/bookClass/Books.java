package com.company;

/* Class: Books
*  Author: Christopher Nellis
*  Description: Stores information about the Books class.
*
*/

public class Books {
    /* Private ID counter will increment after every new book. */
    static int intIDCounter = 0;

    /* Properties */
    int intID; // Book identifier.
    long lngISBN; // Long int of ISBN. They should be unique.
    String strTitle; // Book title.
    String strAuthor; // Book Author.
    String strPublisher; // Book Publisher? Is this needed?
    boolean boolFicNonFic; // Boolean fiction or non-fiction. Fiction=true, Non-Fiction=false
    int intPubDate; // Publication year.
    int intPages; // Number of pages in the book.
    BookRating ratingBlob; // BookRating class for rating the books based on criteria specified in the class.
    String strImageURL; // A goodie for the GUI guys. Should contain an image for displaying in the GUI.

    /* Default Constructor */
    Books() {
        intID = intIDCounter++;
        lngISBN = 0;
        strTitle = "";
        strAuthor = "";
        strPublisher = "";
        boolFicNonFic = false;
        intPubDate = 0;
        intPages = 0;
        ratingBlob = new BookRating();
    }

    /* Full Constructor Without Ratings Specified */
    Books(long pISBN, String pTitle, String pAuthor, String pPublisher, boolean pFicNonFic, int pPubDate, int pPages, String pImageURL) {
        intID = intIDCounter++;
        lngISBN = pISBN;
        strTitle = pTitle;
        strAuthor = pAuthor;
        strPublisher = pPublisher;
        boolFicNonFic = pFicNonFic;
        intPubDate = pPubDate;
        intPages = pPages;
        ratingBlob = new BookRating();
        strImageURL = pImageURL;
    }

    /* Getters and Setters */

    public int getIntID() {
        return intID;
    }

    public void setIntID(int intID) {
        this.intID = intID;
    }

    public long getISBN(){
        return this.lngISBN;
    }

    public void setISBN(long pISBN) {
        this.lngISBN = pISBN;
    }

    public String getTitle(){
        return this.strTitle;
    }

    public void setTitle(String pTitle){
        this.strTitle = pTitle;
    }

    public String getAuthor(){
        return this.strAuthor;
    }

    public void setAuthor(String pAuthor){
        this.strAuthor = pAuthor;
    }

    public String getPublisher(){
        return this.strPublisher;
    }

    public void setPublisher(String pPublisher){
        this.strPublisher = pPublisher;
    }

    public boolean getBoolFicNonFic() {
        return boolFicNonFic;
    }

    public void setBoolFicNonFic(boolean boolFicNonFic) {
        this.boolFicNonFic = boolFicNonFic;
    }

    public int getPubDate(){
        return this.intPubDate;
    }

    public void setPubDate(int pPubDate){
        this.intPubDate = pPubDate;
    }

    public int getPages(){
        return this.intPages;
    }

    public void setPages(int pPages){
        this.intPages = pPages;
    }

    public BookRating getRatingBlob() {
        return ratingBlob;
    }

    public void setRatingBlob(BookRating ratingBlob) {
        this.ratingBlob = ratingBlob;
    }

    public String getStrImageURL() {
        return strImageURL;
    }

    public void setStrImageURL(String strImageURL) {
        this.strImageURL = strImageURL;
    }

    /* Methods */

    // Create some test books with a static main class.
    public static void main()
    {
        System.out.println("\n***** TESTING BOOKS CLASS *****\n");

        Books book1 = new Books(439023528, "The Hunger Games", "Suzanne Collins", "Scholastic", false, 2008, 374, "http://stuff.com");
        Books book2 = new Books(451524934, "1984", "George Orwell", "Signet Classic", false, 1949, 328, "http://stuff.com");
        Books book3 = new Books(393324818, "Moneyball: The Art of Winning an Unfair Game", "Michael Lewis", "W. W. Norton & Company", false, 2004, 320, "http://stuff.com");
        Books book4 = new Books(140275363, "The Iliad", "Homer", "Penguin Classics", true, 1998, 704, "http://stuff.com");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());

        System.out.println("\n***** ADD RATINGS TO BOOK RATINGS CLASS *****\n");

        book1.rateBook(4.4f, 4.5f, 4.7f);
        book2.rateBook(3.4f, 2.9f, 2.7f);
        book3.rateBook(1.5f, 3.9f, 3.7f);
        book4.rateBook(4.8f, 3.5f, 2.7f);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
    }

    /* toString() will print in the console the book objects properties. */
    public String toString(){
        return String.format("ID: %d, ISBN: %d, Title: %s, Author: %s, Publisher: %s, %s, Year Published: %d, Pages: %d," +
                        " Long: %s, Image URL: %s\n     Rating: %s",
                intID, lngISBN, strTitle, strAuthor, strPublisher, this.isFicNonFic(this), intPubDate, intPages,
                this.isBookLong(this), strImageURL, ratingBlob.toString(this));

    }

    /* isBookLong() will determine if a book is long based on whether it
       has more than 500 pages. If yes, it returns true.
    */
    public boolean isBookLong(Books pBooks){
        boolean isLong = false;
        if (pBooks.getPages() > 500){
            isLong = true;
        }
        return isLong;
    }

    /* isFicNonFic(Books) will determine if the book is fiction or non-fiction
       and will give a String saying "Fiction" or "Non-Fiction".
    */
    public String isFicNonFic(Books pBooks){
        String ficOrNon;
        if (pBooks.getBoolFicNonFic()){
            ficOrNon = "Fiction";
        }
        else {
            ficOrNon = "Non-Fiction";
        }
        return ficOrNon;
    }

    /* rateBook(float, float, float) will use the setRatings method in the BookRating class.
    */
    public void rateBook(float pRating, float pShortLongRating, float pFicNonFicRating){
        this.ratingBlob.setRatings(this, pRating, pShortLongRating, pShortLongRating, pFicNonFicRating, pFicNonFicRating);
    }
}