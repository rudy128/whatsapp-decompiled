package X;

/* renamed from: X.9vC  reason: invalid class name and case insensitive filesystem */
public final class C196519vC {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AEI A00(X.C29621ca r10) {
        /*
            r5 = 0
            if (r10 == 0) goto L_0x005b
            java.lang.String r0 = "id"
            X.1ca r4 = r10.A0K(r0)
            java.lang.String r0 = "request_image_url"
            X.1ca r3 = r10.A0K(r0)
            java.lang.String r0 = "original_image_url"
            X.1ca r1 = r10.A0K(r0)
            java.lang.String r0 = "original_dimensions"
            X.1ca r2 = r10.A0K(r0)
            if (r4 == 0) goto L_0x0042
            if (r1 != 0) goto L_0x0021
            if (r3 == 0) goto L_0x0042
        L_0x0021:
            java.lang.String r6 = r4.A0M()
            java.lang.String r7 = X.AnonymousClass8BU.A0o(r1)
            java.lang.String r8 = X.AnonymousClass8BU.A0o(r3)
            r1 = 0
            if (r2 == 0) goto L_0x0040
            java.lang.String r0 = "width"
            int r9 = r2.A0A(r0, r1)     // Catch:{ 1UI -> 0x003d }
            java.lang.String r0 = "height"
            int r10 = r2.A0A(r0, r1)     // Catch:{ 1UI -> 0x0048 }
            goto L_0x004f
        L_0x003d:
            r1 = move-exception
            r9 = 0
            goto L_0x0049
        L_0x0040:
            r9 = 0
            goto L_0x004e
        L_0x0042:
            java.lang.String r0 = "Connection/Product/image node missing url."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r5
        L_0x0048:
            r1 = move-exception
        L_0x0049:
            java.lang.String r0 = "Connection/Product/image dimension node missing"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004e:
            r10 = 0
        L_0x004f:
            if (r6 == 0) goto L_0x005b
            if (r7 != 0) goto L_0x0056
            if (r8 == 0) goto L_0x005b
            r7 = r8
        L_0x0056:
            X.AEI r5 = new X.AEI
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196519vC.A00(X.1ca):X.AEI");
    }
}
