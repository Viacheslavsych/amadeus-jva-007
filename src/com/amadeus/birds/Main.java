import java.util.Date;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addTransaction(new Transaction("John", "Crow", 1,3,new Date()));
        storage.addTransaction(new Transaction("Ben", "Falcon", 5,1,new Date()));
        storage.addTransaction(new Transaction("Sam", "Duck", 0.5,23,new Date()));


        storage.addBird("Crow", 1);
        storage.addBird("Falcon", 5);
        storage.addBird("Duck", 0.5);

        storage.addBird("Duck", 0.6);

        storage.addBirdInStorage("Crow", 20);
        storage.addBirdInStorage("Falcon", 23);
        storage.addBirdInStorage("Duck", 4);


        storage.decreaseBirdFromStorage("Falcon", 2);

        storage.buyBird("Bob", "Falcon", 4);

//        storage.getSoldBirdsCount("Falcon");
        System.out.println("******************************");

        for (Map.Entry <String,Integer> pair : storage.getBirdsInStorage().entrySet()) {
            System.out.println("BirdsInStorage " + pair.getKey() + " " + pair.getValue());
        }

        for (Map.Entry <String,Double> pair : storage.getPriceOfBirds().entrySet()) {
            System.out.println("PriceOfBirds " + pair.getKey() + " " + pair.getValue());
        }

        for (Transaction arrayList : storage.getTransaction()) {
            System.out.println(arrayList.toString());
        }

    }
}

/*
* магазин торгует птицами.
вести учёт в программе,
записывает в блокнот следующие данные:

- Название птицы (ворона, сокол, утка)
- Цена на данный момент в USD (ворона - 1, сокол - 5, утка - 0.5)
- Количество в наличии (ворона - 20, сокол - 23, утка - 4)
- Сколько куплено (ворона - 3, сокол - 1, утка - 23)

+ он хочет знать сколько птиц ему нужно иметь в наличии поэтому хочет знать сколько каких птиц он продал и сколько денег заработал за последние 7 дней и за всё время
*/