fun menu1(){
    print ("MENU - CALCULADORA \n\n\n")
    print("1- SOMAR \n")
    print("2- SUBTRAIR \n")
    print("3- DIVIDIR \n")
    print("4- MULTIPLICAR \n")
    print("5- SAIR \n\n") }
fun soma(num1:Float, num2: Float): Float{ return num1+num2 }
fun sub(num1:Float, num2: Float): Float{ return num1- num2}
fun mult(num1:Float, num2: Float): Float{ return num1*num2}
fun divi(num1:Float, num2: Float): Float{ return num1/num2}
fun entrada1(): Float{ print("INFORME O PRIMEIRO NUMERO:     ");
    val num1 = readLine()!!.toFloat()
    return num1 }
fun entrada2(): Float{ print("INFORME O SEGUNDO NUMERO:     ");
    val num2 = readLine()!!.toFloat()
    return num2 }
fun sair(){ println("\n Você esta saindo, OBRIGADO !!! ATÉ MAIS!") }
fun opc1(): Int { print("INFORME UMA OPCAO:   ")
    return readLine()!!.toInt()
}
