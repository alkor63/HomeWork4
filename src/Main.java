public class Main {
    public static void main(String[] args) {
// Home Work 4
        System.out.println("********** Home Work 4 **********");

        int age = 21;
        byte capacity = 102;
        byte sitting = 60;
        byte numPas = 55;
// Task 1 else
        System.out.println(" * Task 1 else");
        age = 16;
        if (age >= 18)  { System.out.println("Поздравляем, тебе уже "+ age +" ты можешь купить пива!");}
        else { System.out.println("Извини, тебе всего "+ age +" ты не можешь купить пива!");}

// Task 2 else
        System.out.println(" * Task 2 else");
        age = 21;
        if (age >= 24)  { System.out.println("Парню "+ age +" ,он наконец-то нашел работу!");}
        else {
            if (age >= 18) {
                System.out.println("Юноше " + age + " ,он студент!");
            } else {
                if (age < 7) System.out.println("Ребенку " + age + " лет, он даже не ходит в школу!");
                else System.out.println("Ребенку " + age + " лет, он ходит в школу!");
            }
        }
// Task 3 else
        System.out.println(" * Task 3 else");
        capacity = 102;
        sitting = 60;
        numPas = 85;
        if (numPas > capacity)  System.out.println("Увы, ВСЕ места заняты!!!");
        else {
            if (numPas < sitting) {
                System.out.println("В вагоне еще есть " + (sitting - numPas) + " сидячих мест!");
             } else {
                System.out.println("Увы, все сидячие места заняты");
                System.out.println("но в вагоне еще есть " + (capacity - numPas) + " СТОЯЧИХ мест!");
                    }
        }

// Task 4 else
        System.out.println(" * Task 4 else");
        age = 15;

        if (age > 24 ) System.out.println("Если возраст человека "+ age +" лет, то он должен работать");
        else {
            if (age > 18 && age <= 24)
                System.out.println("Если возраст человека " + age + " лет, то он должен учиться в университете");
            else {
                if (age >= 7 && age <= 18)
                    System.out.println("Если возраст человека " + age + " лет, то он должен учиться в школе");
                else {
                    if (age < 7 && age >= 2)
                        System.out.println("Если возраст человека " + age + " лет, то он должен ходить в дедский сад");
                     else{ System.out.println("Этому малышу еще нет и 2 лет!"); }
                    }
                }
            }

        // Task 5
        System.out.println(" * Task 5");
        age = 3;
        if (age > 14 ) System.out.println("Ребенку "+ age +" лет, он может кататься без сопровождения взрослого");
        else {
            if (age >= 5 && age <= 14)
                System.out.println("Ребенку " + age + " лет, он может кататься в сопровождении взрослого");
            else System.out.println("Ребенку всего " + age + " , кататься пока нельзя");
             }

                // Task 6
        System.out.println(" * Task 6");
        int one = 8;
        int two = 5;
        int free = 3;
        if (one > two && one > free) System.out.println("Наибольшее число = " + one);
        else {if (two > one && two > free) System.out.println("Наибольшее число = " + two);
              else {if (free > one && two < free) System.out.println("Наибольшее число = " + free);
                  else System.out.println("В этой тройке нет чемпиона");}
        }
        }
}