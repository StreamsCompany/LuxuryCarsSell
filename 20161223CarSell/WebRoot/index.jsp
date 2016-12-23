<i><%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="css/zzsc.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script src="js/jquery-1.8.2.min.js"></script>
<script src="js/plugins.js"></script>
<script src="js/scripts.js"></script>
<style type="text/css">
#head {
	height: 120px;
    /* border: 1px solid red;  */
    
	margin: 0px auto;
}

#bar {
	height: 45px;
	background-color: #990000;
	border: 1px sold red;
}

#bar a {
	font-size: 20px;
	color: white;
	font-family: "微软雅黑";
	line-height: 45px;
	text-decoration: none;
}

#bar a:hover {
	color: black;
}

#one a {
	display: block;
	/*	    border: 1px solid red;*/
	width: 70px;
	height: 90px;
	float: left;
	text-align: center;
	padding-bottom: 0px;
	text-decoration: none;
	font-family: "微软雅黑";
	color: black;
}

#one a:hover {
	color: orange;
}

#one a img {
	margin-bottom: auto auto;
}

#two a {
	text-decoration: none;
	color: black;
	font-family: "微软雅黑";
}

#two a:hover {
	color: orange;
}

//
图片轮播
	body,ul,li,p {
	margin: 0;
	padding: 0;
}

ul {
	list-style-type: none;
}

body {
	font-family: "Times New Roman", Times, serif;
}

#box {
	position: absolute;
	width: 930px;
	height: 400px;
	left: 480px;
	top: 265px;
}

#box .imgList {
	position: relative;
	width: 930px;
	height: 4000px;
	overflow: hidden;
}

#box .imgList li {
	position: absolute;
	top: 0;
	left: 0;
	width: 930px;
	height: 400px;
}

#box .countNum {
	position: absolute;
	right: 0;
	bottom: 5px;
}

#box .countNum li {
	width: 20px;
	height: 20px;
	float: left;
	color: #fff;
	border-radius: 20px;
	background: #f90;
	text-align: center;
	margin-right: 5px;
	cursor: pointer;
	opacity: 0.7;
	filter: alpha(opacity =   70);
}

#box .countNum li.current {
	background: #f60;
	font-weight: bold;
	opacity: 1;
	filter: alpha(opacity =   70);
}
-->

    //登录和注册窗口的蒙版
   
			p {
				margin: 0;
				padding: 0;
				text-align: center;
				font: normal 14px/180% Tahoma, sans-serif;
			}
			
			#loginBox {
				margin: 0 auto;
				padding: 0px;
				text-align: left;
				width: 550px;
				height: 660px;
				background: white;
				font-size: 9pt;
				border: 1px solid #990000;
				overflow: hidden;
				filter: alpha(opacity=90);
				opacity: 0.9;
			}
			
			#loginBox .title {
				text-align: left;
				padding-left: 10px;
				font-size: 11pt;
				border-bottom: 1px solid #829AFF;
				height: 25px;
				line-height: 25px;
				cursor: move;
				background-color: #990000;
			}
			
			#loginBox .t1 {
				font-family: "微软雅黑";
				float: left;
				font-weight: bold;
				color: white;
				text-decoration: none;
			}
			
			#loginBox .t2 {
				float: right;
				text-align: center;
				line-height: 18px;
				height: 18px;
				width: 18px;
				margin-top: 3px;
				margin-right: 2px;
				overflow: hidden;
				border: 1px solid #FF5889;
				background: #FFE0E9;
				cursor: pointer;
			}
			
			#loginBox .login {
				text-align: center;
				width: 100%;
				height: 100%;
			}
			input{
				height: 25px;
				border: 1px solid #990000;
				text-align: left;
				line-height: 40px;
			}
			input.submit {
				float: right;
				border: 1px solid #829AFF;
				FONT-SIZE: 9pt;
				background: #EAEEFF;
				HEIGHT: 20px;
				margin-top: 5px;
				margin-right: 70px;
			}
			
			#bgDiv {
				width: 100%;
				height: 100%;
				position: absolute;
				top: 0px;
				left: 0px;
				right: 0px;
				background-color: #777;
				filter: progid: DXImageTransform.Microsoft.Alpha(style=3, opacity=25, finishOpacity=75) filter: alpha(opacity=70);
				opacity: 0.7;
			}
			form{
				font-family: "微软雅黑";
				font-size: 15px;
				line-height: 40px;
				text-align: left;
			}
			#loginex{				
				width: 280px;
				height: 40px;
				margin-left: 150px;
			}
			
			
	/* 登录界面 */
	* {
            box-sizing: border-box;
        }
        .wrap {
            width: 50%;
            height: 400px;
            padding: 40px;
            position: fixed;
            top: 50%;
            left: 25%;
            margin-top: -200px;
            opacity: 0.8;
            background: linear-gradient(to bottom right,#990000,#990000);
            background: -webkit-linear-gradient(to bottom right,#990000,#990000);
        }
        .container {
            width: 60%;
            margin: 0 auto;
        }
        .container h1 {
            text-align: center;
            color: #FFFFFF;
            font-weight: 500;
        }
        .container input {
            width: 320px;
            display: block;
            height: 36px;
            border: 0;
            outline: 0;
            padding: 6px 10px;
            line-height: 24px;
            margin: 32px auto;
            -webkit-transition: all 0s ease-in 0.1ms;
            -moz-transition: all 0s ease-in 0.1ms;
            transition: all 0s ease-in 0.1ms;
        }
        .container input[type="text"] , .container input[type="password"]  {
            background-color: #FFFFFF;
            font-size: 16px;
            color: #50a3a2;
        }
        .container input[type='submit'] {
            font-size: 16px;
            letter-spacing: 2px;
            color: #666666;
            background-color: #FFFFFF;
        }
        .container input:focus {
            width: 400px;
        }
        .container input[type='submit']:hover {
            cursor: pointer;
            width: 400px;
        }

        .wrap ul {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: -10;
        }
        .wrap ul li {
            list-style-type: none;
            display: block;
            position: absolute;
            bottom: -120px;
            width: 15px;
            height: 15px;
            z-index: -8;
            background-color:rgba(255, 255, 255, 0.15);
            animotion: square 25s infinite;
            -webkit-animation: square 25s infinite;
        }
        .wrap ul li:nth-child(1) {
            left: 0;
            animation-duration: 10s;
            -moz-animation-duration: 10s;
            -o-animation-duration: 10s;
            -webkit-animation-duration: 10s;
        }
        .wrap ul li:nth-child(2) {
            width: 40px;
            height: 40px;
            left: 10%;
            animation-duration: 15s;
            -moz-animation-duration: 15s;
            -o-animation-duration: 15s;
            -webkit-animation-duration: 15s;
        }
        .wrap ul li:nth-child(3) {
            left: 20%;
            width: 25px;
            height: 25px;
            animation-duration: 12s;
            -moz-animation-duration: 12s;
            -o-animation-duration: 12s;
            -webkit-animation-duration: 12s;
        }
        .wrap ul li:nth-child(4) {
            width: 50px;
            height: 50px;
            left: 30%;
            -webkit-animation-delay: 3s;
            -moz-animation-delay: 3s;
            -o-animation-delay: 3s;
            animation-delay: 3s;
            animation-duration: 12s;
            -moz-animation-duration: 12s;
            -o-animation-duration: 12s;
            -webkit-animation-duration: 12s;
        }
        .wrap ul li:nth-child(5) {
            width: 60px;
            height: 60px;
            left: 40%;
            animation-duration: 10s;
            -moz-animation-duration: 10s;
            -o-animation-duration: 10s;
            -webkit-animation-duration: 10s;
        }
        .wrap ul li:nth-child(6) {
            width: 75px;
            height: 75px;
            left: 50%;
            -webkit-animation-delay: 7s;
            -moz-animation-delay: 7s;
            -o-animation-delay: 7s;
            animation-delay: 7s;
        }
        .wrap ul li:nth-child(7) {
            left: 60%;
            animation-duration: 8s;
            -moz-animation-duration: 8s;
            -o-animation-duration: 8s;
            -webkit-animation-duration: 8s;
        }
        .wrap ul li:nth-child(8) {
            width: 90px;
            height: 90px;
            left: 70%;
            -webkit-animation-delay: 4s;
            -moz-animation-delay: 4s;
            -o-animation-delay: 4s;
            animation-delay: 4s;
        }
        .wrap ul li:nth-child(9) {
            width: 100px;
            height: 100px;
            left: 80%;
            animation-duration: 20s;
            -moz-animation-duration: 20s;
            -o-animation-duration: 20s;
            -webkit-animation-duration: 20s;
        }
        .wrap ul li:nth-child(10) {
            width: 120px;
            height: 120px;
            left: 90%;
            -webkit-animation-delay: 6s;
            -moz-animation-delay: 6s;
            -o-animation-delay: 6s;
            animation-delay: 6s;
            animation-duration: 30s;
            -moz-animation-duration: 30s;
            -o-animation-duration: 30s;
            -webkit-animation-duration: 30s;
        }

        @keyframes square {
            0%  {
                    -webkit-transform: translateY(0);
                    transform: translateY(0)
                }
            100% {
                    bottom: 400px;
                    transform: rotate(600deg);
                    -webit-transform: rotate(600deg);
                    -webkit-transform: translateY(-500);
                    transform: translateY(-500)
            }
        }
        @-webkit-keyframes square {
            0%  {
                -webkit-transform: translateY(0);
                transform: translateY(0)
            }
            100% {
                bottom: 400px;
                transform: rotate(600deg);
                -webit-transform: rotate(600deg);
                -webkit-transform: translateY(-500);
                transform: translateY(-500)
            }
        }
       /* 注册界面的特效 */
        .wrapone {
            width: 50%;
            height: 760px;
            padding: 40px;
            position: fixed;
            top: 220px;
            left: 25%;
            margin-top: -200px;
            opacity: 0.8;
            background: linear-gradient(to bottom right,#990000,#990000);
            background: -webkit-linear-gradient(to bottom right,#990000,#990000);
        }
         .wrapone ul {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: -10;
        }
        .wrapone ul li {
            list-style-type: none;
            display: block;
            position: absolute;
            bottom: -120px;
            width: 15px;
            height: 15px;
            z-index: -8;
            background-color:rgba(255, 255, 255, 0.15);
            animotion: square 25s infinite;
            -webkit-animation: square 25s infinite;
        }
        .wrapone ul li:nth-child(1) {
            left: 0;
            animation-duration: 10s;
            -moz-animation-duration: 10s;
            -o-animation-duration: 10s;
            -webkit-animation-duration: 10s;
        }
        .wrapone ul li:nth-child(2) {
            width: 40px;
            height: 40px;
            left: 10%;
            animation-duration: 15s;
            -moz-animation-duration: 15s;
            -o-animation-duration: 15s;
            -webkit-animation-duration: 15s;
        }
        .wrapone ul li:nth-child(3) {
            left: 20%;
            width: 25px;
            height: 25px;
            animation-duration: 12s;
            -moz-animation-duration: 12s;
            -o-animation-duration: 12s;
            -webkit-animation-duration: 12s;
        }
        .wrapone ul li:nth-child(4) {
            width: 50px;
            height: 50px;
            left: 30%;
            -webkit-animation-delay: 3s;
            -moz-animation-delay: 3s;
            -o-animation-delay: 3s;
            animation-delay: 3s;
            animation-duration: 12s;
            -moz-animation-duration: 12s;
            -o-animation-duration: 12s;
            -webkit-animation-duration: 12s;
        }
        .wrapone ul li:nth-child(5) {
            width: 60px;
            height: 60px;
            left: 40%;
            animation-duration: 10s;
            -moz-animation-duration: 10s;
            -o-animation-duration: 10s;
            -webkit-animation-duration: 10s;
        }
        .wrapone ul li:nth-child(6) {
            width: 75px;
            height: 75px;
            left: 50%;
            -webkit-animation-delay: 7s;
            -moz-animation-delay: 7s;
            -o-animation-delay: 7s;
            animation-delay: 7s;
        }
        .wrapone ul li:nth-child(7) {
            left: 60%;
            animation-duration: 8s;
            -moz-animation-duration: 8s;
            -o-animation-duration: 8s;
            -webkit-animation-duration: 8s;
        }
        .wrapone ul li:nth-child(8) {
            width: 90px;
            height: 90px;
            left: 70%;
            -webkit-animation-delay: 4s;
            -moz-animation-delay: 4s;
            -o-animation-delay: 4s;
            animation-delay: 4s;
        }
        .wrapone ul li:nth-child(9) {
            width: 100px;
            height: 100px;
            left: 80%;
            animation-duration: 20s;
            -moz-animation-duration: 20s;
            -o-animation-duration: 20s;
            -webkit-animation-duration: 20s;
        }
        .wrapone ul li:nth-child(10) {
            width: 120px;
            height: 120px;
            left: 90%;
            -webkit-animation-delay: 6s;
            -moz-animation-delay: 6s;
            -o-animation-delay: 6s;
            animation-delay: 6s;
            animation-duration: 30s;
            -moz-animation-duration: 30s;
            -o-animation-duration: 30s;
            -webkit-animation-duration: 30s;
        }
    </style>
<style></style>
<script type="text/javascript">
	X = 3;
	Y = 0;
	divX = 1400;
	divY = 0;
	function Move() {
		divX -= X;
		divY -= Y;

		div1.style.left = divX + "px";
		div1.style.top = divY + "px";

		if (divX <= 150) {
			X = 0;
		}
	}
	setInterval("Move()", 2);

	//图片轮播
	function runImg() {
	}
	runImg.prototype = {
		bigbox : null, //鏈€澶栧眰瀹瑰櫒
		boxul : null, //瀛愬鍣╱l
		imglist : null, //瀛愬鍣╥mg
		numlist : null, //瀛愬鍣╟ountNum
		prov : 0, //涓婃鏄剧ず椤�
		index : 0, //褰撳墠鏄剧ず椤�
		timer : null, //鎺у埗鍥剧墖杞彉鏁堟灉
		play : null, //鎺у埗鑷姩鎾斁
		imgurl : [], //瀛樻斁鍥剧墖
		count : 0, //瀛樻斁鐨勪釜鏁�
		$ : function(obj) {
			if (typeof (obj) == "string") {
				if (obj.indexOf("#") >= 0) {
					obj = obj.replace("#", "");
					if (document.getElementById(obj)) {
						return document.getElementById(obj);
					} else {
						alert("娌℃湁瀹瑰櫒" + obj);
						return null;
					}
				} else {
					return document.createElement(obj);
				}
			} else {
				return obj;
			}
		},
		//鍒濆鍖�
		info : function(id) {
			this.count = this.count <= 5 ? this.count : 5;
			this.bigbox = this.$(id);
			for ( var i = 0; i < 2; i++) {
				var ul = this.$("ul");
				for ( var j = 1; j <= this.count; j++) {
					var li = this.$("li");
					li.innerHTML = i == 0 ? this.imgurl[j - 1] : j;
					ul.appendChild(li);
				}
				this.bigbox.appendChild(ul);
			}
			this.boxul = this.bigbox.getElementsByTagName("ul");
			this.boxul[0].className = "imgList";
			this.boxul[1].className = "countNum";
			this.imglist = this.boxul[0].getElementsByTagName("li");
			this.numlist = this.boxul[1].getElementsByTagName("li");
			for ( var j = 0; j < this.imglist.length; j++) {
				this.alpha(j, 0);
			}
			this.alpha(0, 100);
			this.numlist[0].className = "current";
		},
		//灏佽绋嬪簭鍏ュ彛
		action : function(id) {
			this.autoplay();
			this.mouseoverout(this.bigbox, this.numlist);
		},
		//鍥剧墖鍒囨崲鏁堟灉
		imgshow : function(num, numlist, imglist) {
			this.index = num;
			var pralpha = 100;
			var inalpha = 0;
			for ( var i = 0; i < numlist.length; i++) {
				numlist[i].className = "";
			}
			numlist[this.index].className = "current";
			clearInterval(this.timer);
			for ( var j = 0; j < this.imglist.length; j++) {
				this.alpha(j, 0);
			}
			this.alpha(this.prov, 100);
			this.alpha(this.index, 0);
			var $this = this;
			//鍒╃敤閫忔槑搴︽潵瀹炵幇鍒囨崲鍥剧墖
			this.timer = setInterval(function() {
				inalpha += 2;
				pralpha -= 2;
				if (inalpha > 100) {
					inalpha = 100
				}
				; //涓嶈兘澶т簬100
				if (pralpha < 0) {
					pralpha = 100
				}
				;
				//涓哄吋瀹规€ц祴鏍峰紡
				$this.alpha($this.prov, pralpha);
				$this.alpha($this.index, inalpha);
				if (inalpha == 100 && pralpha == 0) {
					clearInterval($this.timer)
				}
				; //褰撶瓑浜�100鐨勬椂鍊欏氨鍒囨崲瀹屾垚浜�
			}, 20) //缁忔祴璇�20鏄垜璁や负鏈€鍚堥€傜殑鍊�
		},
		//璁剧疆閫忔槑搴�
		alpha : function(i, opacity) {
			this.imglist[i].style.opacity = opacity / 100;
			this.imglist[i].style.filter = "alpha(opacity=" + opacity + ")";
		},
		//鑷姩鎾斁
		autoplay : function() {
			var $this = this;
			this.play = setInterval(function() {
				$this.prov = $this.index;
				$this.index++;
				if ($this.index > $this.imglist.length - 1) {
					$this.index = 0
				}
				;
				$this.imgshow($this.index, $this.numlist, $this.imglist);
			}, 2000)
		},
		//澶勭悊榧犳爣浜嬩欢
		mouseoverout : function(box, numlist) {
			var $this = this;
			box.onmouseover = function() {
				clearInterval($this.play);
			}
			box.onmouseout = function() {
				$this.autoplay($this.index);
			}
			for ( var i = 0; i < numlist.length; i++) {
				numlist[i].index = i;
				numlist[i].onmouseover = function() {
					$this.prov = $this.index;
					$this.imgshow(this.index, $this.numlist, $this.imglist);
				}
			}
		}
	}
	window.onload = function() {
		var runimg = new runImg();
		runimg.count = 5;
		runimg.imgurl = [ "<img src= img/1.png />", "<img src= img/2.png />",
				"<img src= img/3.png />", "<img src= img/4.png />",
				"<img src= img/5.png />", ];
		runimg.info("#box");
		runimg.action("#box");
	}
	-->
	//logo延時顯示
	$(function(){
		setTimeout(function(){
			$("div2").show();
		},2000);
	})
</script>
</head>

<body>
	<div id="head">
		<div id="div1" style=" width: 272px;height: 100px;  position: absolute;float: left;left: 1400px;margin-bottom: 5px">
			<img src="img/logoone.jpg">
		</div>
		<div id="div2" style="height: 125px;height: 855px;position: absolute;left: 430px">
			<img src="img/logo.png">
		</div>
	</div>
	<div id="bar">
		<div style="height: 45px;width: 80px;margin-left: 162px;display: inline;">
			<a href="#">首页</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">我要买车</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">我要卖车</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">保障服务</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">零配件专区</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">保障服务</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">二手车问答专区</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">APP下载</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 25px;display: inline;">
			<a href="#">豪车之家</a>
		</div>
		<div style="height: 45px;width: 100px;margin-left: 200px;display: inline;">
			<a href="javascript:" onClick="bgDiv.style.display='';wrap.style.display='';">登录</a> <font size="4" color="white">/</font> <a href="javascript:" onClick="bgDiv.style.display='';wrapone.style.display='';">注册</a>
		</div>
	</div>
	<div style="width: 1330px;margin: 0px auto;" id="one">
		<a href="#"><img id="one" src="img/01.png">宝马</a> <a href="#"><img id="one" src="img/02.png">奔驰</a> <a href="#"><img id="one" src="img/03.png">奥迪</a> <a href="#"><img id="one" src="img/04.png">捷豹</a>
		<a href="#"><img id="one" src="img/05.png">劳斯莱斯</a> <a href="#"><img id="one" src="img/06.png">迈巴赫</a> <a href="#"><img id="one" src="img/07.png">兰博基尼</a> <a href="#"><img id="one" src="img/08.png">法拉利</a> <a href="#"><img id="one" src="img/09.png">玛莎拉蒂</a> <a href="#"><img id="one" src="img/10.png">阿斯顿马丁</a> <a href="#"><img id="one" src="img/11.png">帕加尼</a> <a href="#"><img id="one" src="img/12.png">凯迪拉克</a> <a href="#"><img id="one" src="img/13.png">林肯</a> <a href="#"><img id="one" src="img/14.png">英菲尼迪</a>
		<a href="#"><img id="one" src="img/15.png">布加迪</a> <a href="#"><img id="one" src="img/16.png">科尼塞克</a> <a href="#"><img id="one" src="img/17.png">保时捷</a> <a href="#"><img id="one" src="img/18.png">雷克萨斯</a> <a href="#"><img id="one" src="img/19.png">路虎</a>
	</div>
	<div style="height: 204px;width: 57px;position:fixed ;right: 20px;">
		<a href="#"><img src="img/sell.png"></a>
	</div>
	<div style="height: 75px;width: 350px;position: absolute;top: 265px;left: 125px;background: #D8D8D7" id="two">
		<p style="margin-left: 20px;font-family:'微软雅黑';">价格</p>

		&nbsp; &nbsp; &nbsp;<a href="#">20万-70万</a>&nbsp;&nbsp;&nbsp; &nbsp; <a href="#">70万-150万</a>&nbsp;&nbsp; &nbsp; &nbsp; <a href="#">150万以上</a>&nbsp;&nbsp;
	</div>
	<div style="height: 75px;width: 350px;position: absolute;top: 340px;left: 125px;background: #D8D8D7" id="two">
		<p style="margin-left: 20px;font-family:'微软雅黑';">车型</p>
		&nbsp; &nbsp; &nbsp;<a href="#">SUV</a>&nbsp;&nbsp; &nbsp; <a href="#">轿车</a>
		&nbsp;&nbsp; &nbsp; <a href="#">跑车</a>&nbsp;&nbsp; &nbsp; <a href="#">MPV</a>
	</div>
	<div id="box"></div>
	<div style="width: 350px;height: 249px;position: absolute;top: 420PX;left: 125PX">
		<img src="img/fan.png">
	</div>
	<div style="height: 78px;width: 1191px;position: absolute;left: 125px;top: 675px;">
	  <img src="img/bar.png">
	</div>
	<div style="width: 1287px;height: 60px;position: absolute;left: 125px;top: 760px"><p style="font-family:'微软雅黑';font-size: 20px ">精选豪车</p></div>
	<div style="height: 1000px;width: 1287px;border: 1px solid red;position: absolute;left: 125px;top: 820px">
	</div>
	<!-- //精选豪车赏析 -->
	<div style="position: absolute;top:1820px;left: 125px;width: 230px;height: 40px;">
	    <a> <img alt="" src="img/jx.png"></a>
	</div>
	<!-- //动态效果图 -->
	 <div id="gallery-container" style="border: 1px solid blue;position: absolute;top:1864px;left: 125px;width: 1287px;background-color: black; ">
    
    <ul class="items--small">
      <li class="item"><a href="#"><img src="images/small-1.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-2.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-3.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-4.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-5.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-6.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-7.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-8.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-9.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-10.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-11.png" alt=""></a></li>
      <li class="item"><a href="#"><img src="images/small-12.png" alt=""></a></li>
    </ul>
    <ul class="items--big">
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-1.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-2.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-3.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-4.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-5.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-6.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-7.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-8.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-9.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-10.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-11.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
      <li class="item--big">
        <a href="#">
          <figure>
            <img src="images/big-12.png" alt="">
            <figcaption class="img-caption">
              Caption
            </figcaption>
          </figure>
          </a>
      </li>
    </ul>
    <div class="controls">
      <span class="control icon-arrow-left" data-direction="previous"></span> 
      <span class="control icon-arrow-right" data-direction="next"></span> 
      <span class="grid icon-grid"></span>
      <span class="fs-toggle icon-fullscreen"></span>
    </div>
  </div>
  <!-- 登录或注册蒙版 -->
  <div id="bgDiv" style="display:none;">
		</div>
   <div class="wrapone" style="display: none;" id="wrapone">
        <div class="container">
            <h1>注册账号</h1>
            <form>
                <input type="text" placeholder="用户名">
                <input type="text" placeholder="电话号码">
      	          <input type="password" placeholder="密码">
                <input type="password" placeholder="确认密码">
                <input type="text" placeholder="姓名">
                <input type="text" placeholder="身份证">
                <input type="text" placeholder="地址">
                <input type="submit" value="登录">
                <input type="button" value="返回" onclick="wrapone.style.display='none';bgDiv.style.display='none'">
            </form>
        </div>
        <ul>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
		<div class="wrap" style="display: none;" id="wrap">
        <div class="container">
        
            <h1>欢迎您来到二手豪车网</h1>
            <form>
                <input type="text" placeholder="用户名">
                <input type="password" placeholder="密码">
                <input type="submit" value="登录">
                <input type="button" value="返回" onclick="wrap.style.display='none';bgDiv.style.display='none'">
            </form>
        </div>
        <ul>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
		<script type="text/javascript">
			var IsMousedown, LEFT, TOP, S;
			document.getElementById("Mdown").onmousedown = function(e) {
				S = document.getElementById("login");
				IsMousedown = true;
				e = e || event;
				LEFT = e.clientX - parseInt(S.style.left);
				TOP = e.clientY - parseInt(S.style.top);
				document.body.onmousemove = function(e) {
					e = e || event;
					if(IsMousedown) {
						S.style.left = e.clientX - LEFT + "px";
						S.style.top = e.clientY - TOP + "px";
					}
				}
				document.onmouseup = function() {
					IsMousedown = false;
				}
			}
			</script>
<script type="text/javascript">
    $(document).ready(function(){
     $('#gallery-container').sGallery({
        fullScreenEnabled: true
      });
    });
</script>
</body>
</html>
</i>