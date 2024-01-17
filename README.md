# Explicacion breve del ejercicio de AULA

## En este ejercicio lo que hacemos es crear tres clases una aula,una clase alumnos y una clase Start para usar las dos clases anteriores.

En la clase Aula lo que haremos sera especificar unos Atributos uno que sea los Alumnos que su tipo sera de Objeto 
que lo denominaremos como vector para poder introducir todos los alumnos que nosotros en la clase Start mas 
adelante agregaremos,y para denominar un vector ademas que en los Atributos, creando un constructor en el que 
pidamos un int capacidad que es lo que luego en el Start pondremos cuantos alumnos queremos que ocupen 
en el aula sin pasarse.

A continuacion despues de crear todos los huecos para los Alumnos crearemos una operacion que servira para añadir
los alumnos al vector en si,utilizaremos un if para poder limitar cuantos alumnos insertemos,y una variable 
contador que servira para no perder la cuenta de los alumnos que introduzcamos y asi no puedan pasarse
de la capacidad,despues como ultima operacion en la clase Aula un toString que retorna un Arrays.toString
de los alumnos para asi luego en el Start salga todos los alumnos que hemos introducido.

Antes de esto dentro de la clase Alumno ademas de crear los atributos que queremos que sea la información
de los Alumnos debemos crear un constructor para luego poder en el Start crear tantos Alumnos como queramos
ademas de un ToString que nos servira para luego enlazazarlo con la otra clase y asi pueda salir en el Syso 
del Start Syso(aula) todos los alumnos, sin ese ToString no saldria ni el nombre ni la edad.

Una vez programada las dos clases solamente en la clase Start tenemos que crear una Aula con el numero
que queremos de capacidad y luego depende el numero que pusiesemos tantos alumnos, si nos pasamos
al introducir los alumnos no pasara nada ya que esta limitado y como ultimo el Syso(aula) que explique
antes.
