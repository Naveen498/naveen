package com;

import java.io.IOException;

public class HtmlPage {
	static StringBuilder buf = new StringBuilder();
	Split split=new Split();
	
	
	void html() throws IOException {

		buf.append("<html>" + "<head>" + "<style>");
		buf.append("table,th,td {border: 1px solid black;border-collapse: collapse;}");
		buf.append("th,td {padding: 5px;}");
		buf.append("th {text-align: left;}");
		buf.append("body {background-color: powderblue;}");
		buf.append("</style>" + "<body>" + "<table style=width:100%;>");

		split.TableRows();

		buf.append("</table>" + "</body>" + "</html>");

	}

}
