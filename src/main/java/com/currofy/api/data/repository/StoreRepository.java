package com.currofy.api.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.currofy.api.data.model.StoreModel;

public interface StoreRepository extends MongoRepository<StoreModel, String>{

}
