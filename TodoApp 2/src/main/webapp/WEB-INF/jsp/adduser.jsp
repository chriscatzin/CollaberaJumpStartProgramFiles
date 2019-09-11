<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

Add User<br>

<form:form method="post" modelAttribute="user">
	<form:hidden path="id"/>
	<fieldset class="form-group">
		<form:label path="fullName">Full Name</form:label>
		<form:input type="text" path="fullName" required="required"/> <br>
		<form:errors path="fullName" 
		cssClass="text-warning"/>
	</fieldset>
	<fieldset class="form-group">
		<form:label path="userName">User Name</form:label>
		<form:input type="text" path="userName" required="required"/> <br>
		<form:errors path="userName" 
		cssClass="text-warning"/>
	</fieldset>
	<fieldset class="form-group">
		<form:label path="password">Password</form:label>
		<form:input type="text" path="password" required="required"/> <br>
		<form:errors path="password" 
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