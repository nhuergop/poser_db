package com.poser_db.poser_db.dao;

// import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.poser_db.poser_db.model.Pose;

@Repository
public interface PoseRepository extends MongoRepository<Pose, String> {

    // Pose findByTitle(String title);
    
}
