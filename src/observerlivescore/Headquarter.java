package observerlivescore;

import java.util.ArrayList;

public class Headquarter implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;
    
    public Headquarter() {
        this.list = new ArrayList<MyObserver>();
    }

    public void setsomeData(String aData) {
        someData=aData;
        notifyObservers();
    }
    public String getsomeData() {
        return someData;
    }

    @Override
    public void register(MyObserver observer){
        list.add(observer);
    }

    @Override
    public void notifyObservers(){
        for(int j =0 ;j<list.size();++j){
            list.get(j).update(this);
        }
    }


}