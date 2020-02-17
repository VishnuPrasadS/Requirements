package com.example.req;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.req.linked.list.SortedLinkedList;
import com.example.req.tree.SortedTree;

@SpringBootApplication
public class RequirementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequirementsApplication.class, args);
	}

	@Bean
	CommandLineRunner runTask() {
		return args -> {
			System.out.println("Initializing the Sorted Linked List");
			SortedLinkedList sortedList = new SortedLinkedList();
			// Data set: 5, 7, 11, 20, 27, 36, 36, 54
			sortedList.add(54);
			sortedList.add(36);
			sortedList.add(36);
			sortedList.add(27);
			sortedList.add(20);
			sortedList.add(11);
			sortedList.add(7);
			sortedList.add(5);
			System.out.println("Contents:" + sortedList);
			// 34  42  29  33  4
			sortedList.add(34);
			sortedList.add(42);
			sortedList.add(29);
			sortedList.add(33);
			sortedList.add(4);
			System.out.println("Contents:" + sortedList);
		};
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
