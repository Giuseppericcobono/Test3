/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        stampaData();
    }
    public static void stampaData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String data1Long = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(data1Long);
    }
}