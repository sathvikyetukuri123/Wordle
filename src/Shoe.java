import java.util.ArrayList;
//Sathvik Y

public abstract class Shoe {
    private String myName;

    public Shoe(String myName) {
        this.myName = myName;
    }

    public String getName() {
        return myName;
    }

    public abstract String speak();
}

class Dog extends Shoe{
    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "dog";
    }
}

class Cat extends Shoe {
    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "Meow";
    }
}

class LoudDog extends Shoe {
    public LoudDog(String name) {
        super(name);
    }

    public String speak() {
        return "dog noise";
    }
}

class Kenel {
    private ArrayList<Shoe> petList;

    public void AllSpeak() {
        for (Shoe pet : petList) {
            System.out.println(pet.getName() + ": " + pet.speak());
        }
    }
}