public class Main {
    public static void main(String[] args) {
//Задание 1
    double dog = 8;
    var cat = 3.6;
    var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задание 2
    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задание 3
    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задание 4
    var friend = 19;
        System.out.println(friend);
    friend = friend + 2;
        System.out.println(friend);
    friend = friend / 3;
        System.out.println(friend);

//задание 5
    var frog = 3.5;
        System.out.println(frog);
    frog = frog * 10;
        System.out.println(frog);
    frog = frog / 3.5;
        System.out.println(frog);
    frog = frog + 4;
        System.out.println(frog);

//задание 6
    var boxer1Weight = 78.2;
    var boxer2Weight = 82.7;
    var sumOfBoxers = boxer1Weight  + boxer2Weight;
        System.out.println("суммарный вес " + sumOfBoxers);
    var diffOfBoxers = boxer2Weight - boxer1Weight;
        System.out.println("разница в весе " + diffOfBoxers);

//задание 7
    diffOfBoxers = boxer2Weight - boxer1Weight;
        System.out.println("разница в весе " + diffOfBoxers);
    diffOfBoxers = boxer2Weight % boxer1Weight;
        System.out.println("разница в весе " + diffOfBoxers);

//задание 8
    var workHours = 640;
    var numOfWorkers = workHours / 8;
        System.out.println("Всего работников в компании - " + numOfWorkers + "человек");
    numOfWorkers = numOfWorkers + 94;
    workHours = numOfWorkers * 8;
        System.out.println( "Если в компании работает " + numOfWorkers + " человек, то всего " + workHours +
                " часов работы может быть поделено между сотрудниками");
    }
}