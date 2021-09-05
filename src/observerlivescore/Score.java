package observerlivescore;

public class Score implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("Live Score : "+((Headquarter)o).getsomeData());
    }
}