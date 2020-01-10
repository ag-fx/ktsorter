package rafael.ktsorter.sorter.alghoritm

class CircleSorter(pauseTime: Long) : Sorter(pauseTime, INFO.type) {

    companion object {
        val INFO = SortInfo("Circle", SortType.EXCHANGE, AveragePerformance.N2)
    }

    private fun sort(values: IntArray, low: Int, high: Int, nSwaps: Int): Int {
        val lo = low
        val hi = high
        var numSwaps = nSwaps

        fun execute(left: Int, right: Int) {
            if (super.isLesser(values, right, left)) {
                super.swap(values, right, left)
                numSwaps++
            }
        }

        if(lo == hi) {
            return numSwaps
        }


return 0
    }

    override fun process(values: IntArray): IntArray {
        do {

        } while (this.sort(values, 0, values.size - 1, 0) != 0)

        return values
    }

}
