function cubeChecker(volume, side) {
    if (volume <= 0 || side <= 0)
        return false
    let v = side * side * side
    return volume === v
}

console.log(cubeChecker(8, 2))