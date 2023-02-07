public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4.0;
        System.out.println("dog: " + dog);
        cat = cat + 4.0;
        System.out.println("cat: " + cat);
        paper = paper + 4;
        System.out.println("paper: " + paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        System.out.println("dog: " + dog);
        cat = cat - 1.6;
        System.out.println("cat: " + cat);
        paper = paper - 7639;
        System.out.println("paper: " + paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend: " + friend);
        friend = friend + 2;
        System.out.println("friend+2= " + friend);
        friend = friend / 7;
        System.out.println("friend/7= " + friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog: " + frog);
        frog = frog * 10.0;
        System.out.println("frog*10= " + frog);
        frog = frog / 3.5;
        System.out.println("frog/3.5= " + frog);
        frog = frog + 4.0;
        System.out.println("frog+4= " + frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var boxerFerst = 78.2;
        var boxerSeсond = 82.7;
        var boxerAll = boxerFerst + boxerSeсond;
        System.out.println("Общий вес боксеров " + boxerAll + "кг");
        var boxerDifference = boxerFerst - boxerSeсond;
        System.out.println("Разница веса на " + boxerDifference + "кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var boxerFerst = 78.2;
        var boxerSeсond = 82.7;
        var boxerAll = boxerFerst + boxerSeсond;
        var boxerDifference = boxerSeсond - boxerFerst;
        System.out.println("Разница веса на " + boxerDifference + "кг");
        boxerDifference = boxerAll % boxerFerst;
        System.out.println("Разница веса на " + boxerDifference + "кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var timeAll = 640;
        var timeOne = 8;
        var employee = timeAll / timeOne;
        System.out.println("Всего работников в компании — " +employee + " человек");
        var employeeMore = 94;
        var employeeAll = employee + employeeMore;
        var timeNew = timeAll / employeeAll;
        System.out.println("Если в компании работает " + employeeAll + " человек, " +
                "то всего " + timeNew + " часа работы может быть поделено между сотрудниками.");
    }
}