package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchException;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void findCompanyByFragmentOfStringTest() throws SearchException {
        // Given
        Company company1 = new Company("Microsoft");
        Company company2 = new Company("Google");
        Company company3 = new Company("Amazon");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        // When

        List<Company> companies = searchFacade.findCompanyByFragmentOfString("Amazon");

        // Then
        Assert.assertEquals("Amazon", companies.get(0).getName());

        // CleanUp
        companyDao.delete(company1);
        companyDao.delete(company2);
        companyDao.delete(company3);
    }

    @Test
    public void findEmployeeByFragmentOfStringTest() throws SearchException {
        // Given
        Employee employee1 = new Employee("Ted", "Mosby");
        Employee employee2 = new Employee("Marshall", "Erikson");
        Employee employee3 = new Employee("Barney", "Stinson");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        // When
        List<Employee> employees = searchFacade.findEmployeeByFragmentOfString("osb");

        // Then
        Assert.assertEquals("Mosby", employees.get(0).getLastName());

        // CleanUp
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
        employeeDao.delete(employee3);

    }
}
