import java.util.Scanner; 

class arithmetic {
    public static void main(String[] args){

    int a;
    System.out.println("Enter the first value : ");

    Scanner scanner = new Scanner(System.in);
    a=scanner.nextInt();
    System.out.println("Enter the second value : ");
    int b = scanner.nextInt();

    System.out.println("The Sum is :" +(a+b));
    System.out.println("The substraction is :" +(a-b));
    System.out.println("The Divition is :" +(a/b));
    System.out.println("The Multiplication is :" +(a*b));
    System.out.println("The Remainder is :" +(a%b));

    scanner.close();
}
}
