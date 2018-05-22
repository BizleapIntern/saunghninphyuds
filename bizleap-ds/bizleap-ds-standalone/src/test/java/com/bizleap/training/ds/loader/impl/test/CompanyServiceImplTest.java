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
import com.bizleap.training.ds.service.CompanyService;


public class CompanyServiceImplTest  extends ServiceTest{
	static Logger logger=Logger.getLogger(CompanyServiceImplTest.class);
	
	@Autowired
	CompanyService companyService;
	
	//@Ignore
	@Test
	public void testGetAllCompany() throws ServiceUnavailableException, IOException {
		
		
		//assertEquals(employeeService.getAllEmployee().size(),8);
		
		///assertEquals((employeeService.findByEmployeeBoIdSingle("PER01")).getName(),"Alice Kim");
		
		assertNotNull(companyService.getAllCompany());
		logger.info("Company List:"+companyService.getAllCompany());
		assertTrue(CollectionUtils.isNotEmpty(companyService.getAllCompany()));
		assertEquals(3,companyService.getAllCompany().size());
		//assertEquals((companyService.findByCompanyBoIdSingle("COMP01")).getName(),"Apple");
	}
	//@Ignore
	@Test
	public void testFindByAllCompany() throws ServiceUnavailableException {
		assertNotNull(companyService.findByCompanyBoIdSingle("COMP01"));
		logger.info(" Find Company :"+companyService.findByCompanyBoIdSingle("COMP01"));
		assertEquals((companyService.findByCompanyBoIdSingle("COMP01")).getName(),"Apple");
	}
	
}
