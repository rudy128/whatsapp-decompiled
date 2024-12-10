package X;

import java.util.Locale;

public class C1Z extends Exception {
    public C1Z(int i) {
        super(String.format(Locale.US, "Error code %d is not supported", BEA.A1b(i)));
    }
}
