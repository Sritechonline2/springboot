<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Angle Print</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: url('https://tse2.mm.bing.net/th?id=OIP.880NrUEXDIq2yN_oePPgXAHaEK&pid=Api&P=0&h=220') no-repeat center center fixed;
            background-size: cover;
        }

        #wrapper {
            width: 90%;
            max-width: 800px;
            background-color: rgba(255, 255, 255, 0.9);
            border-radius: 20px;
            padding: 40px;
            box-shadow: 0px 0px 30px 0px rgba(0, 0, 0, 0.1);
        }

        #header {
            text-align: center;
            margin-bottom: 40px;
        }

        #header h1 {
            color: #333333;
            font-size: 36px;
            font-weight: bold;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.1);
        }

        #container {
            display: flex;
            justify-content: center;
            gap: 20px;
            margin-bottom: 40px;
        }

        .box {
            flex: 1;
            padding: 30px;
            background-color: #f2f2f2;
            border-radius: 15px;
            box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .box form {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        a {
            display: inline-block;
            padding: 20px 40px;
            background: linear-gradient(#4CAF50, #2E8B57);
            text-decoration: none;
            color: #ffffff;
            border-radius: 30px;
            font-size: 20px;
            font-weight: bold;
            text-transform: uppercase;
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.3);
            transition: transform 0.2s, box-shadow 0.2s;
        }

        a:hover {
            transform: translateY(-2px);
            box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.3);
        }

        #foot {
            text-align: center;
            padding: 20px;
            background-color: #333333;
            color: #ffffff;
            border-radius: 15px;
            box-shadow: 0px -5px 15px 0px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>

<body>
    <div id="wrapper">
        <div id="header">
            <h1>Angle Print</h1>
        </div>
        <div id="container">
            <div class="box">
                <form action="">
                    <a href="formLogIn">Login</a>
                    <a href="formReset">Reset Password</a>
                    <a href="formForget">Forgot Password</a>
                </form>
            </div>
        </div>
        <div id="foot">Contact</div>
    </div>
</body>

</html>