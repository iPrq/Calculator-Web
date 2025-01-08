const inputdisplay = document.getElementById("inputdisplay");
const outputdisplay = document.getElementById("outputdisplay");

let addpressed = false;
let number1, functiontype;
function onInputKey(input) {
        if(outputdisplay.value !== "") {
            inputdisplay.value = "";
            outputdisplay.value = "";
            addpressed = false;
            inputdisplay.value += input;
        }
        else {
            inputdisplay.value += input;
        }
}

function onClearKey() {
    inputdisplay.value = ``;
    outputdisplay.value = "";
    addpressed = false;
}

function onFunctionKey(input) {
    if(!addpressed) {
        switch(input) {
            case "add":
                number1 = inputdisplay.value;
                inputdisplay.value += '+';
                functiontype = "+";
                addpressed = true;
                break;
            case "sub":
                number1 = inputdisplay.value;
                inputdisplay.value += '-';
                functiontype = "-";
                addpressed = true;
                break;
            case "mul":
                number1 = inputdisplay.value;
                inputdisplay.value += '×';
                functiontype = "×";
                addpressed = true;
                break;
            case "div":
                number1 = inputdisplay.value;
                inputdisplay.value += '÷';
                functiontype = "÷";
                addpressed = true;
                break;
            default:
                break;
        }
    }
}
function calculate() {
    let value = inputdisplay.value;
    let a = number1;
    let b = value.substring(value.indexOf(functiontype)+1)
    if(addpressed) {
        switch(functiontype) {
            case "+":
                add(a,b);
                console.log("running");
                break;
            case "-":
                sub(a,b);
                break;
            case "×":
                mul(a,b);
                break;
            case "÷":
                div(a,b);
                break;
            default:
                break;
        }
    }
}

function add(a,b) {
    outputdisplay.value = Number(a)+Number(b);
}

function sub(a,b) {
    outputdisplay.value = Number(a)-Number(b);
}

function mul(a,b){
    outputdisplay.value = Number(a)*Number(b);
}
function div(a,b){
    outputdisplay.value = Number(a)/Number(b);
}

function openHistory() {
    window.open("history.html");
} 