var fs = require('fs');
var input=fs.readFileSync('input.txt').toString().trim().split('\n');

var operation=parseInt(input[0]);
var operand1=parseInt(input[1]);
var operand2=parseInt(input[2]);
function performOperation(operation,operand1,operand2){
    switch(operation){
        case 1:
                    return operand1+operand2;
        case 2:
                    return operand1-operand2;
        case 3:
                    return operand1*operand2;
        case 4:
                    if(operand2===0){
                        return 'Cannot divided by zero';
                    }
                    return operand1/operand2;
        default:
                    return 'Invalid operation'
    }
}
var result=performOperation(operation,operand1,operand2);
console.log(result);
