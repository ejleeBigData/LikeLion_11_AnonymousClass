interface Calculator {
    int compute(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator mul = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a * b;
            }
        };

        Calculator add = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a + b;
            }
        };

        Calculator pow = new Calculator() {
            @Override
            public int compute(int a, int b) {
                if(b <= 0) {
                    return 1;
                }
                else{
                    return a * this.compute(a, b - 1);
                }
            }
        };

        System.out.println(mul.compute(4, 5));
        System.out.println(add.compute(7, 8));
        System.out.println(pow.compute(2, 3));
    }
}