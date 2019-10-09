public class Test {
    private int x =0;    //if private is included, the ExampleProgram cannot use it without a getter method
    int y =2;
    int z=1;

    int f(int x , int y){             //was void so it will return nothing
        y = y + this.y;           //use this to refer to specific 'y'
        return y;
       /* z = x + this.z;
        this.y= y + this.x * z +z;
        x = this.x + 1;*/
    }
    //getter method to retrieve hiding private x
    public int getX(){
        return x;
    }

    //setter method
    public void setX(int myNewValueForX){
        x = myNewValueForX;
    }


    private void doSomething(){
        System.out.println("here in private 1.");
    }

    public void doAnother(){

        System.out.println("I'm here in private 2.");
    }

    void doAnother2(){
        System.out.println("I'm here in private 3.");
    }

    int createSum(int addOn){
        return addOn + x;
    }
    //method with same name is called overloading
    int createSum(int addOn, int secondAddOn){
        return addOn + secondAddOn + x;
    }
    //can overload to accept different data types
    double createSum(double addOn){
        return addOn + x;
    }

}
