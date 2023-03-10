package com.poser_db.poser_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.poser_db.poser_db.dao.PoseRepository;

@SpringBootApplication
@EnableMongoRepositories
public class PoserDbApplication {

	PoseRepository poseRepository;

	@Autowired
	public PoserDbApplication(PoseRepository poseRepository)
    {
        this.poseRepository = poseRepository;
    }
	public static void main(String[] args) {
		SpringApplication.run(PoserDbApplication.class, args);
	}

}
