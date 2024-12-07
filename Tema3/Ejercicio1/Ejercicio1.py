#coding: latin1

# Hacer una aplicación que con un switch se muestre por pantalla un mensaje si el 
# usuario ha introducido una nota, 1-4 INSUFICIENTE, 5 SUFICIENTE, 6 BIEN, 7-8 NOTABLE, 9 y 10 
#SOBRESALIENTE

def asignarNotas():
    nota = input("Introduce una nota, y el programa te dira a que rango corresponde")

    if nota > 0 and nota <= 10:
        if nota > 0 and nota < 5:
            print("INSUFICIENTE")
        elif nota == 5:
            print("SUFICIENTE")
        elif nota == 6:
            print("BIEN")
        elif nota > 6 and nota < 9:
            print("NOTABLE")
        elif nota >= 9 and nota <= 10:
            print("SOBRESALIENTE")
    else:
        print("Introduce una nota valida, del 1 al 10")

if __name__ == "__main__":
    asignarNotas()

# EN PYTHON NO HAY SWITCH POR LO QUE TUVE QUE HACERLO CON IF