package mate.szummer.designpatterns.creational.singleton;

public final class Singleton {

    private static Singleton instance;

    private int myNumber;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }
}
