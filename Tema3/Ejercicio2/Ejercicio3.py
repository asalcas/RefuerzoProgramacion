# ACTIVIDAD, POR CONSOLA: Introduce un numero del 1 - 7 y la maquina te dirá que dia es en un 
# String

def decirDia():
    diaSolicitado = input("Introduce un numero del 1 al 7 y te dire que dia es: ")

    if diaSolicitado > 0 and diaSolicitado < 8:
        if diaSolicitado == 1:
            print("LUNES")
        elif diaSolicitado == 2:
            print("MARTES")
        elif diaSolicitado == 3:
            print("MIERCOLES")
        elif diaSolicitado == 4:
            print("JUEVES")
        elif diaSolicitado == 5:
            print("VIERNES")
        elif diaSolicitado == 6:
            print("SABADO")
        elif diaSolicitado == 7:
            print("DOMINGO")
    else:
        print("Es necesario un numero del 1 al 7 para este ejercicio :(")

if __name__ == "__main__":
    decirDia()