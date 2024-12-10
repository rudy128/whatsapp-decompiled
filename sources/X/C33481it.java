package X;

import java.util.List;

/* renamed from: X.1it  reason: invalid class name and case insensitive filesystem */
public final class C33481it {
    public final AnonymousClass11S A00;
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final C18000vb A03;
    public final AnonymousClass19K A04;

    public C33481it(AnonymousClass11S r2, AnonymousClass118 r3, C19830z4 r4, C18000vb r5, AnonymousClass19K r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r4, 5);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
    }

    public static final String A00(List list) {
        if (list.isEmpty()) {
            return "";
        }
        String valueOf = String.valueOf(((Number) list.get(0)).intValue());
        int size = list.size();
        for (int i = 1; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(",");
            sb.append(((Number) list.get(i)).intValue());
            valueOf = sb.toString();
        }
        return valueOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c3, code lost:
        if (r8 > 18000000) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r7, long r8, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures no disclosure ids to create uri"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x000c:
            X.11S r0 = r6.A00
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            java.lang.String r3 = r0.cc
            if (r3 != 0) goto L_0x002a
        L_0x0019:
            X.0z4 r0 = r6.A02
            java.lang.String r3 = r0.A0l()
            X.C18070vi.A0X(r3)
            boolean r0 = X.AnonymousClass1EG.A0H(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.String r3 = "1"
        L_0x002a:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "whatsapp.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "user-notice"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r2 = r1.appendPath(r0)
            java.lang.String r1 = "ids"
            java.lang.String r0 = A00(r7)
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            X.0vb r4 = r6.A03
            java.lang.String r1 = r4.A05()
            java.lang.String r0 = "lg"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = r4.A04()
            java.lang.String r0 = "lc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = "cc"
            java.lang.String r0 = X.AnonymousClass1K3.A00(r3)
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            android.net.Uri$Builder r3 = r2.appendQueryParameter(r0, r1)
            java.lang.String r2 = "img-size"
            X.118 r0 = r6.A01
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x00b4
            java.lang.String r0 = "hdpi"
        L_0x0092:
            android.net.Uri$Builder r0 = r3.appendQueryParameter(r2, r0)
            android.net.Uri r5 = r0.build()
            X.C18070vi.A0b(r5)
            if (r5 != 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures could not create uri for disclosure ids "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x00b4:
            java.lang.String r0 = "xxhdpi"
            goto L_0x0092
        L_0x00b8:
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            r1 = 18000000(0x112a880, double:8.8931816E-317)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
        L_0x00c5:
            r8 = r1
        L_0x00c6:
            X.9pH r3 = new X.9pH
            r3.<init>()
            java.lang.String r1 = "disclosure_ids"
            int[] r0 = X.C41431wN.A00(r7)
            r3.A01(r1, r0)
            java.lang.String r2 = "handler"
            r1 = 2
            java.util.Map r0 = r3.A00
            X.C17880vN.A1P(r2, r0, r1)
            java.lang.String r1 = r4.A05()
            java.lang.String r0 = "language"
            java.util.Map r2 = r3.A00
            r2.put(r0, r1)
            java.lang.String r1 = "url"
            java.lang.String r0 = r5.toString()
            r2.put(r1, r0)
            X.A6Y r5 = r3.A00()
            X.A1B r1 = new X.A1B
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A00 = r0
            X.A6e r4 = r1.A01()
            java.lang.Class<com.whatsapp.privacy.protocol.http.DisclosureContentWorker> r0 = com.whatsapp.privacy.protocol.http.DisclosureContentWorker.class
            X.8Jt r2 = new X.8Jt
            r2.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.content.fetch"
            r2.A07(r0)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.A06(r3, r0, r8)
            r2.A04(r5)
            java.lang.Class<com.whatsapp.privacy.protocol.http.DisclosureIconsWorker> r0 = com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.class
            X.8Jt r1 = new X.8Jt
            r1.<init>(r0)
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.icons.fetch"
            r1.A07(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.A06(r3, r0, r8)
            r1.A04(r5)
            if (r10 == 0) goto L_0x0190
            r2.A05(r3)
            r1.A05(r3)
        L_0x0136:
            X.9cO r5 = r2.A00()
            X.8Jv r5 = (X.C162248Jv) r5
            X.9cO r4 = r1.A00()
            X.8Jv r4 = (X.C162248Jv) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.content.fetch."
            r1.append(r0)
            java.lang.String r0 = A00(r7)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures: worker name: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " disclosure ids: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", expedited: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.19K r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.A7W r0 = (X.A7W) r0
            X.A7G r0 = r0.A03(r5, r3, r2)
            X.A7G r0 = r0.A03(r4)
            r0.A02()
            return
        L_0x0190:
            r2.A03(r4)
            r1.A03(r4)
            goto L_0x0136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33481it.A01(java.util.List, long, boolean):void");
    }
}
