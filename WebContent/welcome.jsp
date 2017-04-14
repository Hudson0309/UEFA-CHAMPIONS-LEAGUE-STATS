<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body BACKGROUND='http://img.uefa.com/imgml/2016/ucl/social/og-default.jpg'>
		<div style = "color:white"><b><center>UEFA CHAMPIONS LEAGUE</center></b></div>
		<div>
		
			<form action="servlet2">
			<input style="color:blue" value="Show Teams" type="submit" name="teams">
			</form>
			
			<form action="servlet3">
			<input style="color:blue" value="Show Players" type="submit" name="players">
			</form>
			
			<form action="editPlayer.jsp">
			<input style="color:blue" value="Edit Players" type="submit" name="editPlayers">
			</form>
			
			<form action="deletePlayer.jsp">
			<input style="color:blue" value="Delete Players" type="submit" name="deletePlayers">
			</form>
			
			<form action="addPlayer.jsp">
			<input style="color:blue" value="Add Players" type="submit" name="addPlayers">
			</form>
			
			<form action="addTeam.jsp">
			<input style="color:blue" value="Add Team" type="submit" name="addTeam"/>
			</form>
		
		</div>
</body>
</html>