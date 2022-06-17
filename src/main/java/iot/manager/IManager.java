package iot.manager;

import iot.data.Api;

import java.util.List;


public interface IManager {

    void Add(List<Api> api);

    void SortByPrice(List<Api> api);

    List<Api> FindCommercialByName(String name);


}
