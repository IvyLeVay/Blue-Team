import classes.bookClass.Book;
import classes.ListProcessor.Recommendation;
import classes.userClass.User;

public class Main {

/* Class: Main
*  Author: Christopher Nellis
*  Description: This is Main class for the entire project.
*/

    public static void main(String [ ] args)
    {
        // Test main method in book. Not sure if there is a better way to handle this.
        Book.main(null);

        // Test main method in recommendation. Not sure if there is a better way to handle this.
        Recommendation.main(null);
        
        // Test main method in user. Not sure if there is a better way to handle this.
        User.main(null);
    }
}
