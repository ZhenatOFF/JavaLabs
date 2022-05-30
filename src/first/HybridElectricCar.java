package first;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class HybridElectricCar extends ElectricCar
{
    private int powerReserve;

    public HybridElectricCar()
    {
        super();
        List<String> models = Arrays.asList("Toyota Prius", "Lexus RX400h", "Nissan Murano", "Hyundai Ioniq");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.powerReserve = (int) ((Math.random() * (1000 - 300)) + 300);
    }

    public int getPowerReserve()
    {
        return powerReserve;
    }

    public void setPowerReserve(int powerReserve)
    {
        this.powerReserve = powerReserve;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() +
                "\nТип автомобиля: гибридный электрокар" +
                "\nЗапас хода(км): " + this.getPowerReserve();
    }
}
