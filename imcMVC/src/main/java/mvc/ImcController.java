package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/imccalc")

public class ImcController extends HttpServlet {
	private String valor (HttpServletRequest req, String param, String padrao) {
		
		String result = req.getParameter(param);
		if(result == null) {
			result = padrao;
			}
		return result;
	}
	
	private double toDouble (HttpServletRequest req, String param, String padrao) {
		return Double.parseDouble(valor(req, param, padrao));
	}
	
	private int toInt (HttpServletRequest req, String param, String padrao) {
		return Integer.parseInt(valor(req, param, padrao));
	}
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double peso = toDouble(req, "peso", "0");

		Double altura = toDouble(req, "altura", "0");

		int sexo = toInt(req, "selectsexo", "1");
		
		//Passando parâmetro pro JSP.
		req.setAttribute("resultado", ImcModel.calcular(peso, altura, sexo));
		req.getRequestDispatcher("ImcView.jsp").forward(req, resp);
	}
}
