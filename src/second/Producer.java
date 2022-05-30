package second;

// класс Производитель
class Producer implements Runnable
{

    Store store;

    Producer(Store store)
    {
        this.store = store;
    }

    public void run()
    {
        while (true)
        {
            store.put();
        }
    }
}
