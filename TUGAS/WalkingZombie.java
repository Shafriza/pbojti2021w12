package TUGAS;
public class WalkingZombie extends Zombie{
    WalkingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }
    @Override
    public void heal(){
        if (this.health<100) {
          switch(level){
            case 1:
                this.health = (int)(health + (health*0.10));
                break;
            case 2:
                this.health = (int)(health + (health*0.30));
                break;
            case 3:
                this.health = (int)(health + (health*0.40));
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
        int dstr = (int)(health*0.2);
        this.health -= dstr;
    }
    @Override
    public String getZombieinfo(){
        String wlk = "Walking Zombie Data =\n";
        return wlk+super.getZombieinfo();
    }
}
