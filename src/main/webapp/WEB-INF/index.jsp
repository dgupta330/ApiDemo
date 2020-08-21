<html>
<head>
<title>API DEMO</title>
</head>
<body>Hello

<form action="addUser">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id" value="${id}"/></td>
        </tr>
        <tr>
            <td>NAME:</td>
            <td><input type="text" name="name" value="${name}"/></td>
        </tr>
        <tr>
            <td> AGE: </td>
            <td><input type="text" name="age" value="${age}"/></td>
        </tr>
        <tr>
            <td>MOBILE:</td>
            <td><input type="text" name="mobile" value="${mobile}"/></td>
        </tr>
        <tr>
            <td>PASSWORD:</td>
            <td><input type="text" name="pwd" value="${pwd}"/></td>
        </tr>

    </table>
    <br>
    <input type="submit" values="Add Data into DB"><br>
</form>
<p> >> ${msg}</p>

</body>
</html>