<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: url('pic.jpg') no-repeat center center fixed;
            background-size: cover;
        }
    </style>
</head>
<body>
    <div class="container-fluid bg-dark text-light py-1">
        <header class="text-center">
            <h2 class="display-6">Registration Here</h2>
        </header>
    </div>
    

    <form action="StudentServlet" method="post" >
        <input type="hidden" name="action" value="add">

        <section class="container my-3 text-light w-75 p-3 mx-auto">

            <div class="row">
                <div class="col">
                    <label for="firstName">First Name</label>
                    <input type="text" id="firstName" name="firstName" class="form-control" placeholder="First name" required>
                </div>

                <div class="col">
                    <label for="lastName">Last Name</label>
                    <input type="text" id="lastName" name="lastName" class="form-control" placeholder="Last name" required>
                </div>
            </div>

            <div class="row">
                <div class="col">
                    <label for="fatherName">Father's Name</label>
                    <input type="text" id="fathername" name="fatherName" class="form-control" placeholder="Father's Name" required>
                </div>

                <div class="col">
                    <label for="motherName">Mother's Name</label>
                    <input type="text" id="motherName" name="motherName" class="form-control" placeholder="Mother's Name" required>
                </div>
            </div>

            <label for="presentAddress">Present Address</label>
            <input type="text" id="presentAddress" name="presentAddress" class="form-control" required>

            <label for="permanentAddress">Permanent Address</label>
            <input type="text" id="permanentAddress" name="permanentAddress" class="form-control" required>

            <div class="row">
                <div class="col">
                    <label for="em">Email</label>
                    <input type="email" class="form-control" name="email" placeholder="example@gmail.com" id="em" required>
                </div>

                <div class="col">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Enter your password" required>
                </div>
            </div>

            <div class="row">
                <div class="col-6">
                    <label for="dateofbirth">Date of Birth</label>
                    <input type="date" name="dateOfBirth" id="dateOfBirth" class="form-control" required>                    
                </div>

                <div class="col-6">
                    <label for="age">Age</label>
                    <input type="number" name="age" id="age" class="form-control" required>
                </div>
            </div>

            <fieldset class="mt-2">
                <legend>Gender</legend>
                <input type="radio" name="gender" value="male" required> Male
                <input type="radio" name="gender" value="female" required> Female
                <input type="radio" name="gender" value="other" required> Other
            </fieldset>

            <label>Educational Qualification</label>
            <select name="qualification" class="form-control" required>
                <option value="">---Select Your Qualifications---</option>
                <option value="graduate">GRADUATE/FAZIL</option>
                <option value="hsc">HSC/DHAKHIL</option>
                <option value="ssc">SSC/ALIM</option>
            </select>

            <div class="input-group mt-2">
                <input type="file" class="form-control" id="uploadedFile" name="uploadedFile" required>
                <label class="input-group-text" for="uploadedFile">Upload</label>
            </div>

            <div class="mt-3 text-center">
                <input class="btn text-white" type="submit" value="Submit" style="background-color: #12073d;">
                <input type="reset" class="btn text-white" value="Reset" style="background-color: #322c4a;">
                <a class="btn text-white" href="/Form" style="background-color: #1c0f54;">⟵ Back to Home</a>
            </div>
        </section>
    </form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>