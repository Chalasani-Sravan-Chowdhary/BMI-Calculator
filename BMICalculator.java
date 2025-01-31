import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Entering values required for BMI calculations;
        System.out.println("Enter your Weight:");
        double weight= scanner.nextDouble();

        System.out.println("Enter your height");
        double height= scanner.nextDouble();

        System.out.println("Enter your Age");
        double Age= scanner.nextDouble();

        double bmi = weight / (height * height);

        
        System.out.printf("Your BMI is: %.2f%n", bmi);

        
        if(Age>=18){
        if (bmi < 18.5) {
            System.out.println("You are underweight as per BMI.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight as per BMI.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight as per BMI.");
        } else {
            System.out.println("You are obese as per BMI.");
        }
    }else{
        if (bmi < 15) {
            System.out.println("You are underweight as per BMI.");
        } else if (bmi<= 18.5 ) {
            System.out.println("You have a normal weight as per BMI.");
        } else if (bmi >= 18.5 ) {
            System.out.println("You are overweight as per BMI.");
        } 
       
        scanner.close();
    }
}
    }

