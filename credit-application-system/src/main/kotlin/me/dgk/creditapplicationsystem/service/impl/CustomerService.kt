package me.dgk.creditapplicationsystem.service.impl

import me.dgk.creditapplicationsystem.entity.Customer
import me.dgk.creditapplicationsystem.repository.CustomerRepository
import me.dgk.creditapplicationsystem.service.ICustomerService

class CustomerService(
    private val customerRepository: CustomerRepository
) : ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)


    override fun findById(id: Long): Customer = this.customerRepository.findById(id).orElseThrow {
        throw RuntimeException("Id $id not found")
    }

    override fun delete(id: Long) = this.customerRepository.deleteById(id)

}