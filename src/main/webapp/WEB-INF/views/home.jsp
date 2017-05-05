<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>		
	<meta charset="utf-8">
	<title>Price - Home</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="resources/css/jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="resources/css/meuestilo.css">
	<script type="text/javascript" src="resources/js/jquery.js"></script>
	<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
</head>
<body>
	<!-- CABECALHO -->
	<header id="cabecalho">
		<div class="container">
			<h1 id="logo"><a href="#" title="Home">Home</a></h1>
			<nav>
				<ul>
					<li><a href="/price" title="HOME">HOME</a></li>
					<li><a href="formulario" title="NOVO CADASTRO">NOVO CADASTRO</a></li>
					<li><a href="lista" title="LISTA">LISTA</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<!-- END CABECALHO -->
	
	<!-- CONTEUDO -->
	<main id="conteudo">
		<div class="container">
		<h2>Bem-vindo</h2>
		</div>
	</main>
	<!-- END CONTEUDO -->
	
	<!-- RODAPE -->
	<footer id="rodape">
		<div class="container">
			<p>Copyright JP Divine :)</p>
		</div>
	</footer>
	<!-- END RODAPE -->


	<!-- SCRIPTS -->
	<script type="text/javascript" src="js/pickaday.js"></script>
	<script>
		$(".datepicker").datepicker({
			dateFormat: "dd/mm/yy"
		});
	</script>
</body>
</html>