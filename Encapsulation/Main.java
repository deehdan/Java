

class Employee{
    private int code;
    private String name;

    public void setCode(int empcode){
        this.code = empcode;
    }

    public void setName(String uName){
        this.name = uName;
    }



    public int getCode(){
        return code;
    }

    public String getName(){
        return name;
    }
}

class Manager extends Employee{
    double salary = 3200.78;
    String office = ("Mg");

}

public class Main{
    public static void main(String[]args){
     
        
        Manager m = new Manager();
        m.setName("Cate");
        m.setCode(0);

        System.out.println(m.getName()+" works in the "+m.office+" office and their salary is "+m.salary+" ksh. "+m.getCode());

    }
}