package X;

import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2s3  reason: invalid class name and case insensitive filesystem */
public abstract class C62822s3 {
    public static final boolean A01(AnonymousClass1MZ r4, AnonymousClass1E7 r5, C42211xo r6) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0j(r6, r5);
        if (!r6.A02(r5) && !r6.A00(r5)) {
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A00 = C42941yz.A00(r5.A0J);
            if (A00 != null) {
                if (r4.A0K(A00) || (C17890vO.A1R(r5.A06) && r4.A0J(A00))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean A02(AnonymousClass1E7 r1) {
        C18070vi.A0d(r1, 0);
        return C17890vO.A1R(r1.A06);
    }

    public static final boolean A00(AnonymousClass1CJ r3, AnonymousClass1MZ r4, C436420i r5) {
        AnonymousClass1BI r1;
        C18070vi.A0j(r3, r4);
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A00 = C42941yz.A00(r5.A0v.A00);
        if (r5.A17()) {
            r1 = r5.A0H();
        } else {
            r1 = null;
        }
        if (A00 != null && C22971Dz.A0d(r1) && r4.A0K(A00) && !r3.A0R(A00)) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            if (r4.A0Q(A00, (UserJid) r1)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
