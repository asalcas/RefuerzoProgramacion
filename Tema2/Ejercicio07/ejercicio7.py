
class ejercicio7:

    def cifrasNumeros():

        numeroUsuario = int(input("Introduce un numero para determinar cuantas cifras tiene (Debe estar comprendido entre 0 y 99999)"))
        if (numeroUsuario < 10 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 1 cifra")
        elif (numeroUsuario < 100 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 2 cifras")
        elif (numeroUsuario < 1000 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 3 cifras")
        elif (numeroUsuario < 10000 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 4 cifras")
        elif (numeroUsuario < 100000 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 5 cifras")
        else: 
            print("Tiene que ser entre 0 y 99999")
            
    # INTENTEMOS REFACTOR

        if (numeroUsuario < 10 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 1 cifra")
        elif (numeroUsuario < 100 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 2 cifras")
        elif (numeroUsuario < 1000 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 3 cifras")
        elif (numeroUsuario < 10000 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 4 cifras")
        elif (numeroUsuario < 100000 and numeroUsuario > 0):
            print (f"El numero: {numeroUsuario}, tiene 5 cifras")
        else:
            print("Tiene que ser entre 0 y 99999")

    if __name__ == '__main__':
        cifrasNumeros()