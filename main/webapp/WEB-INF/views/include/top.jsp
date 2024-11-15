<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="header">
  <div class="header_10">
    <h2>KimTeacher Lap</h2>
    <h5>Programers</h5>
  </div>
  <div class="header_20">
    <!--<form>
             <input type="text" name="searchword" size="70">
             <input type="submit" value="Search">
         </form>-->
 </div>
 <div id="userinfo">
   <div>
     <p><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bug"
         viewBox="0 0 16 16">
         <path
           d="M4.355.522a.5.5 0 0 1 .623.333l.291.956A4.979 4.979 0 0 1 8 1c1.007 0 1.946.298 2.731.811l.29-.956a.5.5 0 1 1 .957.29l-.41 1.352A4.985 4.985 0 0 1 13 6h.5a.5.5 0 0 0 .5-.5V5a.5.5 0 0 1 1 0v.5A1.5 1.5 0 0 1 13.5 7H13v1h1.5a.5.5 0 0 1 0 1H13v1h.5a1.5 1.5 0 0 1 1.5 1.5v.5a.5.5 0 1 1-1 0v-.5a.5.5 0 0 0-.5-.5H13a5 5 0 0 1-10 0h-.5a.5.5 0 0 0-.5.5v.5a.5.5 0 1 1-1 0v-.5A1.5 1.5 0 0 1 2.5 10H3V9H1.5a.5.5 0 0 1 0-1H3V7h-.5A1.5 1.5 0 0 1 1 5.5V5a.5.5 0 0 1 1 0v.5a.5.5 0 0 0 .5.5H3c0-1.364.547-2.601 1.432-3.503l-.41-1.352a.5.5 0 0 1 .333-.623zM4 7v4a4 4 0 0 0 3.5 3.97V7H4zm4.5 0v7.97A4 4 0 0 0 12 11V7H8.5zM12 6a3.989 3.989 0 0 0-1.334-2.982A3.983 3.983 0 0 0 8 2a3.983 3.983 0 0 0-2.667 1.018A3.989 3.989 0 0 0 4 6h8z" />
       </svg> 		<!-- jstl: if ~ else if -->
       <span id="kk">현재사용자 : 
        <c:choose>		
        	<c:when test="${id != null}">
        		${id }님 로그인<a href="logout">[로그아웃]</a>
        	</c:when>
        	<c:otherwise>
        		GUEST
        	</c:otherwise>
        </c:choose>
       </span></p>
   </div>
 </div>

 <style>
   li {
     color: white;
   }
 </style>
</div>
<div id="nav">
  <nav class="navbar navbar-expand-lg " style="background-color: #89bce6;">
   <div class="container-fluid">
     <a class="navbar-brand" href="#"></a>
     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
       aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="navbarSupportedContent">
       <ul class="navbar-nav me-auto mb-2 mb-lg-0">
         <li class="nav-item">
           <a class="nav-link active" aria-current="page" href="#"> </a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="./index.html">Home</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="#">Lecture</a>
         </li>
         <li class="nav-item dropdown">
           <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
             aria-expanded="false">
             Study
           </a>
           <ul class="dropdown-menu">
             <li><a class="dropdown-item" href="./java.html">java</a></li>
             <li><a class="dropdown-item" href="#">Another action</a></li>
             <li>
               <hr class="dropdown-divider">
             </li>
             <li><a class="dropdown-item" href="#">Something else here</a></li>
           </ul>
         </li>
         <li class="nav-item">
           <a class="nav-link active" aria-current="page" href="board">게시판</a>
         </li>
         <li class="nav-item">
           <a class="nav-link active" aria-current="page" href="#">뉴스</a>
         </li>
         <li class="nav-item">
           <a class="nav-link active" aria-current="page" href="#">취업정보</a>
         </li>
       </ul>
       <form class="d-flex" role="search">
         <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
         <button class="btn btn-outline-success" type="submit">Search</button>
       </form>
     </div>
   </div>
 </nav>

 <!--      <ul>
         <li><div class="dropdown">
             <button id="btn01">Laps</button>
             <div class="dropdown-options">
               <a href="#">Dashboard</a>
               <a href="#">Setting</a>
               <a href="#">Logout</a>
             </div>
           </div>
         </li>
         <li><div class="dropdown">
             <button id="btn02">DataBase</button>
             <div class="dropdown-options">
               <a href="#">Dashboar2d</a>
               <a href="#">Setting2</a>
               <a href="#">Logou2t</a>
             </div>
           </div>
         </li>
         <li><div class="dropdown">
             <button id="btn03">FrontEnd</button>
             <div class="dropdown-options">
               <a href="#">Dashboard</a>
               <a href="#">Setting</a>
               <a href="#">Logout</a>
             </div>
           </div>
         </li>
         <li><div class="dropdown">
             <button id="btn04">BackEnd</button>
             <div class="dropdown-options">
               <a href="#">Dashboard</a>
               <a href="#">Setting</a>
               <a href="#">Logout</a>
             </div>
           </div>
         </li>
         <li><div class="dropdown">
             <button id="btn05">Lecture</button>
             <div class="dropdown-options">
               <a href="#">Dashboard</a>
               <a href="#">Setting</a>
               <a href="#">Logouts</a>
             </div>
           </div>
         </li>
     </ul>
 -->
 </div>