public class Encapsulation {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class EncapsulationTest{
    public static void main(String[] args) {
        Encapsulation person=new Encapsulation();

        person.setName("Jakaria");
        person.setAge(24);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
