
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<title>Login V5</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<style type="text/css">
.box{
	
	border:1px solid #bababa;
	}
</style>

</head>
<body>
	<div class="wrapper">
		<div class="row">
			<div class="col-md-offset-4 col-md-4 box">

				<form class="form-signin" action="login">
					<h2 class="form-signin-heading">Please login</h2>
					<label for="email">Email:</label>
					<input type="text" class="form-control" name="username"
						placeholder="Email Address" required="" autofocus="" /><br>
						<label for="email">Password:</label>
						 <input
						type="password" class="form-control" name="password"
						placeholder="Password" required="" /> <label class="checkbox">
						
						<input type="checkbox" value="remember-me" id="rememberMe"
						name="rememberMe"> Remember me
					</label> <input type="submit" />
				</form>

			</div>
		</div>
	</div>
</body>
</html>