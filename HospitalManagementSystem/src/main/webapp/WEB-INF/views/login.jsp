<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles"  uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <script type="text/javascript" src="resources/js/jquery-1.8.3.min.js"></script>
  <script type="text/javascript">
  

    function selectOPeration(optName){
    	
    	$(loginForm).attr('action',optName).submit();
    	return false;
    }
    
    
</script>
<body>
<div id="bodyPan">
	<form action="login" name="loginForm" method="post">

<div id="bodyLeftPan">
</div>
<div id="bodyRightPan">  
<p><span>Username:<input type="text" name="userName"/></span></p> 
<p><span>Password:<input type="password" name="password"/></span></p> 
<input type="submit" name="login" onclick="selectOPeration('login');" value="login"/> 
<input type="submit" name="signup" onclick="selectOPeration('signup');" value="signup"/>
</div>

 </form>
 </div>
 </body>
