package ru.netology

fun main() {

//    Задача №1. Денежные переводы

    val amount = 100_000 // В amount хранится сумма перевода в рублях

    val commissionSize = if (amount / 100 * 0.75 < 35) 35 else amount / 100 * 0.75

    println("\nКомиссия составит: $commissionSize рублей")

//-----------------------------------------------------------------------

//    Задача №2. Люди/Человеки

    val likes = 31 // В переменной likes хранится число лайков
    // "Человеку" будет в случаях 1 и чисел, заканчивающихся на 1, исключая числа, заканчивающиеся на 11
    if ((likes - 1) % 10 == 0 && ((likes - 1) / 10 - 1) % 10 != 0)
        println("\nПонравилось $likes человеку")
    else
        println("\nПонравилось $likes людям")

    println()
//-----------------------------------------------------------------------

//    Задача №3. Меломан

    val regularCustomer = true // статус покупателя

    val totalPrice = 15_000 // общая сумма покупок

    val discountStart1 = 1_000 // старт дисконта (100 рублей) при покупке выше 1000

    val discountStart2 = 10_000// старт дисконта (5%) при покупке выше 10_000


    val solution = if (totalPrice > discountStart2)
        totalPrice * 0.95
    else if (totalPrice > discountStart1)
        totalPrice - 100
    else totalPrice

    val result = solution.toInt()
// Если покупатель постоянный, то вывод рассчитывается с доп. скидкой (1%)
    if (regularCustomer) println(Math.round(result * 0.99)) else println(result)

}