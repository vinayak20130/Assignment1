public class FizzBuzz {
    public static void fizzBuzz(int n){
        for (int i = 1; i <=n; i++) {
            if (i%3==0&&i%5!=0) {
                System.out.println("Fizz");
            }
            else if (i%3!=0&&i%5==0) {
                System.out.println("Buzz");
            }
            else if (i%3==0&&i%5==0) {
                System.out.println("Fizz Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz(Integer.MAX_VALUE);
    }
}
