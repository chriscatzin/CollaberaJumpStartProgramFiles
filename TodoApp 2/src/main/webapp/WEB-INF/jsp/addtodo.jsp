<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

Add Todo<br>

<form:form method="post" modelAttribute="todo">
	<form:hidden path="id"/>
	<form:hidden path="user"/>
	<form:hidden path="targetDate"/>
	<form:hidden path="isDone"/>
	<fieldset class="form-group">
		<form:label path="desc">Description</form:label>
		<form:input type="text" path="desc" required="required"/> <br>
		<form:errors path="desc" 
		cssClass="text-warning"/>
	</fieldset>
	<input type="submit"/>
</form:form> 


<%@ include file="common/footer.jspf" %>













<%-- <form:form method="post" modelAttribute="todo">
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control" required="required"/>
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<input type="submit"/>
</form:form> --%>