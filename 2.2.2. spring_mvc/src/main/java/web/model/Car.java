package web.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class Car
{
    private   String name;
    private   String series;
    private   String numder;
    public Car(String name, String series, String number){
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
