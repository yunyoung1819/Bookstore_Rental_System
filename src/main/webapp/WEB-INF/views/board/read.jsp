<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<%@include file="../include/header.jsp" %>

 <%@include file="../include/footer.jsp" %>
 <!-- All Jquery -->
    <!-- ============================================================== -->
    <script src="<c:url value="/resources/assets/libs/jquery/dist/jquery.min.js" />"></script>
    
    <!-- Bootstrap tether Core JavaScript -->
    <script src="<c:url value="/resources/assets/libs/popper.js/dist/umd/popper.min.js" />"></script>

    <script src="<c:url value="/resources/assets/libs/bootstrap/dist/js/bootstrap.min.js" />"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="<c:url value="/resources/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js" />"></script>
    <script src="<c:url value="/resources/assets/extra-libs/sparkline/sparkline.js" />"></script>

    <!--Wave Effects -->
    <script src="<c:url value="/resources/dist/js/waves.js" />"></script>
    <!--Menu sidebar -->
    <script src="<c:url value="/resources/dist/js/sidebarmenu.js" />"></script>
    <!--Custom JavaScript -->
    <script src="<c:url value="/resources/dist/js/custom.min.js" />"></script>
    <!-- this page js -->
    <script src="<c:url value="/resources/assets/extra-libs/multicheck/datatable-checkbox-init.js" />"></script>
    <script src="<c:url value="/resources/assets/extra-libs/multicheck/jquery.multicheck.js" />"></script>
    <script src="<c:url value="/resources/assets/extra-libs/DataTables/datatables.min.js" />"></script>
    <script>
        /****************************************
         *       Basic Table                   *
         ****************************************/
        $('#zero_config').DataTable();
    </script>

</body>

</html>