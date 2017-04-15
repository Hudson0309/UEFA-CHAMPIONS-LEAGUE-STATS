<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="InsertResultServlet">
Home Team:<input type="text" name="tHomeTeam">
Away Team:<input type="text" name="tAwayTeam">
Goals Scored By Home Team:<input type="text" name="goalsByTeam1">
Goals Scored By Away Team:<input type="text" name="goalsByTeam2">
<input style="color:blue" value="Inser Result" type="submit" name="InsertResultServlet">
</form>

</body>
</html>