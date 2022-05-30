package first;

abstract class ElectricCar extends Car
{
    private int maxPower;

    public ElectricCar()
    {
        super();
        this.maxPower = (int) ((Math.random() * (250 - 150)) + 150); //рандомное число от 100 до 200
    }

    public double getMaxPower()
    {
        return maxPower;
    }

    public void setMaxPower(int maxPower)
    {
        this.maxPower = maxPower;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() +
                "\nМаксимальная мощность(кВт): " + this.getMaxPower();
    }
}
