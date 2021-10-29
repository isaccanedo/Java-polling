package com.isaccanedo.polling.repository;

import com.isaccanedo.polling.entity.Voting;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRepository extends MongoRepository<Voting, ObjectId> {
}
