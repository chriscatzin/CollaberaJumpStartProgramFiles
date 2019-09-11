<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<table class="table table-striped">
	<thead>
		<tr>
			<th scope="col">Todo Description</th>
			<th scope="col">Target Date</th>
			<th scope="col">Status</th>
			<th scope="col"></th>
			<th scope="col"></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todos}" var = "todo"> 
			<tr scope="row">
				<td>${todo.desc}</td>
				<td>${todo.targetDate }</td>
				<td>${todo.isDone}</td>
				<td> <a class="btn btn-warning" 
				href="/deletetodo?todoId=${todo.id}" >Delete</a> </td>
				<td> <a class="btn btn-success" 
				href="/updatetodo?todoId=${todo.id}" >Edit</a> </td>
			</tr>
		</c:forEach>
	</tbody>
</table>


<a class="btn btn-success" href="/addtodo">Add Todo</a>


<%@ include file="common/footer.jspf" %>