var input = readline();
var number =  input.split(' ');
print((parseInt(number[0]) > parseInt(number[1]) ? number[1] + " "+ number[0] : number[0] + " " +number[1]  ));