<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<!--禁止缩放，适合设备尺寸-->
		<meta name="viewport" content="width=device-width, 
									   initial-scle=1.0,
									   maximum-scale=1.0,
									   user-scalable=no">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<!--
		<style>
	      	body {background-color:yellow;}
	    </style>
		-->
	</head>
	<body>
		<ul style="background-color:black" class="nav nav-tabs">
			<li><a href="#"><strong>课程管理</strong></a></li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				课程类别 <b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><form action="type_manage"><input type="submit" name="type_manage" value="类别管理"  /></form></li>
					<li><form action="detail_type"><input type="submit" name="detail_type" value="课程细类"  /></form></li>
					<li><form action="detail_model"><input type="submit" name="detail_model" value="细类模块"  /></form></li>
				</ul>
			</li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">培养类别 <b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><form action="training_class"><input type="submit" name="training_class" value="课程类别与培养类别对应"  /></form></li>
				</ul>
			</li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">课程库 <b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><form action="class_manage"><input type="submit" name="class_manage" value="课程库管理"  /></form></li>
					<li><form action="class_apply"><input type="submit" name="class_apply" value="新增课程申请"  /></form></li>
					<li><form action="class_check"><input type="submit" name="class_check" value="新增课程审批"  /></form></li>
				</ul>
			</li>
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				先修关系 <b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><form action="relation_apply"><input type="submit" name="relation_apply" value="先修关系申请"  /></form></li>
					<li><form action="relation_check"><input type="submit" name="relation_check" value="先修关系审批"  /></form></li>
				</ul>
			</li>
		</ul>
		<p>欢迎登录！</p>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>
