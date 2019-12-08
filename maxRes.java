import java.util.Scanner;

class Krypton {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        short tests;
        if (ip.hasNext()) {
            tests = (short) ip.nextInt();
            while (tests > 0) {
                int rounds = 0;
                if (ip.hasNext())
                {
                    rounds = ip.nextInt();
                }
                int[] results = new int[11];
                for (short i = 0; i < rounds; i++) {
                    short key = 0, val = 0;
                    if (ip.hasNext()) {
                        key = (short) ip.nextInt();
                    }
                    if (ip.hasNext())
                    {
                        val = (short) ip.nextInt();
                    }   

                    if ( key < 11 && results[key] < val) {
                            results[key] = val;
                    }
                }
                int add = 0;
                for (short i = 0; i < 9; i++) {
                    add += results[i];
                }
                System.out.println(add);
                tests--;
            }
            ip.close();
        }
    }
}
