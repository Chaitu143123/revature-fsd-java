package com.revature.week2task;

public class Person implements Comparable {
		private String name;
		private int age;
		private Long id;

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}


		public Person(Long id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}


		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
		}


	    @Override
		public int compareTo(Object o) {
			Person otherPerson = (Person) o ;
			System.out.println(this.name + " " + otherPerson.name);
			//return name.compareTo(otherPerson.name);
			//return this.age - otherPerson.age;
			Long sort1 = this.id - otherPerson.id;
			return sort1.intValue();
		}

	} 


