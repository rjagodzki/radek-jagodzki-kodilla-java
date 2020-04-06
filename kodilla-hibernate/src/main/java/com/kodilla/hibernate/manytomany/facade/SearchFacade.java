package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> findCompanyByFragmentOfString(String str) throws SearchException {
        List<Company> companies = companyDao.findByFragmentOfString(str);
        if (companies.isEmpty()) {
            LOGGER.error(SearchException.ERR_NO_COMPANY);
            throw new SearchException(SearchException.ERR_NO_COMPANY);
        }
        return companies;
    }

    public List<Employee> findEmployeeByFragmentOfString(String str) throws SearchException {
        List<Employee> employees = employeeDao.findByFragmentOfString(str);
        if (employees.isEmpty()) {
            LOGGER.error(SearchException.ERR_NO_EMPLOYEE);
            throw new SearchException(SearchException.ERR_NO_EMPLOYEE);
        }
        return employees;
    }

}
