package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.task.Invoice;
import com.kodilla.hibernate.task.dao.InvoiceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product = new Product("Milk");
        Item item = new Item(new BigDecimal(3),2,new BigDecimal(6));
        product.getItems().add(item);
        item.setProduct(product);

        Invoice invoice = new Invoice("0000001");
        invoice.getItems().add(item);
        item.setInvoice(invoice);

        invoiceDao.save(invoice);


    }
}
