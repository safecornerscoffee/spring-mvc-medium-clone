<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <title>Tomcat@9</title>
    <link href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet"/>
</head>
<body>
<div class="navbar has-shadow">
    <div class="navbar-brand">
        <a class="navbar-item" href="${pageContext.request.contextPath}/">Home</a>
    </div><!--navbar-brand-->
    <div class="navbar-menu is-active">
        <div class="navbar-start">
            <a class="navbar-item" href="${pageContext.request.contextPath}/users">
                Users
            </a>
            <a class="navbar-item" href="${pageContext.request.contextPath}/articles">
                Articles
            </a>
        </div><!--navbar-start-->

        <div class="navbar-end">
            <a class="navbar-item" href="${pageContext.request.contextPath}/login">Sign in</a>
        </div>
    </div><!--navbar-menu-->
</div><!--navbar-->

<section class="section">
    <div class="columns">
        <div class="column">
            <div class="level">
                <div class="level-left">
                    <div class="level-item">
                        <h1 class="title">
                            <strong>Hello, World!</strong>
                        </h1>
                    </div>
                </div><!--level-left-->

                <div class="level-right">
                    <div class="level-item">
                        <h2 class="subtitle">
                            Cappuccino
                        </h2>
                    </div>
                </div><!--level-right-->
            </div><!--level-->

            <div class="content">
                aa
            </div><!--content-->
        </div><!--column-->
    </div><!--columns-->
</section><!--section-->
</body>
</html>