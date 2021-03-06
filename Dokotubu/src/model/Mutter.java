package model;

import java.io.Serializable;

import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Mutter
 */
@WebServlet("/Mutter")
public class Mutter implements Serializable {

	private String userName;//ユーザー名
	private String text;//つぶやき内容

	public Mutter() {}
	public Mutter (String userName,String text) {
		this.userName = userName;
		this.text = text;
	}

	public String getUserName() {
		return userName;
	}

	public String getText() {
		return text;
	}
}
