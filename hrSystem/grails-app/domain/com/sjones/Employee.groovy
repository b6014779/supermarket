package com.sjones

class Employee {

String fullName

Date dateOfBirth

String residence

Double hourlyRate

String employeeID

Date dateEmployed

String taxCode

String contract

Shift shift

TeamLeader teamleader

Manager manager

String toString() {

	return fullName
}

static hasMany=[tasks:Task, teams:Team]

static belongsTo=[Team]

double dailyPay() {

8*hourlyRate

}



    static constraints = {

	fullName blank:false, nullable:false
	
	dateOfBirth blank:false, nullable:false
	
	residence blank:false, nullable:false

	hourlyRate blank:false, nullable:false

	employeeID blank:false, nullable:false

	dateEmployed blank:false, nullable:false

	taxCode blank:false, nullable:false

	contract blank:false, nullable:false
	
    }
}
