public class ClassHolderSingleton {

}

class Singleton{

    private Singleton(){}

    private static class SingletonHolder{
        private static Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
