package X;

/* renamed from: X.7MA  reason: invalid class name */
public final class AnonymousClass7MA implements B9S {
    public AnonymousClass8Ay[] A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass178 A03;
    public final AnonymousClass12C A04;

    public AnonymousClass7MA(AnonymousClass1KB r5, AnonymousClass118 r6, AnonymousClass178 r7, AnonymousClass12C r8) {
        C108985cd.A1D(r7, r8);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A00 = new AnonymousClass8Ay[]{new AnonymousClass7M8(r6), new AnonymousClass7M9(r6)};
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.6gX] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        if (r7 != 6) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C128696gX BZ9(android.content.Context r22, java.lang.String r23, java.util.List r24) {
        /*
            r21 = this;
            r4 = 0
            X.C17960vV.A00()
            r5 = r24
            boolean r1 = r5.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000e
            return r0
        L_0x000e:
            X.6gX r6 = new X.6gX
            r6.<init>()
            r8 = r21
            X.8Ay[] r3 = r8.A00
            r2 = 2
            r1 = 0
        L_0x0019:
            r9 = r3[r1]
            boolean r0 = r9.Bh1()
            if (r0 == 0) goto L_0x00cb
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            X.6kk r1 = X.C138106wX.A02
            X.12C r0 = r8.A04
            r2 = r22
            X.6wX r0 = r1.A00(r2, r0, r5)
            int r7 = r0.A00
            if (r7 == 0) goto L_0x0136
            java.util.Map r0 = r0.A01
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = X.AnonymousClass000.A15(r0)
        L_0x003d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.Object r2 = r0.getKey()
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r11 = r0.getValue()
            X.6ev r11 = (X.C127786ev) r11
            java.io.File r15 = r11.A00
            X.118 r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x00d1 }
            android.content.Context r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00d1 }
            java.lang.String r0 = X.C19620yd.A06     // Catch:{ IllegalArgumentException -> 0x00d1 }
            android.net.Uri r14 = androidx.core.content.FileProvider.A00(r1, r15, r0)     // Catch:{ IllegalArgumentException -> 0x00d1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r3 = android.util.Pair.create(r0, r0)
            X.C18070vi.A0X(r3)
            boolean r1 = r2 instanceof X.C438421d
            java.lang.String r16 = ""
            if (r1 != 0) goto L_0x00b2
            boolean r0 = r2 instanceof X.AnonymousClass21X
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r2 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x007c
            android.util.Pair r3 = X.C26511Sk.A0B(r15)
        L_0x007c:
            if (r14 == 0) goto L_0x003d
            java.lang.Object r2 = r3.first
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r1 = r3.second
            java.lang.Number r1 = (java.lang.Number) r1
            if (r2 == 0) goto L_0x00a6
            int r0 = r2.intValue()
            if (r0 != 0) goto L_0x00a6
            r0 = 0
        L_0x0090:
            int r20 = X.C26511Sk.A03(r15)
            java.lang.String r2 = r11.A01
            r5.add(r14)
            X.6j0 r13 = new X.6j0
            r17 = r2
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r20)
            r10.add(r13)
            goto L_0x003d
        L_0x00a6:
            int r0 = r1.intValue()
            double r0 = (double) r0
            int r2 = X.AnonymousClass3MY.A03(r2)
            double r2 = (double) r2
            double r0 = r0 / r2
            goto L_0x0090
        L_0x00b2:
            X.21V r2 = (X.AnonymousClass21V) r2
            java.lang.String r0 = r2.A18()
            if (r0 == 0) goto L_0x00bc
            r16 = r0
        L_0x00bc:
            if (r1 == 0) goto L_0x00c6
            android.util.Pair r3 = X.C26511Sk.A0B(r15)
        L_0x00c2:
            X.C18070vi.A0b(r3)
            goto L_0x007c
        L_0x00c6:
            android.util.Pair r3 = X.C26511Sk.A0D(r15)
            goto L_0x00c2
        L_0x00cb:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0136
            goto L_0x0019
        L_0x00d1:
            X.1KB r3 = r8.A01
            X.178 r2 = r8.A03
            r1 = 16
            X.7RS r0 = new X.7RS
            r4 = r23
            r0.<init>(r1, r4, r2)
            r3.A0J(r0)
            java.lang.String r0 = "getSharingIntent: Attempting to share file failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x00e8:
            android.content.Intent r8 = r9.BZ8(r10, r7)
            r6.A01 = r8
            r6.A02 = r5
            if (r8 != 0) goto L_0x0102
            boolean r0 = r9 instanceof X.AnonymousClass7M8
            if (r0 == 0) goto L_0x00fe
            r0 = 7
            r1 = 1
            if (r7 == r0) goto L_0x00ff
            r0 = 6
            r1 = 2
            if (r7 == r0) goto L_0x00ff
        L_0x00fe:
            r1 = 0
        L_0x00ff:
            r6.A00 = r1
            return r6
        L_0x0102:
            boolean r0 = r5.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r5.get(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            android.content.ClipData r4 = android.content.ClipData.newRawUri(r1, r0)
            int r3 = r5.size()
            r2 = 1
        L_0x011b:
            if (r2 >= r3) goto L_0x012e
            java.lang.Object r1 = r5.get(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.ClipData$Item r0 = new android.content.ClipData$Item
            r0.<init>(r1)
            r4.addItem(r0)
            int r2 = r2 + 1
            goto L_0x011b
        L_0x012e:
            if (r4 == 0) goto L_0x0133
            r8.setClipData(r4)
        L_0x0133:
            r8.addFlags(r7)
        L_0x0136:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7MA.BZ9(android.content.Context, java.lang.String, java.util.List):X.6gX");
    }
}
