#coding: latin1

class Ejericicio2:
    
    @staticmethod
    def comprobarNumeros():
        numero1 = 0 # Declaramos las variables
        numero2 = 0
        try: # Controlamos las exepciones
            numero1 = int(input("Introduce 1 numero: ")) # Recogemos los numeros del usuario
            numero2 = int(input("Introducelo de nuevo: "))
            
            if (numero1 == numero2): # Comprobamos si los numeros son iguales
                print("Son iguales")
            else:
                print("No son iguales")
        except:
            print("Un numero, no otra cosa!!")    

if __name__ == '__main__':
    Ejericicio2.comprobarNumeros() # Llamamos a la funcion 'comprobarNumeros()' de la clase Ejercicio2.