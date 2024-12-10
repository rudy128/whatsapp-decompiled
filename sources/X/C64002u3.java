package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.2u3  reason: invalid class name and case insensitive filesystem */
public abstract class C64002u3 {
    public static final int A00(int i) {
        if (i < 32) {
            return 1;
        }
        if (i < 64) {
            return 2;
        }
        if (i < 128) {
            return 3;
        }
        if (i < 256) {
            return 4;
        }
        if (i < 512) {
            return 5;
        }
        if (i < 1024) {
            return 16;
        }
        if (i < 1500) {
            return 7;
        }
        if (i < 2000) {
            return 8;
        }
        if (i < 2500) {
            return 9;
        }
        if (i < 3000) {
            return 10;
        }
        if (i < 3500) {
            return 11;
        }
        if (i < 4000) {
            return 12;
        }
        if (i >= 4500) {
            return i < 5000 ? 14 : 15;
        }
        return 13;
    }

    public static final int A01(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static final int A02(int i) {
        if (i < 4) {
            return 1;
        }
        if (i < 8) {
            return 2;
        }
        if (i < 16) {
            return 3;
        }
        if (i < 32) {
            return 4;
        }
        if (i < 64) {
            return 5;
        }
        if (i < 128) {
            return 6;
        }
        if (i < 256) {
            return 7;
        }
        if (i < 512) {
            return 8;
        }
        if (i < 999) {
            return 9;
        }
        if (i < 1500) {
            return 10;
        }
        if (i < 2000) {
            return 11;
        }
        if (i < 2500) {
            return 12;
        }
        if (i < 3000) {
            return 13;
        }
        if (i < 3500) {
            return 14;
        }
        if (i >= 4000) {
            return i < 4500 ? 16 : 17;
        }
        return 15;
    }

    public static final int A03(int i) {
        if (i <= 33) {
            return 1;
        }
        if (i <= 65) {
            return 2;
        }
        if (i <= 129) {
            return 3;
        }
        if (i <= 257) {
            return 4;
        }
        if (i <= 513) {
            return 5;
        }
        if (i <= 1025) {
            return 16;
        }
        if (i <= 1501) {
            return 7;
        }
        if (i <= 2001) {
            return 8;
        }
        if (i <= 2501) {
            return 9;
        }
        if (i <= 3001) {
            return 10;
        }
        if (i <= 3501) {
            return 11;
        }
        if (i <= 4001) {
            return 12;
        }
        if (i > 4501) {
            return i <= 5001 ? 14 : 15;
        }
        return 13;
    }

    public static final int A05(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        if (C22971Dz.A0N(r1.A0H())) {
            return 3;
        }
        return A04(r1.A0v.A00);
    }

    public static final Integer A07(AnonymousClass1CJ r1, AnonymousClass1BI r2) {
        C18070vi.A0d(r1, 1);
        if (!C22971Dz.A0e(r2)) {
            return null;
        }
        GroupJid groupJid = (GroupJid) r2;
        if (!C22971Dz.A0e(groupJid)) {
            return null;
        }
        int A06 = r1.A06(groupJid);
        if (A06 != 2) {
            int i = 3;
            if (A06 != 3) {
                if (A06 != 6) {
                    i = 1;
                }
            }
            return Integer.valueOf(i);
        }
        return 2;
    }

    public static final int A06(String str) {
        if (C18070vi.A18(str, "lid")) {
            return 2;
        }
        C18070vi.A18(str, "pn");
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (X.C20133A8t.A0F(r3) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A09(X.C63362sw r3) {
        /*
            java.lang.Class<X.34u> r0 = X.C688134u.class
            X.B5K r2 = X.C63362sw.A00(r3, r0)
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L_0x000f
            if (r2 != 0) goto L_0x000f
            r0 = 0
            return r0
        L_0x000f:
            java.lang.String r1 = "peer"
            java.lang.String r0 = r3.A0N
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r1 = 1
        L_0x001a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x001f:
            java.lang.String r1 = "medianotify"
            java.lang.String r0 = r3.A0R
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            r1 = 4
            goto L_0x001a
        L_0x002b:
            boolean r0 = X.C20133A8t.A0E(r3)
            if (r0 != 0) goto L_0x0038
            boolean r0 = X.C20133A8t.A0F(r3)
            r1 = 3
            if (r0 == 0) goto L_0x001a
        L_0x0038:
            r1 = 2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64002u3.A09(X.2sw):java.lang.Integer");
    }

    public static final Integer A0A(C29621ca r3) {
        int i;
        C29621ca A0K = r3.A0K("meta");
        if (A0K == null || A0K.A0Q("appdata", (String) null) == null) {
            return null;
        }
        if ("peer".equals(r3.A0Q("category", (String) null))) {
            i = 1;
        } else {
            i = 3;
            if ("medianotify".equals(r3.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                i = 4;
            }
        }
        return Integer.valueOf(i);
    }

    public static final String A0B(AnonymousClass206 r5) {
        String str;
        AnonymousClass205 r4 = r5.A0v;
        AnonymousClass1BI r1 = r4.A00;
        AnonymousClass1BI r3 = null;
        if (r1 == null) {
            return null;
        }
        if (C22971Dz.A0e(r1) || C22971Dz.A0N(r1)) {
            r3 = r5.A0H();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r1.getRawString());
        A10.append('_');
        A10.append(r4.A01);
        A10.append('_');
        A10.append(r4.A02 ? 1 : 0);
        A10.append('_');
        if (r3 == null || (str = r3.getRawString()) == null) {
            str = "0";
        }
        return AnonymousClass000.A0y(str, A10);
    }

    public static final int A04(Jid jid) {
        if (C22971Dz.A0e(jid)) {
            return 2;
        }
        if (C22971Dz.A0a(jid)) {
            return 4;
        }
        if (C22971Dz.A0O(jid)) {
            return 3;
        }
        if (C22971Dz.A0V(jid)) {
            return 5;
        }
        if (C22971Dz.A0S(jid)) {
            return 6;
        }
        return 1;
    }

    public static final Integer A08(AnonymousClass1BI r1) {
        int i;
        if (C22971Dz.A0e(r1)) {
            i = 2;
        } else if (C22971Dz.A0a(r1)) {
            i = 4;
        } else if (C22971Dz.A0O(r1)) {
            i = 3;
        } else if (C22971Dz.A0V(r1)) {
            i = 5;
        } else if (C22971Dz.A0S(r1)) {
            i = 6;
        } else if (!C22971Dz.A0d(r1)) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
