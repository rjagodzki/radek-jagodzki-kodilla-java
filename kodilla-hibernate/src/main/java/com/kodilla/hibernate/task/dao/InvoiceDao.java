package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
