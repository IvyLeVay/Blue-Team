/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recommendationsandbox;

import java.util.Random;

/**
 *
 * @author chris
 */
public class RecommendationSandBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestBook book = new TestBook("Sample", 5.6, 4.8, 9.8);
        book.printBook();
        //ListProcessor LP = new ListProcessor(true);
        List list = new List();

    }

}

class TestBook {

    int id;
    double fictNonFictScale;
    double newOldScale;
    double readingIntensityScale;  //eek
    static int idGen = 0;
    String name;

    //lightweight version, can test with better later
    public TestBook(String name, double ficfNonFictScale, double newOldScale,
            double readingIntensityScale) {
        this.name = name;
        this.fictNonFictScale = ficfNonFictScale;
        this.newOldScale = newOldScale;
        this.readingIntensityScale = readingIntensityScale;

    }

    public void printBook() {
        System.out.println(this.name + " " + this.fictNonFictScale + " "
                + this.newOldScale + " " + this.readingIntensityScale);
    }

}

class ListProcessor {

    TestBook[] recBookArr = new TestBook[10];

    //wicked hacky - if it get a boolean its just a flag to run the test one
    public ListProcessor(boolean tF) {
        Random rand = new Random(System.currentTimeMillis());
        TestBook[] book = new TestBook[100];
        for (TestBook i : book) {
            i = new TestBook("Hi", (rand.nextDouble() * 10), rand.nextDouble() * 10, (rand.nextDouble() * 10));
            i.printBook();
        }

    }

}

class List {

    TestBook[] books = new TestBook[10];

    public List() {
        Random rand = new Random(System.currentTimeMillis());
        for (TestBook i : books) {
            //also hacky
            i = new TestBook(Integer.toString(rand.nextInt(26) + 'a'),
                    (rand.nextDouble() * 10), rand.nextDouble() * 10,
                    (rand.nextDouble() * 10));
            i.printBook();
        }

    }

}


