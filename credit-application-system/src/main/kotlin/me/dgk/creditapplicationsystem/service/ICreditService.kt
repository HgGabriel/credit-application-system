package me.dgk.creditapplicationsystem.service

import me.dgk.creditapplicationsystem.entity.Credit
import java.util.UUID

interface ICreditService {

    fun save(credit:Credit) : Credit

    fun findAllByCustomer(customerId: Long) : List<Credit>

    fun findByCreditCode(customerId: Long, creditCode: UUID) : Credit

}