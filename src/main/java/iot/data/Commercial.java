package iot.data;


import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public @Data class Commercial extends iot.data.Api {

    protected String creator;
    protected String description;
    protected String advertiser;
    protected int durationInSeconds;

    protected int commercialID;

@Builder
    public Commercial(String name, float price, String creator, String description, String advertiser, int durationInSeconds,
                      int commercialID) {
        super(name, price);
        this.creator = creator;
        this.description = description;
        this.advertiser = advertiser;
        this.durationInSeconds = durationInSeconds;
        this.commercialID = commercialID;
    }



    @Override
    public String toString() {
        return "Producer: " + this.creator + ",\nshort description: " + this.description + "\nadvertiser: " +
                this.advertiser + ",\nduration " + this.durationInSeconds + ",\n ID "
                    + this.commercialID + "\nname: " + this.name + "\nprice: " + this.price + ".\n" + System.lineSeparator();
    }


    public String ToCSV() {
        return "Producer:" + creator + ", short description:" + description + ", advertiser:"
                + advertiser + ", duration:" + durationInSeconds + ", ID:" + commercialID + ".";
    }

}
