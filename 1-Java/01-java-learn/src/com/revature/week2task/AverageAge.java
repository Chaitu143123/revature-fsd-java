package com.revature.week2task;

	
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class AverageAge {



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

			/*List<Long> square= personList.stream()
					.map(e -> e.getId() * e.getId() )
					.collect(Collectors.toList());
			
			square.forEach(System.out::println);*/

			 Integer averageAge= personList.stream()
					    .map(p -> p.getAge())
					    .reduce(1, (ans, i) -> ans + i/personList.size());
					    //  .reduce(0, (ans, i) -> ans-i/personList.size());   


		    System.out.println(averageAge);
		}

	}


