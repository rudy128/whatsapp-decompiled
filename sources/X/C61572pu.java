package X;

/* renamed from: X.2pu  reason: invalid class name and case insensitive filesystem */
public final class C61572pu {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C61572pu r10, X.AnonymousClass206 r11) {
        /*
            X.00H r0 = r10.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 12655(0x316f, float:1.7733E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00c9
            X.205 r0 = r11.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0a(r1)
            if (r0 != 0) goto L_0x00c9
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r1 = X.AnonymousClass2TJ.A00(r11)
            if (r1 == 0) goto L_0x00c9
            boolean r0 = X.AnonymousClass1YF.A0T(r1)
            if (r0 != 0) goto L_0x00c9
            X.00H r0 = r10.A03
            r0.get()
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r1)
            java.util.ArrayList r9 = X.C32011gU.A01(r0)
            boolean r0 = X.C17880vN.A1X(r9)
            if (r0 == 0) goto L_0x00b3
            X.00H r0 = r10.A02
            java.lang.Object r1 = r0.get()
            X.2aF r1 = (X.C52022aF) r1
            r7 = 1
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00b3
            X.1Cd r0 = r1.A00
            X.1au r5 = r0.A05()
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x005d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x00a2 }
            X.1D6 r1 = (X.AnonymousClass1D6) r1     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = r1.first     // Catch:{ all -> 0x00a2 }
            int r2 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = r1.second     // Catch:{ all -> 0x00a2 }
            int r1 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x00a2 }
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x00a2 }
            X.AnonymousClass206.A04(r4, r11)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "start_index"
            X.C17880vN.A18(r4, r0, r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "end_index"
            X.C17880vN.A18(r4, r0, r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "span_type"
            X.C17880vN.A18(r4, r0, r7)     // Catch:{ all -> 0x00a2 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a2 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "message_span_indices"
            java.lang.String r1 = "INSERT_MESSAGE_LINK_INDICES_TABLE"
            r0 = 4
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x005d
        L_0x009b:
            r6.A00()     // Catch:{ all -> 0x00a2 }
            r6.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x00b0
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x00b0:
            r5.close()
        L_0x00b3:
            boolean r0 = X.C17880vN.A1X(r9)
            if (r0 == 0) goto L_0x00c9
            r0 = 65536(0x10000, float:9.18355E-41)
            r11.A0V(r0)
            X.00H r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.121 r0 = (X.AnonymousClass121) r0
            r0.CQw(r11)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61572pu.A00(X.2pu, X.206):void");
    }

    public C61572pu(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }
}
