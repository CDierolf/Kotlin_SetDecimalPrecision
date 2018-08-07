class DecimalFormat()
{
    fun setPrecision(value: Double, precision: Int) : Double {
        var inputString: String = "%.$precision" + "f"
        return (inputString.format(value)).toDouble()
    }
}

fun main(args: Array<String>) {

    var value: Double = 3.4323423432
    var df = DecimalFormat()

    println(df.setPrecision(value, 7))
}