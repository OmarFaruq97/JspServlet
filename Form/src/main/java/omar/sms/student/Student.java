package omar.sms.student;

import java.util.Date;


public class Student {
	private int id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String presentAddress;
    private String permanentAddress;
    private String email;
    private String password;
    private Date dateOfBirth;
    private int age;
    private String gender;
    private String qualification;
    private String uploadedFile;


    public Student() {
    }

    public Student(String firstName, String lastName, String fatherName, String motherName, String presentAddress, String permanentAddress, String email, String password, Date dateOfBirth, int age, String gender, String qualification, String uploadedFile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.qualification = qualification;
        this.uploadedFile = uploadedFile;
    }

    public Student(int id, String firstName, String lastName, String fatherName, String motherName, String presentAddress, String permanentAddress, String email, String password,Date dateOfBirth , int age, String gender, String qualification, String uploadedFile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.qualification = qualification;
        this.uploadedFile = uploadedFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(String uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

}
