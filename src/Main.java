import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Loop exercises");
        System.out.println("Question 1:");
        question1();
        System.out.println("Question 2:");
        question2();
        //System.out.println("Question 3:");
        //question3();
        System.out.println("Question 13:");
        question13();
    }

    public static void question1(){
        for (int i = 1; i<=10;i++){
            System.out.println(i);
        }
    }

    public static void question2(){
        int sum = 0;
        for (int i = 1; i<=10; i++){
            sum += i;
        }
        System.out.println("Result: "+sum);
    }

    public static void question3(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a positive natural number");
        int userNumber = Integer.parseInt(reader.nextLine());
        for (int i = 1; i<=10;i++){
            System.out.println(userNumber+"*"+i+"="+userNumber*i);
        }
    }

    public static void question13(){
        for (int i = 0; i<=5; i++){
            for (int j = 0; j<=9; j++){
                for (int k = 0; k<=9; k++){
                    int number = i*100+j*10+k;
                    //System.out.println(number);
                    int armstrongOperation = (i*i*i)+(j*j*j)+(k*k*k);
                    if (number == armstrongOperation){
                        System.out.println(number+" is an armstrong number!");
                    }
                }
            }

        }

    }
}