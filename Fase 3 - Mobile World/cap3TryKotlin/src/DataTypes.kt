fun main() {
    // kotlin is a highly typed programming language, meaning that we can't reassign a variable to another type
    // without casting it

    // numeric types:

    // integers:

    // Long - 64 bits
    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
    val longSizeBits = Long.SIZE_BITS
    val longSizeBytes = Long.SIZE_BYTES

    println("Long max value: $longMaxValue")
    println("Long min value: $longMinValue")
    println("Long size bits: $longSizeBits")
    println("Long size bytes: $longSizeBytes")

    // Int - 32 bits
    val intMaxValue = Int.MAX_VALUE
    val intMinValue = Int.MIN_VALUE
    val intSizeBits = Int.SIZE_BITS
    val intSizeBytes = Int.SIZE_BYTES

    println("Int max value: $intMaxValue")
    println("Int min value: $intMinValue")
    println("Int size bits: $intSizeBits")
    println("Int size bytes: $intSizeBytes")

    // Short - 16 bits
    val shortMaxValue = Short.MAX_VALUE
    val shortMinValue = Short.MIN_VALUE
    val shortSizeBits = Short.SIZE_BITS
    val shortSizeBytes = Short.SIZE_BYTES

    println("Short max value: $shortMaxValue")
    println("Short min value: $shortMinValue")
    println("Short size bits: $shortSizeBits")
    println("Short size bytes: $shortSizeBytes")

    // Byte - 8 bits
    val byteMaxValue = Byte.MAX_VALUE
    val byteMinValue = Byte.MIN_VALUE
    val byteSizeBits = Byte.SIZE_BITS
    val byteSizeBytes = Byte.SIZE_BYTES

    println("Byte max value: $byteMaxValue")
    println("Byte min value: $byteMinValue")
    println("Byte size bits: $byteSizeBits")
    println("Byte size bytes: $byteSizeBytes")

    // floating points:
    // Double - 64 bits
    val doubleMaxValue = Double.MAX_VALUE
    val doubleMinValue = Double.MIN_VALUE
    val doubleSizeBits = Double.SIZE_BITS
    val doubleSizeBytes = Double.SIZE_BYTES

    println("Double max value: $doubleMaxValue")
    println("Double min value: $doubleMinValue")
    println("Double size bits: $doubleSizeBits")
    println("Double size bytes: $doubleSizeBytes")

    // Float - 32 bits
    val floatMaxValue = Float.MAX_VALUE
    val floatMinValue = Float.MIN_VALUE
    val floatSizeBits = Float.SIZE_BITS
    val floatSizeBytes = Float.SIZE_BYTES

    println("Float max value: $floatMaxValue")
    println("Float min value: $floatMinValue")
    println("Float size bits: $floatSizeBits")
    println("Float size bytes: $floatSizeBytes")

    val weight: Byte = 127
    println(weight)
}