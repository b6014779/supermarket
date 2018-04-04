package com.sjones

class EmployeeController {

    def scaffold= Employee

    def employeeSearch(){

	}

    def employeeResults(){

    def employeeProps = Employee.metaClass.properties*.name

    def employees = Employee.withCriteria {

		"${params.queryType}" {

			params.each {field, value->

			
			if(employeeProps.grep(field) && value){

				ilike(field, value)
			}

		}


	}
	

	}
	return [employees:employees]
}

}
