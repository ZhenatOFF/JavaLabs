package second;

// Класс Потребитель
class Consumer implements Runnable
{

    Store store;

    Consumer(Store store)
    {
        this.store = store;
    }

    public void run()
    {
        while (true)
        {
            store.get();
        }
    }
}
