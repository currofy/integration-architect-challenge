package com.currofy.api.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.currofy.api.data.model.ArticleModel;

public interface ArticleRepository extends MongoRepository<ArticleModel, String>{

}
