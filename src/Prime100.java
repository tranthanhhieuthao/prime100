public class Prime100 {
    public static void main(String[] args) {
        boolean isprime =false;
        for (int i = 1; i < 100; i++) {
            if (i == 2| i==3)
                System.out.println(i);
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){
                    isprime = false;
                    break;
                }
                else isprime = true;
            }
            if (isprime)
            System.out.println(i);

        }
    }
}
