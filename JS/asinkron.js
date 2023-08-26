console.log("welcome")

setTimeout(()=>{
    console.log("Arigatou!!!")
}, 3000)

console.log("hufttt why it take too long!!")

function getUsers(callback) {
    setTimeout(()=>{
        const users =  ['John', 'Jack', 'Abigail'];
    },3000);
}

getUsers((users)=>{
    console.log(users)
});
