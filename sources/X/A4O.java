package X;

import java.nio.charset.Charset;
import java.util.AbstractCollection;
import org.json.JSONTokener;

public final class A4O {
    public static final A4O A00 = new Object();

    public static final boolean A00(C18030ve r1, C195709tm r2) {
        C18070vi.A0d(r1, 0);
        Object nextValue = new JSONTokener(C108955ca.A0v(r1, 7187)).nextValue();
        C18070vi.A0b(nextValue);
        Object A002 = C20064A5n.A00(nextValue);
        C18070vi.A0z(A002, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        return C108965cb.A1Z((AbstractCollection) A002, r2.A01);
    }

    public final String A01(C196109uT r6, String str, boolean z) {
        String str2;
        C18070vi.A0h(str, r6);
        C18100vl r4 = r6.A01;
        String A0r = C17880vN.A0r(C17880vN.A0C(r4), "flows_salt_for_logging_message_id");
        if (A0r == null) {
            byte[] A1Y = AnonymousClass8BX.A1Y();
            Charset charset = C19620yd.A0C;
            C18070vi.A0Z(charset);
            A0r = new String(A1Y, charset);
            C17880vN.A1E(C17890vO.A0A(r4), "flows_salt_for_logging_message_id", A0r);
        }
        if (z) {
            str2 = "_qpl";
        } else {
            str2 = "_wam";
        }
        String obj = C17900vP.A0H(str, A0r, str2).toString();
        C18070vi.A0d(obj, 0);
        String A0Y = AnonymousClass8BY.A0Y(obj);
        C18070vi.A0X(A0Y);
        return A0Y;
    }
}
