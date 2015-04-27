package classes.userClass;

import java.util.Scanner;
/*********************************************
        UserPreference Class clean up ACR got rid of all the commented out code
**********************************************/
 class UserPreference 
{
        /** Field declarations **/
        private float fiction;
        private float nonFiction;
        private float newBooks;
        private float oldBooks;
        private float longBooks;
        private float shortStory;


        /** GETTERS **/
        public float getFiction()
        {
            return fiction;
        }
        public float getNonFiction()
        {
            return nonFiction;
        }
        public float getNewBooks()
        {
            return newBooks;
        }
        public float getOldBooks()
        {
            return oldBooks;
        }
        public float getLongBooks()
        {
            return longBooks;
        }
        public float getShortStory()
        {
            return shortStory;
        }  



        /** SETTERS **/
        public void setFiction(float fiction)
        {
            this.fiction = fiction;
        }
        public void setNonFiction(float nonFiction)
        {
            this.nonFiction = nonFiction;
        } 
        public void setNewBooks(float newBooks)
        {
            this.newBooks = newBooks;
        }  
        public void setOldBooks(float oldBooks)
        {
            this.oldBooks = oldBooks;
        }    
        public void setLongBooks(float longBooks)
        {
            this.longBooks = longBooks;
        }  
        public void setShortStory(float shortStory)
        {
            this.shortStory = shortStory;
        }      

}
   /*********************************************
        User Class 
    **********************************************/

class User {
       /**
        * ******************************************
        * Field declarations
        * ********************************************
        */
       private String name;

       private static float idGen = 0001;

       /**
        * ******************************************
        * Getters
        * ********************************************
        */
       public String getName() {
           return name;//field return
       }

       public float getIdGen() {
           return idGen;
       }

       /**
        * ******************************************
        * Setters
        * ********************************************
        */
       public void setName(String name) {
           this.name = name;
       }

       public void setIdGen(float idGen) {
           this.idGen = idGen++;
       }
   }

