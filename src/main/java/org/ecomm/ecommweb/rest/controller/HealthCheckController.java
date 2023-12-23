package org.ecomm.ecommweb.rest.controller;

import org.ecomm.ecommweb.persistance.entity.order.EInvoices;
import org.ecomm.ecommweb.persistance.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health-check")
public class HealthCheckController {

  // @Autowired InvoiceRepository invoiceRepository;

  @GetMapping
  public String healthCheck() {

    // invoiceRepository.save(EInvoices.builder().invoiceNo("ahahahha").url("sampleurl").build());
    return "Ecomm-web is running";
  }
}
