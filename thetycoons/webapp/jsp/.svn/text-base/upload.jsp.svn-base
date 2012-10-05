<!DOCTYPE HTML>

<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js">
</script>

<META http-equiv="Content-Type" content="text/html;charset=UTF-8">

<title>Upload Example</title>

<script language="JavaScript">
	function Validate() {
		
		var image = document.getElementById("image").value;
		
		if (image != '') {
			var checkimg = image.toLowerCase();
			var imgSize = image.files[0].size;
			if (!checkimg.match(/(\.jpg|\.png|\.JPG|\.PNG|\.jpeg|\.JPEG)$/)) {
				alert("Please upload a valid Image File. Allowed file extensions are - .jpg, .png, .jpeg ");
				document.getElementById("image").focus();
				return false;
			}
		}
		
		
		if (imgSize > 1000000) {
			alert("Too much to handle!!!");
			return false;
		}
		return true;
	}

	
</script>

</head>

<body>

	<form:form modelAttribute="photo" name="frm" method="post"
		enctype="multipart/form-data" onSubmit="return Validate();">

		<fieldset>
			<legend>Upload File</legend>

			<table>
				<tr>
					<td><form:label for="fileData" path="fileData">File</form:label><br />
					</td>
					
					<td><form:input path="fileData" id="image" type="file" /></td>
					
				</tr>
				<tr>
					<td><br /></td>
					<td><input type="submit" value="Upload" /></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>

</html>