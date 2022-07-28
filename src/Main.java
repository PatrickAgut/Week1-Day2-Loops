public class Main {
    public static void main(String[] args) {
        System.out.println("Loop exercises");
        System.out.println("Question 1:");
        question1();
        System.out.println("Question 2:");
        question2();
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
}