<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<link rel="stylesheet" href="<c:url value = '/css/ok.css'/>" />
<link rel="stylesheet" href="<c:url value = '/css/util.css'/>" />

<link rel="stylesheet" href="<c:url value = '/vendor/bootstrap/css/bootstrap.min.css'/>" />

<link rel="stylesheet" href="<c:url value = '/vendor/animate/animate.css'/>" />
<link rel="stylesheet" href="<c:url value = '/vendor/select2/select2.min.css/css/main.css'/>" />
<link rel="stylesheet" href="<c:url value = '/vendor/perfect-scrollbar/perfect-scrollbar.css'/>" />

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Search</title>
</head>
<body>


	<div class="limiter">
		
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100">
				<h3 class="text-light text-center mb-4">TỒN KHO THEO LOẠI</h3>
					<table>
						<thead>
							<tr class="table100-head">
								<th class="column1">Loại hàng</th>
								<th class="column2">Tổng giá</th>
								<th class="column3">Số sản phẩm</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${items}">
								<tr>
									<td class="column1">${item.group.name}</td>
									<td class="column2">${item.sum}</td>
									<td class="column3">${item.count}</td>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	</body>
</html>