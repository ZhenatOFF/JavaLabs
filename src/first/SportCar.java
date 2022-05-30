package first;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class SportCar extends FuelCar
{
    private int maxSpeed;

    public SportCar()
    {
        super();
        List<String> models = Arrays.asList("Aston Martin Vanquish", "Audi R8", "GT40", "Bugatti Veyron");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.maxSpeed = (int) ((Math.random() * (350 - 250)) + 250);
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() +
                "\nТип автомобиля: спортивный" +
                "\nМаксимальная скорость(км/ч): " + this.getMaxSpeed();
    }
}
