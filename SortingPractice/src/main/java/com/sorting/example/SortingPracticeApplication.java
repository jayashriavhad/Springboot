package com.sorting.example;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sorting.example.repository.UserRepository;

@SpringBootApplication
public class SortingPracticeApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SortingPracticeApplication.class, args);
	
		UserRepository userrepository=context.getBean(UserRepository.class);
		
	
//		 User user1=new User(101, "Jayashri","Yeola");
//		 User user2=new User(102, "Pranjal","Pune");
//		 User user3=new User(103, "Pritika","Nashik");
//		 User user4=new User(104, "Aditi","Mumbai");
		//save single object at a time
//		   ob.save(product);
//		   ob.save(product1);
//		   ob.save(product2);
//		   ob.save(product3);
		
		//save multiple object at a time
//	  List<User> user5=List.of(user1,user2,user3,user4);
//		Iterable<User> result=userrepository.saveAll(user5);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//		
//       
		}

}
