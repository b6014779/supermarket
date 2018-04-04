package com.sjones

class ManagerController {

	def scaffold= Manager

	def login(){

	}

	def validate(){
	
	def user = Manager.findByUserName(params.userName)

	if (user && user.password == params.password){
		
		session["jobtitle"] = "manager"
			
		session.user = user

		render view:'home'
		}
	else {
		
		flash.message = "Invalid username and password."

		render view:'login'
	
		}

	}

	def logout = {

		session.user = null

		session.jobtitle = null

		redirect(uri:'/')

		}

}
