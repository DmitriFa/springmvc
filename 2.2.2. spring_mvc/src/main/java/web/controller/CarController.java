package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    public static class Car{
        String name;
        String series;
        String numder;
        Car(String name,String series,String number){
            this.name =name;
            this.series=series;
            this.numder= number;
        }

        public String getName() {
            return name;
        }

        public String getNumder() {
            return numder;
        }

        public String getSeries() {
            return series;
        }
    }

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model) {
        List<Car> car = new ArrayList<>();
        car.add(new Car("GAZ ","21 ","A117MK"));
        car.add(new Car("VAZ ","2107 ","P118PO"));
        car.add(new Car("BMW ","725 ","117ACZ"));
        model.addAttribute("message", car.get(0).getName());
        model.addAttribute("message1", car.get(0).getSeries());
        model.addAttribute("message2",car.get(0).getNumder());
        model.addAttribute("message3", car.get(1).getName());
        model.addAttribute("message4", car.get(1).getSeries());
        model.addAttribute("message5",car.get(1).getNumder());
        model.addAttribute("message6", car.get(2).getName());
        model.addAttribute("message7", car.get(2).getSeries());
        model.addAttribute("message8",car.get(2).getNumder());
        return "cars";
    }

}

