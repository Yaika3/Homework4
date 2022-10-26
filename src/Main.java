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


    }}