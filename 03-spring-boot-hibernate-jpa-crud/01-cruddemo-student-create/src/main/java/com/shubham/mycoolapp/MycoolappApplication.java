package com.shubham.mycoolapp;

import com.shubham.mycoolapp.dao.StudentDAO;
import com.shubham.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDao) {
		return runner -> {
			createStudent(studentDao);

			createMultipleStudents(studentDao);
		};
	}

	// Create multiple student object and persist it in DB
	private void createMultipleStudents(StudentDAO studentDao) {
		// Create the student object
		System.out.println("Creating multiple student...");
		Student student1 = new Student("Sachin", "NA", "sachin@spring.com");
		Student student2 = new Student("Yogesh", "Solank", "yogesh.solanki@spring.com");
		Student student3 = new Student("Nerd", "Singh", "nerd.singh@spring.com");

		// Save the student object in db
		System.out.println("Saving the student objects in db...");
		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);

		// Log the id of crated student
		System.out.println("Student "+ student1.getFirstName() +" created with id: " + student1.getId());
		System.out.println("Student "+ student2.getFirstName() +" created with id: " + student2.getId());
		System.out.println("Student "+ student3.getFirstName() +" created with id: " + student3.getId());
	}

	// Create student & persist it in DB
	private void createStudent(StudentDAO studentDAO) {
		// Create the student object
		System.out.println("Creating a student...");
		Student student = new Student("Adarsh", "Kumar", "adarsh.kumar@spring.com");

		// Save the student object in db
		System.out.println("Saving the object in db...");
		studentDAO.save(student);

		// Log the id of crated student
		System.out.println("Student created with id: " + student.getId());
	}

}
