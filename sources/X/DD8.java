package X;

public class DD8 implements E4W {
    public final E7Y A00;
    public final C24661CEb A01;
    public final E4W A02;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0102, code lost:
        if (r2 != false) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCn(X.C25268CcD r18, X.ECs r19) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "BitmapMemoryCacheProducer#produceResults"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x0108 }
        L_0x000d:
            r4 = r19
            r15 = r4
            X.DDI r15 = (X.DDI) r15     // Catch:{ all -> 0x0108 }
            X.E9w r8 = r15.A05     // Catch:{ all -> 0x0108 }
            r9 = r17
            boolean r10 = r9 instanceof X.C22854BSg     // Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x0038
            java.lang.String r7 = "BitmapMemoryCacheGetProducer"
        L_0x001c:
            r8.C1r(r4, r7)     // Catch:{ all -> 0x0108 }
            X.Cbv r6 = r15.A07     // Catch:{ all -> 0x0108 }
            java.lang.Object r5 = r15.A08     // Catch:{ all -> 0x0108 }
            android.net.Uri r0 = r6.A03     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0108 }
            X.Clx r1 = r6.A06     // Catch:{ all -> 0x0108 }
            X.CmA r0 = r6.A04     // Catch:{ all -> 0x0108 }
            X.DAM r12 = new X.DAM     // Catch:{ all -> 0x0108 }
            r12.<init>(r0, r1, r2)     // Catch:{ all -> 0x0108 }
            r12.A00 = r5     // Catch:{ all -> 0x0108 }
            r1 = 1
            int r13 = r6.A00     // Catch:{ all -> 0x0108 }
            goto L_0x003b
        L_0x0038:
            java.lang.String r7 = "BitmapMemoryCacheProducer"
            goto L_0x001c
        L_0x003b:
            r0 = r13 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6 = 0
            if (r0 == 0) goto L_0x004b
            X.E7Y r0 = r9.A00     // Catch:{ all -> 0x0108 }
            X.DRN r14 = r0.BMF(r12)     // Catch:{ all -> 0x0108 }
            goto L_0x004c
        L_0x004b:
            r14 = r6
        L_0x004c:
            java.lang.String r11 = "memory_bitmap"
            java.lang.String r5 = "cached_value_found"
            if (r14 == 0) goto L_0x009f
            java.lang.Object r0 = r14.A05()     // Catch:{ all -> 0x0108 }
            X.E4V r0 = (X.E4V) r0     // Catch:{ all -> 0x0108 }
            java.util.Map r0 = r0.BRV()     // Catch:{ all -> 0x0108 }
            r4.CD3(r0)     // Catch:{ all -> 0x0108 }
            java.lang.Object r2 = r14.A05()     // Catch:{ all -> 0x0108 }
            X.EDo r2 = (X.C28672EDo) r2     // Catch:{ all -> 0x0108 }
            boolean r0 = r2 instanceof X.BSF     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x0086
            X.BSF r2 = (X.BSF) r2     // Catch:{ all -> 0x0108 }
            X.CYh r0 = r2.A01     // Catch:{ all -> 0x0108 }
        L_0x006d:
            boolean r2 = r0.A01     // Catch:{ all -> 0x0108 }
            if (r2 == 0) goto L_0x0098
            boolean r0 = r8.CFc(r4, r7)     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "true"
            java.util.Map r0 = X.C27311Dbi.A00(r5, r0)     // Catch:{ all -> 0x0108 }
        L_0x007d:
            r8.C1q(r4, r7, r0)     // Catch:{ all -> 0x0108 }
            r8.C9Q(r4, r7, r1)     // Catch:{ all -> 0x0108 }
            goto L_0x0089
        L_0x0084:
            r0 = r6
            goto L_0x007d
        L_0x0086:
            X.CYh r0 = X.C25112CYh.A03     // Catch:{ all -> 0x0108 }
            goto L_0x006d
        L_0x0089:
            if (r10 == 0) goto L_0x008e
            java.lang.String r0 = "pipe_ui"
            goto L_0x0090
        L_0x008e:
            java.lang.String r0 = "pipe_bg"
        L_0x0090:
            r4.CD4(r11, r0)     // Catch:{ all -> 0x0108 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A05(r0)     // Catch:{ all -> 0x0108 }
        L_0x0098:
            r3.A07(r14, r2)     // Catch:{ all -> 0x0108 }
            r14.close()     // Catch:{ all -> 0x0108 }
            goto L_0x0102
        L_0x009f:
            X.BzR r0 = r15.A06     // Catch:{ all -> 0x0108 }
            int r14 = r0.mValue     // Catch:{ all -> 0x0108 }
            X.BzR r0 = X.C24330BzR.BITMAP_MEMORY_CACHE     // Catch:{ all -> 0x0108 }
            int r0 = r0.mValue     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "false"
            if (r14 < r0) goto L_0x00cd
            boolean r0 = r8.CFc(r4, r7)     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00bd
            java.util.Map r0 = X.C27311Dbi.A00(r5, r2)     // Catch:{ all -> 0x0108 }
        L_0x00b5:
            r8.C1q(r4, r7, r0)     // Catch:{ all -> 0x0108 }
            r0 = 0
            r8.C9Q(r4, r7, r0)     // Catch:{ all -> 0x0108 }
            goto L_0x00bf
        L_0x00bd:
            r0 = r6
            goto L_0x00b5
        L_0x00bf:
            if (r10 == 0) goto L_0x00c4
            java.lang.String r0 = "pipe_ui"
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r0 = "pipe_bg"
        L_0x00c6:
            r4.CD4(r11, r0)     // Catch:{ all -> 0x0108 }
            r3.A07(r6, r1)     // Catch:{ all -> 0x0108 }
            goto L_0x0104
        L_0x00cd:
            r0 = 2
            r0 = r0 & r13
            boolean r1 = X.AnonymousClass000.A1P(r0)
            if (r10 == 0) goto L_0x00d6
            goto L_0x00dd
        L_0x00d6:
            X.BSU r0 = new X.BSU     // Catch:{ all -> 0x0108 }
            r0.<init>(r12, r3, r9, r1)     // Catch:{ all -> 0x0108 }
            r3 = r0
            goto L_0x00e1
        L_0x00dd:
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x0108 }
        L_0x00e1:
            boolean r0 = r8.CFc(r4, r7)     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00eb
            java.util.Map r6 = X.C27311Dbi.A00(r5, r2)     // Catch:{ all -> 0x0108 }
        L_0x00eb:
            r8.C1q(r4, r7, r6)     // Catch:{ all -> 0x0108 }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "mInputProducer.produceResult"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x0108 }
        L_0x00f9:
            X.E4W r0 = r9.A02     // Catch:{ all -> 0x0108 }
            r0.CCn(r3, r4)     // Catch:{ all -> 0x0108 }
            X.C26212Cuq.A00()     // Catch:{ all -> 0x0108 }
            goto L_0x0104
        L_0x0102:
            if (r2 == 0) goto L_0x009f
        L_0x0104:
            X.C26212Cuq.A00()
            return
        L_0x0108:
            r0 = move-exception
            X.C26212Cuq.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DD8.CCn(X.CcD, X.ECs):void");
    }

    public DD8(C24661CEb cEb, E7Y e7y, E4W e4w) {
        this.A00 = e7y;
        this.A01 = cEb;
        this.A02 = e4w;
    }
}
