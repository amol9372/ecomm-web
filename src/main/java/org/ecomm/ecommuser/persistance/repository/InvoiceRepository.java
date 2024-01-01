package org.ecomm.ecommuser.persistance.repository;

import org.ecomm.ecommuser.persistance.entity.order.EInvoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<EInvoices, Integer> {



}
