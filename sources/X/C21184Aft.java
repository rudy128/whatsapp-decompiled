package X;

import java.util.List;

/* renamed from: X.Aft  reason: case insensitive filesystem */
public final class C21184Aft implements C22470B9c {
    public static final C21184Aft A00 = new C21184Aft();

    public final Object BCF(C29621ca r25, C62672rm r26) {
        C178399Cy A02;
        C29621ca r5 = r25;
        C62672rm r4 = r26;
        int A17 = C18070vi.A17(r5, r4);
        if (!r4.A09(r5, "state")) {
            return null;
        }
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "child";
        List A0O = C18070vi.A0O("embedded", A1Z, A17);
        String[] strArr = new String[A17];
        strArr[0] = "launch_mode";
        String A07 = r4.A07(r5, A0O, strArr);
        if (A07 == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        strArr2[0] = "config";
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        String str = (String) r4.A05(r5, cls, A0i, A0j, (Object) null, strArr2, false);
        if (str == null) {
            return null;
        }
        String[] strArr3 = new String[A17];
        strArr3[0] = "parameters";
        C62672rm r12 = r4;
        C29621ca r13 = r5;
        Class<String> cls2 = cls;
        String str2 = (String) r12.A05(r13, cls2, C17890vO.A0L(), AnonymousClass8BV.A0l(), (Object) null, strArr3, false);
        String[] strArr4 = new String[A17];
        strArr4[0] = "catch";
        String str3 = (String) r4.A05(r5, cls, A0i, A0j, (Object) null, strArr4, false);
        if (r12.A05(r13, cls2, A0i, A0j, "subflow", AnonymousClass8BS.A1a(A17, 0), false) == null || (A02 = A6w.A02(r5, r4)) == null) {
            return null;
        }
        return new C178609Dt(r5, A02, A07, str, str2, str3);
    }
}
