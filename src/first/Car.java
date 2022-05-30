package first;

abstract class Car
{
    private String model; //
    private int horsePower;

    public Car()
    {
        this.horsePower = (int) ((Math.random() * (200 - 100)) + 100);  //рандомное число от 100 до 200
    }

    public String getModel()
    {
        return model;
    }

    public int getHorsePower()
    {
        return horsePower;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setHorsePower(int horsePower)
    {
        this.horsePower = horsePower;
    }

    public String getDescription()
    {
        return "\nМодель: " + this.getModel() +
                "\nЛошадиные силы: " + this.getHorsePower();
    }

    ;
}
