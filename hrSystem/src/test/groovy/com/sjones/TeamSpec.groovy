package com.sjones

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

	def NewTeam

    def setup() {

	NewTeam = new Team(teamName:'Bakers',
			numberOfEmployees:11,
			sectionName:'Bakery',
			description:'Bakery Cooking Team')

    }

    def cleanup() {
	NewTeam = null
    }

    void "Team name cannot be blank"() {
	given:
		setup()
	when: "teamName field has blank value"
		NewTeam?.teamName = ""
	then: "Validation returns false"
		NewTeam?.validate() == false
		NewTeam?.errors?.hasFieldErrors('teamName') == true

    }
}
