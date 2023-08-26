console.log("welcome")

setTimeout(()=>{
    console.log("hufttt why it take too long!!")
}, 3000)

console.log("Arigatouu!!!")

function getUsers(callback) {
    // simulate network delay
    setTimeout(() => {
        const users = ['John', 'Jack', 'Abigail'];
        callback(users);
    }, 3000);
}

function usersCallback(users) {
    console.log(users);
}

getUsers(usersCallback)