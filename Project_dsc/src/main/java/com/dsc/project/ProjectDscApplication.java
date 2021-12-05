package com.dsc.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.dsc.service.DoubleValuedService;



@SpringBootApplication(scanBasePackages = "com.dsc")
@EnableJpaRepositories(basePackages = "com.dsc.persistance")
@EntityScan(basePackages = "com.dsc.bean")
@ComponentScan("com.dsc")
public class ProjectDscApplication {
//
//	@Autowired 
//	private static DoubleValuedService doubleValuedService;
//
//	public  DoubleValuedService getDoubleValuedService() {
//		return doubleValuedService;
//	}
//
//	public void setDoubleValuedService(DoubleValuedService doubleValuedService) {
//		this.doubleValuedService = doubleValuedService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectDscApplication.class, args);
//			System.out.println(doubleValuedService.findInDatabase("Class 100- Chain"));
	}

}
