class Permutation(
    private val numbers: IntArray,
    private val sample: Int
){
    private val permutation = Array<Int?>(sample) { null }
    fun start(){
        permute(0)
    }
    private fun permute(pointer: Int) {
        if(pointer == sample){
            printNumbers(permutation)
            println()
            return
        }

        for(n in numbers){
            if(!permutation.contains(n))
            {
                permutation[pointer] = n
                permute(pointer + 1)
            }
            permutation[pointer] = null
        }
    }
    private fun printNumbers(numbers: Array<Int?>){
        for(n in numbers)
            print("$n ")
    }
}
// formula
// P(n,r) = n!/(n-r)!