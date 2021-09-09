package com.revature.week2task;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class Id {
	public static void main(String[] args) {
		Person person1 = new Person(1L, "Nanda", 22);
		Person person2 = new Person(2L, "Kumar", 12);
		Person person3 = new Person(3L, "Muni", 36);
		Person person4 = new Person(4L, "Suhas", 45);
		Person person5 = new Person(5L, "Gopi", 39);

		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);


		// getting person details using id
		List<Person> getPersonById = personList.stream()
				.filter(e -> e.getId() == 3)
		    	.collect(Collectors.toList());
		getPersonById.forEach(System.out::println);
	      //System.out.println(getPersonById);

		//sorting the stream
		List<Person> getPersonSorted = personList.stream()
				.sorted()
		    	.collect(Collectors.toList());
		getPersonSorted.forEach(System.out::println);
	}
}


