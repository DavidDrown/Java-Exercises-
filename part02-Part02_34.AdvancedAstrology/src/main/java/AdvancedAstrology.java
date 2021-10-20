
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++){  
            System.out.print("*");
        } 
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++){  
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int a = 1;
        int b = (height + height) - 1; 
        for (int i = 1; i <= b; i+=2) {
            printSpaces(height - a);
            printStars(i);
            a++; 
        }
        for (int c = 0; c < 2; c++) {
            printSpaces((b/2)-1);
            printStars(3);
        }
    }
    
  

    public static void main(String[] args) {
        
        
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}     
