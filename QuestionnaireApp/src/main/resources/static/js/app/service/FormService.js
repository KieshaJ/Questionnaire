app.service("FormService", ["$http", function($http) {
	this.getQuestions = function getQuestions() {
		return $http({
			method: "GET",
			url: "api/questions"
		});
	}
	
	this.submitForm = function submitForm(answer1, answer2, answer3) {
		return $http({
			method: "POST",
			url: "api/answers",
			data: {
				answer1: answer1,
				answer2: answer2,
				answer3: answer3
			},
		});
	}
}]);