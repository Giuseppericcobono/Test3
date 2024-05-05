import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testFormattazioneData() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String dateFormatter = date.format(formatter);
        assertEquals("01 marzo 2023", dateFormatter, "Formato della data errato");
    }

    @Test
    public void testAnalisiData() {
        OffsetDateTime expectedDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime actualDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(expectedDateTime, actualDateTime, "Analisi della data errato");
    }

    @Test
    public void testUguaglianzaStampaData () {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String expectedVideoDateTime = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String actualVideoDateTime = "1 marzo 2023";
        assertEquals(expectedVideoDateTime, actualVideoDateTime, "Stampa della data errato");
    }
}