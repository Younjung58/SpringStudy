<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

<style>
  body {
    margin: 0px;
    width: 1920px;
    height: 1024px;
  }

  #userinfo {
    display: inline-block;
    width: 1000px;
    height: 50px;
    /*  background-color: aqua;*/
    top: 40px;
    left: 1700px;
    position: absolute;
  }

  #header {
    width: 1920px;
    height: 100px;
    /* background-color: rgb(98, 139, 253);*/
    padding-top: 20px;
    box-sizing: border-box;
    float: left;
    /* display: flex;*/

  }

  .header_20 input[type=text] {
    width: 500px;
    height: 32px;
    font-size: 15px;
    border: solid 1px gray;
    border-radius: 15px;
    outline: none;
    margin-bottom: 10px;
    background-color: rgb(233, 233, 233);
  }

  .header_10 {
    width: 400px;
    height: 40px;
    /* border: 1px solid;*/
    margin: 0px auto;
    text-align: center;
    float: left;
  }

  .header_20 {
    padding-top: 5px;
    width: 1500px;
    height: 40px;
    /* border: 1px solid;*/
    margin: 0px auto;
    text-align: center;
    float: left;
  }

  .header_10 h2 {
    display: inline;
    color: green;
    font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
  }

  #nav {
    width: 1920px;
    height: 60px;
    float: left;
    border-bottom: 1px solid;
    font-size: larger;
  }

  /*
    #nav ul li{
        color:black;
    }
     #nav ul li:hover{
        background-color: aqua;
    } */
  /*   ul {
*/
  /*   border: 1px solid;
        margin-top: 3px;
    }*/
  ul li {
    display: inline-block;
    width: 120px;
    /*   border: 1px solid;*/

  }

  #mainsection {
    width: 80%;
    height: 900px;
    /*  border: 1px dotted;*/
    float: left;
    box-sizing: border-box;
  }

  #mainsection_01 {
    width: 80%;
    height: 300px;
    /*   border: 1px solid;
    /*    background-color: red;*/
    margin: 0px auto;
    text-align: center;
    float: left;
  }

  #asidelogin {
    width: 20%;
    height: 500px;
    /* border: 1px solid;*/
    float: left;
  }

  .subject {
    display: inline-block;
    font-size: larger;
    margin-bottom: 5px;
  }

  #login {
    background-color: darkcyan;
    padding-top: 15px;
    border-radius: 5px;
    box-sizing: border-box;
    color: white;

  }

  #login,
  #loginup,
  #logindown {
    width: 250px;
    height: 50px;
    text-align: center;
    vertical-align: middle;
    margin: 0px auto;

  }

  #loginbox {
    margin-top: 30px;
    box-sizing: border-box;
  }

  #infosection {
    width: 1920px;
    height: 150px;
    /* border: 1px solid;*/
    float: left;
  }

  .infosetion_card {
    width: 360px;
    height: 150px;
    margin-left: 20px;
    /* background-color: yellow;*/
    float: left;
  }

  #footer {
    width: 1920px;
    text-align: center;
    font-size: larger;
    /* border: 1px solid;*/
    float: left;
  }
</style>
<style>
  .dropdown {
    display: inline-block;
    position: relative;
  }

  #btn01,
  #btn02,
  #btn03,
  #btn04,
  #btn05 {
    border: none;
    border-radius: 5px;
    padding: 3px 30px;
    font-size: 18px;
    cursor: pointer;
    display: inline-block;
    background-color: white;
  }

  button:hover {
    background-color: #ddd;
  }

  .dropdown-options {
    display: none;
    position: absolute;
    overflow: auto;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0px 10px 10px 0px rgba(0, 0, 0, 0.4);
  }

  .dropdown:hover .dropdown-options {
    display: block;
  }

  .dropdown-options a {
    display: block;
    color: #000000;
    padding: 5px;
    text-decoration: none;
    padding: 20px 40px;
  }

  .dropdown-options a:hover {
    color: #0a0a23;
    background-color: #ddd;
    border-radius: 5px;
  }
</style>
<style>
  /*boot strap에서 마우스 올려 놓으면 메뉴 자동 펼치기 추가 코드 */
  nav li.dropdown:hover>ul.dropdown-menu {
    display: block;
    margin: 0;
  }
</style>

<body>
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
          </svg> 현재사용자 : Guest</p>
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
              <a class="nav-link active" aria-current="page" href="./bbs.html">게시판</a>
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
  <div id="mainsection">
    <style>
      #mainsection_left {
        /*  display: inline-block;*/
        float: left;
        width: 300px;
        height: 500px;
        /*    border: 1px solid;*/
        padding: 20px 20px 20px 30px;
        box-sizing: border-box;
      }
    </style>
    <div id="mainsection_left">

      <div class="btn-group-vertical" role="group" aria-label="Vertical button group">
        <button type="button" class="btn btn-primary">Button</button>
        <button type="button" class="btn btn-primary">Button</button>
        <div class="btn-group" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
        <div class="btn-group dropstart" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
        <div class="btn-group dropend" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
        <div class="btn-group dropup" role="group">
          <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </button>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
            <li><a class="dropdown-item" href="#">Dropdown link</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div id="mainsection_01">

      <div>
        <div>
          <div class="card text-center">
            <div class="card-body">

              <h5 class="card-title">게시판</h5>
            </div>
          </div>
        </div>
      </div>
      <div id="article_table">
        <table class="table">
          <thead class="table-dark">
            <tr>
              <th scope="col">#</th>
              <th scope="col">First</th>
              <th scope="col">Last</th>
              <th scope="col">Handle</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td>Mark</td>
              <td>Otto</td>
              <td>@mdo</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>Jacob</td>
              <td>Thornton</td>
              <td>@fat</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td colspan="2">Larry the Bird</td>
              <td>@twitter</td>
            </tr>

          </tbody>
        </table>
        <div id="table_menu">
          <a href="bwr">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-file-plus"
            viewBox="0 0 16 16">
            <path d="M8.5 6a.5.5 0 0 0-1 0v1.5H6a.5.5 0 0 0 0 1h1.5V10a.5.5 0 0 0 1 0V8.5H10a.5.5 0 0 0 0-1H8.5V6z" />
            <path
              d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2zm10-1H4a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1z" />
          </svg>
        </a>
        </div>

      </div>
    </div>
  </div>



  <div id="asidelogin">
    <div id="loginbox">
      <div id="loginup">
        KimTeacher Lap에 참여하세요
      </div>
      <div id="login" data-bs-toggle="modal" data-bs-target="#loginModal">
        KimTeacher 로그인
      </div>
      <div id="logindown">
        <br>
        <button type="button" data-bs-toggle="modal" data-bs-target="#exampleModal">
          회원가입
        </button>
        <button type="button">아이디/비빌번호찾기</button>

      </div>
      <style>
        #news {
          border: 1px solid;
          display: inline-block;
          width: 100%;
          height: 300px;
          margin: 0px auto;
          border-radius: 5%;
          border-color: rgb(196, 193, 193);
          background-color: white;
        }

        #talks {
          border: 1px solid;
          display: inline-block;
          width: 100%;
          height: 150px;
          margin: 0px auto;
          border-radius: 5%;
          border-color: rgb(196, 193, 193);
          background-color: white;
        }
      </style>
      <br>
      <div id="news">
        <img src="./img/we.PNG">
      </div>
      <div id="talks">
      </div>
    </div>
    <div>


    </div>
  </div>


  <div id="footer">
    <hr>
    김티처 tel. 010-9407-8767
  </div>
  <!-- Modal -->
  <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5" id="exampleModalLabel">회원가입</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">ID</span>
            <input type="text" class="form-control" placeholder="Username" aria-label="Username"
              aria-describedby="basic-addon1">
          </div>
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">PASS</span>
            <input type="text" class="form-control" placeholder="Pass" aria-label="Username"
              aria-describedby="basic-addon1">
          </div>
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">TEL</span>
            <input type="text" class="form-control" placeholder="tel" aria-label="Username"
              aria-describedby="basic-addon1">
          </div>
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">EMAIL</span>
            <input type="text" class="form-control" placeholder="E-mail" aria-label="Username"
              aria-describedby="basic-addon1">
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Save</button>
          <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Cancel</button>
        </div>
      </div>
    </div>
  </div>
  <div>
    <!-- Modal -->
    <!-- Modal -->
    <div class="modal fade" id="loginModal" tabindex="-1" aria-labelledby="exampleModalLabel1" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="exampleModalLabel1">로그인</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">ID</span>
              <input type="text" class="form-control" placeholder="Username" aria-label="Username"
                aria-describedby="basic-addon1">
            </div>
            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">PASS</span>
              <input type="text" class="form-control" placeholder="Pass" aria-label="Username"
                aria-describedby="basic-addon1">
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">login</button>
              <button type="button" class="btn btn-primary " data-bs-dismiss="modal">Cancel</button>
            </div>
          </div>
        </div>
      </div>
      <div>
        <!-- Modal -->
</body>

</html>