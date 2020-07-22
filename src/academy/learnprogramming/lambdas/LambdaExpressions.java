package academy.learnprogramming.lambdas;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String type;
    private boolean canJump;
    private  boolean canSwing;

    public Animal(String type, boolean canJump, boolean canSwing) {
        this.type = type;
        this.canJump = canJump;
        this.canSwing = canSwing;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public boolean isCanSwing() {
        return canSwing;
    }

    public String getType() {
        return type;
    }
}

interface CheckAnimal {
    boolean check(Animal animal);
}

class CheckCanJump implements CheckAnimal {

    @Override
    public boolean check(Animal animal) {
        return animal.isCanJump();
    }
}

public class LambdaExpressions {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));

        print(animals, new CheckCanJump());

        print(animals, Animal::isCanSwing);
        print(animals, animal ->  !animal.isCanSwing());

    }

    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }

        System.out.println();
    }
}
