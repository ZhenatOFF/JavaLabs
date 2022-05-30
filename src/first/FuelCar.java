package first;

abstract class FuelCar extends Car
{
    private int fuelConsumption;

    public FuelCar()
    {
        super();
        this.fuelConsumption = (int) ((Math.random() * (20 - 8)) + 8);
    }

    public int getFuelConsumption()
    {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() +
                "\nПотребление автомобиля на 100км: " + this.getFuelConsumption();
    }
}
