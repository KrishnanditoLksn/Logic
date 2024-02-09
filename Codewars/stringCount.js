function str_count(str, letter) {
    let count = 0
    for (let i = 0; i < str.length; i++) {
        if (str[i].includes(letter)) {
            count++
        }
    }
    return count
}

console.log(str_count(" ", 'z'))