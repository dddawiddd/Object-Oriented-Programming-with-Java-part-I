public class Printing {

    public static void printStars(int amount) {
        for(int i = 1; i<=amount; i++)
            System.out.print("*");
        System.out.println("");
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
    }

    public static void printSquare(int sideSize) {
        for(int i = 1;i<=sideSize;i++)
            printStars(sideSize);
        // 39.2
    }

    public static void printRectangle(int width, int height) {
        for(int i = 1; i<=height;i++)
            printStars(width);
        // 39.3
    }

    public static void printTriangle(int size) {
        for(int i = 1;i<=size;i++)
            printStars(i);
        // 39.4
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        printTriangle(4);

        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first
        // here to see that the printout looks correct
/*
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");

        */
    }

}
