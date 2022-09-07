package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsService {

    private List<Car> cars;

    public CarsService() {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Subaru", "Blue"));
        cars.add(new Car(2, "Nissan", "Red"));
        cars.add(new Car(3, "Mazda", "Black"));
        cars.add(new Car(4, "Mitsubishi", "White"));
        cars.add(new Car(5, "BMW", "Green"));
    }

    public List<Car> getCars(int count) {
        if(count >= 0) {
            return cars.stream().limit(count).toList();
        } else {
            return null;
        }
    }
}
