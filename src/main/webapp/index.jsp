<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:import url="/includes/header.html" /> 
<div class="survey-container"> 
    <img class="logo" src="images/murachlogo.jpg" alt="Murach Logo" width="100">
    <h1>Survey</h1>
    <p>If you have a moment, we'd appreciate it if you would fill out this servey.</p>
    <h1>Join our email list</h1>
    <p>To join our email list, enter your name and email address below.</p>
    <p style="color: red;"> <i>${message}</i> </p>
    <!--post: data gan vao body, get: data gan vao header -->
    <form action="emailList " method="get" class="lbl-index"> 
        <input type="hidden" name="action" value="add">

        <label><b>First Name</b></label>
        <input type="text" name="firstName"><br>

        <label><b>Last Name</b></label>
        <input type="text" name="lastName"><br>

        <label><b>Email</b></label>
        <input type="email" name="email"><br>

        <label><b>Date of Birth</b></label>
        <input type="text" name="dateOfBirth"><br>

        <h1>How did you hear about us?</h1>

        <input type="radio" name="heardFrom" value="Search engine" checked> Search engine

        <input type="radio" name="heardFrom" value="Word of mouth"> Word of mouth

        <input type="radio" name="heardFrom" value="Social Media"> Social Media

        <input type="radio" name="heardFrom" value="Other"> Other


        <h1>Would you like to receive announcements about new CDs and special offers?</h1>
        <input type="checkbox" name="wantAnnouncements">YES, I'd like that.<br>
        <input type="checkbox" name="wantSendEmail">YES, please send me email announcements.<br>

        <p style="display: inline-block;">Please contact me by:</p>

        <select name="contactMethod">
            <option value="Email or postal mail" selected>Email or postal mail</option>
            <option value="Email only">Email only</option>
            <option value="Postal mail only">Postal mail only</option>
        </select><br>

        <input type="submit" value="Submit" id="submit">
    </form>
</div>
<c:import url= "/includes/footer.jsp" /> 