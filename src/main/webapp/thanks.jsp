<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:import url="/includes/header.html" /> 
<div class="survey-container lbl-thanks"> 
    <h1>Thanks for joining our survey</h1>

    <p>Here is the information that you entered:</p>

    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>Date of Birth:</label>
    <span>${user.dateOfBirth}</span><br>
    <label>Heard From:</label>
    <span>${user.heardFrom}</span><br>
    <label>Contact for Offers:</label>
    <span>${user.wantAnnouncements}</span><br>
    <label>Send Email Announcements:</label>
    <span>${user.wantSendEmail}</span><br>
    <label>Preferred Contact:</label>
    <span>${user.contactMethod}</span><br>
    <p>To enter another email address, click on the Back 
        button in your browser or the Return button shown 
        below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</div>
<c:import url= "/includes/footer.jsp" /> 
