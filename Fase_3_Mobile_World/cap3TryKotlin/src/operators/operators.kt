package operators

fun main() {
    var a = 10
    var b = 10

    val sum = a + b
    println("Sum a($a) + b($b) = $sum")

    val sub = a - b
    println("Sub a($a) - b($b) = $sub")

    val mul = a * b
    println("Mul a($a) * b($b) = $mul")

    val div = a / b
    println("Div a($a) / b($b) = $div")

    val mod = a % b
    println("Mod a($a) % b($b) = $mod")

    a += 1
    println("a($a) += 1: $a")

    b -= 1
    println("b($b) -= 1: $b")

    a *= 2
    println("a($a) *= 2: $a")

    b /= 2
    println("b($b) /= 2: $b")

    a %= 3
    println("a($a) %= 3: $a")

    val inc = a++
    println("a($a)++: $inc")

    val dec = b--
    println("b($b)--: $dec")

    if (a == 4 && b == 3) {
        println("a($a) == 4 && b($b) == 3")
    } else {
        println("a($a) != 4 && b($b) != 3")
    }

    if (a == 4 || b == 3) {
        println("a($a) == 4 || b($b) == 3")
    } else {
        println("a($a) != 4 || b($b) != 3")
    }

    if (a != 4) {
        println("a($a) != 4")
    } else {
        println("a($a) == 4")
    }

    if (a > b) {
        println("a($a) > b($b)")
    } else {
        println("a($a) <= b($b)")
    }

    if (a < b) {
        println("a($a) < b($b)")
    } else {
        println("a($a) >= b($b)")
    }

    if (a >= b) {
        println("a($a) >= b($b)")
    } else {
        println("a($a) < b($b)")
    }

    if (a <= b) {
        println("a($a) <= b($b)")
    } else {
        println("a($a) > b($b)")
    }

    if (a == b) {
        println("a($a) == b($b)")
    } else {
        println("a($a) != b($b)")
    }

    if (a != b) {
        println("a($a) != b($b)")
    } else {
        println("a($a) == b($b)")
    }
}