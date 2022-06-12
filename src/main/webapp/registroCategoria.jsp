<%-- 
    Document   : registroCategoria
    Created on : 8 jun 2022, 22:13:04
    Author     : lenazu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Categoría</title>
        <%@include file="css.jsp" %>
    </head>
    <body class="no-skin">
        <div id="navbar" class="navbar navbar-default          ace-save-state">
            <div class="navbar-container ace-save-state" id="navbar-container">
                <div class="navbar-header pull-left">
                    <a href="index.jsp" class="navbar-brand">
                        <small>
                            <i class="fa fa-book"></i>
                            CRUD Biblioteca
                        </small>
                    </a>
                </div>
            </div><!-- /.navbar-container -->
        </div>

        <div class="main-container ace-save-state" id="main-container">
            <script type="text/javascript">
                try {
                    ace.settings.loadState('main-container')
                } catch (e) {
                }
            </script>

            <div id="sidebar" class="sidebar                  responsive                    ace-save-state">
                <script type="text/javascript">
                    try {
                        ace.settings.loadState('sidebar')} catch (e) {
                    }
                </script>



                <ul class="nav nav-list">
                    

                    <li class="active open">
                        <a href="#" class="dropdown-toggle">
                            <i class="menu-icon fa fa-book"></i>
                            <span class="menu-text"> Libros </span>

                            <b class="arrow fa fa-angle-down"></b>
                        </a>

                        <b class="arrow"></b>

                        <ul class="submenu">
                            <li class="">
                                <a href="index.jsp">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Lista de Libros
                                </a>

                                <b class="arrow"></b>
                            </li>

                            <li class="">
                                <a href="registroLibro.jsp">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Registrar Libro
                                </a>

                                <b class="arrow"></b>
                            </li>
                            <li class="">
                                <a href="registroEditorial.jsp">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Registrar Editorial
                                </a>

                                <b class="arrow"></b>
                            </li>
                            <li class="active">
                                <a href="registroCategoria.jsp">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    Registrar Categoría
                                </a>

                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </li>

                </ul><!-- /.nav-list -->

                <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
                    <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
                </div>
            </div>

            <div class="main-content">
                <div class="main-content-inner">
                    

                    <div class="page-content">

                        <div class="page-header">
                            <h1>
                                Gestionar los libros
                                <small>
                                    <i class="ace-icon fa fa-angle-double-right"></i>
                                    Registro de Categorias
                                </small>
                            </h1>
                        </div><!-- /.page-header -->

                        <div class="row">
                            <div class="col-xs-12">
                                <!-- PAGE CONTENT BEGINS -->
                                <!-- /.row -->

                                <div class="row">
                                    <div class="col-xs-12">
                                        <div class="table-header">
                                            Registro de Categorias
                                        </div>

                                        <!-- div.table-responsive -->

                                        <!-- div.dataTables_borderWrap -->
                                        <div>
                                            <form action="CategoriaController" method="post" class="form-horizontal">
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Código:
                                                    </label>
                                                
                                                    <div class="col-sm-9 ">
                                                        <input type="text" name="codigo" value="" placeholder="Código de la Categoría" />
                                                    </div>
                                                </div>
                                                
                                                <div class="form-group">
                                                    <label class="col-sm-3 control-label no-padding-right">
                                                        Nombre:
                                                    </label>
                                                
                                                    <div class="col-sm-9 ">
                                                        <input type="text" name="nombre" value="" placeholder="Nombre de la Categoría" />
                                                    </div>
                                                </div>
                                                <button class="btn btn-success" type="submit">
                                                    <i class="fa fa-save"></i>
                                                    Registrar
                                                </button>
                                                
                                                
                                                
                                                <div>
                                                    <%=(request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"") %>
                                                </div>
                                            </form>
                                        </div>


                                    </div><!-- /.modal-content -->
                                </div><!-- /.modal-dialog -->


                                <!-- PAGE CONTENT ENDS -->
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.page-content -->
                </div>
            </div><!-- /.main-content -->

            <div class="footer">
                <div class="footer-inner">
                    <div class="footer-content">
                        <span class="bigger-120">
                            Miguel Nequiz &copy; 2022
                        </span>


                    </div>
                </div>
            </div>

            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>


            <!-- basic scripts -->

            <!--[if !IE]> -->
            <script src="assets/js/jquery-2.1.4.min.js"></script>

            <!-- <![endif]-->

            <!--[if IE]>
<script src="assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
            <script type="text/javascript">
                                if ('ontouchstart' in document.documentElement)
                                    document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
            </script>
            <script src="assets/js/bootstrap.min.js"></script>

            <!-- page specific plugin scripts -->
            <script src="assets/js/jquery.dataTables.min.js"></script>
            <script src="assets/js/jquery.dataTables.bootstrap.min.js"></script>
            <script src="assets/js/dataTables.buttons.min.js"></script>
            <script src="assets/js/buttons.flash.min.js"></script>
            <script src="assets/js/buttons.html5.min.js"></script>
            <script src="assets/js/buttons.print.min.js"></script>
            <script src="assets/js/buttons.colVis.min.js"></script>
            <script src="assets/js/dataTables.select.min.js"></script>

            <!-- ace scripts -->
            <script src="assets/js/ace-elements.min.js"></script>
            <script src="assets/js/ace.min.js"></script>

            
    </body>
</html>

