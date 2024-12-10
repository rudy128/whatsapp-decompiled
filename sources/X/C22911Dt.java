package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1Dt  reason: invalid class name and case insensitive filesystem */
public final class C22911Dt {
    public static final String A01(String str, String str2) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 1);
        if (str.length() == 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    public final Jid A02(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            obj = A00(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (Jid) obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019b, code lost:
        throw new X.AnonymousClass11T(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        throw new X.AnonymousClass11T(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r3.equals(r0) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r8 = r7.lastIndexOf(46);
        r6 = r7.lastIndexOf(58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        if (r6 != -1) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        if (r8 != -1) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dc, code lost:
        r0 = X.C22921Du.A02(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r1 = r7.length();
        r0 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if (r6 == r0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        if (r8 == r0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        if (r6 == -1) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ef, code lost:
        if (r8 == -1) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f1, code lost:
        if (r8 < r6) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        if (r6 != -1) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f5, code lost:
        r4 = 0;
        r1 = r9.A04(r7.substring(0, r8), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
        if (r6 == -1) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r4 = java.lang.Integer.parseInt(r7.substring(r6 + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if ("lid".equals(r3) == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r0 = new X.C42521yJ(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
        if ("hosted.lid".equals(r3) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        r0 = new X.C47732Jq((X.AnonymousClass1E2) r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0131, code lost:
        if ("interop".equals(r3) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        r0 = new X.AnonymousClass1EF((X.AnonymousClass1ED) r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0141, code lost:
        if ("hosted".equals(r3) == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0143, code lost:
        r0 = new X.C47722Jp(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014f, code lost:
        if ("bot".equals(r3) == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0151, code lost:
        r0 = new X.C47702Jn((X.C42711yc) r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0159, code lost:
        r0 = new X.AnonymousClass1E3(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0195, code lost:
        throw new X.AnonymousClass11T(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.jid.Jid A00(java.lang.String r10) {
        /*
            X.1Du r9 = com.whatsapp.jid.Jid.JID_FACTORY
            if (r10 == 0) goto L_0x01b0
            X.00z r2 = r9.A00
            java.lang.Object r0 = r2.A04(r10)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 != 0) goto L_0x018c
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x01a8
            r0 = 64
            int r1 = r10.lastIndexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x015f
            if (r1 == 0) goto L_0x019c
            int r0 = r10.length()
            if (r1 == r0) goto L_0x019c
            r0 = 0
            java.lang.String r7 = r10.substring(r0, r1)
            int r0 = r1 + 1
            java.lang.String r3 = r10.substring(r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1673355044: goto L_0x003d;
                case -1618876223: goto L_0x0051;
                case -1211484089: goto L_0x0079;
                case -605206432: goto L_0x007c;
                case 97735: goto L_0x007f;
                case 107143: goto L_0x0082;
                case 3045982: goto L_0x0085;
                case 3116421: goto L_0x0094;
                case 3556308: goto L_0x00a3;
                case 1102578873: goto L_0x00b3;
                case 1180231958: goto L_0x017c;
                case 1958063037: goto L_0x00c1;
                default: goto L_0x0037;
            }
        L_0x0037:
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x003d:
            java.lang.String r0 = "s.whatsapp.net"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "gdpr"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00cb
            X.688 r0 = X.AnonymousClass688.A00
            goto L_0x0189
        L_0x0051:
            java.lang.String r0 = "broadcast"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "location"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0065
            X.8v1 r0 = X.C173408v1.A00
            goto L_0x0189
        L_0x0065:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0072
            X.1cg r0 = X.C29671cg.A00
            goto L_0x0189
        L_0x0072:
            X.2Jo r0 = new X.2Jo
            r0.<init>(r7)
            goto L_0x0189
        L_0x0079:
            java.lang.String r0 = "hosted"
            goto L_0x00c3
        L_0x007c:
            java.lang.String r0 = "hosted.lid"
            goto L_0x00c3
        L_0x007f:
            java.lang.String r0 = "bot"
            goto L_0x00c3
        L_0x0082:
            java.lang.String r0 = "lid"
            goto L_0x00c3
        L_0x0085:
            java.lang.String r0 = "call"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.8v5 r0 = new X.8v5
            r0.<init>(r7)
            goto L_0x0189
        L_0x0094:
            java.lang.String r0 = "g.us"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1EC r0 = new X.1EC
            r0.<init>(r7)
            goto L_0x0189
        L_0x00a3:
            java.lang.String r0 = "temp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1EB r0 = new X.1EB
            r0.<init>(r7)
            goto L_0x0189
        L_0x00b3:
            java.lang.String r0 = "newsletter"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1ch r0 = r9.A03(r7, r3)
            goto L_0x0189
        L_0x00c1:
            java.lang.String r0 = "interop"
        L_0x00c3:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00cb
            goto L_0x0037
        L_0x00cb:
            r0 = 46
            int r8 = r7.lastIndexOf(r0)
            r0 = 58
            int r6 = r7.lastIndexOf(r0)
            r5 = -1
            if (r6 != r5) goto L_0x00e2
            if (r8 != r5) goto L_0x00e2
            com.whatsapp.jid.UserJid r0 = X.C22921Du.A02(r7, r3)
            goto L_0x0189
        L_0x00e2:
            int r1 = r7.length()
            int r0 = r1 + -1
            if (r6 == r0) goto L_0x0196
            if (r8 == r0) goto L_0x0196
            if (r6 == r5) goto L_0x00ef
            r1 = r6
        L_0x00ef:
            if (r8 == r5) goto L_0x0103
            if (r8 < r6) goto L_0x00f5
            if (r6 != r5) goto L_0x0103
        L_0x00f5:
            r4 = 0
            java.lang.String r0 = r7.substring(r4, r8)
            com.whatsapp.jid.UserJid r1 = r9.A04(r0, r3)
            if (r6 == r5) goto L_0x010d
            int r0 = r6 + 1
            goto L_0x0105
        L_0x0103:
            r8 = r1
            goto L_0x00f5
        L_0x0105:
            java.lang.String r0 = r7.substring(r0)     // Catch:{ NumberFormatException -> 0x0190 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0190 }
        L_0x010d:
            java.lang.String r0 = "lid"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x011b
            X.1yJ r0 = new X.1yJ
            r0.<init>(r1, r4)
            goto L_0x0189
        L_0x011b:
            java.lang.String r0 = "hosted.lid"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x012b
            X.1E2 r1 = (X.AnonymousClass1E2) r1
            X.2Jq r0 = new X.2Jq
            r0.<init>(r1, r4)
            goto L_0x0189
        L_0x012b:
            java.lang.String r0 = "interop"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x013b
            X.1ED r1 = (X.AnonymousClass1ED) r1
            X.1EF r0 = new X.1EF
            r0.<init>(r1, r4)
            goto L_0x0189
        L_0x013b:
            java.lang.String r0 = "hosted"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0149
            X.2Jp r0 = new X.2Jp
            r0.<init>(r1, r4)
            goto L_0x0189
        L_0x0149:
            java.lang.String r0 = "bot"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0159
            X.1yc r1 = (X.C42711yc) r1
            X.2Jn r0 = new X.2Jn
            r0.<init>(r1, r4)
            goto L_0x0189
        L_0x0159:
            X.1E3 r0 = new X.1E3
            r0.<init>(r1, r4)
            goto L_0x0189
        L_0x015f:
            com.whatsapp.jid.Jid r0 = X.C22921Du.A00(r10)
            if (r0 != 0) goto L_0x0189
            java.lang.String r0 = "status_me"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0171
            X.1E5 r0 = X.AnonymousClass1E5.A00
            goto L_0x0189
        L_0x0171:
            java.lang.String r0 = "lid_me"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01a2
            X.8v7 r0 = X.C173468v7.A00
            goto L_0x0189
        L_0x017c:
            java.lang.String r0 = "interop.g.us"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.8v2 r0 = new X.8v2
            r0.<init>(r7)
        L_0x0189:
            r2.A08(r10, r0)
        L_0x018c:
            X.C18070vi.A0X(r0)
            return r0
        L_0x0190:
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x0196:
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x019c:
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x01a2:
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x01a8:
            java.lang.String r1 = "<empty>"
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01b0:
            java.lang.String r1 = "null"
            X.11T r0 = new X.11T
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22911Dt.A00(java.lang.String):com.whatsapp.jid.Jid");
    }
}
