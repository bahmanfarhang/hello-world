import java.util.Scanner;

/*
* Calculator App
-Size of the wall
-What happens if there is things on the wall like a door or socket
-How many paint buckets will i need to paint my wall
-what happens if i have different bucket sizes

* 2 walls
*
* */

public class PaintCalcApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //intro
        System.out.println("Hi we are Top Painters, what is your name and age?");
        String name = myScanner.nextLine();
        int age = myScanner.nextInt();
        int discount = 5;
        if (age >=65){
            System.out.println("welcome to my house, my name is " + name+ " and my age is "+ age);
            System.out.println("because you are above "+ age + "you get £"+discount+ " discount from your total bill");
        }
        else {
            System.out.println("sorry no discount because you are "+ age);
        }

        //bucket info
        int bucketLitre = 2;
        int bucketMetres = 6;
        int totalMetre = bucketLitre*bucketMetres;
        System.out.println("1 paint bucket has 2 litre of paint which will cover 6 metres sqr of wall, giving" +
                " a total of "+ totalMetre + "metres");

        //wall info
        System.out.println("what is your wall length and wall height? in metres");
        int wallLength = myScanner.nextInt();
        int wallHeight = myScanner.nextInt();
        System.out.println("your wall length is: " + wallLength + " and wall height is: " +  wallHeight);
        int wallArea = wallLength*wallHeight;
        System.out.println("your total area size is: " + wallArea);
        System.out.println("you'll need " + wallArea*2 + "litrs of paint to cover the wall");

        //number of walls
        System.out.println("how many walls do you have?");
        int numberOfWalls = myScanner.nextInt();
        for (int i = 0; i< numberOfWalls; i++){
            System.out.println("you have a total of "+ i);
        }

        System.out.println("Therefore, " + numberOfWalls*wallArea + " is the total painting area");

        System.out.println("you might need 2 or 3 buckets");
        int paintBucket = myScanner.nextInt();
        System.out.println("so, you need" + paintBucket+ " buckets");

        //window
        System.out.println("what is your window length and height?");
        int windowLength = myScanner.nextInt();
        int windowHeight = myScanner.nextInt();
        System.out.println("my window is " + "length: " + windowLength + " height : " +  windowHeight);
        int windowArea = windowLength*windowHeight;
        int finalPaint = wallArea-windowArea;
        System.out.println("your total area size is " + windowArea);
        System.out.println("we can minus window area from the walls, giving" + finalPaint);

        //socket
        double eachSocketPrice = 0.99;
        System.out.println("how many sockets are on the wall: ");
        int socket = myScanner.nextInt();
        double totalSocketPrice = socket*eachSocketPrice;
        System.out.println("there are " + "" +" sockets " + totalSocketPrice);

        //price
        double redPrice = 11.99;
        double bluePrice = 9.99;
        double greenPrice = 15.99;
        double newPrice = greenPrice-totalSocketPrice;

//        if (redPrice){
//            System.out.println("you are");
//        }
        System.out.println("each bucket will cost you " + greenPrice + "excluding sockets");
        System.out.println("so, it will be a total of " + newPrice*2);

        //extra
        System.out.println("do you want better quality ?");
        String response = myScanner.nextLine();
        System.out.println(response);

        System.out.println("alright, then it will be " + greenPrice*3);
        double discountedPrice = greenPrice-discount;
        System.out.println("and your new total after discount is " + discountedPrice);

    }
}
