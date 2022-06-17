package iot.data;

import iot.Writer.Writer;
import iot.data.Panel;
import iot.data.Commercial;
import iot.data.Api;

import iot.data.Panel;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        Panel panel = new Panel("01", (float) 12.55, "samsung", "drinks",
                "500x500", 12);
        Shop shop = new Shop("02", "food", "ATB", "24-7", 120, (float) 344.4);
        Commercial commercial = new Commercial("03", "short and bright", "Vids", 19, 78446);

        System.out.println(panel);

        List<Api> api = new LinkedList<Api>();

        api.add(panel);
        api.add(shop);
        api.add(commercial);

        Writer writer = new Writer();

        writer.writeCSV(api);

    }
}
