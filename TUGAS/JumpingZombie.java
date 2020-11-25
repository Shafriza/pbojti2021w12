package TUGAS;
public class JumpingZombie extends Zombie {
    JumpingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
    @Override
    public void heal(){
        if (this.health<100) {
                   switch(level){
            case 1:
                this.health = (int)(health + (health*0.30));
                break;
            case 2:
                this.health = (int)(health + (health*0.40));
                break;
            case 3:
                this.health = (int)(health + (health*0.50));
                break; 
        }
            if (this.health>100) {
                  this.health = 100;  
                }
        }else if(this.health>100){
            this.health = 100;
        }
    }
    @Override
    public void destroyed(){
        int dstr = (int)(health*0.1);
        this.health -= dstr;
    }
    @Override
    public String getZombieinfo(){
        String wlk = "Jumping Zombie Data =\n";
        return wlk+super.getZombieinfo();
    }
}
