package first;

import java.util.*;

public class ClassHierarchy
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число автомобилей: ");
        int N = in.nextInt();
        ArrayList<Car> cars = new ArrayList<>();
        //цикл для создания случайных экземпляров производных классов
        for(int i=0;i<N;i++){
            int rand = (int) ((Math.random() * ( 5 - 1 )) + 1);
            switch(rand){
                case 1:
                    cars.add(new PassengerCar());
                    break;
                case 2:
                    cars.add(new SportCar());
                    break;
                case 3:
                    cars.add(new HybridElectricCar());
                    break;
                case 4:
                    cars.add(new BatteryElectricCar());
                    break;
            }
        }
        //цикл для вызова getDescription
        for (Car car:cars)
        {
            System.out.println(car.getDescription());
        }
    }
}

abstract class Car{
    private String model; //
    private int horsePower;

    public Car()
    {
        this.horsePower = (int) ((Math.random() * ( 200 - 100 )) + 100);  //рандомное число от 100 до 200
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

    public String getDescription(){
        return "\nМодель: "+this.getModel()+
                "\nЛошадиные силы: "+this.getHorsePower();
    };
}
abstract class ElectricCar extends Car{
    private int maxPower;

    public ElectricCar()
    {
        super();
        this.maxPower = (int) ((Math.random() * ( 250 - 150 )) + 150); //рандомное число от 100 до 200
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
        return super.getDescription()+
                "\nМаксимальная мощность(кВт): "+this.getMaxPower();
    }
}
abstract class FuelCar extends Car{
    private int fuelConsumption;

    public FuelCar()
    {
        super();
        this.fuelConsumption = (int) ((Math.random() * ( 20 - 8 )) + 8);
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
        return super.getDescription()+
                "\nПотребление автомобиля на 100км: "+this.getFuelConsumption();
    }
}
class PassengerCar extends FuelCar{
    private int passengerCount;

    public PassengerCar()
    {
        super();
        List<String> models = Arrays.asList("Lada Largus","Renault Dokker","Fiat Doblo Cargo","Peugeot Partner");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.passengerCount = (int) ((Math.random() * ( 8 - 3 )) + 3);
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
        return super.getDescription()+
                "\nТип автомобиля: пассажирский"+
                "\nКоличество пассажиров: "+this.getPassengerCount();
    }
}
class SportCar extends FuelCar{
    private int maxSpeed;

    public SportCar()
    {
        super();
        List<String> models = Arrays.asList("Aston Martin Vanquish","Audi R8","GT40","Bugatti Veyron");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.maxSpeed = (int) ((Math.random() * ( 350 - 250 )) + 250);
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
        return super.getDescription()+
                "\nТип автомобиля: спортивный"+
                "\nМаксимальная скорость(км/ч): "+this.getMaxSpeed();
    }
}
class HybridElectricCar extends ElectricCar{
    private int powerReserve;

    public HybridElectricCar()
    {
        super();
        List<String> models = Arrays.asList("Toyota Prius","Lexus RX400h","Nissan Murano","Hyundai Ioniq");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.powerReserve = (int) ((Math.random() * ( 1000 - 300 )) + 300);
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
        return super.getDescription()+
                "\nТип автомобиля: гибридный электрокар"+
                "\nЗапас хода(км): "+this.getPowerReserve();
    }
}

class BatteryElectricCar extends ElectricCar{
    private int chargingTime;

    public BatteryElectricCar()
    {
        super();
        List<String> models = Arrays.asList("Tesla Model 3 ","Tesla Model Y","Ford Mustang Mach-E CA Route 1 Edition","Hyundai Kona Electric");//создаем список моделей
        String randomModel = models.get(new Random().nextInt(models.size()));//задаем рандомную модель из списка
        this.setModel(randomModel);
        this.chargingTime = (int) ((Math.random() * ( 10 - 3 )) + 3);;
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
        return super.getDescription()+
                "\nТип автомобиля: аккумуляторный электрокар"+
                "\nВремя зарядки(ч): "+this.getChargingTime();
    }
}
