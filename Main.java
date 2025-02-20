public class Main {

    public static void main(String[] args) {
        
        Person person = new Person();

        person.setName("Zaden");
        person.setAge(20);

        String name = person.getName();
        int age = person.getAge();

        System.out.println("name: " + name);
        System.out.println("age" + age);
    }
    
}
