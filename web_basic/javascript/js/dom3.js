/**
 * 1. 추가버튼 클릭시 input에 들어있는 value의 값을 list에 추가
 * 2. 확인버튼 클릭시 todo-content의 색상을 red로 변경, 취소선 적용
 * 3. 확인버튼 다시 클릭시 todo-content의 색상을 black로 변경, 취소선 미적용
 */

const statusList = new Array();
const addButton = document.getElementsByClassName("add-button");
addButton[0].onclick = () => {
    const todoText = document.getElementsByClassName("todo-text");
    const todoList = document.getElementsByClassName("todo-list");
    todoList[0].innerHTML += `
        <li><span class="todo-content">${todoText[0].value}</span> <button class="ok-button">확인</button></li>
        `;
        statusList.push(false);

        addEvent();
}

function addEvent() {
    const okButton = document.getElementsByClassName("ok-button");
    const todoContent = document.getElementsByClassName("todo-content");
    for (let i = 0; i < okButton.length; i++) {
        okButton[i].onclick = () => {
            if(statusList[i]) {
                todoContent[i].style.color = "black";
                todoContent[i].style.textDecoration = "none";
                statusList[i] = false;
            } else {
                todoContent[i].style.color = "red";
                todoContent[i].style.textDecoration = "line-through";
                statusList[i] = true;
            }
        }
    }
}


// const todoText = document.getElementsByClassName("todo-text");

// todoText[0].addEventListener("keydown", (event) => {
//     if (event.key === "Enter") {
//     const todoList = document.getElementsByClassName("todo-list");
//     todoList[0].innerHTML += `
//         <li><span class="todo-content">${todoText[0].value}</span> <button class="ok-button">확인</button></li>
//         `;
//         statusList.push(false);

//         addEvent();
//     }
// });


// const addButton = document.getElementsByClassName("add-button");
// const todoList = document.getElementsByClassName("todo-list");

// addButton[0].onclick = () => {
//     const todoText = document.getElementsByClassName("todo-text");
//     todoList[0].innerHTML += `<li><span class="todo-content">${todoText[0].value}</span> <button class="ok-button">확인</button></li>`;
//     odoText[0].value = "";
//     addEvent(); 
// }

// function addEvent() {
//     const todoContent = document.getElementsByClassName("todo-content");
//     const okButton = document.getElementsByClassName("ok-button");
//     for (let i = 0; i < todoContent.length; i++) {
//         let action = true;
//         okButton[i].onclick = () => {
//             if(action) {
//                 todoContent[i].style.color = "red";
//                 todoContent[i].style.textDecoration = "line-through";
//             } else {
//                 todoContent[i].style.color = "black";
//                 todoContent[i].style.textDecoration = "none";
//             }
//             action = !action;
//         }
//     }
// }
