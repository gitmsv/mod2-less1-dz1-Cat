package ua.jvlab.smlnk.object;

public class Cat {

    private String name;
    private String breed;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age > 0 & age <= 7) {
            this.age = age;
        } else {
            System.out.println("ВНИМАНИЕ! Возраст кота не может быть равным/меньше 0 и больше 7 лет");
        }

    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("ВНИМАНИЕ! Вес кота не может быть равным/меньше 0");
        }
        this.weight=weight;

    }

    public Cat() {

    }

    public Cat(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        if (weight <= 0) {
            System.out.println("ВНИМАНИЕ! Вес кота не может быть равным/меньше 0");
        } this.weight=weight;

    }

    public void huntCat() {
        System.out.println("Кот " + getName() + " охотится, вес его составляет " + getWeight() + " кг");
    }

    public void playCat() {
        System.out.println("Кот " + getName() + " любит играть, ему " + getAge()+ " г.");
    }

    public void voiceCat() {
        // заглушка..., и т.д., присущие объекту методы (действия);
    }

}
