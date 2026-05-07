<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Form</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<form action="processForm" method="POST">

		<div class="container mt-5 ">
			<h1 class="text-center">Registration Form</h1>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					name="email"
					>
				

			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label" >Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword1" name="password">
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>


		</div>
	</form>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>