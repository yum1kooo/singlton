public class SynchronizedAccessor {
    public static void main(String[] args) {
            Synch s = Synch.getInstance();
    }
}

class Synch{
    private static Synch INSTANCE;

    private Synch(){}

    public static synchronized Synch getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Synch();
        }
        return INSTANCE;
    }
}
