import java.util.Scanner;

public class calculationIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Weight");
        int weight = scanner.nextInt();
        System.out.println("Enter Your Height");
        double height= scanner.nextDouble();
        double bmi= weight /(height * height);
        System.out.println("Your Body Mass Index"+bmi);

    }
}
