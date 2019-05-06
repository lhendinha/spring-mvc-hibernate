<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/js/popper.min.js" rel="stylesheet">
<link href="${contextPath}/resources/css/stickFooter.css"
	rel="stylesheet">
</head>
<body>
	<jsp:include page="../header.jsp" />

	<main role="main" class="container">
	<h1 class="d-flex justify-content-center">Login</h1>
	<div class="d-flex justify-content-center align-items-center">
		<form action="login" method="post"
			class="d-flex justify-content-center flex-column align-items-center">
			<div class="form-group">
				<label for="userName">Nome do usuario</label> <input
					class="form-control" id="userName"
					placeholder="Digite seu nome de usuario..." name="userName">
			</div>
			<div class="form-group">
				<label for="password">Senha</label> <input
					type="password" class="form-control" id="password"
					placeholder="Digite sua senha..." name="password">
			</div>
			<button type="submit" class="btn btn-primary">Login</button>
		</form>
	</div>
	</main>

	<footer class="footer">
		<jsp:include page="../footer.jsp" />
	</footer>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')
	</script>
</body>
</html>