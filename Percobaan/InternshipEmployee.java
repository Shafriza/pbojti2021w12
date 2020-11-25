
package Percobaan;

public class InternshipEmployee extends Employee{
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }
    public int getLenght(){
        return length;
    }
    public void setLenght(int length){
        this.length = length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
