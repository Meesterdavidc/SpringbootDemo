package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Candy;
import com.revature.SpringBootDemo.models.Shop;

import java.util.List;

public interface ShopService {
    boolean createShop(Shop sop);

    //get candies by id
    Shop getShoById(int id);

    //get all the candies
    List<Shop> getAllShops();

    //update a candy
    boolean updateShop(Shop shop);

    //delete a candy
    boolean deleteShop(Shop shop);
}
