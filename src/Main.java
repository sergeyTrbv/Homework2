public class Main {
    public static void main(String[] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dog2 = dog - 3.5;
        System.out.println(dog2);

        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        System.out.println("Вес первого бойца " + boxer1 + " кг");
        var boxer2 = 82.7;
        System.out.println("Вес второго бойца " + boxer2 + " кг");
        var weightTwoBoxer = boxer1 + boxer2;
        System.out.println("Общий вес " + weightTwoBoxer + "кг");

        var weightDifference1 = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightDifference1 + " кг " + "(1 способ)");

        var weightDifference2 = boxer2 % boxer1;
        System.out.println("Разница в весе " + weightDifference2 + " кг " + "(2 способ)");

        var workTime = 640;
        System.out.println("Общее время работы: " + workTime);
        var workingShift = 8;
        System.out.println("рабочая смена " + workingShift + " часов");
        var worker = workTime / workingShift;
        System.out.println("Всего работников в компании – " + worker + " человек");

        worker = worker + 94;
        System.out.println("Количетсо сотрудников после увеличения штата: " + worker );
        var newWorkTime = workingShift * worker;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");

    }
}