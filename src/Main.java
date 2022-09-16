public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");

        var dog1 = 12.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес " + totalWeight + " кг");

        var difference = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница " + difference);

        // Задача 7
        System.out.println("Задача 7");

        difference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Из большего " + difference);

        difference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница " + difference + " кг!");

        // Задача 8
        System.out.println("Задача 8");

        var commonHours = 640;
        var oneEmployee = 8;
        var totalEmployees = commonHours / oneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");


        totalEmployees = totalEmployees + 94;
        commonHours = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + commonHours + " часа работы может быть поделено между сотрудниками");

        //Домашка выполнена
    }
}