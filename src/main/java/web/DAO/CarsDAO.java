package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {

    private List<Car> carsList = new ArrayList<>();

    public CarsDAO() {
        carsList.add(new Car("BMW", 350, 400));
        carsList.add(new Car("VW", 100, 125));
        carsList.add(new Car("Audi", 5, 365));
        carsList.add(new Car("Mercedes", 600, 600));
        carsList.add(new Car("Lada", 14, 80));
    }

    public List<Car> getCarsList() {
        return carsList;
    }
}
