package imcjava;

public class Calcular {
	public static String calcular(double peso, double altura, double sexo) {
		Double imc=peso/((altura*altura)/10000);
		
		String retorno= "";
		
		if(sexo==1) {
			if(imc<20.7){
				retorno = ("Abaixo do peso ideal!\nIMC: "+imc);
			} else if(imc>20.8&&imc<26.4) {
				retorno = ("Peso normal!\nIMC: "+imc);
			} else if(imc>26.4&&imc<27.8) {
				retorno = ("Marginalmente acima do peso!\nIMC: "+imc);
			} else if(imc>=27.8&&imc<=31.1) {
				retorno = ("Acima do peso ideal!\nIMC: "+imc);
			} else if(imc>31.1) {
				retorno = ("Obeso!\nIMC: "+imc);
			}
		}else if(sexo==2) {
			if(imc<19.1){
				retorno = ("Abaixo do peso ideal!\nIMC: "+imc);
			} else if(imc>=19.1&&imc<=25.8) {
				retorno = ("Peso normal!\nIMC: "+imc);
			} else if(imc>=25.9&&imc<=27.3) {
				retorno = ("Marginalmente acima do peso!\nIMC: "+imc);
			} else if(imc>=27.4&&imc<=32.3) {
				retorno = ("Acima do peso ideal!\nIMC: "+imc);
			} else if(imc>32.3) {
				retorno = ("Obeso!\nIMC: "+imc);
			}
		}
		
		return retorno;
	}
}
