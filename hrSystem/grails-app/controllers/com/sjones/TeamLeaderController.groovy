package com.sjones

class TeamLeaderController {

    def scaffold= TeamLeader

	def login(){

	}

	def validate(){
	
	def user = TeamLeader.findByLeaderEmail(params.leaderEmail)

	if (user && user.password == params.password){

		session["jobtitle"] = "teamleader"
			
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
