package observerlivescore;

public interface Source {
    public void notifyObservers();
    public void register(MyObserver Observer);
    
}