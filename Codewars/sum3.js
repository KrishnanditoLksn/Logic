function getSum(a, b) {
    let total = 0
    let min = Math.min(a, b)
    let max = Math.max(a, b)
    if (min === max) {
        return min
    }
    for (let i = min; i <= max; i++) {
        total += i
    }
    return total
}

console.log(getSum(0, -1))