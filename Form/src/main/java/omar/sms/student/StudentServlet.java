package omar.sms.student;

import java.io.IOException;
import java.sql.Date;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pages/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StudentDAO studentDAO;

    @Override
    public void init() {
        studentDAO = new StudentDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String fatherName = request.getParameter("fatherName");
            String motherName = request.getParameter("motherName");
            String presentAddress = request.getParameter("presentAddress");
            String permanentAddress = request.getParameter("permanentAddress");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Date dateOfBirth = Date.valueOf(request.getParameter("dateOfBirth")); // Convert String to SQL Date
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");
            String qualification = request.getParameter("qualification");
            String uploadedFile = request.getParameter("uploadedFile");

            Student student = new Student(firstName, lastName, fatherName, motherName, presentAddress, permanentAddress, email, password, dateOfBirth, age, gender, qualification, uploadedFile);

            try {
                studentDAO.addStudent(student);
                String successMessage = "Student record added successfully!";
                request.setAttribute("successMessage", successMessage);
                response.sendRedirect("list-students.jsp"); // Redirect to the list of students
            } catch (SQLException e) {
                e.printStackTrace();
                String errorMessage = "Error adding student: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
                request.getRequestDispatcher("MainForm.jsp").forward(request, response); // Forward back to the add form
            }
        } else if ("update".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String fatherName = request.getParameter("fatherName");
            String motherName = request.getParameter("motherName");
            String presentAddress = request.getParameter("presentAddress");
            String permanentAddress = request.getParameter("permanentAddress");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Date dateOfBirth = Date.valueOf(request.getParameter("dateOfBirth")); // Convert String to SQL Date
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");
            String qualification = request.getParameter("qualification");
            String uploadedFile = request.getParameter("uploadedFile");

            Student student = new Student(id, firstName, lastName, fatherName, motherName, presentAddress, permanentAddress, email, password, dateOfBirth, age, gender, qualification, uploadedFile);

            try {
                studentDAO.updateStudent(student);
                String successMessage = "Student record updated successfully!";
                request.setAttribute("successMessage", successMessage);
                response.sendRedirect("list-students.jsp"); // Redirect to the list of students
            } catch (SQLException e) {
                e.printStackTrace();
                String errorMessage = "Error updating student: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
                request.getRequestDispatcher("update-students.jsp?id=" +id).forward(request, response); // Forward back to the edit form
            }
        } else {
            // If the action is unknown, redirect to the students page
            response.sendRedirect("students");
        }

        if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id")); // Get the student ID to delete

            try {
                studentDAO.deleteStudent(id);
                String successMessage = "Student record deleted successfully!";
                request.setAttribute("successMessage", successMessage);

            } catch (SQLException e) {
                e.printStackTrace();
                String errorMessage = "Error deleting student: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
            }

            response.sendRedirect("list-student.jsp");
        } else {
           
            response.sendRedirect("students");
        }

    }
}