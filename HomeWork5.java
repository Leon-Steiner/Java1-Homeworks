/**
* GB Java 1. Home work #5
*
* @author Leon Steiner
* @version 25.02.2022
*/
class HomeWork5 {
    public static void main(String[] args) {
        Worker[] workers = {
            new Worker ("Shtainer Leonid", "Installer", 
                "LShtayner@nvbs.ru", "86396682700", 55000, 33),
            new Worker ("Moskalenok Valentin", "Senior installer", 
                "VMoskalenok@nvbs.ru", "86396682687", 65000, 34),
            new Worker ("Sadovnikov Anton", "Department leader", 
                "ASadovnikov@nvbs.ru", "86396620049", 90000, 39),
            new Worker ("Smirnov Roman", "Installer", 
                "RSmirnov@nvbs.ru", "86396682718", 55000, 41),
            new Worker ("Mamistov Andrey", "Shift Supervisor", 
                "AMamistov@nvbs.ru", "86396682677", 80000, 42),
        };
        
        for (Worker worker : workers) {
            if (worker.getAge() > 40) {
                System.out.println(worker);
            }
        }
    }
}

class Worker {
    private String name;
    private String function;
    private String email;
    private String phone;
    private int wage;
    private int age;
    
    public Worker(String name, String function, String email, String phone,
            int wage, int age) {
        this.name = name;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }
            
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return (name +
            "\n| Function: " + function +
            "\n| Email: " + email +
            "\n| Phone: " + phone +
            "\n| Wage: " + wage +
            "\n| Age: " + age);
    }
}
