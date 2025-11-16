public class LazyInitialization {
    public static void main(String[] args) {
        Singlton singlton = Singlton.getInstance();
    }
}
//lazy
class Singlton {
    private static Singlton INSTANCE;

    private Singlton() {
    }

    public static Singlton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singlton();
        }
        return INSTANCE;
    }
}
