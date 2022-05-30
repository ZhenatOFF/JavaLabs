package second;

import java.util.concurrent.TimeUnit;

public class ProducerConsumer
{
    public static void main(String[] args)
    {
        Store store=new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Storage{
    static int productCount;
    static void AddProduct(int count){
        productCount+=count;
        System.out.printf("Произведен товар. Количество товара на складе:"+productCount);
    }
    static void ConsumeProduct(int consumeCount){
        productCount-=consumeCount;
        System.out.printf("Потреблен товар. Количество товара на складе:"+productCount);
    }
}

class Store{
    private int product=0;
    public static int storeSize = 6;
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        int consumed = (int) ((Math.random()*((product-1)+1))+1);//потребляется от 1 товара до количества товара на складе
        product-=consumed;
        System.out.printf("Потреблен товар в количестве: %d. Количество товара на складе: %d.\n",consumed,product);
        notify();
    }
    public synchronized void put() {
        while (product>=storeSize) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        int produced = (int) ((Math.random()*((storeSize-product-1)+1))+1);//производится от 1 товара до разницы между нынешним количеством и максимумом
        product+=produced;
        System.out.printf("Произведен товар в количестве: %d. Количество товара на складе: %d.\n",produced,product);
        notify();
    }
}
// класс Производитель
class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        while(true) {
            store.put();
        }
    }
}
// Класс Потребитель
class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        while(true) {
            store.get();
        }
    }
}