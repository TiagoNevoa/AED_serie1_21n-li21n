package parte1
fun squaresSorted(v: IntArray): IntArray {

    val arrAux = IntArray(v.size)
/*
    // Console print code flow
    println("Array_Aux size : " + arrAux.size)
    println("v size : " + v.size)
*/
    // if v Array empty return
    if (v.isEmpty()) return v

    var i = 0
    var j = v.size -1
    var arrAuxPos = v.size-1
    while(i <= j){
        if(kotlin.math.abs(v[i]) > kotlin.math.abs(v[j])) arrAux[arrAuxPos--] = kotlin.math.abs(v[i] * v[i++])
        else arrAux[arrAuxPos--] = kotlin.math.abs(v[j]*v[j--])
    }
/*
    // Console print code flow
    println("Array V:")
    print("[ ")
    for (i in v.indices){
        print(v[i])
        print(" ")
    }
    println("]")
    println("Array Aux:")
    print("[ ")
    for (i in arrAux.indices){
        print(arrAux[i])
        print(" ")
    }
    println("]")
*/
    return arrAux



}

fun countInRange(v1: IntArray, l: Int, r: Int, min: Int, max: Int): Int {
/*
    // Console print code flow
    println("v1 size : " + v1.size)
    println("l : $l")
    println("r : $r")
    println("min : $min")
    println("max : $max")

    // Console print code flow
    println("Array V1:")
    print("[ ")
    for (i in v1.indices){
        print(v1[i])
        print(" ")
    }
    println("]")
*/
    // Check array is empty, or pointers out of range
    if (v1.isEmpty() || l>r || l<0 || r>=v1.size || min>max) return 0

    var count = 0
    var left = l-1
    // Every time we find value on array, with l --> r range and with correct condition, we increase the count
    while (++left <= r) if (v1[left] in min..max) count++
/*
    // Console print code flow
    println("counter : $count")
*/
    return count
}

fun sumGivenN(n: Int): Int {

    // Console print code flow
    println("n : $n")

    //if (n == 0) return 0

    val arrAux = IntArray(n+1)
    // Console print code flow
    println("Array_Aux size : " + arrAux.size)

    var count = 0
    var num = n

    for(i in arrAux.indices){
        arrAux[i] = num--
        count++
    }

    // Console print code flow
    println("Array Aux:")
    print("[ ")
    for (i in arrAux.indices){
        print(arrAux[i])
        print(" ")
    }
    println("]")

    println("count : $count")
    return count
}

fun counter(array:IntArray, k:Int, lower:Int, upper:Int):Pair<Int,Int> {
    throw UnsupportedOperationException()
}

fun countInverses(v: Array<String>, l: Int, r: Int): Int {
    throw UnsupportedOperationException()
}
