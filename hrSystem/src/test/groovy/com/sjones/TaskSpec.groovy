package com.sjones

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TaskSpec extends Specification implements DomainUnitTest<Task> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeTask() {

	when:"A task has a name, section and department"

	def StockBakery=new Task(taskName:'Replenishing',
				
				sectionName:'Bakery 1st Floor',

				department:'Grocery')

	then:"The mergeTask method will merge them into one string"

	StockBakery.toString()
    }
}



