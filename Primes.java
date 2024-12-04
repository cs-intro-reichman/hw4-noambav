public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        final int N = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + N + ":");
        boolean[] isPrime = new boolean[N];
        int currentPrime = 2;
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int multiplie = currentPrime + currentPrime;
        while (currentPrime < Math.sqrt(N)) {
            multiplie = currentPrime + currentPrime;
            while (multiplie < N) {
                isPrime[multiplie] = false;
                multiplie += currentPrime;
            }
            for (int i = currentPrime + 1; i < N; i++) {
                if (isPrime[i] == true) {
                    currentPrime = i;
                    break;
                }
            }
        }
        int counter = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println(
                "There are " + counter + " primes between 2 and " + N + " (" + (int) (100.0 * counter / N)
                        + "% are primes)");
    }
}