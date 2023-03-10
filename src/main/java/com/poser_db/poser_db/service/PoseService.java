package com.poser_db.poser_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.poser_db.poser_db.dao.PoseRepository;
import com.poser_db.poser_db.dao.PoseRepositoryImpl;
import com.poser_db.poser_db.model.Pose;

@Service
public class PoseService extends PoseRepositoryImpl {

    @Autowired
    private PoseRepository poseRepository;



    // public Pose upsertPose(Pose pose)
    // {
    //     Pose existingPose = poseRepository.findByTitle(pose.getTitle());

    //     if (existingPose != null)
    //     {
    //         pose.setTitle(existingPose.getTitle());
    //     }

    //     return poseRepository.save(pose);
    // }
    // public PoseService(@Qualifier("mongoDb") PoseRepository repository)
    // {
    //     this.repository = repository;
    // }

    public List<Pose> getAllPoses()
    {
        return poseRepository.findAll();
    }

    public void upsertPose(Pose pose)
    {
        upsertPose(pose);
    }
}
