package com.sjones

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

def NewShift

    def setup() {

	NewShift = new Shift(timeOfDay:'Morning',
			dayOfWeek:'Tuesday',
			numberOfHours:9,
			startingTime:'6:00am')

    }

    def cleanup() {
	NewShift = null
    }

    void "Number of hours in shift cannot be more than 16"() {
	given:
		setup()
	when: "Number of hours is greater than 16"
		NewShift?.numberOfHours = string	
	then: "Validation returns false"
		NewShift?.validate() == false
		NewShift?.errors?.hasFieldErrors('numberOfHours') == true

    }
}
