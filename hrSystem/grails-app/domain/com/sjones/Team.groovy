package com.sjones

class Team {

String teamName

int numberOfEmployees

String sectionName

String description

TeamLeader teamleader

static hasMany=[shifts:Shift, employees:Employee, tasks:Task]


    static constraints = {

	teamName blank:false, nullable:false

	numberOfEmployees blank:false, nullable:false

	sectionName blank:false, nullable:false

	description blank:false, nullable:false, maxSize:250

    }
}
