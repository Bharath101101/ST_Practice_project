package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPopulationSearch {
	@Test
	public void findpopulation() {
		String city="Mumbai";
		int ExpectedPopultaion = 20000000;
		PopulationSearch ps =new PopulationSearch(); 
		
		int count =ps.getPopulation(city);
		
		System.out.println(count);
		
		Assert.assertEquals(count,ExpectedPopultaion);
		
	}
	@Test
	public void findpopulationEmptyInput()
	{
		try {
		String city = "";
		@SuppressWarnings("unused")
		int ExpectedPopulation = 0;
		PopulationSearch ps = new PopulationSearch();
		
		// number of people in the city
		
		@SuppressWarnings("unused")
		int count = ps.getPopulation(city);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("City name cannot be empty");
		}
		
	}
	
	@Test
	public void findpopulationInvalidInput()
	{
		try {
		String city = "Hyderabad";
		@SuppressWarnings("unused")
		int ExpectedPopulation = 700000;
		PopulationSearch ps = new PopulationSearch();
		
		// number of people in the city
		
		@SuppressWarnings("unused")
		int count = ps.getPopulation(city);
		}
		
		
		catch(NullPointerException e1)
		{
			System.out.println("City name does'nt exisit in the list");
		}
		
	}
	}
		