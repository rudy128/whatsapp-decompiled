package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Du  reason: invalid class name and case insensitive filesystem */
public final class C22921Du {
    public static volatile C22921Du A01;
    public final C002100z A00 = new C002100z(1000);

    public static Jid A00(String str) {
        if (str.equals("s.whatsapp.net")) {
            return C173438v4.A00;
        }
        if (str.equals("g.us")) {
            return C173428v3.A00;
        }
        if (str.equals("call")) {
            return C23996Btd.A00;
        }
        return null;
    }

    public static C22921Du A01() {
        if (A01 == null) {
            synchronized (C22921Du.class) {
                if (A01 == null) {
                    A01 = new C22921Du();
                }
            }
        }
        return A01;
    }

    public UserJid A04(String str, String str2) {
        C22911Dt r0 = Jid.Companion;
        String A012 = C22911Dt.A01(str, str2);
        C002100z r2 = this.A00;
        Jid jid = (Jid) r2.A04(A012);
        if (C22971Dz.A0d(jid)) {
            return (UserJid) jid;
        }
        UserJid A02 = A02(str, str2);
        r2.A08(A012, A02);
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        return new X.AnonymousClass1E2(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r2.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r1.equals("Server") != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (r1.equals("0") != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = com.whatsapp.jid.Jid.Companion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        return new com.whatsapp.jid.PhoneUserJid(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        return X.C42541yL.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        return X.C173458v6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        throw new X.AnonymousClass11T(X.C22911Dt.A01(r1, r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.jid.UserJid A02(java.lang.String r1, java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -2070199035: goto L_0x006c;
                case -1673355044: goto L_0x004e;
                case -1211484089: goto L_0x004b;
                case -1102975408: goto L_0x0040;
                case -605206432: goto L_0x0032;
                case 97735: goto L_0x0024;
                case 107143: goto L_0x0021;
                case 1958063037: goto L_0x0013;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Dt r0 = com.whatsapp.jid.Jid.Companion
            java.lang.String r1 = X.C22911Dt.A01(r1, r2)
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0013:
            java.lang.String r0 = "interop"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1ED r0 = new X.1ED
            r0.<init>(r1)
            return r0
        L_0x0021:
            java.lang.String r0 = "lid"
            goto L_0x0034
        L_0x0024:
            java.lang.String r0 = "bot"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1yc r0 = new X.1yc
            r0.<init>(r1)
            return r0
        L_0x0032:
            java.lang.String r0 = "hosted.lid"
        L_0x0034:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1E2 r0 = new X.1E2
            r0.<init>(r1)
            return r0
        L_0x0040:
            java.lang.String r0 = "lid_me"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.8v7 r0 = X.C173468v7.A00
            return r0
        L_0x004b:
            java.lang.String r0 = "hosted"
            goto L_0x0050
        L_0x004e:
            java.lang.String r0 = "s.whatsapp.net"
        L_0x0050:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "Server"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0078
            com.whatsapp.jid.PhoneUserJid r0 = new com.whatsapp.jid.PhoneUserJid
            r0.<init>(r1)
            return r0
        L_0x006c:
            java.lang.String r0 = "status_me"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.1E5 r0 = X.AnonymousClass1E5.A00
            return r0
        L_0x0078:
            X.1yL r0 = X.C42541yL.A00
            return r0
        L_0x007b:
            X.8v6 r0 = X.C173458v6.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22921Du.A02(java.lang.String, java.lang.String):com.whatsapp.jid.UserJid");
    }

    public C29681ch A03(String str, String str2) {
        String trim = str.trim();
        if (trim.isEmpty() || "0".equals(trim) || trim.indexOf("0") == 0) {
            throw new AnonymousClass11T("Identifier must be a valid number starting with non-zero");
        }
        C22911Dt r0 = Jid.Companion;
        String A012 = C22911Dt.A01(str, str2);
        if ("newsletter".equals(str2)) {
            C002100z r2 = this.A00;
            Jid jid = (Jid) r2.A04(A012);
            if (C22971Dz.A0V(jid)) {
                return (C29681ch) jid;
            }
            C29681ch r1 = new C29681ch(str);
            r2.A08(A012, r1);
            return r1;
        }
        throw new AnonymousClass11T(A012);
    }
}
