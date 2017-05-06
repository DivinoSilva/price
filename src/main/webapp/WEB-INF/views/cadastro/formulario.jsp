<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Price - Cadastro</title>
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
			<h1 id="logo"><a href="#" title="Formulário">Formulário</a></h1>
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
			<form action="/price/ok" method="post">
				<h2>Cadastro de Usuários</h2>
				<div class="grupo">
					<label for="campo1">Nome</label>
					<input type="text" required="" id="campo1" name="nome">
				</div>
				<div class="grupo">
					<label for="campo2">E-mail</label>
					<input type="email" required="e-mail" id="campo2" name="email">
				</div>
				<div class="grupo">
					<label for="campo3">CEP</label>
					<input type="text" required="CEP"  id="campo3" name="cep" pattern= "\d{5}-?\d{3}" ">
				</div>			
				<div class="grupo">
					<label for="campo4">Logradouro</label>
					<input type="text" required=""  id="campo4" name="logradouro">
				</div>
				<div class="grupo">
					<label for="campo5">Número</label>
					<input type="text" required=""  id="campo5" name="numero" pattern="[0-9]+$">
				</div>
				<div class="grupo">
					<label for="campo6">Complemento</label>
					<input type="text"   id="campo6" name="complemento">
				</div>
				<div class="grupo">
					<label for="campo7">Bairro</label>
					<input type="text" required="" id="campo7" name="bairro">
				</div>	
				<div class="grupo">
					<label for="campo8">Cidade</label>
					<input type="text" required="" id="campo8" name="cidade">
				</div>	

				<button class="btn btn-cadastrar" type="submit">CADASTRAR</button>
			</form>
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