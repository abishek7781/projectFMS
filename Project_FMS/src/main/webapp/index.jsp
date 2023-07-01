<!DOCTYPE html>
<html>
    <head>
        <title>INDEX</title>
        <link rel="icon" href="asset/img/mec logo.jpg">
        <style>
            .header{
                overflow: hidden;
                padding-bottom: 10px 3px;
                height: 2.3cm;
            }

            .header a{
            	font-weight:bold;
                position: relative;
                display: flex;
                float: left;
                color: black;
                text-align: center;
                padding: 12px;
                text-decoration: none;
                font-size: 18px;
                line-height: 18px;
                border-radius: 14px;
            }

            .header a:hover{
            	background-color:#20338d;
            	border-radius:5px;
            	border:1.5px solid black;
                color:white;
            }

            .header a.active{
                background-color: whitesmoke;
                color: black;
            }

            .header-right{
                float: right;
                font-family:'Segoe UI','Open Sans', 'Helvetica Neue', sans-serif;
                padding-top: .3cm;
            }

            .img{
            	cursor:pointer;
                width: 264px;
                height: 87px;
                padding-left: 8px;	
                padding-top: 1px;
            }

            .label{
                color: black;
            }

            button {
            	cursor:pointer;
                background-color: #20338d;
                border-radius: 15px;
                color: #fff;
                padding: 8px;
                height:80px;
                width: 300px;
                font-size: .7cm;
                
            }

            .button{
            font-style:times-new-roman;
            	margin-top:4cm;
                text-align: center;
            }
            button:hover{
                transform:translateY(-3px);
                box-shadow:0 10px 20px rgba(0,0,0,0.2);
            }
            body{
  				/*background-image: url("https://st4.depositphotos.com/3930503/19991/i/450/depositphotos_199910082-stock-photo-light-blue-gradient-background-blue.jpg");
  				background-size: cover;*/
  				background-color:"whitesmoke";
  				}
        </style>
    </head>
    <body>

        <!--header-->
        <div class="header">
            <img class="img" src="https://www.madhaengineeringcollege.com/wp-content/uploads/2022/06/hlogo.png">
            <div class="header-right">
              <a href="https://www.madhaengineeringcollege.com/">Home</a>
              <a href="https://www.madhaengineeringcollege.com/contact-us/ 	">Contact</a>
              <a href="https://www.madhaengineeringcollege.com/about-college/">About</a>
            </div>
        </div>
        <div class="button" id="b">
        <a href="accountantlogin.html"><button href="E:\projects\Madha\webapp\reg.html">Accountant Login</button><br><br></a>
        <a href="authlogin.html"><button href="#recipts">Authorizer Login</button><br><br></a>
        <a href="higerlogin.html"><button href="#payment">Higher Official Login </button><br><br></a>
        <a href="studentlogin.html"><button href="#payment">Student Login</button></a>
        
        
        </div>
    </body>
</html>