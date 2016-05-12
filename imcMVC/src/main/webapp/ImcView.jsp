<html>
<head>
<title>IMC</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body style="background:#D8F6CE">
	<h1 style="color:black">&nbsp;IMC - Cálculo do índice de massa corporal - calculo imc</h1>
	<form>
		<h4 style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Peso</h4>
		<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="peso" placeholder="Ex: 52Kg"></p>
		<br>
		<h4 style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Altura</h4>
		<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="altura" placeholder="Ex: 162cm"></p>
	
		<br>
		<h4 style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Sexo</h4>
		<div class="form-group">
		  <div class="col-md-2">
			<select name="selectsexo" class="form-control">
			  <option value="1">Masculino</option>
			  <option value="2">Feminino</option>
			</select>
		  </div>
		</div>
		<button>Calcular</button>
	</form>
	<br>
	<br>
	<br>
	<b>Resultado: ${resultado}</b>
	
	<TABLE BORDER=1 style="margin: 15px">
				<TR style="background:#BDBDBD"><TH>Condição</TH><TH>IMC em Mulheres</TH><TH>IMC em Homens</TH></TR>
				<TR><TD>abaixo do peso</TD><TD>> 19,1</TD><TD>> 20,7</TD></TR>
				<TR><TD>no peso normal</TD><TD>19,1 - 25,8</TD><TD>20,7 - 26,4</TD></TR>
				<TR><TD>marginalmente acima do peso</TD><TD>25,8 - 27,3</TD><TD>26,4 - 27,8</TD></TR>
				<TR><TD>acima do peso ideal</TD><TD>27,3 - 32,3</TD><TD>27,8 - 31,1</TD></TR>
				<TR><TD>obeso</TD><TD>> 32,3</TD><TD>> 31,1</TD></TR>
			</TABLE>
		<img src="img/sucos.png" class="moveimg">
</body>
</html>
	