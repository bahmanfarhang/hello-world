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
public class calc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //intro
        System.out.println("Hello, we are here to paint your walls");
        System.out.println("Can you please tell us your age?");
        int age = myScanner.nextInt();
        if (age>=65){
            System.out.println("since you are " + age + " then you are entitled to discount");
        }
        else {
            System.out.println("sorry, you are below the discount age");
        }

        //walls
        System.out.println("please tell me your wall height and length?");
        int wallHeight = myScanner.nextInt();
        int wallLength = myScanner.nextInt();
        if (wallHeight>50 && wallLength>45) {
        System.out.println("sure! my wall height is " + wallHeight + " and my length is " + wallLength);

        }



    }
}
