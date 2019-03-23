<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<%@include file="../include/header.jsp" %>
        <!-- ============================================================== -->
        <!-- Page wrapper  -->
        <!-- ============================================================== -->
        <div class="page-wrapper">
            <!-- ============================================================== -->
            <!-- Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <div class="page-breadcrumb">
                <div class="row">
                    <div class="col-12 d-flex no-block align-items-center">
                        <h4 class="page-title"> 자유 게시판 </h4>
                        <div class="ml-auto text-right">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active" aria-current="page"> 자유 게시판 </li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End Bread crumb and right sidebar toggle -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Container fluid  -->
            <!-- ============================================================== -->
            <div class="container-fluid">
                <!-- ============================================================== -->
                <!-- Start Page Content -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-12">     
                        <div class="card">
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th style="width:10px">BNO</th>
                                                <th>TITLE</th>
                                                <th>WRITER</th>
                                                <th>REGDATE</th>
                                                <th>VIEW CNT</th>
                                            </tr>
                                        </thead>
                                        
                                        <tbody>
                                        <c:forEach items="${list}" var="boardVO">
                                            <tr>
                                                <td>${boardVO.bno}</td>
                                                <td><a href='/board/read?bno=${boardVO.bno}'>${boardVO.title}</a></td>
                                                <td>${boardVO.writer}</td>
                                                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}"/></td>
                                                <td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
                                            </tr>
                                        </c:forEach>                                    
                                        </tbody>                                     
                                    </table>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- End PAge Content -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- Right sidebar -->
                <!-- ============================================================== -->
                <!-- .right-sidebar -->
                <!-- ============================================================== -->
                <!-- End Right sidebar -->
                <!-- ============================================================== -->
            </div>
            <!-- ============================================================== -->
            <!-- End Container fluid  -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <%@include file="../include/footer.jsp" %>
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- End Page wrapper  -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- End Wrapper -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
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