package com.bizleap.training.ds.loader.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.service.EmployeeService;

public class EmployeeServiceImplTest  extends ServiceTest{
static Logger logger=Logger.getLogger(CompanyServiceImplTest.class);
	
	@Autowired
	EmployeeService employeeService;
	
	//@Ignore
	@Test
	public void testGetAllEmployee() throws ServiceUnavailableException, IOException {
		
		
		//assertEquals(employeeService.getAllEmployee().size(),8);
		
		///assertEquals((employeeService.findByEmployeeBoIdSingle("PER01")).getName(),"Alice Kim");
		
		assertNotNull(employeeService.getAllEmployee());
		logger.info("Company List:"+employeeService.getAllEmployee());
		assertTrue(CollectionUtils.isNotEmpty(employeeService.getAllEmployee()));
		assertEquals(8,employeeService.getAllEmployee().size());
		//assertEquals((companyService.findByCompanyBoIdSingle("COMP01")).getName(),"Apple");
	}
	//@Ignore
	@Test
	public void testFindByAllEmployee() throws ServiceUnavailableException {
		assertNotNull(employeeService.findByEmployeeBoIdSingle("PER01"));
		logger.info("Employee List:"+employeeService.findByEmployeeBoIdSingle("PER01"));
		assertEquals((employeeService.findByEmployeeBoIdSingle("PER01")).getName(),"Alice Kim");
	}
	
}
