const inputdisplay = document.getElementById("inputdisplay");
let addpressed = false;
function onInputKey(input) {
    inputdisplay.value += input;
}

function onClearKey() {
    inputdisplay.value = ``;
}

function onFunctionKey(input) {

    switch(input) {
        case `add`:
            add(a+b)
    }
}

