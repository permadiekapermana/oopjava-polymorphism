public class Main {
    public static void main(String[] args) {

        Smartphone object = new Smartphone();
        System.out.println(object.brand);
        object = new Xiaomi();
        System.out.println(object.brand);
        object = new Iphone();
        System.out.println(object.brand);

    }
}