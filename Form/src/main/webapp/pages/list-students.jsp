<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="omar.sms.student.StudentDAO, omar.sms.student.Student, java.util.List"  %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Dark blue background for the entire page */
        body {
            background-color: #001f3f; /* Dark blue */
            color: #ffffff; /* White text for contrast */
            font-family: Arial, sans-serif;
            padding: 10px;
            }

        /* Container styling */
        .container {
            background-color: #003366; /* Slightly lighter blue for the container */
            padding: 20px;
            border-radius: 20px;
            margin-top: 20px;
        }

        /* Table styling */
        .table {
            background-color: #ffffff; /* White background for the table */
            color: #000000; /* Black text for the table */
            border-radius: 15px;
            overflow: hidden;            
        }

        .table th {
            background-color: #004080; /* Dark blue for table headers */
            color: #ffffff; /* White text for headers */
        }

        .table td {
            background-color: #f0f0f0; /* Light gray for table rows */
            color: #000000; /* Black text for rows */
        }

        /* Button styling */
        .btn {
            background-color: #007bff; /* Blue button */
            color: #ffffff; /* White text */
            border: none;
            padding: 5px 10px;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }

        /* Link styling */
        a {
            color: #007bff; /* Blue links */
            text-decoration: none;
        }

        a:hover {
            color: #0056b3; /* Darker blue on hover */
        }

        /* Form styling */
        form {
            display: inline-block;
            margin: 0;
            width: 65px;
        }

        /* Option div styling */
        .option {
            display: flex;
            gap: 10px;
        }
    </style>
</head>
<body>
    <div class="container mt-4 ">
        <h2 class="text-center">List of Students</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Father's Name</th>
                    <th>Mother's Name</th>
                    <th>Present Address</th>
                    <th>Permanent Address</th>
                    <th>Email</th>
                    <th>Date of Birth</th>
                    <th>Age</th>
                    <th>Gender</th>
                    <th>Qualification</th>
                    <th>Uploaded File</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    StudentDAO studentDAO = new StudentDAO();
                    List<Student> studentList = studentDAO.getAllStudents();
                    if (studentList != null) {
                        for (Student student : studentList) {
                %>
                <tr>
                    <td><%= student.getId() %></td>
                    <td><%= student.getFirstName() %></td>
                    <td><%= student.getLastName() %></td>
                    <td><%= student.getFatherName() %></td>
                    <td><%= student.getMotherName() %></td>
                    <td><%= student.getPresentAddress() %></td>
                    <td><%= student.getPermanentAddress() %></td>
                    <td><%= student.getEmail() %></td>
                    <td><%= student.getDateOfBirth() %></td>
                    <td><%= student.getAge() %></td>
                    <td><%= student.getGender() %></td>
                    <td><%= student.getQualification() %></td>
                    <td><%= student.getUploadedFile() %></td>
                    <td>
                        <div class="option">
                            <a href="update-student.jsp?id=<%= student.getId() %>" class="btn">Update</a>
                            <form action="StudentServlet" method="post">
                                <input type="hidden" name="id" value="<%= student.getId() %>">
                                <input type="hidden" name="action" value="delete">
                                <button type="submit" class="btn" onclick="return confirm('Are you sure to delete this student?');">Delete</button>
                            </form>
                        </div>
                    </td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="14" class="text-center">No students available</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <br><br>
        <a href="/Form" class="btn">⟵ Return to Home</a>
    </div>
</body>
</html>