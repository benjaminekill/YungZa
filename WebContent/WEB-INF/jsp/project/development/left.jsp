<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="org.springframework.security.core.AuthenticationException"%>
<%@ page import="com.buckwa.domain.project.*" %>
<%@ page import="java.util.*" %>
 
<div class="subTopicHeaderNoBorder"> 
 	Project :<c:out value="${project.projectName}"/>  
 <table height="100px;">
 	 <tr>
 	<td><div class="businessRuleHeaderTxt"> <img src="<c:url value="/images/icon_sub.gif"/>"/>&nbsp;
 		<a href="<%=request.getContextPath()%>/project/requirement/util/init.htm?type=D">80%</a>
 	</div></td>
 	</tr> 	
 	
  	 <tr>
 	<td><div class="businessRuleHeaderTxt"> <img src="<c:url value="/images/icon_sub.gif"/>"/>&nbsp;
 		<a href="<%=request.getContextPath()%>/project/requirement/util/init.htm?type=N">Cost: 45,600</a>
 	</div></td>
 	</tr> 
 	<tr>
 	<td><div class="businessRuleHeaderTxt"> <img src="<c:url value="/images/icon_sub.gif"/>"/>&nbsp;
 		<a href="<%=request.getContextPath()%>/project/requirement/message/init.htm?type=S">Pay:23,234</a>
 	</div></td>
 	</tr>
 	 
 	<tr>
 	<td><div class="businessRuleHeaderTxt"> <img src="<c:url value="/images/icon_sub.gif"/>"/>&nbsp;
 		<a href="<%=request.getContextPath()%>/project/development/initSoftwareAndTool.htm">Software and Tool</a>
 	</div></td>
 	</tr>
  	<tr>
 	<td><div class="businessRuleHeaderTxt"> <img src="<c:url value="/images/icon_sub.gif"/>"/>&nbsp;
 		<a href="<%=request.getContextPath()%>/project/development/initDeployment.htm">Deployment</a>
 	</div></td>
 	</tr>	  
 </table>
 
  </div>
 
 
