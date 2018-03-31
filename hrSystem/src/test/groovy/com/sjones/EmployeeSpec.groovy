package com.sjones

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void totalPay() {

	when:"An employee has a name and hourly pay"

	def Steven=new Employee(fullName:'Steven Testman',
				
				hourlyRate:8.53)

	then:"The dailyPay method will calculate a the total pay per day"

	Steven.dailyPay()


    }
}
