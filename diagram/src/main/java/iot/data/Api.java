package iot.data;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Api {

    protected static String name;
    protected float price;

    public Api(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public static String getName() {
        return name;
    }


    public String ToCSV() {
        return "Name:" + name + ", price:" + price;
    }

}
