
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

        <!-- http://getbootstrap.com/ -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">

        <link href="resources/css/styles.css" rel="stylesheet"/>
		
        <title>Comment Form</title>
		
    </head>

    <body>
            
        <div class="container">

            
            <div id="middle">
                <main class="container p-5">
                        <font color="red">* required field</font>
                            <form method="post" action="comment">  
                              Name: <input type="text" name="name" value="${name}">
                              <font color="red">* ${invalidName}</font>
                              <br><br>
                              E-mail: <input type="text" name="email" value="${email}">
                              <font color="red">* ${invalidEmail}</font>
                              <br><br>
                              Website: <input type="text" name="url" value="${url}">
                              <font color="red">${invalidWebsite}</font>
                              <br><br>
                              Comment: <textarea name="comment" rows="5" cols="40"></textarea>
                              <br><br>
                              Gender:
                              <input type="radio" name="gender"  value="female">Female
                              <input type="radio" name="gender"  value="male">Male
                              <input type="radio" name="gender"  value="other">Other  
                              <font color="red">* ${invalidGender}</font>
                              <br><br>
                              <input type="submit" name="submit" value="Submit">  
                            </form>
                </main>
            </div>	
        </div>

    </body>

</html>

