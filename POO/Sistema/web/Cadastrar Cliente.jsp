<%-- 
    Document   : Cadastrar Cliente
    Created on : 16/10/2018, 16:24:53
    Author     : gustavo.villani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Clinete</title>
    </head>
    <body>
        <h1>Cadastrar Clinete</h1>
    <from name="formulario" method="post" action ="salvarcliente.jsp">
            <label> nome</label>
            <input type ="Text" name="nome" placeholder="Nome do cliente" />
            </br>
            <label> sobreome </label>
            <input type ="Text" name="sobrenome" placeholder="Sobrenome do cliente" />
            </br> 
            <label> dataNascimento</label>
            <input type =Date name="dataNascimento" placeholder="Data de nascimento" />
            </br>
            <label> telefone</label>
            <input type ="Text" name="telefone" placeholder="Telefone" />
            </br>
            <input type="submit" name="enviar" value="Salvar"/>
    </from>
    </body>
</html>
