<%@page import="com.buckwa.util.BuckWaDateUtils"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="semester" action="create.htm" method="POST" name="mainForm">  
<div class="post">
	<h2 class="title">เทอมการศึกษา > สร้าง </h2>
	<div class="entry">
		<table width="100%">
			<tr>
				<td class="label-form">ปีการศึกษา:</td>
				<td>
					<%= Integer.parseInt(request.getParameter("yearId")) + 543 %>
				</td>
			</tr>
			<tr>
				<td class="label-form">ภาคเรียนที่:</td>
				<td>
					<select id="semesterList" name="name">
						<option value="1">1</option>
						<option value="2">2</option>
					</select>
				</td>
			</tr>
			<tr>
				<td class="label-form">วันที่เริ่ม:</td>
				<td>
					<form:input cssClass="input" path="startDateStr" id="startDate" readonly="true" />
					<span class="require">*</span>
					<form:errors path="startDateStr" cssClass="require" />
				</td>
			</tr>
			<tr>
				<td class="label-form">วันที่สิ้นสุด:</td>
				<td>
					<form:input cssClass="input" path="endDateStr" id="endDate" readonly="true" />
					<span class="require">*</span>
					<form:errors path="endDateStr" cssClass="require" />
				</td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td></td>
				<td align="left">
					<input value="<spring:message code="label.button.save"/>" class="btn btn-primary" type="submit" >
					<input class="btn btn-primary" value="<spring:message code="label.button.back"/>" type="button" onclick="init();">
				</td>
			</tr>
		</table>
<%-- 		<input id="yearId" value="${semester.yearId}"/> --%>
		<form:input path="yearId" id="yearId"  value="${semester.yearId}" style="display:none;"/>
	</div>
</div>	
</form:form>	
 
<script type="text/javascript">
	function init (){
		window.location = "<%=request.getContextPath()%>/admin/semester/initByYear.htm?yearId=${semester.yearId}";
	}
	
	$(document).ready( function() {

		$('#startDate,#endDate').datepicker( {
			showOn : 'both',
			buttonText : 'Choose a date',
			buttonImage : '<c:url value="/images/calendar.jpg"/>',
			buttonImageOnly : true,
			showButtonPanel : true
		});
		$('#startDate,#endDate').datepicker($.datepicker.regional['th']);

	});
</script>
