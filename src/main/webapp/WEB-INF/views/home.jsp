<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina Principal</title>
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/js/popper.min.js" rel="stylesheet">
<link href="${contextPath}/resources/css/stickFooter.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="header.jsp" />
	<!-- Begin page content -->
	<main role="main" class="container">
	<h1 class="mt-5">Titulo</h1>
	Conteudo
	</main>

	<footer class="footer">
		<jsp:include page="footer.jsp" />
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