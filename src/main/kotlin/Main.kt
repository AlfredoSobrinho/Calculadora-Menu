fun main() { while (true){ menu1()
        val opc= opc1()
        when(opc){1->{ val num1= entrada1()
                val num2= entrada2()
                val result= soma(num1,num2)
                print("\n\n RESULTADO: $result ")
                break }2->{ val num1= entrada1()
                val num2= entrada2()
                val result= sub(num1,num2)
                print("\n\n RESULTADO: $result ")
                break }3->{ val num1= entrada1()
                val num2= entrada2()
                val result= divi(num1,num2)
                print("\n\n RESULTADO: $result ")
                break }4->{ val num1= entrada1()
                val num2= entrada2()
                val result= mult(num1,num2)
                print("\n\n RESULTADO: $result ")
                break }5->{sair()
                break } }
                while(opc<1||opc>5){ println("\nOPÇÃO INVALIDA!!!!\n")
                break } } }

