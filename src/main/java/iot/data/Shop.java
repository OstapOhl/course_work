package iot.data;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public @Data class Shop extends iot.data.Api {
    protected String address;
    protected String specialization;
    protected String shopNetwork;
    protected String workHours;
    protected int numberOfCustomers;
    protected float shopArea;

    @Builder
    public Shop(String name, float price, String adress, String specialization, String shopNetwork,
                String workHours, int numberOfCustomers, float shopArea) {
        super(name, price);
        this.address = adress;
        this.specialization = specialization;
        this.shopArea = shopArea;
        this.shopNetwork = shopNetwork;
        this.workHours = workHours;
        this.numberOfCustomers = numberOfCustomers;

    }


    @Override
    public String toString() {
        return "Address: " + this.address + ",\nspecialization: " + this.specialization + "\nshop network: " +
                this.shopNetwork + ",\nworking hours: " + this.workHours + ", \nnumber of customers: " + numberOfCustomers +
                "shop area in m*2:\n" + shopArea + "\nname: " + this.name + "\nprice: "
                + this.price + ".\n" + System.lineSeparator();
    }


    public String ToCSV() {
        return "Producer:" + address + ", shop department:" + workHours + ", screen resolution:"
                + numberOfCustomers + ", screen diagonal in inches:" + shopArea + ".";
    }


}
