<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body style = "background-color : 'black' ">

      <h2>Login</h2>
      <form action = "login">
        <input type = "text" name = "name" placeholder = "Name"/><br><br>
        <input type = "password" name = "password" placeholder = "password"/><br><br>
        <input type = "submit" name = "submit"/>
      </form>
   </body>
</html>