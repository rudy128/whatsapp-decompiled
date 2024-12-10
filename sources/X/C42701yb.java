package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.1yb  reason: invalid class name and case insensitive filesystem */
public abstract class C42701yb {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C22971Dz.A0M(r2) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.jid.UserJid A00(com.whatsapp.jid.Jid r2) {
        /*
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.lang.String r0 = r2.user
            boolean r0 = A02(r0)
            if (r0 == 0) goto L_0x0013
            boolean r0 = X.C22971Dz.A0M(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "getRemoteTargetJidForOutgoingMessage must be phone number based bot jid"
            X.C17960vV.A0F(r1, r0)
            X.1BI r1 = X.C22971Dz.A00(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            com.whatsapp.jid.UserJid r0 = X.C22971Dz.A04(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42701yb.A00(com.whatsapp.jid.Jid):com.whatsapp.jid.UserJid");
    }

    public static final boolean A01(AnonymousClass1BI r2) {
        if (r2 != null) {
            if (r2 instanceof C42711yc) {
                return true;
            }
            if (r2 instanceof PhoneUserJid) {
                return A02(r2.user);
            }
        }
        return false;
    }

    public static final boolean A02(String str) {
        C18070vi.A0d(str, 0);
        C42731ye A00 = C42721yd.A00(str);
        if (A00 != null) {
            long j = A00.A00;
            if (AnonymousClass04C.A00(j, 13135550000L) < 0 || AnonymousClass04C.A00(j, 13135559999L) > 0) {
                return AnonymousClass04C.A00(j, 13165550000L) >= 0 && AnonymousClass04C.A00(j, 13165550099L) <= 0;
            }
            return true;
        }
    }
}
