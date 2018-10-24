app.controller("FormController", ["$scope", "FormService", function($scope, FormService) {
	$scope.questions = FormService.getQuestions().then(function success(response) {
		$scope.questions = response.data;
	});
	
	var data
	
	$scope.submitForm = function() {FormService.submitForm($scope.answer1, $scope.answer2, $scope.answer3).then(function success(response) {
		$scope.answer1 = "";
		$scope.answer2 = "";
		$scope.answer3 = "";
	});};
}]);