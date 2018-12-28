<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>freemarker模板</title>

<body>
<div id="Content">

    <table border="1px solid #CCCCCC">
        <tr>
            <td>name</td>
            <td>age</td>
            <td>sex</td>
        </tr>
        <#list userList as user>
           <tr>
               <td>${user.name}</td>
               <td>${user.age}</td>
               <td>${user.sex}</td>
           </tr>

        </#list>
    </table>

</div>

</body>

</html>