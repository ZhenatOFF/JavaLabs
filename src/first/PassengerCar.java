package first;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class PassengerCar extends FuelCar
{
    private int passengerCount;

    public PassengerCar()
    {
        super();
        List<String> models = Arrays.asList("Lada Largus", "Renault Dokker", "Fiat Doblo Cargo", "Peugeot Partner");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.passengerCount = (int) ((Math.random() * (8 - 3)) + 3);
    }

    public int getPassengerCount()
    {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount)
    {
        this.passengerCount = passengerCount;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() +
                "\nТип автомобиля: пассажирский" +
                "\nКоличество пассажиров: " + this.getPassengerCount();
    }
}
