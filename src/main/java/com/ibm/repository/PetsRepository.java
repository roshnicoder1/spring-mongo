package com.ibm.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.model.Pets;

public interface PetsRepository extends MongoRepository<Pets,String>{
	Pets findBy_id(ObjectId _id);

}
