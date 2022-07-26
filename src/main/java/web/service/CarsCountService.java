package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.DAO.CarsDAO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsCountService {

    private CarsDAO carsList;

    public CarsCountService(CarsDAO carsList) {
        this.carsList = carsList;
    }

    public List<Car> getCarsByCount(int count) {
        if (count > 5) {count = 5;}
        return carsList.getCarsList().subList(0, count);
    }
}
