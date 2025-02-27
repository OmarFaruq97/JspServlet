<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="omar.sms.student.StudentDAO, omar.sms.student.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div>
			<h2>Update Student</h2>
				<div class = "form">
					<%
							int id = Integer.parseInt(request.getParameter("id"));
							StudentDAO studentDAO = new StudentDAO();
							Student student = studentDAO.getStudentById(id);
					%>
					<form action="StudentServlet" method ="post">
							<input type = "hidden" name="action" value="update">
							<input type= "hidden" name= "id" value= "<%= student.getId() %>">
							
							<label for= "">First Name: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getFirstName() %>" required><br><br>
							
							<label for= "">Last Name: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getLastName() %>" required><br><br>
							
							<label for= "">Father Name: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getFatherName() %>" required><br><br>
							
							<label for= "">Mother Name: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getMotherName() %>" required><br><br>
							
							<label for= "">Present Address: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getPresentAddress() %>" required><br><br>
							
							<label for= "">Permanent Address: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getPermanentAddress() %>" required><br><br>
							
							<label for= "">Email: </label>
							<input type= "email" id= "email" name= "email" value= "<%=student.getEmail() %>" required><br><br>
							
							<label for= "">Password: </label>
							<input type= "text" id= "" name= "" value= "<%=student.getEmail() %>" required><br><br>
							
							<label for= "">Date of Birth: </label>
							<input type= "date" id= "" name= "" value= "<%=student.getDateOfBirth() %>" required><br><br>
							
							<label for= "">Age: </label>
							<input type= "number" id= "" name= "" value= "<%=student.getAge() %>" required><br><br>
							
							<label for= "">Gender: </label>
							<input type= "radio" id= "" name= "gender" value= "<%= student.getGender() %>" required>Male
							<input type= "radio" id= "" name= "gender" value= "<%= student.getGender() %>" required>Female
							<input type= "radio" id= "" name= "gender" value= "<%= student.getGender() %>" required>Other<br><br>
							
							<label for= "">Qualification: </label>
							<input type= "text" id= "" name= "" value= ""><br><br>
							
							<label for= "">Uploaded File: </label>						
							<input type= "file" id= "uploadedFile" name= "uploadedFile" value= "<%= student.getUploadedFile() %>"><br><br>
														
							
							<input type= "submit" value= "Update">
							<br><br>
							<a href= "list-students.jsp">⟵ Back to List</a> 
							<br><br>
							<a href= "/Form">⟵ Back to Home</a>
							
					</form>
				</div>
		</div>

</body>
</html>