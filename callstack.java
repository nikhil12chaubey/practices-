public class callstack {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        System.out.println("back to a");

    }

    public static void b() {
        System.out.println("back to b");
        c();
        System.out.println("inside c");
    }

    public static void c() {
        System.out.println("inside c");
    }
}
