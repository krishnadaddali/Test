package com.fidelity.card.test;

import java.util.ArrayList;
import java.util.List;

import com.fidelity.card.pojo.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To create person object using default constructor

		Person person = new Person();

		System.out.println(person.getId());

		person.setId(1);
		person.setName("Satya");
		person.setAddress("Irving");
		person.setStatus("H1B");
		person.setGraduation("Masters");

		System.out.println(person.getId());

		System.out.println(person);

		// To create person object using parameterized constructor

		Person gopi = new Person(11, "Gopi", "Masters", "Plano", "OPT");

		System.out.println(gopi);

		// to create a multiple person objects

		Person balagopi = new Person(101, "BalaGopi", "Masters", "Frisco",
				"OPT");
		Person seshu = new Person(111, "Seshu", "Masters", "Huston", "OPT");
		Person satya = new Person(121, "Sathya", "Masters", "Raleigh", "OPT");
		Person sreeni = new Person(131, "Sreeni", "Masters", "Durham", "OPT");
		Person sunnet = new Person(141, "Sunnet", "Masters", "Atlanta", "OPT");

		List<Person> persons = new ArrayList<Person>();

		persons.add(gopi);
		persons.add(sunnet);
		persons.add(sreeni);
		persons.add(seshu);
		persons.add(satya);
		persons.add(balagopi);

		for (Person personInfo : persons) {

			System.out.println(personInfo);

		}

	}

}
