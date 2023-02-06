public class Bear {
    private String name;
    private int age;
    private double weight;

    private char sex;

    public Bear(String name, int age, double weight, char sex){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;

    }
    public String getName(){
        return this.name;
    }
    public String setName(String newName){
         this.name = newName;
         return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean readyToHibernate() {
//        if(this.weight >= 80.00){
//        return true;
//    }else {
//            return false;
//        }
        return this.weight >= 80.00;
     }

     public char getSex(){
        return this.sex;
     }
    }


