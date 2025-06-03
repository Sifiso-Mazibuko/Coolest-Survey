<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Survey Results</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h1 {
            margin-top: 50px;
            font-size: 32px;
            color: #333;
        }

        .card {
            background-color: #fff;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.08);
            padding: 40px 60px;
            margin: 40px 0;
            max-width: 900px;
            width: 90%;
        }

        .result-container {
            display: flex;
            justify-content: space-between;
            gap: 50px;
            flex-wrap: wrap;
        }

        .column {
            flex: 1;
            min-width: 280px;
        }

        .row {
            margin-bottom: 16px;
        }

        .label {
            font-weight: 600;
            color: #555;
        }

        .value {
            margin-left: 6px;
            color: #222;
        }

        .footer {
            margin: 30px 0 60px 0;
            font-size: 14px;
            color: #aaa;
            text-align: center;
        }

        .back-button {
            background-color: #007bff;
            color: #fff;
            padding: 12px 24px;
            border: none;
            border-radius: 8px;
            text-decoration: none;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .back-button:hover {
            background-color: #0056b3;
        }

        @media (max-width: 768px) {
            .result-container {
                flex-direction: column;
            }
        }
    </style>
</head>
<body>
    <h1>Survey Results</h1>

    <div class="card">
        <%
            Integer TotalNumberSurvey = (Integer)request.getAttribute("countRows");   
            Double averageAge = (Double)request.getAttribute("avgAge");
            Integer lowAge = (Integer)request.getAttribute("lowAge");
            Integer higAge = (Integer)request.getAttribute("hiAge");
            
            Double percPizza = (Double)request.getAttribute("percPizza");
            Double percPasta = (Double)request.getAttribute("percPasta");
            Double percPapWors = (Double)request.getAttribute("percPapW");
            
            Double avgWatchMovie = (Double)request.getAttribute("avgWatchMovie");
            Double avgListenRadion = (Double)request.getAttribute("avgListenRadion");
            Double avgEatOut = (Double)request.getAttribute("avgEatOut");
            Double avgWatchTv = (Double)request.getAttribute("avgWatchTv");
        %>

        <div class="result-container">
            <div class="column">
                <div class="row"><span class="label">Total number of surveys:</span><span class="value"><%= TotalNumberSurvey %></span></div>
                <div class="row"><span class="label">Average Age:</span><span class="value"><%= averageAge %></span></div>
                <div class="row"><span class="label">Oldest person who participated in survey:</span><span class="value"><%= higAge %></span></div>
                <div class="row"><span class="label">Youngest person who participated in survey:</span><span class="value"><%= lowAge %></span></div>
                <div class="row"><span class="label">Percentage of people who like Pizza:</span><span class="value"><%= percPizza %> %</span></div>
                <div class="row"><span class="label">Percentage of people who like Pasta:</span><span class="value"><%= percPasta %> %</span></div>
                <div class="row"><span class="label">Percentage of people who like Pap and Wors:</span><span class="value"><%= percPapWors %> %</span></div>
            </div>

            <div class="column">
                <div class="row"><span class="label">People who like to watch movies:</span><span class="value"><%= avgWatchMovie %></span></div>
                <div class="row"><span class="label">People who like to listen to radio:</span><span class="value"><%= avgListenRadion %></span></div>
                <div class="row"><span class="label">People who like to eat out:</span><span class="value"><%= avgEatOut %></span></div>
                <div class="row"><span class="label">People who like to watch TV:</span><span class="value"><%= avgWatchTv %></span></div>
            </div>
        </div>
    </div>

    <a href="menu.jsp" class="back-button">← Back to Home</a>

    <div class="footer">© <%= java.time.Year.now() %> Survey Results System</div>
</body>
</html>
