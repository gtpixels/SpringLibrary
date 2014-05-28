<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.books-resources"/>
<html>
<head>
<title>List <fmt:message key="books.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="books.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newBooks"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="books.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="books.id.title"/></th>
					<th class="thead"><fmt:message key="books.bookname.title"/></th>
					<th class="thead"><fmt:message key="books.author.title"/></th>
					<th class="thead"><fmt:message key="books.qty.title"/></th>
					<th class="thead"><fmt:message key="books.genre.title"/></th>
					<th class="thead"><fmt:message key="books.isbn.title"/></th>
					<th class="thead"><fmt:message key="books.sectionnumber.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bookss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectBooks?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editBooks?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteBooks?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bookName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.author}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.qty}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.genre}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.isbn}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.sectionNumber}
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