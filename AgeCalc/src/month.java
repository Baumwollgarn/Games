import java.text.DateFormatSymbols;
import java.util.Locale;

public class month {
    public static String getMonth(int month) {
            return new DateFormatSymbols(Locale.ENGLISH).getMonths()[month - 1];
        }
    }
