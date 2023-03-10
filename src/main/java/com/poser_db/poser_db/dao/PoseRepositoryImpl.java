package com.poser_db.poser_db.dao;

// import java.lang.foreign.MemoryAddress;
// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Update;

// import com.mongodb.client.result.UpdateResult;
import com.poser_db.poser_db.model.Pose;

@Repository("mongoDb")
public class PoseRepositoryImpl implements PoseRepositoryCustom {
    
    @Autowired
    private MongoTemplate mongoTemplate;

    // @Autowired
    // public PoseRepositoryImpl(PoseRepository poseRepository)
    // {
    //     this.poseRepository = poseRepository;
    // }

    // public List<Pose> getAllPoses() {
    //     return poseRepository.findAll();
    // }

    public void upsertPose(Pose pose)
    {
        BasicQuery query = new BasicQuery(String.format("{title : %s}", pose.getTitle()));

        Update updateDefinition = new Update().set("title", pose.getTitle());

        // UpdateResult updateResult = 
        mongoTemplate.upsert(query, updateDefinition, Pose.class);

        // return updateResult.getUpsertedId().toString();
    }

    
}
