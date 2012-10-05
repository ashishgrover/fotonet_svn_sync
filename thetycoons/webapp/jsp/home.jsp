<!DOCTYPE HTML>
<html>
<head>
<title>USER LOGIN</title>
</head>
<body>

	List of Albums Message : ${message}

	<a href="upload">Upload Photo</a>


	<%
		if (session.getAttribute("uploadFile") != null

		&& !(session.getAttribute("uploadFile")).equals("")) {
	%>

	<h3>Uploaded File</h3>

	<br>

	<img
		src="<%=request.getRealPath("/") + "/images/"

				+ session.getAttribute("uploadFile")%>"
		alt="Upload Image" />

	<%
		session.removeAttribute("uploadFile");

		}
	%>

</body>
</html>


