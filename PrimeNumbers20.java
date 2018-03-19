public class PrimeNumbers20 {
    public static void main(String[] args) {

        int count = 0;
            for (int number = 2; count < 20 ; number++) {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.print(number + " ");
                    count++;
                }
            }
        System.out.println("Count: " + count);
    }
}