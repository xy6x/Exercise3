import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
     //#1
        for (int i = 1; i<=100 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBizz");
            }else if(i%5==0){
                System.out.println("Bizz");}
            else if(i%3==0){
                System.out.println("Fizz");}
            else System.out.println(i);

        }
       // #2
        String maseg = "The quick brown fox";
        int cunt= maseg.length();
        String new_mas="";
        for (int i = cunt-1 ;  i>=0 ; i--) {
            new_mas+=maseg.charAt(i);

        }
       System.out.println(new_mas);
       //#3
       int tax =s.nextInt();
       int fac =1;
        for (int i =tax; i>=1 ; i--) {
            fac *=i;

        }
        System.out.println(fac);

        ///////////////////////////
        //#4
        System.out.println("please enter first number");
        int first_num =s.nextInt();
        System.out.println("please enter second number");
        int second_num = s.nextInt();
        int res =1;
        for (int i = 0; i <second_num ; i++) {
            res *=first_num;
        }
        System.out.println(first_num+"power of "+second_num+"is"+res);






        //#5
        System.out.println("please enter number integers");
        int num =s.nextInt();
        int sum=0;

       while (num !=0){
           sum +=num;
           System.out.println("please enter number integers");
            num =s.nextInt();
       }
        System.out.println(sum);
        //#6
        System.out.println("Please enter a valid number");
        int number2 =s.nextInt();
        boolean isPrime = true;

        if(number2 <= 1){
            isPrime =false;
        }else
            for (int i = 2; i <number2 ; i++) {
                if(number2%i ==0){
                    isPrime =false;
                    break;
                }

              }
        if(isPrime){
            System.out.println("It is a prime number");
        } else System.out.println("It is not a prime number");
        System.out.println("Enter the number of weeks");
        //#7
        System.out.println("please enter  number week");

        for (int week = 1; week<=4 ; week++) {
            System.out.println("Week" + week + ":");
            for (int day = 1; day <= 7; day++) {
                System.out.println("day" + day + ":");

            }

        }
        System.out.print("Please enter the word: ");
        String word = s.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The word is a syndrome");
        } else {
            System.out.println("This word is not a syndrome");
        }
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return word.equalsIgnoreCase(reversedWord);



















    }
}
