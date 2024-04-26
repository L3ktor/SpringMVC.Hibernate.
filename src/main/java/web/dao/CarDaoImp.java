package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "A8", 40000));
        cars.add(new Car("Audi", "A4", 30000));
        cars.add(new Car("BMW", "X7", 70000));
        cars.add(new Car("Mercedes", "C300", 100000));
        cars.add(new Car("Lada", "Niva", 20000));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
