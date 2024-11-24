class ejercicio10:
    
    def suma():
        a = int(input("Introduce tres numeros y veremos si sumamos dos da como resultado el tercero: \n"))
        b = int(input("Introduce un segundo numero: \n"))
        c = int(input("Introduce un tercer numero: \n"))
        
        if a + b == c:
            print("La suma del 1er num y el 2do num tiene como resultado el tercer num")
        elif b + c == a:
            print("La suma del 2do num y el 3er num tiene como resultado el primer num")
        elif c + a == b: 
            print("La suma del 3er num y el 1er num tiene como resultado el segundo num")
        else:
            print("Ninguna de las sumas dan un numero ")
            
    if __name__ == "__main__":
        suma()