angular.module('tmDemoApp').controller('MainCtrl', function($scope, $http) {
	$http({
		method : 'GET',
		//url : 'http://localhost:8091/users'
		url : '/usersSer/users' // After implementing Zuul
	}).then(function(response) {
		$scope.users = response.data;
	}, function(response) {
		console.error('Error requesting Users');
	});
});