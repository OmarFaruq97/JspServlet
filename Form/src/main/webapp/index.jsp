<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Home Page</title>
    <style >
    	body {    	
    font-family: Arial, sans-serif;
    text-align: center;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
}

.container {
    margin-top: 50px;
    border: 2px solid black;
    padding: 20px;
    display: inline-block;
     transition: all 0.3s ease;
     background-color: #9a8ccf;
}
.container:hover {
    background-color: #f0f0f0; /* Change the background color on hover */
    border-color: #007BFF; /* Change the border color on hover */
}


h1 {
    color: #333;    
}

.buttons {
    margin-top: 20px;
}

.buttons a {
    display: inline-block;
    padding: 10px 20px;
    text-decoration: none;
    font-size: 18px;
    border-radius: 5px;
    margin: 10px;
    color: white;
}

.blue-btn {
    background-color: #007BFF;
    
}

.green-btn {
    background-color: #28A745;
}

.yellow-btn {
    background-color: #FFC107;
}
    	
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Omar's  Academy</h1>
        <h3>JAVA is not only a programming language; is's an addiction</h3>
        <h4>Never stop learning JAVA</h4>
        <div class="buttons"> 
            <a class="blue-btn" href="pages/MainForm.jsp">Add Student</a>
            <a class="green-btn" href="pages/list-students.jsp">List of Students</a>
        </div>
    </div>
</body>
</html>