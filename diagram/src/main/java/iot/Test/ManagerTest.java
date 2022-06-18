package iot.Test;

import iot.data.Commercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import iot.data.Shop;
import iot.data.Panel;
import iot.data.Api;
import iot.manager.Manager;
import java.util.LinkedList;
import java.util.List;


class ManagerTest {

    private List<Api> api;
    private Manager Manager;

    @BeforeEach
    void Data() throws Exception {

        api = new LinkedList<>();

        api.add(new Panel("01", (float) 3, "samsung", "drinks",
                "500x500", 12));

        api.add(new Shop("02", (float)1, "Naukova", "food", "Silpo",
                "24-7", 317, 2344));

        api.add(new Commercial("03", (float)2, "DFG group", "active advertisement",
                "Limo", 18 , 317445));

        Manager = new Manager();
        Manager.Add(api);
    }


    @org.junit.jupiter.api.Test
    void findCommercialByNameTest() {
        List<Api> apiList = Manager.FindCommercialByName("03");
        Assertions.assertEquals("03", Api.getName());
    }

    @org.junit.jupiter.api.Test
    void sortByPriceTest() {
        Manager.SortByPrice(api);


        Assertions.assertEquals("03", api.get(2).getName());
        Assertions.assertEquals((float) 3, api.get(2).getPrice());

        Assertions.assertEquals("03", api.get(1).getName());
        Assertions.assertEquals((float) 1, api.get(0).getPrice());

        Assertions.assertEquals("03", api.get(1).getName());
        Assertions.assertEquals((float) 1, api.get(0).getPrice());

    }


}