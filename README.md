In dieser Aufgabe werden Strings verwendet. Sie können Strings wie folgt miteinander vergleichen:

```java
String s1 = "Blabla";
if(s1.equals("Blabla")) {
  System.out.println("In dem String steht Blabla.")
}
```

# Aufgabe 1
Schreiben Sie eine Methode `public static String printGreeting(String name)`, die eine persönliche Begrüßung für einen gegebenen Namen ausgibt und auf die Konsole printed.

Beispiel: Beim Aufruf `printGreeting("Tom")`, gibt die Methode "Hallo Tom" zurück.

# Aufgabe 2
Schreiben Sie eine Methode `public static float calculate(int numOne, int numTwo, String operation)`, die zwei Zahlen nimmt, die übergebene Rechenoperation durchführt und der Ergebnis zurückgibt. Außerdem soll die Methode die Rechnung printen.

Beispiel: bei einem Aufruf von `calculate(1, 1, "sum")` wird auf die Konsole `1 + 1 = 2.0` geschrieben.

Gütige Rechenoperationen sind: sum, difference, product, quotient. Wenn eine andere Rechenoperation übergeben wird, soll das Programm auf die Konsole printen: "Unbekannte Operation" und -1 zurückgeben.
Wenn durch 0 geteilt wird, wird auf die Konsole geschrieben "Teilen durch 0 nicht möglich" und auch -1 zurückgegeben.
# Aufgabe 3
Schreiben Sie zwei Methoden, die jeweils den Umfang von einem Quadrat, bzw. von einem Rechteck berechnen. Für das Quadrat sieht die Methodensignatur so aus: `public static double calculatePerimeter(double sideLength)`.
Für das Rechteck soll die Methode den gleichen Namen haben (calculatePerimeter), sie unterscheidet sich zu der anderen Methode nur durch die übergebenen Argumente.
Längen können nicht negativ sein. Wenn eins der Argumente negativ ist, geben Sie -1 zurück.

# Aufgabe 4
Schreiben Sie eine Funktion `int countEvenNumbers(int[] numArray)`, die ein Array übergeben bekommt, die Anzahl von geraden Zahlen im Array berechnet und zurückgibt.

Beispiel: Der Aufruf `countEvenNumbers(new int[] {1, 2, 3, 4, 5})` gibt 2 zurück.
# Aufgabe 5
Schreiben Sie eine Funktion `int[] findEvenNumbers(int[] numArray)`, die ein Array übergeben bekommt und die Indices der geraden Zahlen im Array in ein neues Array schreibt. Das neue Array wird zurückgegeben.

Beispiel: Die Rückgabe des Aufrufs `findEvenNumbers({1, 2, 3, 4, 5}` wäre {1, 3}.

Hinweis: Um die Länge des neuen Arrays zu bestimmen, muss zuerst die Anzahl an geraden Zahlen im Array bestimmt werden.
