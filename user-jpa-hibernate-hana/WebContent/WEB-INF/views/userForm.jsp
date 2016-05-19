<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Save User Data</title></head>
<body>
  <h3>Save User Data</h3>
  <form:form action="user/save" method="post">
      User Name:<input type="text" name="userName"> <br/>
      <input type="submit" value="Submit"/>
  </form:form>
</body>
</html> 