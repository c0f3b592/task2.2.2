package web.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//database
@Component
public class CarList {

    private List<Car> carList;

    public CarList() {
        carList = new ArrayList<>();
        carList.add(new Car("AAAA", 1111, "aaaa"));
        carList.add(new Car("BBBB", 2222, "bbbb"));
        carList.add(new Car("CCCC", 3333, "cccc"));
        carList.add(new Car("DDDD", 4444, "dddd"));
        carList.add(new Car("EEEE", 5555, "eeee"));
    }

    public List<Car> getCars(int inputCount) {
        int count = inputCount < 5 && inputCount > -1 ? inputCount : 5;
        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
