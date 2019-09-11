<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

Login<br>

<p style="color:red"> ${errorMessage } </p>
<form method="post">
	<input type="text" name="name"/> <br>
	<input type="password" name="password"/><br>
	<input type="submit"/>
</form>
<%@ include file="common/footer.jspf" %>