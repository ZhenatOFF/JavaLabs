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

