#coding: latin1

from decimal import Decimal
from tokenize import Double


class Ejercicio3:
    numeroInput = Decimal(input("Introduce un numero para comprobar como es: "))
    seguir = True
    while (seguir == True):
        if ((numeroInput > 0) and (numeroInput < 1)):
            print ("El numero es Casi 0")
            seguir = False
        elif ((numeroInput < 0) and (numeroInput > -1)):
            print ("El numero es Casi 0") 
            seguir = False
        else:
            numeroInput = Decimal(input("Sigue intentandolo con otro numero que sea casi 0: "))
        numeroInput