package web.service;

import web.DAO.CarDao;
import web.DAO.CarDaoImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService{

    private CarDao carDao;

    public CarServiceImp() {
        carDao = new CarDaoImp();
    }

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
