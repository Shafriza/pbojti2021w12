
package TUGAS;

public class Zombie implements Destroyable {
    public int health;
    public int level;
    
    public void heal(){
        System.out.println("Zombie has been heal");
    }
    @Override
    public void destroyed(){
        System.out.println("Zombie has been destroyed");
    }
    public String getZombieinfo(){
        return "Health = "+health+"\n"+"Level = "+level;
    }
}
