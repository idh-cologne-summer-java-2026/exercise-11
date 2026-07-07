Fortgeschrittene Programmierung (Java 2)


# Übung 7


Klonen Sie dieses Repository direkt in Eclipse und importieren Sie das Projekt. Legen Sie einen neuen Branch an, den Sie nach Ihrem GitHub-Benutzernamen benennen.

## Aufgabe 1

Sie finden im Repository die Referenzlösung aus Aufgabe 4 als Startpunkt. Dabei handelt es sich um den Geldautomaten, der zu einer Bank gehört, und den Kontostand verschiedener Konten auseinander halten kann. Implementieren Sie in der Klasse `Bank` die Methode `getAccount(int)`, so dass sie den passenden Account für eine Kontonummer liefert. Intern -- innerhalb der Klasse `Bank` -- verwenden Sie dazu bitte eine `HashMap`.


## Aufgabe 2

Als Teil einer Werbekampagne hat sich die Bank dazu entschieden, den Kund:innen frei konfigurierbare Kontonummern zu erlauben, die auch Zeichen beinhalten können. Verändern Sie Ihre Implementierung aus Aufgabe 1 so, dass man auch die Kontonummern "1234@5678", "cat_haz_cash" und "💸" verwenden kann. Beachten Sie dass dies auch Änderungen am Geldautomaten selbst nach sich zieht, der nun auch Texteingaben akzeptieren muss.

----

Wenn Sie fertig sind, committen Sie alle Ihre Änderungen am Quellcode, und pushen Sie den neuen Branch auf das remote namens `origin` (= GitHub). 