package observerlivescore;

public class Shoutcaster implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("Now The Score is =>"+((Headquarter)o).getsomeData());
    }
}