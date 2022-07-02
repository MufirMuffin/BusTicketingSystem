<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/sidebars/">

<!-- add icon link -->
<link rel="icon" href="assets/images/h_logo.svg" type="image/x-icon">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/sign-in/">

<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icon -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.0/font/bootstrap-icons.css">

<!-- Custom styles for this template -->
<link href="assets/css/sidebars.css" rel="stylesheet">
<link href="assets/css/menu_student.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body style="height: 100%;">

<!--  Content -->
<main>
		<div class="backg overflow-scroll">
			<div class="card">
				<div class="bg-soft-primary">
					<div class="card-body">
						<h4 class="card-title">LIST TRIP</h4>
						<!--  
						<form action="SearchCollegeController">
						<div class="input-group mb-3">
						  <input type="text" class="form-control" placeholder="Search Data By College Number, Name, Status" name="search" value="">
						  <button class="btn btn-outline-secondary" type="submit">Search</button>
						</div>
						</form>
						-->
						<ul class="nav nav-pills navtab-bg nav-justified">
							<li class="nav-item"><a href="ListAllTripController"
								data-toggle="tab" aria-expanded="true" class="nav-link active"
								style="border-radius: 15px;">LIST OF TRIPS</a></li>
							<li class="nav-item"><a href="AddTripController"
								data-toggle="tab" aria-expanded="false" class="nav-link"
								style="border-radius: 15px;">ADD COLLEGE</a></li>
						</ul>
						<!--start div table   -->
						<form action="#" method="post">
							<div class="table-responsive mt-4">
								<table class="table table-centered table-nowrap">
									<tbody>
										<tr>
											<td style="width: 5%">
												<h5 class="mb-0">ID TRIP</h5>
											</td>
											<td style="width: 5%">
												<h5 class="mb-0">ADMIN ID</h5>
											</td>
											<td style="width: 5%">
												<h5 class="mb-0">BUS ID</h5>
											</td>
											<td style="width: 10%">
												<h5 class="mb-0">DEPARTURE</h5>
											</td>
											<td style="width: 10%">
												<h5 class="mb-0">DESTINATION</h5>
											</td>
											<td style="width: 10%">
												<h5 class="mb-0">DATE</h5>
											</td>
											<td style="width: 10%">
												<h5 class="mb-0">TIME</h5>
											</td>
											<td style="width: 10%">
												<h5 class="mb-0">PRICE</h5>
											</td>
											<td style="width: 35%" align="center">
												<h5 class="mb-0">ACTION</h5>
											</td>
										</tr>

										<c:forEach items="${trip}" var="trip" varStatus="trip">
											<tr>
												<td>
													<p class="mb-0">${trip.tripid}</p>
												</td>
												<td>
													<p class="mb-0">${trip.adminid}</p>
												</td>
												<td>
													<p class="mb-0">${trip.busid}</p>
												</td>
												<td>
													<p class="mb-0">${trip.departure}</p>
												</td>
												<td>
													<p class="mb-0">${trip.destination}</p>
												</td>
												
												<td>
													<p class="mb-0">${trip.date}</p>
												</td>
												<td>
													<p class="mb-0">${trip.time}</p>
												</td>
												<td>
													<p class="mb-0">${trip.price}</p>
												</td>
												<td>
												<!--  
													<button type="button" class="btn btn-primary"
														style="margin: 10px; padding: 5px 50px 5px 50px; border-radius: 10px;"
														onclick="document.location='UpdateCollegeController?coll_no=${college.coll_no}'">UPDATE</button>
														<input type="hidden" id="coll_no-${coll.index}" value="<c:out value="${college.coll_no}"/>">
													<button type="submit" class="btn btn-danger" onclick="confirmDelete('${coll.index}')"
														style="margin: 10px; padding: 5px 50px 5px 50px; border-radius: 10px;">REMOVE</button>
												-->
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</main>
	<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
	<script>
	/*
		function confirmDelete(index) {
			var coll_no = $("#coll_no-" + index).val();
			var r = confirm("Are you sure want to delete college " + coll_no + "?");
			if (r == true) {
				location.href = 'DeleteCollegeController?coll_no='+ coll_no;
				alert("College deleted!");
			} else {
				return false;
			}
		}*/
	</script>
</body>
</html>