public class Slime {
    public static void main(String[] args) {
        String[] friends = {
                "Soup",
                "Eddie",
                "Steve",
                "Vicky",
                "Tom"
        };
        // this is an array of Strings
        // aka String[]
        // a list of strings
        // a collection of strings

        // loop through all the items in the array
        // process each item in the array and display them on terminal

        // for loop
        // declare a counter (incrementor)
        // condition to evaluate to true
        // if true, do {block}
        // counter++; repeat
        for (int counter = 0; counter < friends.length; counter++) {
            //System.out.println(counter);
            //System.out.println(friends.length);
            System.out.println("Guess who's about to get slimed?!");
            System.out.println(friends[counter]);
            System.out.println(friends[counter] + " JUST GOT SLIMED!!!!");
        } // end for loop
        //System.out.println(friends[0]);
    }
}