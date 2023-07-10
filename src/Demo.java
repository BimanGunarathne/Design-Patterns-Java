public class Demo {
    public static void main(String[] args) {
        Singalton singalton1 = new Singalton();
        Singalton singalton2 = new Singalton();
        System.out.println(singalton1==singalton2);
    }
}
