package com.sjones

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

    static constraints = {

	timeOfDay blank:false, nullable:false

	dayOfWeek blank:false, nullable:false, maxSize:9

	numberOfHours blank:false, nullable:false, max:24, min:1

	startingTime blank:false, nullable:false

    }
}
