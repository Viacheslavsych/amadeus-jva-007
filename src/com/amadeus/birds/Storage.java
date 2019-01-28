import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Storage {
    public HashMap<String, Integer> birdsInStorage;
    public HashMap<String, Double> priceOfBirds;
    public ArrayList<Transaction> transactions;

    public Storage() {
        this.birdsInStorage = new HashMap<>();
        this.priceOfBirds = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    public HashMap<String, Integer> getBirdsInStorage() {
        return birdsInStorage;
    }

    public void setBirdsInStorage(HashMap<String, Integer> birdsInStorage) {
        this.birdsInStorage = birdsInStorage;
    }

    public HashMap<String, Double> getPriceOfBirds() {
        return priceOfBirds;
    }

    public void setPriceOfBirds(HashMap<String, Double> priceOfBirds) {
        this.priceOfBirds = priceOfBirds;
    }

    public ArrayList<Transaction> getTransaction() {
        return transactions;
    }

    public void setTransaction(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transactions) {
        this.transactions.add(transactions);
    }

    public void addBird(String birdName, double price) {
        if (this.priceOfBirds.containsKey(birdName)) {
            System.out.println("This bird name " + birdName + " already exists in the list.");
        } else {
            this.priceOfBirds.put(birdName, price);
            this.birdsInStorage.put(birdName, 0);
            System.out.println(birdName + " successfully added in the list with birds.");
        }
    }

    public void addBirdInStorage(String birdName, int countOfBird) {
        if (!this.priceOfBirds.containsKey(birdName)) {
            System.out.println("Unfortunately this bird name " + birdName + ", doesn't exists in the list.");
        } else {
            this.birdsInStorage.put(birdName, this.birdsInStorage.get(birdName) + countOfBird);
        }
    }

    public void decreaseBirdFromStorage(String birdName, int count) {
        if (this.birdsInStorage.get(birdName) >= count) {
            this.birdsInStorage.put(birdName, this.birdsInStorage.get(birdName) - count);
            System.out.println(birdName + " " + count + " unit(s) is sold.");
        } else {
            System.out.println("We can't sell " + count + " " + birdName + " for you. Try later.");
        }
    }

    public void buyBird(String client, String birdName, int count) {
        if (this.birdsInStorage.get(birdName) >= count) {
            this.decreaseBirdFromStorage(birdName, count);
            this.transactions.add(new Transaction(client, birdName, this.priceOfBirds.get(birdName), count, new Date()));
        } else {
            System.out.println("We can't make this transaction, because we don't have enough birds in our storage.");
        }
    }

//    public void getSoldBirdsCount(String birdName) {
//        for (String s : this.transactions.get() )
//        if (this.transactions.contains(birdName)) {
//            System.out.println("FindED");
//        } else {
//            System.out.println("This bird doesn't find");
//        }
//    }


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


1. Получить продажи по конкретной птице
  а. сколько штук
  б. сколько денег

2. Каких птиц на складе меньше 3-х штук

3. Сколько денег я вообще заработал

4. Вывести список покупателей отсортирован по количеству потраченных денег

5. Вывести список покупателей отсортирован по количеству совершённых покупок

6. + необходимые методы для работы магазина


*/
