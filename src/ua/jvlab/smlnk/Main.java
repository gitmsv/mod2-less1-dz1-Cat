package ua.jvlab.smlnk;

import ua.jvlab.smlnk.object.Cat;

public class Main {

    public static void main(String[] args) {

        Cat ct1 = new Cat("Матроскин", "Siam", 5, 2.8);
        ct1.huntCat();

        Cat ct2 = new Cat();
        ct2.setName("Рыжик");
        ct2.setAge(3);
        ct2.playCat();
    }
}
