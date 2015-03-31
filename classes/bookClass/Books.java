/* Class: Books
*  Author: Christopher Nellis
*  Description: Stores information about the Books class.
*               
*/

public static class Books {

    /* Properties */
    long lngISBN; // Instead of ID, I propose using the ISBN. They should be unique.
    String strTitle; // Book title.
    String strAuthor; // Book Author.
    String strPublisher; // Book Publisher? Is this needed?
    int intPubDate; // Publication Date
    int intPages; // Number of pages in the book.
    double dblRating; // double number of a rating

    // Create some test books with a static class.
    {
        Books book1 = new Books(0439023528, "The Hunger Games", "Suzanne Collins", "Scholastic", 2008, 374, 4.5);
        Books book2 = new Books(0451524934, "1984", "George Orwell", "Signet Classic", 1949, 328, 4.5);
        Books book3 = new Books(0393324818, "Moneyball: The Art of Winning an Unfair Game", "Michael Lewis", "W. W. Norton & Company", 2004, 320, 4.5);
    }

    /* Default Constructor */
    Books() {
        lngISBN = 0;
        strTitle = "";
        strAuthor = "";
        strPublisher = "";
        intPubDate = 0;
        intPages = 0;
        dblRating = 0.0;
    }

    /* Full Constructor */
    Books(long pISBN, String pTitle, String pAuthor, String pPublisher, int pPubDate, int pPages, double pRating) {
        lngISBN = pISBN;
        strTitle = pTitle;
        strAuthor = pAuthor;
        strPublisher = pPublisher;
        intPubDate = pPubDate;
        intPages = pPages;
        dblRating = pRating;
    }

    /* Getters and Setters */
    private long getISBN(){
        return this.lngISBN;
    }

    private void setISBN(long pISBN) {
        this.lngISBN = pISBN;
    }

    private String getTitle(){
        return this.strTitle;
    }

    private void setTitle(String pTitle){
        this.strTitle = pTitle;
    }

    private String getAuthor(){
        return this.strAuthor;
    }

    private void setAuthor(String pAuthor){
        this.strAuthor = pAuthor;
    }

    private String getPublisher(){
        return this.strPublisher;
    }

    private void setPublisher(String pPublisher){
        this.strPublisher = pPublisher;
    }

    private int getPubDate(){
        return this.intPubDate;
    }

    private void setPubDate(int pPubDate){
        this.intPubDate = pPubDate;
    }

    private int getPages(){
        return this.intPages;
    }

    private void setPages(int pPages){
        this.intPages = pPages;
    }

    private double getRatings(){
        return this.dblRating;
    }

    private void setRatings(double pRating) {
        this.dblRating = pRating;
    }

    /* Methods */

    /* toString() will print in the console the book objects properties. */
    public String toString(){
        return "ISBN: " + lngISBN+ ", Title: " + strTitle + ", Author: " +
                strAuthor + ", Publisher: " + strPublisher +
                ", Year Published: " + intPubDate + ", Pages: " +
                intPages + ", Rating: " + dblRating + "\n";

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


}