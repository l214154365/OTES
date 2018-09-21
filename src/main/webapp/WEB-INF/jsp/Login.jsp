<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"><head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>教师评价系统</title>
    <meta name="keywords" content="">
    <meta name="description" content="">


    <style>
        html{
            color:#000;
            /*--
                背景规定颜色，使iframe背景不透明
            --*/
            /*background:#FFF;*/
        }
        body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code, form, fieldset, legend, input, textarea, p, blockquote, th, td {
            margin:0;
            padding:0;
        }
        table {

        }
        fieldset,
        img {
            border:0;
        }

        body{
            font-size: 12px;
            font-family:arial,"\5b8b\4f53";
            color: #7F7F7F;
        }
        img{
            display: block;
        }


        /*---------------------------------头部------------------------------------*/
        .ld_header{
            height: 106px;
            border-bottom: 2px solid #336699;
           /* background-color: black;*/
        }
        .ld_header_in{
            width: 1000px;
            margin: 0 auto;

        }
        .ld_logo{
            padding-top: 22px;
            overflow: hidden;
            text-shadow: #4b23ff 0 0 10px;
            color:white;
            font-size:60px;
           letter-spacing:10px;
            font-family: italic;



        }



        /*---------------------------------登录页面------------------------------------*/
        .ldL_con{
            height: 610px;
            background:#f5f8fb;
            background: url(images/cc.png)  no-repeat
        }
        .ldL_con_in{
            width: 1000px;
            height: 541px;
            overflow: hidden;
            margin: 0 auto;
            background: url(images/0.png)  no-repeat 10px top;
        }
        .ld_form{
            width: 290px;
            height: 254px;
            overflow: hidden;
            padding-left: 30px;
            margin:178px 0 0 609px;
        }
        .form_title {
            font-size: 18px;
            font-family: Microsoft Yahei;
            color: #336599;
            margin: 26px 0 15px 0;}
        .ld_form p{
            margin-bottom: 13px ;
        }
        .ld_form input {
            width: 233px;
            height: 20px;
            line-height: 22px;
            padding:18px 10px 8px 30px;
            border: 1px solid #97abc5;

           /* background: url(images/icon01.png) no-repeat 10px 8px;  */}
        #userName{
            background: url("images/user.png") no-repeat 5px 16px;
        }
        #password{
            background: url("images/password.png") no-repeat 5px 16px;
        }

        .ld_form .ld_pass{
            background-position: 13px -47px;}
        .ld_login{
            padding:10px 29px 0 0;
            overflow: hidden;}
        .ld_login_in{
            width: 260px;
            height: 31px;
            background:url(images/ld_login.jpg);
            line-height: 31px;
            font-size: 14px;
            color: #fff;
            text-align: center;
            cursor: pointer;
            margin-bottom: 10px; }
        .ld_login a{
            float: right;
            color: #7F7F7F;}


        .ld_footer{
            height: 64px;
            border-top: 1px solid #d2dfec;
            background:#f5f8fb;
        }
        .ld_footer_in{
            width: 450px;
            margin: 0 auto;
            padding-top: 10px;}
        .ld_footer_in p{
            width:100%;
            line-height: 22px;
            text-align: center;}

    </style>
</head>
<body>
<div class="ld_header">
    <div class="ld_header_in">
        <div class="ld_logo">
          <strong>  教师评价系统</strong>
        </div>
    </div>
</div>
<div class="ldL_con">
    <div class="ldL_con_in">
        <div class="ld_form">
            <form id="login-form" method="post" action="submit">
                <h3 class="form_title" style="margin-left:10px">用户登录</h3>
                <p>
                    <input type="text" name="userid" id="userid">
                </p>
                <p>
                    <input type="password" id="password" name="password" class="ld_pass">
                </p>

                <div class="ld_login">
                    <div class="ld_login_in" id="bt-login" style="margin-left:8px"><button>马上登录</</button></div>
                    <div id="login-msg"></div>

                </div>

            </form>
        </div>
    </div>

</div>
<div class="ld_footer">
    <div class="ld_footer_in">
        <p>某某某某学院教师网络教学系统</p>
        <p>xxxxxxxxxxxxxxxxxxx</p>
    </div>
</div>

</body></html>