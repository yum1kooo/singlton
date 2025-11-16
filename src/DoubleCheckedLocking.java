public class DoubleCheckedLocking {
    public static void main(String[] args) {
            Dab dab = Dab.getInstance();

    }
}

class Dab{
    private static Dab INSTANCE;

    private Dab(){}

    public static Dab getInstance(){
        if(INSTANCE == null){
            synchronized (Dab.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Dab();
                }
            }
        }
        return INSTANCE;
    }
}
