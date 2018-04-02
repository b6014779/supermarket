package com.sjones

class Task {

String taskName

int numberOfPeople

String sectionName

String department

String timeRequired

String description

Boolean taskCompleted

String toString(){

		return "$taskName, $sectionName, $department"
		
		}

static hasMany=[shifts:Shift, employees:Employee, teams:Team]

static belongsTo=[Employee, Team]

    static constraints = {

	taskName blank:false, nullable:false

	numberOfPeople blank:false, nullable:false

	sectionName blank:false, nullable:false

	department blank:false, nullable:false

	timeRequired blank:false, nullable:false

	description blank:false, nullable:false, maxSize:250

	taskCompleted blank:false, nullable:false
    }
}
