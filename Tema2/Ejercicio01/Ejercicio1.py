#coding: latin1

class Ejercicio1:   

        @staticmethod
        def paresOImpares():
            numeroUsuario = 0 # En python la cosa cambia, al no ser tipado, tendremos que trabajar con el dato despues de declararlo
        try:
            numeroUsuario = int(input("Escribe un numero: ")) # Asignamos valor a la variable 'numeroUsuario' que previamente declaramos

            if numeroUsuario % 2 == 0: # Hacemos la comprobación
                print("El numero es PAR")
            else:
                print("El numero es IMPAR")
        except:
            print("Que ingrese un numero valido hombre!")

if __name__ == "__main__":
    Ejercicio1.paresOImpares()