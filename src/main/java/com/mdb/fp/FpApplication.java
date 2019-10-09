package com.mdb.fp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = { "com" })
//@SpringBootApplication(scanBasePackages={ "com.mdb.fp.controller", "com.mdb.fp.model", "com.mdb.fp.repo", "com.mdb.fp.repoImpl",
//		"com.mdb.fp.service", "com.mdb.fp.serviceImpl" })
//@ComponentScan({ "com.mdb.fp.controller", "com.mdb.fp.model", "com.mdb.fp.repo", "com.mdb.fp.repoImpl",
//		"com.mdb.fp.service", "com.mdb.fp.serviceImpl" })
//@EntityScan({ "com.mdb.fp.controller", "com.mdb.fp.model", "com.mdb.fp.repo", "com.mdb.fp.repoImpl",
//	"com.mdb.fp.service", "com.mdb.fp.serviceImpl" })
//@EnableMongoRepositories("com.mdb.fp.repo")
@EnableJpaRepositories("com.mdb.fp.repo")
public class FpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FpApplication.class, args);

		// MongoClient fcUserClient = new MongoClient(new
		// MongoClientURI("mongodb+srv://fcuser:fcuser%40123@firstclust-idadz.gcp.mongodb.net"));

		/*
		 * MongoClientURI uri = new MongoClientURI(
		 * "mongodb+srv://fcuser:fcuser@123@firstclust-idadz.gcp.mongodb.net/test?retryWrites=true"
		 * );
		 * 
		 * MongoClient mongoClient = new MongoClient(uri); MongoDatabase database =
		 * mongoClient.getDatabase("fdb");
		 * 
		 * System.out.println("DB Name: " + database.getName());
		 */

	}

}
