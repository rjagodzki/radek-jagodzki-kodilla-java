package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

//        CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void findBySurnameQueryTest() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee adamSmith = new Employee("Adam", "Smith");
        Employee philSmith = new Employee("Phil", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(adamSmith);
        employeeDao.save(philSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        int johnSmithsId = johnSmith.getId();
        int adamSmithsId = adamSmith.getId();
        int philSmithsId = philSmith.getId();
        int stephanieClarcksonsId = stephanieClarckson.getId();
        int lindaKovalskysId = lindaKovalsky.getId();

        List<Employee> smiths = employeeDao.findBySurname("Smith");

        //Then
        Assert.assertEquals(3, smiths.size());

        //CleanUp
        employeeDao.deleteById(johnSmithsId);
        employeeDao.deleteById(adamSmithsId);
        employeeDao.deleteById(philSmithsId);
        employeeDao.deleteById(stephanieClarcksonsId);
        employeeDao.deleteById(lindaKovalskysId);


        Assert.assertEquals(0, employeeDao.count());
    }

    @Test
    public void findByFirstThreeChars() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company greyGroup = new Company("Grey Group");
        Company squadGrey = new Company("Squad Grey");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(greyGroup);
        companyDao.save(squadGrey);

        int softwareMachinesId = softwareMachine.getId();
        int dataMastersId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();
        int greyGroupsId = greyGroup.getId();
        int squadGreysId = squadGrey.getId();

        List<Company> filtredCompanies = companyDao.findByFirstThreeCharsCompanyName("gre");

        //Then
        Assert.assertEquals(2, filtredCompanies.size());

        //CleanUp
        companyDao.deleteById(softwareMachinesId);
        companyDao.deleteById(dataMastersId);
        companyDao.deleteById(greyMatterId);
        companyDao.deleteById(greyGroupsId);
        companyDao.deleteById(squadGreysId);

        Assert.assertEquals(0, companyDao.count());


    }
}