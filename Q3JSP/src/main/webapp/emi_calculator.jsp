<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <%-- JSP scriptlet TAg--%>
    <%@ page import="java.text.DecimalFormat" %>
    <%@ page import="java.lang.Math" %>

  
    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));   
            double interestRate = Double.parseDouble(request.getParameter("interestRate"));
            int loanTerm = Integer.parseInt(request.getParameter("loanTerm"));

            double monthlyInterestRate = interestRate / 1200;  
            //imp Formula for claculate EMI
            double emi = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTerm)
                    / (Math.pow(1 + monthlyInterestRate, loanTerm) - 1);

            DecimalFormat decimalFormat = new DecimalFormat("#.##");  
            String formattedEMI = decimalFormat.format(emi);

            out.println("<h3>EMI Result:</h3>");
            out.println("<p>Loan Amount: $" + loanAmount + "</p>");
            out.println("<p>Interest Rate: " + interestRate + "%</p>");
            out.println("<p>Loan Term: " + loanTerm + " months</p>");
            out.println("<p>EMI: $" + formattedEMI + "</p>");
        }
    %>


</body>
</html>