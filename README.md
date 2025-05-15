In dieser Aufgabe werden Strings verwendet. Sie können Strings wie folgt miteinander vergleichen:

```java
String s1 = "Blabla";
if(s1.equals("Blabla")) {
  System.out.println("In dem String steht Blabla.")
}
```

# Aufgabe 1
Schreiben Sie eine Methode `public static void printGreeting(String name)`, die eine persönliche Begrüßung für einen gegebenen Namen ausgibt und auf die Konsole printed.

Beispiel: Beim Aufruf `printGreeting("Tom")`, gibt die Methode "Hallo Tom" zurück.

# Aufgabe 2
Schreiben Sie eine Methode `public static void calculate(int numOne, int numTwo, String operation)`, die zwei Zahlen nimmt, die übergebene Rechenoperation durchführt und das Ergebnis auf der Konsole ausgibt.

Beispiel: bei einem Aufruf von `calculate(1, 1, "sum")` wird auf die Konsole `1 + 1 = 2.0` geschrieben.

Gütige Rechenoperationen sind: sum, difference, product, quotient. Wenn eine andere Rechenoperation übergeben wird, soll das Programm auf die Konsole printen: "Unbekannte Operation".

# Aufgabe 3
Schreiben Sie zwei Methoden, die jeweils den Umfang von einem Quadrat, bzw. von einem Rechteck berechnen und auf der Konsole ausgeben.

Das Format der Ausgabe sollte sein: "Der Umfang von einem [Quadrat/Rechteck] mit den Kantenlängen [Längen] beträgt [Umfang]". Ersetzen Sie die Inhalte in den eckigen Klammern entsprechend.

Für das Quadrat sieht die Methodensignatur so aus: `public static double calculatePerimeter(double sideLength)`.
Für das Rechteck soll die Methode den gleichen Namen haben (calculatePerimeter), sie unterscheidet sich zu der anderen Methode nur durch die übergebenen Argumente.
Längen können nicht negativ sein. Wenn eins der Argumente negativ ist, geben Sie "Negative Kantenlängen sind nicht möglich" aus.

