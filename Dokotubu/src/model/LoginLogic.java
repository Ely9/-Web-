package model;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class LoginLogic
 */
@WebServlet("/LoginLogic")
public class LoginLogic extends HttpServlet {


	public boolean excute (User user) {

		if(user.getPass().equals("1234")){return true;}
		return false;
	}

}
