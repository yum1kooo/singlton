//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SimpleSolution {
    public static void main(String[] args) {
        Person person = Person.getInstance();

        person.setName("Jack");
        System.out.println(person.getName());
    }
}

class Person{
    String name;
    private static final Person INSTANCE = new Person();

    private Person(){
    }

    public static Person getInstance(){
        return INSTANCE;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
