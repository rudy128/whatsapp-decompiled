package X;

import android.text.TextUtils;

/* renamed from: X.2WV  reason: invalid class name */
public abstract class AnonymousClass2WV {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String[] strArr = AnonymousClass31Y.A00;
        A10.append(TextUtils.join(", ", strArr));
        A10.append(" FROM ");
        A00 = AnonymousClass000.A0y("wa_vnames", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(TextUtils.join(", ", strArr), " FROM ", "wa_vnames", A11);
        A11.append(" WHERE ");
        A01 = AnonymousClass000.A0y("jid = ?", A11);
    }
}
