window.onload = () => {

}

function a() {
    console.log("a 함수 호출")
}

a();

console.log(typeof a)

// =>를 function이라고 생각하면됨
let b = (f) => {
    console.log("테스트가 프린트 되기 전에 무조건 실행");
    f();
}

b(a);
b(function(){console.log("test")});

// 정의 후 바로 실행
(function(){console.log("test2")}());