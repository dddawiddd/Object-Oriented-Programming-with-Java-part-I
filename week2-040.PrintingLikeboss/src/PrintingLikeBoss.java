public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for(int i =1; i<=amount;i++)
            System.out.print("*");
        System.out.println("");

    }

    public static void printWhitespaces(int amount) {
        for(int i =1; i<=amount;i++)
            System.out.print(" ");
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i<=size){
            printWhitespaces(size-i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        while(i<=height){
            printWhitespaces(height-i);
            printStars(2*i-1);
            i++;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);

    }

    public static void main(String[] args) {
        printStars(5);
        //printWhitespaces(4);
        printTriangle(4);
        System.out.println("");
        xmasTree(16);



        // Tests do not use main, yo can write code here freely!
        /*
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
        */
    }
}
