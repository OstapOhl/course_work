package iot.manager;

import iot.data.Api;
import java.util.*;


public class Manager implements IManager {

    private  Map<String, List<Api>> ApiMap = new HashMap<>();

    @Override
    public void Add(List<Api> api) {
        api.forEach(obj -> {
            String name = Api.getName();
            List<Api> available = ApiMap.get(name);
            if (available == null) {
                available = new LinkedList<Api>();
                ApiMap.put(obj.getName(), available);
            }
            available.add(obj);
        });
    }


    @Override
    public void SortByPrice(List<Api> api) {
        api.sort(Comparator.comparing(Api::getPrice));
    }

    @Override
    public List<Api> FindCommercialByName(String name){
        return ApiMap.get(name);
    };

}
