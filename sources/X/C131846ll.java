package X;

/* renamed from: X.6ll  reason: invalid class name and case insensitive filesystem */
public final class C131846ll {
    public final AnonymousClass00H A00;

    public C131846ll(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:51|(3:53|54|55)|56|57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        r3.addCategory("android.intent.category.BROWSABLE");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0132 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r8, android.net.Uri r9, X.C131856lm r10) {
        /*
            r7 = this;
            java.lang.String r1 = r9.toString()
            r2 = 0
            if (r1 == 0) goto L_0x013c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x013c
            android.content.Intent r1 = X.AnonymousClass6VV.A00(r1)     // Catch:{ URISyntaxException -> 0x013c }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)     // Catch:{ URISyntaxException -> 0x013c }
            java.lang.String r5 = "android.intent.category.BROWSABLE"
            r1.addCategory(r5)     // Catch:{ URISyntaxException -> 0x013c }
            r1.setComponent(r2)     // Catch:{ URISyntaxException -> 0x013c }
            r1.setSelector(r2)     // Catch:{ URISyntaxException -> 0x013c }
            java.lang.String r6 = r9.toString()
            java.lang.String r1 = r1.getPackage()
            boolean r0 = r10 instanceof X.AnonymousClass6Pt
            if (r0 == 0) goto L_0x004d
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "url"
            r1.putString(r0, r6)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x013c
            android.content.Intent r3 = X.AnonymousClass6VV.A00(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            r3.setComponent(r2)
            r3.setSelector(r2)
            goto L_0x0139
        L_0x004d:
            boolean r3 = r10 instanceof X.AnonymousClass6Pu
            if (r3 == 0) goto L_0x00f4
            android.os.Bundle r4 = X.C17880vN.A0D()
            java.lang.String r2 = "url"
            r4.putString(r2, r6)
            java.lang.String r0 = "package_name"
            r4.putString(r0, r1)
            java.lang.String r1 = "package_names"
            java.util.ArrayList r0 = X.AnonymousClass6Pu.A00
        L_0x0063:
            r4.putStringArrayList(r1, r0)
        L_0x0066:
            if (r3 == 0) goto L_0x00ce
            java.lang.String r0 = "package_name"
            java.lang.String r6 = r4.getString(r0)
            if (r6 == 0) goto L_0x008d
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "market"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "details"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "id"
            android.net.Uri r0 = X.C17890vO.A0C(r1, r0, r6)
        L_0x0087:
            boolean r0 = r10.A00(r8, r0, r4)
            if (r0 != 0) goto L_0x013c
        L_0x008d:
            if (r3 == 0) goto L_0x009d
            java.lang.String r0 = r4.getString(r2)
            if (r0 == 0) goto L_0x013c
            android.net.Uri r0 = X.C26215Cuu.A01(r0)
        L_0x0099:
            r10.A00(r8, r0, r4)
            return
        L_0x009d:
            boolean r0 = r10 instanceof X.AnonymousClass6Pv
            java.lang.String r3 = r4.getString(r2)
            if (r0 == 0) goto L_0x0111
            if (r3 == 0) goto L_0x013c
            java.util.ArrayList r1 = X.AnonymousClass6Pv.A01
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00b4
            return
        L_0x00b4:
            java.util.Iterator r2 = r1.iterator()
        L_0x00b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.String r1 = X.C17880vN.A0v(r2)
            r0 = 1
            boolean r0 = X.AnonymousClass1YE.A0A(r3, r1, r0)
            if (r0 == 0) goto L_0x00b8
            android.net.Uri r0 = X.C26215Cuu.A01(r3)
            goto L_0x0099
        L_0x00ce:
            boolean r0 = r10 instanceof X.AnonymousClass6Pv
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "package_name"
            java.lang.String r6 = r4.getString(r0)
            if (r6 == 0) goto L_0x008d
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "samsungapps"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "ProductDetail"
            android.net.Uri$Builder r0 = r1.authority(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r6)
            android.net.Uri r0 = r0.build()
            goto L_0x0087
        L_0x00f4:
            boolean r0 = r10 instanceof X.AnonymousClass6Pv
            android.os.Bundle r4 = X.C17880vN.A0D()
            java.lang.String r2 = "url"
            if (r0 == 0) goto L_0x010c
            r4.putString(r2, r6)
            java.lang.String r0 = "package_name"
            r4.putString(r0, r1)
            java.lang.String r1 = "package_names"
            java.util.ArrayList r0 = X.AnonymousClass6Pv.A00
            goto L_0x0063
        L_0x010c:
            r4.putString(r2, r6)
            goto L_0x0066
        L_0x0111:
            if (r3 == 0) goto L_0x013c
            r2 = 0
            android.net.Uri r1 = X.C26215Cuu.A01(r3)
            r0 = 1
            android.content.Intent r1 = X.C137576vg.A00(r8, r1, r0)
            android.content.Intent r3 = X.AnonymousClass6VV.A00(r3)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            r3.setComponent(r2)
            r3.setSelector(r2)
            if (r1 == 0) goto L_0x0132
            X.C180869Og.A00(r8, r1)     // Catch:{ ActivityNotFoundException -> 0x0132 }
            return
        L_0x0132:
            X.C180869Og.A00(r8, r3)     // Catch:{ ActivityNotFoundException -> 0x0136 }
            return
        L_0x0136:
            r3.addCategory(r5)
        L_0x0139:
            X.C180869Og.A00(r8, r3)     // Catch:{  }
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131846ll.A00(android.content.Context, android.net.Uri, X.6lm):void");
    }
}
