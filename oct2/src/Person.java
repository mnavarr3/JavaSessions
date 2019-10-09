public class Person {

    //will not be including main because this will be combined with others that do have it
    //like using public available Java API
    String name;
    int age;

    //constructor
    public Person(String na, int age){
        name=na;
        this.age= age;
        System.out.println("Created person: "+ name);
    }

    //other constructor
    public Person(String na){
        name = na;
        System.out.println("Created Person: " + name);
    }


    //setter method for name
    public void setName (String na) {
        name = na;
    }
    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for age
    public void setAge (int age){
        this.age = age;
    }

    //getter method for age
    public int getAge(){
        return age;
    }
    //puts everything in format
    public String printEverything(){
        return String.format("Name: " + name+ ", Age: "+ age);
    }
}
