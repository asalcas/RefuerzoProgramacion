import math
from random import randint


class ejercicio6:

    def ecuacion():
        a = input("Vamos a realizar una ecuacion, introduce tres numeros para realizarla: a = ")
        b = input("Otro numero más: b = ")
        c = input("Un ultimo número: c = ")
        discriminante = pow(b,2) - (4 * a * c)
        if (a == 0 or b == 0 or c == 0):
            print("La solución es 0")
        elif (discriminante == 0):
            x = -b / (2 * a)
            print("La solución es: " + x)
        elif (discriminante > 0):
            x = (-b - (math.sqr(discriminante)) /(2 * a))
            x1 = (-b + (math.sqr(discriminante)) /(2 * a))
            print("Las soluciones son: " + x + " y " + x1)
        else:
            print ("No hay solucion REAL")


    if __name__ == '__main__':
        ecuacion()
        


