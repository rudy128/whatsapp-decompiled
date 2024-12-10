package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.AJf  reason: case insensitive filesystem */
public final class C20392AJf implements BDi {
    public static final DateFormat A00;

    static {
        SimpleDateFormat A0q = AnonymousClass8BS.A0q("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        A00 = A0q;
        AnonymousClass8BV.A1P(A0q);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        ((BAB) obj2).BAt(A00.format((Date) obj));
    }
}
