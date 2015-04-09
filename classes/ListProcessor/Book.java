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
public class Book {
        String name;
        String author;
        //others
        BookRating rating;
        
        public Book(){
            rating = new BookRating();
        }
        
        public BookRating getBookRating(){
            return this.rating;
        }       
        
        
    }

