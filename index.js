let i=100;
for (let index = 1; index <=i; index++) {
    if (index%3==0&&index%5!=0) {
        console.log("Fizz");
    }
    else if (index%3!=0&&index%5==0) {
        console.log("Buzz");
    }
    else if (index%3==0&&index%5==0) {
        console.log("Fizz Buzz");
    }
    else{
        console.log(index);
    }
    
}