package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Candy;

import java.util.List;

public interface CandyService {
    //create a new candy
    boolean createCandy(Candy candy)
    ;
    //get candies by id
    Candy getCandyById(int id);

    //get all the candies
    List<Candy> getAllCandy();

    //update a candy
    boolean updateCandy(Candy candy);

    //delete a candy
    boolean deleteCandy(Candy candy);

}
