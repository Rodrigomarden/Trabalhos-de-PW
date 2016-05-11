package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
}
