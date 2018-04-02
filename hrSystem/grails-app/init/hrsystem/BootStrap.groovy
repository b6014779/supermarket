package com.sjones

class BootStrap {

    def init = { servletContext ->
	
	//commented out bootstrap instances

	/* def manager1=new Manager (fullName: 'Steve Crossbar',
				userName: 'scross',
				password: 'secret1234',
				managerEmail: 'scross@email.com',
				office: 'B1-009',
				department: 'Electronics'
				).save()

	def manager2=new Manager (fullName: 'Phil Crowbar',
				userName: 'pcrow',
				password: 'secret1234',
				managerEmail: 'pcrow@email.com',
				office: 'A1-349',
				department: 'Grocery'
				).save()

	def team1=new Team (teamName: 'Butcher Team',
				numberOfEmployees:13,
				sectionName:'Butcher',
				description:'''Lorem Ipsum this is a description''',
				).save()

	def team2=new Team (teamName: 'Clothing Team',
				numberOfEmployees:7,
				sectionName:'Clothing',
				description:'''Lorem Ipsum this is a description''',
				).save()


	def leader1=new TeamLeader (fullName: 'Sarah MacDonald',
				department: 'Clothing',
				employeeID: 'TL1111',
				sectionName: 'Sales',
				officePhone: '01234 402912',
				leaderEmail: 'smac@email.com',
				password: 'secret456',
				manager: manager2,
				team: team1
				).save()

	def leader2=new TeamLeader (fullName: 'John Johnson',
				department: 'Butcher',
				employeeID: 'TL2222',
				sectionName: 'Fresh Food',
				officePhone: '01234 454242',
				leaderEmail: 'jjohn@email.com',
				password: 'secret789',
				manager: manager1,
				team: team2
				).save()


	def shift1=new Shift (timeOfDay: 'Morning',
				dayOfWeek: 'Monday',
				numberOfHours:8,
				startingTime: '8:00am'
				).save()

	def shift2=new Shift (timeOfDay: 'Night',
				dayOfWeek: 'Monday',
				numberOfHours:12,
				startingTime: '7:00pm'
				).save()


	def employee1=new Employee (fullName: 'Tom Rivers',
				dateOfBirth: new Date('19/09/1977'),
				residence: 'Sheffield',
				hourlyRate: 8.65,
				employeeID: 'E2304',
				dateEmployed: new Date('29/11/2017'),
				taxCode: 'TX345',
				contract: 'Part-Time',
				shift: shift1,
				teamleader: leader1,
				manager: manager1
				).save()

	def employee2=new Employee (fullName: 'Tim Lake',
				dateOfBirth: new Date('12/03/1984'),
				residence: 'Barnsley',
				hourlyRate:9.45,
				employeeID: 'E5374',
				dateEmployed: new Date('21/05/2014'),
				taxCode: 'TX365',
				contract: 'Full-Time',
				shift: shift1,
				teamleader: leader1,
				manager: manager1
				).save()


	def task1=new Task (taskName: 'Replenishing',
				numberOfPeople:3,
				sectionName:'Butcher',
				department:'Fresh Food',
				timeRequired:'2 hours 30 minutes',
				description:'''Lorem Ipsum this is a description''',
				taskCompleted: false
				).save()

	def task2=new Task (taskName: 'Cleaning',
				numberOfPeople:2,
				sectionName:'Electronics',
				department:'Maintenance',
				timeRequired:'1 hours 45 minutes',
				description:'''Lorem Ipsum this is a description''',
				taskCompleted: true
				).save()

	manager1.addToEmployees(employee1)
	manager2.addToEmployees(employee2)
		
	manager1.addToTeamleaders(leader2)
	manager2.addToTeamleaders(leader1)

	shift1.addToEmployees(employee1)
	shift2.addToEmployees(employee2)

	leader1.addToEmployees(employee1)
	leader2.addToEmployees(employee2)

	employee1.addToTasks(task1)
	employee2.addToTasks(task2)

	team1.addToShifts(shift1)
	team2.addToShifts(shift2)

	team1.addToEmployees(employee1)
	team2.addToEmployees(employee2)

	team1.addToTasks(task1)
	team2.addToTasks(task2)

	task1.addToShifts(shift1)
	task2.addToShifts(shift2)
*/

    }
    def destroy = {
    }
}
