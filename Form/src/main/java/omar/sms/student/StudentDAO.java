package omar.sms.student;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.Date;

import omar.sms.database.DBConnection;

import java.util.ArrayList;

public class StudentDAO {
    private static final String INSERT_STUDENT_SQL = "INSERT INTO students_jsp (first_name, last_name, father_name, mother_name, present_address, permanent_address, email, password, date_of_birth, age, gender, qualification, uploaded_file) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_STUDENTS_SQL = "SELECT * FROM students_jsp";
    private static final String SELECT_STUDENT_BY_ID_SQL = "SELECT * FROM students_jsp WHERE student_id = ?";
    private static final String DELETE_STUDENT_SQL = "DELETE FROM students_jsp WHERE student_id = ?";  // Corrected SQL query
    private static final String UPDATE_STUDENT_SQL = "UPDATE students_jsp SET first_name = ?, last_name = ?, father_name = ?, mother_name = ?, present_address = ?, permanent_address = ?, email = ?, password = ?, date_of_birth = ?, age = ?, gender = ?, qualification = ?, uploaded_file = ? WHERE id = ?"; 

    public void addStudent(Student student) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(INSERT_STUDENT_SQL)) {
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, student.getFatherName());
            pstmt.setString(4, student.getMotherName());
            pstmt.setString(5, student.getPresentAddress());
            pstmt.setString(6, student.getPermanentAddress());
            pstmt.setString(7, student.getEmail());
            pstmt.setString(8, student.getPassword());
            pstmt.setDate(9, new Date(student.getDateOfBirth().getTime()));
            pstmt.setInt(10, student.getAge());
            pstmt.setString(11, student.getGender());
            pstmt.setString(12, student.getQualification());
            pstmt.setString(13, student.getUploadedFile());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error while adding student.", e);
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_STUDENTS_SQL)) {

            while (rs.next()) {
                int id = rs.getInt("student_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String fatherName = rs.getString("father_name");
                String motherName = rs.getString("mother_name");
                String presentAddress = rs.getString("present_address");
                String permanentAddress = rs.getString("permanent_address");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Date dateOfBirth = rs.getDate("date_of_birth");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String qualification = rs.getString("qualification");
                String uploadedFile = rs.getString("uploaded_file");
                students.add(new Student(id, firstName, lastName, fatherName, motherName, presentAddress, permanentAddress, email, password, dateOfBirth, age, gender, qualification, uploadedFile));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error while fetching student records.", e);
        }
        return students;
    }

    public void deleteStudent(int id) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(DELETE_STUDENT_SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error while deleting student.", e);
        }
    }

    public Student getStudentById(int id) throws SQLException {
        Student student = null;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENT_BY_ID_SQL)) {
            preparedStatement.setInt(1, id);
            ResultSet rSt = preparedStatement.executeQuery();
            if (rSt.next()) {
                String firstName = rSt.getString("first_name");
                String lastName = rSt.getString("last_name");
                String fatherName = rSt.getString("father_name");
                String motherName = rSt.getString("mother_name");
                String presentAddress = rSt.getString("present_address");
                String permanentAddress = rSt.getString("permanent_address");
                String email = rSt.getString("email");
                String password = rSt.getString("password");
                Date dateOfBirth = rSt.getDate("date_of_birth");
                int age = rSt.getInt("age");
                String gender = rSt.getString("gender");
                String qualification = rSt.getString("qualification");
                String uploadedFile = rSt.getString("uploaded_file");
                student = new Student(id, firstName, lastName, fatherName, motherName, presentAddress, permanentAddress, email, password, dateOfBirth, age, gender, qualification, uploadedFile);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error while fetching student by ID.", e);
        }
        return student;
    }

    public void updateStudent(Student student) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(UPDATE_STUDENT_SQL)) {
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, student.getFatherName());
            pstmt.setString(4, student.getMotherName());
            pstmt.setString(5, student.getPresentAddress());
            pstmt.setString(6, student.getPermanentAddress());
            pstmt.setString(7, student.getEmail());
            pstmt.setString(8, student.getPassword());
            pstmt.setDate(9, new Date(student.getDateOfBirth().getTime()));
            pstmt.setInt(10, student.getAge());
            pstmt.setString(11, student.getGender());
            pstmt.setString(12, student.getQualification());
            pstmt.setString(13, student.getUploadedFile());
            pstmt.setInt(14, student.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error while updating student.", e);
        }
    }
}