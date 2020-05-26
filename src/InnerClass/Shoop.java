package InnerClass;

public class Shoop {
    public static void main(String[] args) {
        Door door = new Door();
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }
}


