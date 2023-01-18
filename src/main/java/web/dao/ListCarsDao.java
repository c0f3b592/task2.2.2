package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;
import web.model.CarList;
import java.util.List;

@Repository
public class ListCarsDao implements Dao {


    private CarList carList; //connection

    public ListCarsDao() {}

    @Autowired
    public ListCarsDao(CarList carList) {
        this.carList = carList;
    }

    //get from db
    @Override
    public List<Car> getCars(int count) {
        return carList.getCars(count);
    }
}
