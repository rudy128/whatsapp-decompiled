package X;

import java.text.DateFormat;
import java.util.Date;

public final class CVm {
    public final String A00;
    public final String A01;

    public CVm(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        String format = DateFormat.getDateTimeInstance().format(new Date());
        C18070vi.A0X(format);
        this.A01 = format;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        BE7.A1N(A10, this.A01);
        return AnonymousClass000.A0y(this.A00, A10);
    }
}
