package X;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.11X  reason: invalid class name */
public final class AnonymousClass11X {
    public static final AnonymousClass11Y A00 = new Object();
    public static volatile DateFormat A01;
    public static volatile DateFormat A02;
    public static volatile DateFormat[] A03;

    public static final String A00(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        Locale A0N = r2.A0N();
        C18070vi.A0X(A0N);
        String A08 = r2.A08(272);
        C18070vi.A0X(A08);
        return AnonymousClass11Y.A02(A0N, A08);
    }

    public static final String A01(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        Locale A0N = r2.A0N();
        C18070vi.A0X(A0N);
        String A08 = r2.A08(273);
        C18070vi.A0X(A08);
        return AnonymousClass11Y.A02(A0N, A08);
    }

    public static final String A02(C18000vb r1, long j) {
        C18070vi.A0d(r1, 0);
        String format = AnonymousClass11Y.A03(r1).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }
}
