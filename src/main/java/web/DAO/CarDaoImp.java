package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{
    private List<Car> carList = new ArrayList<>(5);

    public CarDaoImp() {
        carList.add(new Car(1L, "Moskvich", 2141));
        carList.add(new Car(2L, "Volga", 3110));
        carList.add(new Car(3L, "Zaporozhets", 968));
        carList.add(new Car(4L, "Niva", 2121));
        carList.add(new Car(5L, "Lada", 2114));
    }

    @Override
    public List<Car> getCar(int count) {
        return carList.stream().limit(count).toList();
    }
}
