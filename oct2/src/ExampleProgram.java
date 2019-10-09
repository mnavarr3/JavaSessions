public class ExampleProgram {

    public static void main(String[] args){
        Person anne = new Person("annie", 40);
        Person hubert = new Person("hubert");
        //cannot just type
        // Person peggy;
        //because it has not been correctly initialized like " Person peggy = new Person("peggy"); "

        System.out.println(hubert.getName());//if hubert hadn't been set, the program will return 'null'
        System.out.println(anne.getName());

        anne.setName("Mary");
        hubert.setName("Mark");

        System.out.println(hubert.getName());  //hubert HAS been re-set so it will return "Mark"
        System.out.println(anne.printEverything());

    }
}
