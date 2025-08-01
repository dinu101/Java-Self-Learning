//instance scope example
class instacescope{
    int Speed=120;//Instance scope variable
    public void showSpeed(){
        System.out.println(Speed);//Access Inside The Method
    }
    //main java entry point
    public static void main(String[] args){
        instacescope obj=new instacescope();//
        obj.showSpeed();
    }
}
//       Instance Method Question      //
// Q.What Is Instance Scope?
//Ans:- * A Variable Declared Inside A Class But Outside Any Method.
//      *also called non static field.
//      *Each Object Gets Its Own Copy.
//      *Instance Scope Means That A Variable Belongs To One Specific Object
