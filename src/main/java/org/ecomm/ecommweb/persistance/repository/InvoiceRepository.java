package org.ecomm.ecommweb.persistance.repository;

import org.ecomm.ecommweb.persistance.entity.order.EInvoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<EInvoices, Integer> {



}
