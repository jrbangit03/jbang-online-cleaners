<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

<table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Cleaner Name</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
             <c:forEach items="${cleaners}" var="cleaners">
                    <tr>
                        <td>${cleaners.cleaner_id}</td>
                        <td>${cleaners.cleaner_fn}</td>
                        <td>${cleaners.cleaner_age}</td>
                    </tr>
               </c:forEach>
            </tbody>
        </table>


</body>
</html>