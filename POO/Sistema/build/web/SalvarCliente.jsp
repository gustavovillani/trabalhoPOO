
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <% 
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String dataNascimento = request.getParameter("dataNascimento");
        String telefone = request.getParameter("telefone");
        out.println("nome");
        out.println(nome);
        out.println("sobrenome");
        out.println(sobrenome);
        out.println("dataNascimento");
        out.println(dataNascimento);
        out.println("telefone");
        out.println(telefone);

        %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
