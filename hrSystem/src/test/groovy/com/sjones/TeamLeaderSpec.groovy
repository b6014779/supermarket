package com.sjones

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamLeaderSpec extends Specification implements DomainUnitTest<TeamLeader> {

    def NewTeamLeader

    def setup() {
	NewTeamLeader = new TeamLeader(fullName:'Leader McTestman',
					department:'Clothing',
					employeeID:'TL1111',
					sectionName:'Shoes',
					officePhone:'0114 4023201',
					leaderEmail:'email123@email.com',
					password:'123456')

    }

    def cleanup() {
	NewTeamLeader = null
    }

    void "Test if TeamLeader doesn't allow null values for fullName"() {
	given:
		setup()
	when: "fullName field has null value"
		NewTeamLeader?.fullName = null
	then: "Validation returns false"
		NewTeamLeader?.validate() == false
		NewTeamLeader?.errors?.hasFieldErrors('fullName') == true
	


    }
}


