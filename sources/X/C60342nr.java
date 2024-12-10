package X;

/* renamed from: X.2nr  reason: invalid class name and case insensitive filesystem */
public abstract class C60342nr {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r0 = r2.A01(r0);
        X.C18070vi.A0b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.AnonymousClass118 r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            if (r3 == 0) goto L_0x000d
            int r0 = r3.hashCode()
            switch(r0) {
                case 116079: goto L_0x003c;
                case 3045982: goto L_0x0030;
                case 3146030: goto L_0x001c;
                case 555704345: goto L_0x0010;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = ""
        L_0x000f:
            return r0
        L_0x0010:
            java.lang.String r0 = "catalog"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 2131886585(0x7f1201f9, float:1.9407753E38)
            goto L_0x0048
        L_0x001c:
            java.lang.String r0 = "flow"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 0
            if (r4 == 0) goto L_0x002c
            org.json.JSONObject r1 = X.C17880vN.A16(r4)     // Catch:{ JSONException -> 0x0057 }
            goto L_0x002d
        L_0x002c:
            r1 = r0
        L_0x002d:
            if (r1 == 0) goto L_0x000f
            goto L_0x0050
        L_0x0030:
            java.lang.String r0 = "call"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 2131886584(0x7f1201f8, float:1.940775E38)
            goto L_0x0048
        L_0x003c:
            java.lang.String r0 = "url"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 2131886586(0x7f1201fa, float:1.9407755E38)
        L_0x0048:
            java.lang.String r0 = r2.A01(r0)
            X.C18070vi.A0b(r0)
            return r0
        L_0x0050:
            java.lang.String r0 = "cta_text"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0057 }
            return r0
        L_0x0057:
            java.lang.String r0 = "AutomatedGreetingMessageNativeFlowInfoConverter/getFlowsCtaText: No cta_text type"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131886583(0x7f1201f7, float:1.9407749E38)
            java.lang.String r0 = r2.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60342nr.A00(X.118, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final boolean A01(String str, String str2) {
        String[] strArr = new String[4];
        boolean z = false;
        strArr[0] = "call";
        strArr[1] = "catalog";
        strArr[2] = "flow";
        if (!C29431cG.A18(C18070vi.A0O("url", strArr, 3), str)) {
            return false;
        }
        if (!str.equals("url")) {
            return true;
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        return !z;
    }
}
