package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Component;
import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}
