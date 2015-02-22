/**
 * 
 */
package com.distinctive_software.collections.hashcode_equals;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ladobbins
 *
 */
public class EmployeesTest {
	
	private Address addressOne;
	private Address addressTwo;
	
	private Employee employeeOne;
	private Employee employeeTwo;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		addressOne = new Address();
		addressOne.setStreet("1234 A Street");
		addressOne.setCity("City");
		addressOne.setState("State");
		addressOne.setPostalCode("12345");
		
		EmployeeId idOne = new EmployeeId();
		idOne.setId(UUID.randomUUID());
		employeeOne = new Employee();
		employeeOne.setAddress(addressOne);
		EmployeeName nameOne = new EmployeeName("First", "One");
		employeeOne.setName(nameOne);
		employeeOne.setId(idOne);
		
		addressTwo = new Address();
		addressTwo.setStreet("4567 B Street");
		addressTwo.setCity("City");
		addressTwo.setState("State");
		addressTwo.setPostalCode("12345");
		
		EmployeeId idTwo = new EmployeeId();
		idTwo.setId(UUID.randomUUID());
		employeeTwo = new Employee();
		employeeTwo.setAddress(addressTwo);
		EmployeeName nameTwo = new EmployeeName("First", "Two");
		employeeTwo.setName(nameTwo);
		employeeTwo.setId(idTwo);

	}

	@Test
	public void testByName() {
		HashMap<EmployeeName, Employee> employeesByName = new HashMap<EmployeeName, Employee>();
		employeesByName.put(employeeOne.getName(), employeeOne);
		
		Employee result = employeesByName.get(new EmployeeName("First", "One"));
		assertNotNull(result);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
