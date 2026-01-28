public class Encapsulation {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class EncapsulationTest{
    public static void main(String[] args) {
        Encapsulation person=new Encapsulation();
        person.setName("Jakaria");
        System.out.println(person.getName());
    }
}
