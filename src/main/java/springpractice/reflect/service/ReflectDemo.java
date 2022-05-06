package springpractice.reflect.service;

/**
 * @date 5/6/2022 10:46 PM
 */

class ReflectDemo  implements ReflectInterface{

    String name ;

    ReflectDemo(String name){
        this.name = name;
    }

    @Override
    public void printSomthing(){
        System.out.println("success to print!");
    }


}
