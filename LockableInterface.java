public interface Lockable{
    void setKey(int keyInput, int newKey);
    void lock(int key);
    void unlock(int key);
    boolean locked();
}
