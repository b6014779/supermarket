package com.sjones

class TaskController {

    def scaffold= Task

    def taskSearch(){

	}

    def taskResults(){

    def taskProps = Task.metaClass.properties*.name

    def tasks = Task.withCriteria {

		"${params.queryType}" {

			params.each {field, value->

			
			if(taskProps.grep(field) && value){

				ilike(field, value)
			}

		}


	}
	

	}
	return [tasks:tasks]
}

}
