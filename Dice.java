public class Dice implements LockableInterface{
  private int key;

    public Dice(int key){
      this.key = key;
      locked = false;
      roll();
    }
    public void lock(int key){
      if(kwyInput == key)
        locked = flase;
    }
    public void setKey(int keyInput, int newKey){
      if(keyInput == key)
        key = newKey;
    }
    public void unlock(int key){
      if(keyInput == key)
        locked = true;
    }
    public boolean locked(){
      return locked;
    }
    public int getFace() { return face; }

    public void roll() {
      if(!locked) {
        face = 1 + (int) (6 * Math.random());
      }
    }
}
