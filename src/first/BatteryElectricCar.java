package first;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class BatteryElectricCar extends ElectricCar
{
    private int chargingTime;

    public BatteryElectricCar()
    {
        super();
        List<String> models = Arrays.asList("Tesla Model 3 ", "Tesla Model Y", "Ford Mustang Mach-E CA Route 1 Edition", "Hyundai Kona Electric");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.chargingTime = (int) ((Math.random() * (10 - 3)) + 3);
        ;
    }

    public int getChargingTime()
    {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime)
    {
        this.chargingTime = chargingTime;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() +
                "\nТип автомобиля: аккумуляторный электрокар" +
                "\nВремя зарядки(ч): " + this.getChargingTime();
    }
}
