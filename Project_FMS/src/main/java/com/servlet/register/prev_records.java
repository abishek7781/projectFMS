package com.servlet.register;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prev_records")
public class prev_records extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String query = "select reg_no,paid_date,amount from fees_details1 order by paid_date desc limit 20";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //get PrintWriter
        PrintWriter pw = res.getWriter();
        //set content type
        res.setContentType("text/html");
        //add title of the page
        pw.println("<title>Previous Transaction</title>");
        //link the bootstrap
        pw.println("<link rel='stylesheet' href='css/prev_records.css'></link>");
        //load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e) {
            e.printStackTrace();
        }
        //generate the connection
        try(Connection con = DriverManager.getConnection("jdbc:mysql:///student?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false","root","Time1234");
                PreparedStatement ps = con.prepareStatement(query);){
            //resultSet
            ResultSet rs = ps.executeQuery();
			pw.println("<img style=\"width:264px; height:87px;padding-left:8px;padding-top:1px;\" src=\"https://www.madhaengineeringcollege.com/wp-content/uploads/2022/06/hlogo.png\">");

            pw.println("<a type=\"button\" class=\"btn\" href=\"accpage.html\" value=\"Home\">Home</a>");
			pw.println("<u><h1 style=font-weight:bolder'  class='td1' >Previous Transactions</h1></u>");

            pw.println("<div name='transaction_tbl'>");
            pw.println("<table class='table table-hover table-striped'>");
            pw.println("<tr class=\"heading\">");
            pw.println("<th>Register No</th>");
            pw.println("<th>Date</th>");
            pw.println("<th>Amount</th>");
           
            pw.println("</tr>");
            while(rs.next()) {
                pw.println("<tr>");
                if(rs.getString(3).equals(null)) {
                	continue;
                }
                else {
                pw.println("<td class=\"bold\">"+rs.getString(1)+"</td>");
                pw.println("<td>"+rs.getString(2)+"</td>");
                pw.println("<td class=\"green bold\">"+rs.getString(3)+"</td>");
                pw.println("</tr>");}
            }
            pw.println("</table>");
        }catch(SQLException se) {
            pw.println("<h2 class='bg-danger text-light text-center'>"+se.getMessage()+"</h2>");
            se.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
        pw.println("</div>");
        //close the stream
        pw.close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req,res);
    }
}

