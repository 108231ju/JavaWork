// 배너
$(document).ready(function () {
    var $banner = $("#banner").find("ul");
    var $bannerWidth = $banner.children().outerWidth(); //이미지의 폭
    var $bannerHeight = $banner.children().outerHeight(); // 높이
    var $length = $banner.children().length; //이미지의 갯수
    var rollingId;

    //정해진 초마다 함수 실행
    rollingId = setInterval(function () {
        rollingStart();
    }, 4000); //다음 이미지로 롤링 애니메이션 할 시간차

    function rollingStart() {
        $banner.css("width", $bannerWidth * $length + "px");
        $banner.css("height", $bannerHeight + "px");
        // alert(bannerHeight);
        //배너의 좌측 위치를 옮겨 준다.
        $banner.animate({
            left: -$bannerWidth + "px"
        }, 1500, function () { //숫자는 롤링 진행되는 시간이다.
            //첫번째 이미지를 마지막 끝에 복사(이동이 아니라 복사)해서 추가
            $(this).append("<li>" + $(this).find("li:first").html() + "</li>");
            //뒤로 복사된 첫번재 이미지는 필요 없으니 삭제.
            $(this).find("li:first").remove();
            //다음 움직임을 위해서 배너 좌측의 위치값을 초기화 .
            $(this).css("left", 0);
            //계속 롤링하는 배너
        });
    }
});

// 회원가입 유효성검사
function chkSubmit() {
    var frm = document.forms['form2'];

    if (frm['firstname'].value.trim() == "") {
        alert("닉네임은 필수입니다");
        frm['firstname'].focus()
        return false;
    }
    if (frm['lastname'].value.trim() == "") {
        alert("닉네임은 필수입니다");
        frm['lastname'].focus()
        return false;
    }
    if (frm['password'].value.trim() == "") {
        alert("닉네임은 필수입니다");
        frm['password'].focus()
        return false;
    }
    if (frm['repassword'].value.trim() == "") {
        alert("닉네임은 필수입니다");
        frm['repassword'].focus()
        return false;
    }

    frm.submit();
    return true;
}


// 로그인 팝업
var loginBtn = document.getElementById("loginBtn");
var modal = document.getElementById("id01");
var close = document.getElementsByClassName("close")[0];

loginBtn.onclick = function () {
    modal.style.display = "block";
}

close.onclick = function () {
    modal.style.display = "none";
}

window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

// 로그인 유효성검사
function chkSubmit1() {
    var frm = document.forms['form1'];

    if (frm['login-name'].value.trim() == "") {
        alert("ID/email 을 입력해주세요");
        frm['login-name'].focus()
        return false;
    }

    if (frm['password'].value.trim() == "") {
        alert("password 를 입력해주세요");
        frm['password'].focus()
        return false;
    }
    frm.submit();
    return true;
}