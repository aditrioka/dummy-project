fun main() {
    println("hello, moto")

    val phone = Phone()
    phone.topUpCredit(50)
    phone.call()
    phone.sms()
    phone.checkCredit()
}

class Phone {
    private var credit = 0

    fun topUpCredit(amount: Int) {
        credit += amount
    }

    fun call() {
        credit -= 10
    }

    fun sms() {
        credit -= 1
    }

    fun checkCredit() {
        println("Your credit is $credit")
    }
}