package X;

import java.util.List;

/* renamed from: X.2oc  reason: invalid class name and case insensitive filesystem */
public abstract class C60792oc {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        C43501zu.A01(A0e, C50762Vr.A00);
        C17890vO.A18(A0e, "contacts");
        A00 = AnonymousClass000.A0y("jid = ?", A0e);
    }

    public static String A00(List list, long j, boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        if (!list.isEmpty() && !z) {
            A10.append(" WHERE ");
            for (int i = 0; i < list.size(); i++) {
                String A0w = C17880vN.A0w(list, i);
                A10.append("consumer_status");
                A10.append(" & ");
                A10.append(j);
                A10.append(" = ");
                A10.append(A0w);
                if (i < list.size() - 1) {
                    A10.append(" OR ");
                }
            }
        }
        return A10.toString();
    }
}
