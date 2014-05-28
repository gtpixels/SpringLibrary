<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.member-resources"/>
<html>
<head>
<title>List <fmt:message key="member.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="member.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newMember"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="member.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="member.name.title"/></th>
					<th class="thead"><fmt:message key="member.address.title"/></th>
					<th class="thead"><fmt:message key="member.address2.title"/></th>
					<th class="thead"><fmt:message key="member.town.title"/></th>
					<th class="thead"><fmt:message key="member.contactnumber.title"/></th>
					<th class="thead"><fmt:message key="member.bookallowance.title"/></th>
					<th class="thead"><fmt:message key="member.balance.title"/></th>
					<th class="thead"><fmt:message key="member.active.title"/></th>
					<th class="thead"><fmt:message key="member.id.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${members}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectMember?nameKey=${current.name}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editMember?nameKey=${current.name}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteMember?nameKey=${current.name}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.name}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.address}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.address2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.town}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contactNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bookAllowance}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.balance}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.active}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>