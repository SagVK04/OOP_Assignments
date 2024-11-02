/*Write A Program In Java To Create A Class Animal
Having A Method Eat() To Print The Message "All Animal Can Eat".
From This Animal Class Create A Child Class Of Name Dog. Dog
Has Its Own Member Method Called Bark() To Print The Message
"Dogs Are Barking". Now Create An Object Of Dog To Print Its
Eating And Barking Nature.*/
class Animal {
    void eat() {
        System.out.println("All animals can eat.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dogs are barking.");
    }
}
public class p3 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
    }
}