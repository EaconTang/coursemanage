<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<!--禁止缩放，适合设备尺寸-->
		<meta name="viewport" content="width=device-width, 
									   initial-scle=1.0,
									   maximum-scale=1.0,
									   user-scalable=no">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<style>
	      	body {background-color:yellow;}
	      	thead {background-color:green;}
	    </style>
	</head>
	<body>
		<ul style="background-color:black" class="nav nav-tabs">
			<li><a href="#"><strong>课程类别管理</strong></a></li>
			<li><a href="#">新增</a></li>
			<li><a href="#">修改</a></li>
			<li><a href="#">删除</a></li>
			<li><a href="#">导出</a></li>	
			<li class="pull-right"><form action="home.jsp"><input style="background-color:yellow; width:60px; height:40px" type="submit" value="返回"/></form></li>       
		</ul>
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th class="text-center">课程类别码</th>
						<th class="text-center">课程类别</th>
						<th class="text-center">课程性质</th>
						<th class="text-center">序号</th>
						<th class="text-center">是否需要重考</th>
						<th class="text-center">是否需要重修</th>
					</tr>
				</thead>
				<tbody class="text-center">
					<tr>
						<td><input type="text" name="code" /></td>
						<td>
							<select class="col-md-12">
								<option>公必</option>
								<option>专必</option>
								<option>公选</option>
								<option>专选</option>
							</select>
						</td>
						<td><input type="text" name="description" /></td>
						<td><input type="text" name="number" /></td>
						<td>
							<input type="radio" name="reexam" value="exam" />重考<br>
							<input type="radio" name="reexam" value="nexam" />不重考
						</td>
						<td>
							<input type="radio" name="relearn" value="learn" />重修<br>
							<input type="radio" name="relearn" value="nlearn" />不重修
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div align="center">
			<button type="button" onclick="add()">添加</button>
			<button type="button" onclick="findall()">查询</button>
			<button type="button" onclick="modify()">修改</button>
			<button type="button" onclick="delete()">删除</button>
		</div>
		<div class="table-responsive">
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th class="text-center">课程类别码</th>
						<th class="text-center">课程类别</th>
						<th class="text-center">课程性质</th>
						<th class="text-center">序号</th>
						<th class="text-center">是否需要重考</th>
						<th class="text-center">是否需要重修</th>
					</tr>
				</thead>
				<tbody class="text-center">
					<tr>
						<td>课程类别码1</td>
						<td>课程类别1</td>
						<td>课程性质1</td>
						<td>序号1</td>
						<td>是</td>
						<td>是</td>
					</tr>
					<tr>
						<td>课程类别码2</td>
						<td>课程类别2</td>
						<td>课程性质2</td>
						<td>序号2</td>
						<td>否</td>
						<td>否</td>
					</tr>
				</tbody>
			</table>
		</div>
	</body>
</html>