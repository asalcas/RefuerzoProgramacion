class ejercicio8:

    def notasAlumnos():
        
        notaAlumno = int(input("Introduce la nota del alumno al sistema: /n"))
        if notaAlumno > 0 and notaAlumno < 5:
            print("INSUFICIENTE")
        elif notaAlumno >= 5 and notaAlumno < 6:
            print("SUFICIENTE")
        elif notaAlumno >= 6 and notaAlumno < 7:
            print("BIEN")
        elif notaAlumno >= 7 and notaAlumno < 9: 
            print("NOTABLE")
        elif notaAlumno >= 9 and notaAlumno <= 10:
            print("SOBRESALIENTE")
        else:
            print("Tienes que introducir un numero correcto")