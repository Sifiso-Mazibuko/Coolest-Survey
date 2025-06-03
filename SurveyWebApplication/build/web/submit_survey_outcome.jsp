<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey Submitted</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e6f2ff; /* light baby blue */
            color: #333;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        h1 {
            color: #004080;
        }

        .message-box {
            background-color: #ffffff;
            border-radius: 12px;
            padding: 40px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            text-align: center;
        }

        .btn {
            display: inline-block;
            margin-top: 20px;
            padding: 12px 24px;
            background-color: #3399ff;
            color: white;
            border: none;
            border-radius: 6px;
            text-decoration: none;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        .btn:hover {
            background-color: #007acc;
        }
    </style>
</head>
<body>
    <div class="message-box">
        <h1>Survey Submitted!</h1>
        <p>Your survey was successfully submitted.</p>
        <a href="index.html" class="btn">Return to Home Page</a>
    </div>
</body>
</html>
