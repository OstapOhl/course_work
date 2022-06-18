package iot.data;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public @Data class Panel extends iot.data.Api {
    protected String producer;
    protected String shopDepartament;
    protected String screenResolution;
    protected float screenDiagonalInInch;

    @Builder
    public Panel(String name, float price, String producer, String shopDepartament, String screenResolution, float screenDiagonalInInch) {
        super(name, price);
        this.producer = producer;
        this.shopDepartament = shopDepartament;
        this.screenResolution = screenResolution;
        this.screenDiagonalInInch = screenDiagonalInInch;
    }

    @Override
    public String toString() {
        return "Producer: " + this.producer + ",\nshop departament: " + this.shopDepartament + "\nscreen resolution: " +
                this.screenResolution + ",\nscreen diagonal in inches " + this.screenDiagonalInInch +
                 "\nname: " + this.name + "\nprice: " + this.price + ".\n" + System.lineSeparator();
    }


    public String ToCSV() {
        return "Producer:" + producer + ", shop departament:" + shopDepartament + ", screen resolution:"
                + screenResolution + ", screen diagonal in inches:" + screenDiagonalInInch + ".";
    }


}
