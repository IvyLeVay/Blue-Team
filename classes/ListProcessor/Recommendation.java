/*
 *Blue Team's Recommendation Engine
 *Data comparison and crawler
 */
package classes.ListProcessor;

import classes.bookClass.Book;
import classes.userClass.*;

import java.util.LinkedList;


/**
 * This work is done By Chris Berns Northern Essex Community College Computer
 * Science II Prof. Russ Gouveia
 */
public class Recommendation {

    /**
     */
    public static class Crawler {

        RecommendedBooks list;
        LinkedList<Book> books;
        classes.userClass.User user;

        public Crawler(classes.userClass.User user, LinkedList<Book> bookList) {
            this.user = user;
            books = bookList;
            list = new RecommendedBooks(10);

        }

        private float getMatch(Book book) {
            float match = 0;
            float crntMatch = 0;
            for (int i = 0; i < book.getRating().getArrayLength(); i++) {
                if (user.getUserPref()[i] < 0) {
                    crntMatch = user.getUserPref()[i] + book.getBookRating().getRatingMatrix()[0][i];
                    if (crntMatch > 0) {
                        match += crntMatch;
                    } else {
                        match -= crntMatch;
                    }
                } else {
                    crntMatch = user.getUserPref()[i] - book.getBookRating().getRatingMatrix()[1][i];
                    if (crntMatch > 0) {
                        match += crntMatch;
                    } else {
                        match -= crntMatch;
                    }
                }
            }
            return match;
        }

        public int[] getRecommendations() {

            float match;
            float worstMatch;
            for (Book bks : books) {
                worstMatch = list.getWorse();
                match = getMatch(bks);
                System.out.println(bks.getIntID() + "  " + match + "  " + worstMatch);
                if (match <= worstMatch) {
                    list.addBook(bks.getIntID(), match);
                }
            }
            int[] retArr = new int[list.bookIds.length];
            retArr = list.getBookIds();
            return retArr;
        }

        private class RecommendedBooks {

            int[] bookIds;
            float[] matches;
            int numRecommendations;

            public RecommendedBooks() {
                numRecommendations = 10;
                bookIds = new int[numRecommendations];
                matches = new float[numRecommendations];
                for (int i = 0; i < numRecommendations; i++) {
                    bookIds[i] = Integer.MAX_VALUE;
                    matches[i] = Float.MAX_VALUE;
                }
            }

            public RecommendedBooks(int numRecommendations) {
                this.numRecommendations = numRecommendations;
                bookIds = new int[numRecommendations];
                matches = new float[numRecommendations];
                for (int i = 0; i < numRecommendations; i++) {
                    bookIds[i] = 9999;
                    matches[i] = 100.0f;
                }
            }

            public void addBook(int id, float match) {
                bookIds[numRecommendations - 1] = id;
                matches[numRecommendations - 1] = match;
                sort();
            }

            private void sort() {
                float tempRating;
                int tempId;
                for (int i = 0; i < numRecommendations; i++) {
                    for (int j = i; j < numRecommendations; j++) {
                        if (matches[i] > matches[j]) {
                            tempId = bookIds[i];
                            tempRating = matches[i];
                            bookIds[i] = bookIds[j];
                            matches[i] = matches[j];
                            bookIds[j] = tempId;
                            matches[j] = tempRating;
                        }
                    }
                }
            }

            public float getWorse() {
                return matches[numRecommendations - 1];
            }

            public int[] getBookIds() {
                return bookIds;
            }
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book(439023528, "The Hunger Games", "Suzanne Collins", "Scholastic", false, 2008, 374, "http://stuff.com");
        Book book2 = new Book(451524934, "1984", "George Orwell", "Signet Classic", false, 1949, 328, "http://stuff.com");
        Book book3 = new Book(393324818, "Moneyball: The Art of Winning an Unfair Game", "Michael Lewis", "W. W. Norton & Company", false, 2004, 320, "http://stuff.com");
        Book book4 = new Book(140275363, "The Iliad", "Homer", "Penguin Classics", true, 1998, 704, "http://stuff.com");

        float[][] rating1 = {{5.0f, 5.0f, 5.0f}, {0.0f, 0.0f, 0.0f}};
        float[][] rating2 = {{0.0f, 0.0f, 0.0f}, {5.0f, 5.0f, 5.0f}};
        float[][] rating3 = {{5.0f, 5.0f, 0.0f}, {0.0f, 0.0f, 2.0f}};
        float[][] rating4 = {{2.0f, 2.0f, 0.0f}, {2.0f, 2.0f, 2.0f}};

        book1.getRating().setRating(rating1);
        book2.getRating().setRating(rating2);
        book3.getRating().setRating(rating3);
        book4.getRating().setRating(rating4);

        float[] userPref = {4.5f, 4.7f, 3.9f};
        float[] userPref1 = {-4.5f, -2.7f, -3.9f};
        User user = new User(userPref);
        User user1 = new User(userPref1);

        LinkedList<Book> books = new LinkedList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        for (Book bk : books) {
            System.out.println(bk.getTitle());
            System.out.println(bk.getIntID());
        }
        Crawler crawl = new Crawler(user, books);
        Crawler crawl1 = new Crawler(user1, books);
        int[] list;
        int[] list2;

        System.out.println(crawl.getMatch(book4));
        list = crawl.getRecommendations();
        list2 = crawl1.getRecommendations();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "     ");
            System.out.println(list2[i]);
        }

    }
}
