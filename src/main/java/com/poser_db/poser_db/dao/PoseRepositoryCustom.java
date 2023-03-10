package com.poser_db.poser_db.dao;

import com.poser_db.poser_db.model.Pose;

public interface PoseRepositoryCustom {
    
    void upsertPose(Pose pose);

}
