package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarsDAO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsCountService {

    private CarsDAO carsList;

    @Autowired
    public CarsCountService(CarsDAO carsList) {
        this.carsList = carsList;
    }

    public List<Car> getCarsByCount(int count) {
        return carsList.getCarsList().stream().limit(count).collect(Collectors.toList());
    }
}
