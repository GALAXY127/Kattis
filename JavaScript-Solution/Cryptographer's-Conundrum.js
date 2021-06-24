var input = readline();
var tempStore = input.split('');
var comp = "PER";
var namePer = comp.split("");
var count = 0;

for (var i = 0; i < tempStore.length; i++){
  if(tempStore[i] != namePer[i%3]){ // med mod kan vi eneklt ittera genom per..
    count++;
  }
}

print(count);