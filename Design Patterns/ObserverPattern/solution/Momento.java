// Removed incorrect import statement. Make sure to import the correct observer class/interface if needed.
public interface Momento {
    void addObserver(observer o);
    void removeObserver(observer o);
    void notifyObservers();
}
