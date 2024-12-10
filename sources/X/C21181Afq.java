package X;

import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.Afq  reason: case insensitive filesystem */
public final class C21181Afq implements C22470B9c {
    public static final C21181Afq A00 = new C21181Afq();

    public final Object BCF(C29621ca r22, C62672rm r23) {
        C178399Cy A02;
        C29621ca r6 = r22;
        C62672rm r5 = r23;
        int A17 = C18070vi.A17(r6, r5);
        if (!r5.A09(r6, "state")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        String str = (String) r5.A05(r6, cls, A0i, A0j, (Object) null, strArr, false);
        if (str == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        strArr2[0] = "catch";
        String str2 = (String) r5.A05(r6, cls, A0i, A0j, (Object) null, strArr2, false);
        if (r5.A05(r6, cls, A0i, A0j, "choice", AnonymousClass8BS.A1a(A17, 0), false) == null) {
            return null;
        }
        String[] strArr3 = new String[A17];
        strArr3[0] = "choice";
        ArrayList A0k = AnonymousClass8BX.A0k(r6, r5, new C21287AhY(12), strArr3);
        if (A0k == null || (A02 = A6w.A02(r6, r5)) == null) {
            return null;
        }
        return new C178599Ds(r6, A02, str, str2, A0k);
    }
}
