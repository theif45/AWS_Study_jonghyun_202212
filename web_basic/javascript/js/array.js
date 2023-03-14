let numbers1 = [1,2,3,4,5];
let numbers2 = [6,7,8,9,10];
let numbers3 = new Array();

let numbers4 =  numbers1.concat(numbers2);

console.log(numbers1);
console.log(typeof numbers2);
console.log(typeof numbers3);
console.log(typeof numbers4);

console.log(numbers4);

function odd(num){
    return num % 2 != 0;
}

let numbers5 = numbers4.filter(odd);
console.log(numbers5);

let numbers6 = numbers4.filter(n => n % 2 != 0);
console.log(numbers6);

for(let i = 0; i < numbers5.length; i++) {
    console.log("i: " + numbers5[i]);
}

for(let num of numbers5) {
    console.log(`forEach: ${num}`);
}

numbers5.forEach(n => console.log(`ArrayForEach: ${n}`));

// 값을 통해 인덱스 번호를 찾음
console.log(numbers5.indexOf(5));
console.log(numbers5.lastIndexOf(2));
// 배열을 문자로 바꾸며 join 안의 값을 기준으로 나눔
console.log(numbers5.join(";"));
// 배열의 제일 뒤에값 추가
console.log(numbers5.push(11));
console.log(numbers5);
// 배열의 제일 앞에 값 추가
console.log(numbers5.unshift(13));
console.log(numbers5);
// 무조건 마지막 요소 제거
console.log(numbers5.pop());
console.log(numbers5);
// 원하는 지점의 값을 추가 및 제거 가능
// (시작 인덱스, 삭제 개수, 추가할 값)
numbers5.splice(2,1,15,17);
console.log(numbers5);
// 원하는 지점을 인덱스를 이용해 제거하여 추출(원본은 그대로)
console.log(numbers5.slice(3,6));
console.log(numbers5);

// compare 함수를 이용해 숫자를 정렬, 기본은 문자 정렬
function compare(n1, n2) {
    if(n1 > n2) return 1;
    if(n1===n2) return 0;
    if(n1 < n2) return -1;
}
console.log(numbers5.sort(compare));
// 역순으로 정렬
console.log(numbers5.reverse());
// 쉼표로 나눠서 문자로 바꿈
console.log(numbers5.toString());

const backButton = document.getElementsByTagName("button");
backButton[0].onclick = () => {
    history.back();
}