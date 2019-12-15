package code.repository;


import code.entity.Activity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActivityRepository extends MongoRepository<Activity, String> {
    Activity findBy_id(ObjectId id);
    List<Activity> findActivitiesByUserId(ObjectId _id);
}