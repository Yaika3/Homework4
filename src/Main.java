import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 17;
        if ( age >= 18) {
            System.out.println( "поздравляем с совершеннолетием!");
        }

        if ( age < 18) {
            System.out.println( "возраст совершеннолетия ещё не наступил, и нужно немного подождать.!");
        }


        // task 2
        // Не вижу смысла создавать 3 переменные, просто можно менять значение и код работает( если бы мы запрашивали возраст то было бы интереснее)

        int ageOne = 25;
        if (ageOne <= 7) {
            System.out.println("ребенок ходит в школу");

        }
        if (ageOne > 7)
        if (ageOne >= 18 ) {
            System.out.println("уже закончил школу и может отправляться в университет");

    }
        if (ageOne >= 24){
            System.out.println("человек окончил университет и ему пора искать первую работу");


    }
        // task 3 ( Тот же пример- можно менять значение и программа работает, )
        int totalSeats =102;
        int seating = 60;
        int standingPlaces = ( totalSeats - seating);
        if ( seating >= 60)
       if ( standingPlaces >= 42){
            System.out.println("Свободного места нет");

    }
        if  ( seating < 60)
        if (standingPlaces < 42){
            System.out.println("Место есть");
    }

        //task 4 else
        int ageA = 17;
        if ( ageA >= 18) {
            System.out.println( "поздравляем с совершеннолетием!");
        }

        else {
            System.out.println( "возраст совершеннолетия ещё не наступил, и нужно немного подождать.!");


    }
        //task 5 else - по задачам с возрастом и поездом в комментах ребятки уже решили этот вопрос)конструкция else не требуется тк несколько условий.





        // task 6
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваш возраст: ");
        int ageTwo = in.nextInt();
        boolean kindergarten = ageTwo > 2 && ageTwo <= 6;
        boolean school = ageTwo >= 7 && ageTwo < 18;
        boolean college = ageTwo>= 18 && ageTwo < 24;
        boolean Job = ageTwo > 24;

        if ( kindergarten){
            System.out.println("нужно ходить в детский сад");}
            if (school) {
                System.out.println("нужно ходить в школу");}
            if (college) {
                System.out.println("в университет");}
            if (Job) {
                System.out.println(" пора ходить на работу");}


            //task 7 все задачи записал в один проэкт(задача 7 работает после исполнение задачи 6)

        int kid = 5;
        boolean kidFive = kid < 5;{
            System.out.println( "он не может кататься на аттракционе.");}
        boolean KidFive14 = kid > 5 && kid < 14; {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
        boolean Kid14 = kid > 14; {
            System.out.println("он может кататься без сопровождения взрослого.");}


        // task 8 (можно сравнивать каждое число,но зачем если есть такой вариант отпимизации кода?или я неправильно понял?)
        int one = 1;
        int two = 2;
        int free= 3;// если поменять на 1 то выполнится условия else
        if (free> two && free> one){
            System.out.println("Наибольшее число "+ free);}
        else System.out.println(" Программа не работает");





    }}