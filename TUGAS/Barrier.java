
package TUGAS;


public class Barrier implements Destroyable {
    private int Strength;
    
    Barrier(int Strength){
        this.Strength = Strength;
    }
    public void setStrength (int Strength){
        this.Strength = Strength;
    }
    public int getStrength(){
        return this.Strength; 
    }
    @Override
    public void destroyed() {
        int dstr = (int)(Strength * 0.112); 
        this.Strength -= dstr;
    }
    public String getBarrierInfo(){
        String str ="Barrier Strength = "+String.valueOf(Strength);
        return str;
    }
}
