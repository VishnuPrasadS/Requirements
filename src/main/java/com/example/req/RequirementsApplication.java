package com.example.req;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.req.tree.SortedTree;

@SpringBootApplication
public class RequirementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequirementsApplication.class, args);
	}

	@Bean
	CommandLineRunner runTreeTask() {
		return args -> {
			System.out.println("Initializing the Sorted Tree");
			SortedTree sortedTree = new SortedTree();
			// Data set: 5, 7, 11, 20, 27, 36, 36, 54
			sortedTree.add(54);
			sortedTree.add(36);
			sortedTree.add(36);
			sortedTree.add(27);
			sortedTree.add(20);
			sortedTree.add(11);
			sortedTree.add(7);
			sortedTree.add(5);
			System.out.println("Tree Contents:" + sortedTree);
		};
	}
}
