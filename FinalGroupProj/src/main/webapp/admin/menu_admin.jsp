<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">

<link rel="canonical" 
href="https://getbootstrap.com/docs/5.2/examples/sidebars/">
<link rel="canonical"
href="https://getbootstrap.com/docs/5.2/examples/sign-in/">
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/menu_student.css" rel="stylesheet">

<!-- Bootstrap Icon -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.0/font/bootstrap-icons.css">
<!-- Custom styles for this template -->
<link href="assets/css/sidebars.css" rel="stylesheet">
<link href="assets/css/menu_student.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="assets/css/sidebars.css" rel="stylesheet">


<title>Admin Menu</title>
</head>
<body style="height: 100%;">

<main>
		<div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark"
			style="width: 15%; min-width: 200px; overflow: hidden; height: 100%;">
			<a href="StaffMenuController"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
				<span class="fs-4">Admin Menu</span>
			</a>
			<hr>
			<ul class="nav nav-pills flex-column mb-auto">
				<li class="nav-item"><a href="StaffMenuController"
					class="nav-link active" aria-current="page"> <i
						class="bi bi-house"></i> Home
				</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link text-white"> <i class="bi bi-people-fill"></i>
						List Student
				</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link text-white"> <i class="bi bi-justify"></i>
						List College
				</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link text-white"> <i
						class="bi bi-justify"></i>
						List College Application
				</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link text-white"> <i class="bi bi-exclamation-square"></i>
						List Complaint
				</a></li>
				<li class="nav-item"><a href="#"
					class="nav-link text-white"> <i class="bi bi-journal-check"></i>
						Generate Report
				</a></li>
			</ul>
			<hr>
			<!--  
			<div style="margin: 5px 20px 5px 20px;">
				<a style="vertical-align: baseline;"><img
					src="assets/images/user.png" alt="" width="32" height="32"
					class="rounded-circle me-2"><strong></strong></a>
			</div>
			-->
			<button onclick="document.location='LogoutController'" type="button"
				class="btn btn-danger" style="margin: 10px;">
				<i class="bi bi-power"
					style="vertical-align: baseline; margin-right: 10px;"></i> Logout
			</button>
		</div>
		
		
		</main>	
	
</body>
</html>