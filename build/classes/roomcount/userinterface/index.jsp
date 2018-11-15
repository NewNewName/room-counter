<%-- 
    Document   : newjsp
    Created on : Oct 29, 2018, 3:48:43 PM
    Author     : jonesn2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
           <h1>Boston CodeCamp</h1>
           <div class="row">
                <form>
                    Room Name
                    <select> 
                        <option> Room 1 </option>
                        <option> Room 2 </option>
                        <option> Room 3 </option>
                    </select>
                    <br>
                    Session Name
                    <input type="text" name="sessionName"/>
                    <br>
                    Session Number
                    <input type="number" name="sessionNumber"/>
                    <br>
                    Start Time
                    <input type="time" name="startTime"/>
                    <br>
                    End Time
                    <input type="time" name="endTime"/>
                    <br>
                    Room Capacity
                    <input type="number" name="roomCapacity"/>
                    <br>
                    User
                    <select>
                        <option> User 1 </option>
                        <option> User 2 </option>
                        <option> User 3 </option>
                        <option> User 4 </option>
                    </select>
                    <br>
                    <br>
                    <input type ="submit" value="Submit" />
                </form>
            </div>
        </div>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    </body>
</html>
