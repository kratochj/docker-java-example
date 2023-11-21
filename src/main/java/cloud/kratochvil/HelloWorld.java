package cloud.kratochvil;

public class HelloWorld {

    String text;
    public HelloWorld(String text) {
        this.text = text;
    }


    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("Hello World...!");
        helloWorld.print();
    }

    public void print() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}