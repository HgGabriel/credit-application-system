package me.dgk.creditapplicationsystem.service

import me.dgk.creditapplicationsystem.entity.Customer

interface ICustomerService {

    fun save(customer: Customer) : Customer

    fun findById(id: Long) : Customer

    fun delete(id: Long)

}