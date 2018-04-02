package com.sjones

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

String toString() {

	return "$timeOfDay, $dayOfWeek"
}

static hasMany=[employees:Employee, teams:Team, tasks:Task]

static belongsTo=[Team, Task]

    static constraints = {

	timeOfDay blank:false, nullable:false

	dayOfWeek blank:false, nullable:false, maxSize:9

	numberOfHours blank:false, nullable:false, max:16, min:1

	startingTime blank:false, nullable:false

    }
}
