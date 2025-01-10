const inputdisplay = document.getElementById("inputdisplay");
const outputdisplay = document.getElementById("outputdisplay");

let addpressed = false;
let number1, functiontype;
let funcinput;
let newWindow;
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
        funcinput = input;
    }
}
function calculate() {
    let value = inputdisplay.value;
    let a = number1;
    let output;
    let b = value.substring(value.indexOf(functiontype)+1)
    if(addpressed) {
        switch(functiontype) {
            case "+":
                output = add(a,b);
                console.log("running");
                break;
            case "-":
                output = sub(a,b);
                break;
            case "×":
                output = mul(a,b);
                break;
            case "÷":
                output = div(a,b);
                break;
            default:
                break;
        }
        postCalculation(a,b,funcinput,output);
    }
}

function add(a,b) {
    outputdisplay.value = Number(a)+Number(b);
    return Number(a)+Number(b);
}

function sub(a,b) {
    outputdisplay.value = Number(a)-Number(b);
    return Number(a)-Number(b);
}

function mul(a,b){
    outputdisplay.value = Number(a)*Number(b);
    return Number(a)*Number(b);
}
function div(a,b){
    outputdisplay.value = Number(a)/Number(b);
    return Number(a)/Number(b);
}

function openHistory() {
   newWindow = window.open('history.html');
   newWindow.addEventListener('DOMContentLoaded', () =>
    {gethistory(newWindow)});
} 





async function gethistory(newWindow) {
    try {
        const response = await fetch('http://localhost:8080/calculator/get', {
            method: 'GET'
        });
     data = await response.json();
     addhistory(data, newWindow)// passing the fetched data to addhistory
    } catch (error) {
        console.error(error);
    }
}


async function postCalculation(a,b,method,o) {
    const response = await fetch('http://localhost:8080/calculator/add', {
        headers: {
            'Content-type': 'application/json'
        },
        method: 'POST',
        body: JSON.stringify({number1: a, number2: b, method: method, output: o})
    });
    if(response.ok) {
        console.log("Added Calculation");
    }
    else {
        console.error(error);
    }
    
}

function addhistory(data, newWindow) {
    console.log(data);
    if (!Array.isArray(data)) { 
        console.error("Expected an array but got: ", data);
     } 
    else {
        data.forEach(element => { createEntry(element, newWindow); }); 
    }
}

function createEntry(element, newWindow) {
    let newcalculation = newWindow.document.getElementById("calculationtemplate").cloneNode(true);
    newcalculation.id = "calculation1";
    
    let entrys = newcalculation.querySelectorAll("p");
    let divnumber1 = entrys[0];
    let method = entrys[1];
    let divnumber2 = entrys[2];
    let divoutput = entrys[4];

    divnumber1.textContent = element.number1;
    divnumber2.textContent = element.number2;
    method.textContent = setmethod(element.method);
    divoutput.textContent = element.output;

    newWindow.document.body.appendChild(newcalculation);
}

function setmethod(method) {
    switch(method) {
        case "add":
            return "+";
        case "sub":
            return "-";
        case "mul":
            return "×";
        case "div":
            return "÷";
        default:
            return "null";
    }
}

