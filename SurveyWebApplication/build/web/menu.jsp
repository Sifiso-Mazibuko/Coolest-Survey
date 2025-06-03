<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Survey Menu</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <script>
        function calculateAge(dob) {
            const birthDate = new Date(dob);
            const today = new Date();
            let age = today.getFullYear() - birthDate.getFullYear();
            const m = today.getMonth() - birthDate.getMonth();
            if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
                age--;
            }
            return age;
        }

        function validateForm(event) {
            const form = document.forms[0];

            const fullname = form.fullname.value.trim();
            const email = form.email.value.trim();
            const dob = form.dob.value;
            const contact = form.contact.value.trim();

            if (!fullname || !email || !dob || !contact) {
                alert("Please fill in all personal details.");
                event.preventDefault();
                return false;
            }

            const age = calculateAge(dob);
            if (age < 5 || age > 120) {
                alert("Age must be between 5 and 120 years.");
                event.preventDefault();
                return false;
            }

            for (let i = 1; i <= 4; i++) {
                const radios = form[`q${i}`];
                let isChecked = false;
                for (let r of radios) {
                    if (r.checked) {
                        isChecked = true;
                        break;
                    }
                }
                if (!isChecked) {
                    alert(`Please select a rating for question ${i}.`);
                    event.preventDefault();
                    return false;
                }
            }

            return true;
        }

        window.addEventListener("load", () => {
            document.querySelector("form").addEventListener("submit", validateForm);
        });
    </script>
</head>
<body>
    <header class="navbar">
        <div class="logo">_Surveys</div>
        <nav>
            <a href="menu.jsp">FILL OUT SURVEY</a>
            <a href="ResultServlet.do">VIEW SURVEY RESULTS</a>
        </nav>
    </header>

    <main class="survey-container">
        <h2>Personal Details :</h2>

        <form action="SubmiSurveyServlet.do" method="POST">

            <div class="form-group">
                <label>Full Names</label>
                <input type="text" name="fullname" required>
            </div>
            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" required>
            </div>
            <div class="form-group">
                <label>Date of Birth</label>
                <input type="date" name="dob" required>
            </div>
            <div class="form-group">
                <label>Contact Number</label>
                <input type="tel" name="contact" required>
            </div>

            <div class="form-group food-options">
                <label>What is your favorite food?</label><br>
                <label><input type="checkbox" name="food" value="Pizza"> Pizza</label>
                <label><input type="checkbox" name="food" value="Pasta"> Pasta</label>
                <label><input type="checkbox" name="food" value="Pap and Wors"> Pap and Wors</label>
                <label><input type="checkbox" name="food" value="Other"> Other</label>
            </div>

            <div class="form-group">
                <p>Please rate your level of agreement on a scale from 1 to 5, with 1 being "strongly agree" and 5 being "strongly disagree."</p>
                <table>
                    <thead>
                        <tr>
                            <th></th>
                            <th>Strongly Agree</th>
                            <th>Agree</th>
                            <th>Neutral</th>
                            <th>Disagree</th>
                            <th>Strongly Disagree</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>I like to watch movies</td>
                            <td><input type="radio" name="q1" value="1"></td>
                            <td><input type="radio" name="q1" value="2"></td>
                            <td><input type="radio" name="q1" value="3"></td>
                            <td><input type="radio" name="q1" value="4"></td>
                            <td><input type="radio" name="q1" value="5"></td>
                        </tr>
                        <tr>
                            <td>I like to listen to radio</td>
                            <td><input type="radio" name="q2" value="1"></td>
                            <td><input type="radio" name="q2" value="2"></td>
                            <td><input type="radio" name="q2" value="3"></td>
                            <td><input type="radio" name="q2" value="4"></td>
                            <td><input type="radio" name="q2" value="5"></td>
                        </tr>
                        <tr>
                            <td>I like to eat out</td>
                            <td><input type="radio" name="q3" value="1"></td>
                            <td><input type="radio" name="q3" value="2"></td>
                            <td><input type="radio" name="q3" value="3"></td>
                            <td><input type="radio" name="q3" value="4"></td>
                            <td><input type="radio" name="q3" value="5"></td>
                        </tr>
                        <tr>
                            <td>I like to watch TV</td>
                            <td><input type="radio" name="q4" value="1"></td>
                            <td><input type="radio" name="q4" value="2"></td>
                            <td><input type="radio" name="q4" value="3"></td>
                            <td><input type="radio" name="q4" value="4"></td>
                            <td><input type="radio" name="q4" value="5"></td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <button type="submit" class="button-link">SUBMIT</button>
        </form>
    </main>
</body>
</html>
