/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.customer.respository;

import com.paymentchain.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author sotobotero
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

     @Query("SELECT c FROM Customer c WHERE c.code = ?1")
      public Customer findByCode(String code);
   }
