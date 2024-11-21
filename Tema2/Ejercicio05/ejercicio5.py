
class ejercicio5:

    def mayorMenor():
        # Insertamos valores
        num1 = input("Inserta un numero: ")
        num2 = input("Inserta un segundo numero: ")
        num3 = input("Inserta un tercer numero: ")

        if (num1 > num2 and num1> num3): #Validamos si num1 es mayor que los demas
            if num2 > num3:
                print(f"{num1} > {num2} > {num3}")
            else:
                print(f"{num1} > {num3} > {num2}")

        if (num2 > num1 and num2 > num3):#Validamos si num2 es mayor que los demas
            if num1 > num3:
                print(f"{num2} > {num1} > {num3}")
            else:
                print(f"{num2} > {num3} > {num1}")

        if (num3 > num2 and num3 > num1):#Validamos si num3 es mayor que los demas
            if num1 > num2:
                print(f"{num3} > {num1} > {num2}")
            else:
                print(f"{num3} > {num2} > {num1}")

    if __name__ == '__main__':
        mayorMenor()