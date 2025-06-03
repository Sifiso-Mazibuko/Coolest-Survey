<%@page  isErrorPage="true"contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Input Error</title>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #fefefe;
            text-align: center;
            padding-top: 100px;
        }
        .error-box {
            display: inline-block;
            padding: 30px;
            border: 2px solid #cc0000;
            background-color: #ffe6e6;
            color: #cc0000;
            border-radius: 10px;
        }
        .button {
            margin-top: 20px;
            padding: 10px 25px;
            background-color: #cc0000;
            color: white;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
        }
        .button:hover {
            background-color: #a30000;
        }
    </style>
</head>
<body>
    <div class="error-box">
        <h2>Oops! A Required Field Was Not Filled.</h2>
        <p>Please make sure to complete all required fields before submitting the survey.</p>
        <a href="menu.jsp" class="button">← Go Back to Survey Form</a>
    </div>
</body>
</html>
