package com.poser_db.poser_db.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.lang.NonNull;
import com.poser_db.poser_db.model.Pose;
import com.poser_db.poser_db.service.PoseService;

@RequestMapping("api/v1/poses")
@RestController
public class PoserController {

    private final PoseService poseService;

    @Autowired
    public PoserController(PoseService poseService)
    {
        this.poseService = poseService;
    }

    @GetMapping
    public List<Pose> getAllPoses()
    {
        return poseService.getAllPoses();
    }

    @PostMapping("/")
    public void insertPose(@NonNull @RequestBody Pose pose)
    {
        poseService.upsertPose(pose);
    }
}
