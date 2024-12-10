package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.Afu  reason: case insensitive filesystem */
public final class C21185Afu implements C22470B9c {
    public static final C21185Afu A00 = new C21185Afu();

    public final Object BCF(C29621ca r21, C62672rm r22) {
        C29621ca r5 = r21;
        C62672rm r4 = r22;
        int A17 = C18070vi.A17(r5, r4);
        if (r4.A09(r5, "state")) {
            String[] strArr = new String[A17];
            strArr[0] = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
            Class<String> cls = String.class;
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r4.A05(r5, cls, A0i, A0j, (Object) null, strArr, false) != null) {
                if (r4.A05(r5, cls, A0i, A0j, "version_check", AnonymousClass8BS.A1a(A17, 0), false) != null) {
                    String[] strArr2 = new String[A17];
                    C29621ca A0Z = AnonymousClass8BT.A0Z(r5, "choice", strArr2);
                    if (A0Z == null) {
                        AnonymousClass8BY.A11(r5, r4, strArr2, 0);
                    } else if (r4.A09(A0Z, "choice")) {
                        String str = (String) AnonymousClass8BY.A0W(A0Z, r4, (Object) null, new String[]{"choice"}, false);
                        if (str != null) {
                            AnonymousClass9CY r1 = new AnonymousClass9CY(A0Z, str);
                            C178399Cy A02 = A6w.A02(r5, r4);
                            if (A02 != null) {
                                return new C178589Dr(r5, r1, A02);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
