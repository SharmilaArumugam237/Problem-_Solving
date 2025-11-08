import java.util.Scanner;

public class Problem_100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        //positiveornegative(num);
        //OddOrEven(num);
        //SumOfNaturalNum(num);
        //SumOfNumRange(n1,n2);
        //GreatestOfTwo(n1,n2);
        //GreatestofThree(n1,n2,n3);
        //LeapYearOrNot(num);
       //System.out.println(PrimeOrNot(num));
        //Prime(n1,n2);
        //SumOFDigits(num);
        //ReverseNum(num);
        //PalindromeNum(num);
        //ArmstrongRange(n1,n2);
        //ArmstrongNum(num);
       //FibonacciSeries(num);
       // System.out.print(Factorial(num));
        //PowerOfANum(n1,n2);
        //FactorOfNum(num);
        //isStrongNumber(num);
        //PerfectNumber(num);
        //AbundantNumber(num);
        //AutomorphicNumber(num);
        //HarshadNumber(num);
       // PerfectSquare(num);
       // FriendlyPairs(n1,n2);
        HCF(n1, n2);
    }
    public static void HCF(int n1, int n2){
        if(n1==n2) System.out.println(n1);
        int result=Math.min(n1,n2);
        while(result>0){
            if(n1%result == 0 && n2 % result ==0){
                 break;
            }
            result--;
        }


    }
    public static void FriendlyPairs(int n1, int n2){
        if(SumOfFactor(n1)/n1 == SumOfFactor(n2)/n2){
            System.out.print("Friendly Pairs");
        }
        else{
            System.out.print("Not a Friendly Pairs");
        }

        }
    public static void PerfectSquare(int n){
        double a=Math.sqrt(n);
        if(n == a*a){
            System.out.print("Perfect Square");
        }
        else{
            System.out.print("Not a Perfect Square");
        }
    }

    public static void HarshadNumber(int n){
        System.out.print(n%SOD(n)==0?"Harshad Number":"Not an Harshard Number");
    }
    public static int SOD(int n){
        int sum =0;

        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static void AutomorphicNumber(int n)
    {
        int num = (n*n)%10;
        if(n%10 == (n*n)%10){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.print("Not an Automorphic Number");
        }
    }
    public static void AbundantNumber(int n){
        System.out.print(n<SumOfFactor(n)?"Abundant Number":"Not an Abundant Number");
    }
    public static void PerfectNumber(int n){
            System.out.print(n == SumOfFactor(n)?"Perfect Number":"Not a Perfect Number");

    }
    public static int SumOfFactor(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void isStrongNumber(int n){
        System.out.print(n==StrongNumber(n)?"Strong Number":"Not a Strong NUmber");
    }
    public static int StrongNumber(int n){
        int strong=0;
        while(n>0){
          strong+=Factorial(n%10);
            n=n/10;
        }
        return strong;
    }
    public static void FactorOfNum(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }

    }
    public static void PowerOfANum(int num,int pow){

        int i = 1;
        int mul =1;
        while(i<=pow){
           mul*=num;
            i++;
        }
        System.out.print(mul);
    }
    public static int Factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void FibonacciSeries(int n){
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i =2;i<n ;i++){
           int c=a+b;
          System.out.print(c+" ");
          a=b;
          b=c;
        }
    }
    public static void ArmstrongRange(int start, int end){
        for(int i = start; i<= end; i++){
            if(i == isArmstrongNum(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static void ArmstrongNum(int num){
        if(num == isArmstrongNum(num)){
           System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
    public static int isArmstrongNum(int n){
        int sum=0;
        while (n != 0) {
            int a= n%10;
            sum += a*a*a;
            n = n/10;
        }
        return sum;


    }
    public static void PalindromeNum(int n){
        if(n == ReverseNum(n)){
            System.out.print("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static int ReverseNum(int n){
        int rev=0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10 + digit;
            n=n/10;

        }
        return rev;
    }
    public static void SumOFDigits(int n){
        int sum =0;

        while(n>0){
           sum += n%10;
           n = n/10;
        }
        System.out.println(sum);
    }
    public static void OddOrEven(int n){
        System.out.println((n%2==0)?"Even":"Odd");
    }
    public static void positiveornegative(int n){
            System.out.println((n>0)?"Positive":"Negative");
    }
    public static void SumOfNaturalNum(int n){
        int sum=0;
        for(int i=1; i<=n ; i++){
            sum+=i;
        }
        System.out.println("Sum of N Natural numbers are :" + sum);
    }
    public static void SumOfNumRange(int n1, int n2){
        int sum =0;
        for(int i=n1 ; i<=n2;i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("Sum of Natural numbers between Range :" + sum);
    }
    public static void GreatestOfTwo(int n1, int n2){
        System.out.println((n1>n2)? n1 +" is Greater" :n2 +" is Greater" );
    }
    public static void GreatestofThree(int n1, int n2, int n3){
        if(n1>n2 && n1>n3){
            System.out.print(n1);
        }
        else{
            System.out.println(Math.max(n2, n3));
        }
    }
    public static void LeapYearOrNot(int year){
        if((year%400 == 0 )||(year%4 ==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Non Leap Year");
        }
    }public static void Prime(int start,int end){
        for(int i=start; i<=end; i++){
            if(PrimeOrNot(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean PrimeOrNot(int n){
        if(n<2) return false;
        if(n>2) {
            for (int i = 2; i <=Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
            }
        }
       return true;

    }
}
