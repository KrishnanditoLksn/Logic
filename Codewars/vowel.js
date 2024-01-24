const  getCount = (str) => {
    let count = 0
    for (let i = 0; i < str.length; i++) {
        if (str[i].includes('a') || str[i].includes('i') || str[i].includes('u') || str[i].includes('e') || str[i].includes('o')) {
            count++
        }
    }
    return count
}

console.log(getCount('abracadabra'))