package X;

import java.util.List;

/* renamed from: X.AhQ  reason: case insensitive filesystem */
public final class C21279AhQ implements C22470B9c {
    public static final C21279AhQ A00 = new C21279AhQ();

    public final Object BCF(C29621ca r21, C62672rm r22) {
        C29621ca r5 = r21;
        C62672rm r4 = r22;
        int A17 = C18070vi.A17(r5, r4);
        if (!r4.A09(r5, "config")) {
            return null;
        }
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "uwp_alpha";
        List A0O = C18070vi.A0O("uwp_beta", A1Z, A17);
        String[] strArr = new String[A17];
        strArr[0] = "version";
        r4.A07(r5, A0O, strArr);
        Class<String> cls = String.class;
        if (r4.A05(r5, cls, C108975cc.A0X(), 255L, (Object) null, AnonymousClass8BS.A1W(A17, 0), false) == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        if (r4.A05(r5, cls, AnonymousClass8BW.A0Z("platform", strArr2, 0), AnonymousClass8BU.A0j(), "wns", strArr2, false) != null) {
            return new AnonymousClass9EN(r5);
        }
        return null;
    }
}
