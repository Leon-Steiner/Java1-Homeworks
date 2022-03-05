/**
* GB Java 1. Home work #7
*
* @author Leon Steiner
* @version 05.03.2022
*/
class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Flerkin", 15), new Cat("Kate", 10), new Cat("El_diablo", 20)
        };
        Plate plate = new Plate(50, 30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean wellfed;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        wellfed = false;
    }
    
    void setFullness(boolean status) {
        wellfed = status;
    }
    
    void eat(Plate plate) {
        if (!wellfed) {
            wellfed = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "{name=" + name + ", appetite=" +
        appetite + ", wellfed=" + wellfed + "}";
    }
}

class Plate {
    private int volume;
    private int food;
    
    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }
    
    boolean decreaseFood(int portition) {
        if (food < portition) {
            return false;
        }
        food -= portition;
        return true;
    }
    
    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }
    
    @Override
    public String toString() {
        return "plate: " + food;
    }
}