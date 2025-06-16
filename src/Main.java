interface Greeting {
    void greet();

    //void bye();
}

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("익명클래스 ");
            }
        };

        //Greeting bye = () -> System.out.println("놉");
        //greeting.bye();
    }
}