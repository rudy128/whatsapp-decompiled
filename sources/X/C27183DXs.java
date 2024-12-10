package X;

/* renamed from: X.DXs  reason: case insensitive filesystem */
public class C27183DXs implements C23421Fz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C27183DXs(AnonymousClass1OS r1, C23421Fz r2, int i) {
        this.A00 = i;
        switch (i) {
            case 6:
            case 9:
            case 10:
                this.A02 = r2;
                this.A01 = r1;
                break;
            default:
                this.A01 = r1;
                this.A02 = r2;
                break;
        }
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (r0 != r6) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x023c A[Catch:{ all -> 0x0243 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BFC(X.C30391dr r10, X.AnonymousClass1G2 r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0045;
                case 2: goto L_0x003d;
                case 3: goto L_0x0035;
                case 4: goto L_0x002d;
                case 5: goto L_0x01c7;
                case 6: goto L_0x0136;
                case 7: goto L_0x00ba;
                case 8: goto L_0x005a;
                case 9: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A02
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A01
            r0 = 10
            X.DXu r3 = new X.DXu
            r3.<init>(r11, r1, r0)
        L_0x0012:
            java.lang.Object r6 = r4.BFC(r10, r3)
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            if (r6 != r0) goto L_0x0240
            return r6
        L_0x001b:
            X.1Dh r2 = new X.1Dh
            r2.<init>()
            java.lang.Object r4 = r9.A02
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A01
            r0 = 1
            X.DXw r3 = new X.DXw
            r3.<init>(r11, r2, r1, r0)
            goto L_0x0012
        L_0x002d:
            java.lang.Object r4 = r9.A01
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A02
            r0 = 4
            goto L_0x0054
        L_0x0035:
            java.lang.Object r4 = r9.A01
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A02
            r0 = 3
            goto L_0x0054
        L_0x003d:
            java.lang.Object r4 = r9.A01
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A02
            r0 = 2
            goto L_0x0054
        L_0x0045:
            java.lang.Object r4 = r9.A01
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A02
            r0 = 1
            goto L_0x0054
        L_0x004d:
            java.lang.Object r4 = r9.A01
            X.1Fz r4 = (X.C23421Fz) r4
            java.lang.Object r1 = r9.A02
            r0 = 0
        L_0x0054:
            X.DXu r3 = new X.DXu
            r3.<init>(r1, r11, r0)
            goto L_0x0012
        L_0x005a:
            r0 = r9
            boolean r1 = r10 instanceof X.C27413DdU
            if (r1 == 0) goto L_0x0080
            r5 = r10
            X.DdU r5 = (X.C27413DdU) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0080
            int r3 = r3 - r2
            r5.label = r3
        L_0x006d:
            java.lang.Object r4 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L_0x008b
            if (r1 == r2) goto L_0x009f
            if (r1 != r3) goto L_0x0086
            X.C30691eM.A01(r4)
            goto L_0x0240
        L_0x0080:
            X.DdU r5 = new X.DdU
            r5.<init>(r9, r10)
            goto L_0x006d
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x008b:
            X.C30691eM.A01(r4)
            java.lang.Object r1 = r9.A02
            X.1Fz r1 = (X.C23421Fz) r1
            r5.L$0 = r9
            r5.L$1 = r11
            r5.label = r2
            java.lang.Object r4 = X.C24642CDc.A00(r5, r1, r11)
            if (r4 != r6) goto L_0x00a8
            return r6
        L_0x009f:
            java.lang.Object r11 = r5.L$1
            java.lang.Object r0 = r5.L$0
            X.DXs r0 = (X.C27183DXs) r0
            X.C30691eM.A01(r4)
        L_0x00a8:
            if (r4 == 0) goto L_0x0240
            java.lang.Object r1 = r0.A01
            X.1nB r1 = (X.C36001nB) r1
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r1.invoke(r11, r4, r5)
            goto L_0x012e
        L_0x00ba:
            r1 = r9
            boolean r0 = r10 instanceof X.C27429Ddk
            if (r0 == 0) goto L_0x00e0
            r7 = r10
            X.Ddk r7 = (X.C27429Ddk) r7
            int r3 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00e0
            int r3 = r3 - r2
            r7.label = r3
        L_0x00cd:
            java.lang.Object r5 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00fb
            if (r0 == r3) goto L_0x00eb
            if (r0 != r4) goto L_0x00e6
            X.C30691eM.A01(r5)
            goto L_0x0240
        L_0x00e0:
            X.Ddk r7 = new X.Ddk
            r7.<init>(r9, r10)
            goto L_0x00cd
        L_0x00e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00eb:
            java.lang.Object r2 = r7.L$2
            X.1du r2 = (X.C30421du) r2
            java.lang.Object r11 = r7.L$1
            X.1G2 r11 = (X.AnonymousClass1G2) r11
            java.lang.Object r1 = r7.L$0
            X.DXs r1 = (X.C27183DXs) r1
            X.C30691eM.A01(r5)     // Catch:{ all -> 0x0131 }
            goto L_0x011a
        L_0x00fb:
            X.C30691eM.A01(r5)
            X.0wh r0 = r7.getContext()
            X.Ddr r2 = new X.Ddr
            r2.<init>(r0, r11)
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x0131 }
            X.1OS r0 = (X.AnonymousClass1OS) r0     // Catch:{ all -> 0x0131 }
            r7.L$0 = r9     // Catch:{ all -> 0x0131 }
            r7.L$1 = r11     // Catch:{ all -> 0x0131 }
            r7.L$2 = r2     // Catch:{ all -> 0x0131 }
            r7.label = r3     // Catch:{ all -> 0x0131 }
            java.lang.Object r0 = r0.invoke(r2, r7)     // Catch:{ all -> 0x0131 }
            if (r0 != r6) goto L_0x011a
            return r6
        L_0x011a:
            r2.releaseIntercepted()
            java.lang.Object r1 = r1.A02
            X.1Fz r1 = (X.C23421Fz) r1
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r0
            r7.label = r4
            java.lang.Object r0 = r1.BFC(r7, r11)
        L_0x012e:
            if (r0 != r6) goto L_0x0240
            return r6
        L_0x0131:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L_0x0136:
            r1 = r9
            boolean r0 = r10 instanceof X.C27428Ddj
            if (r0 == 0) goto L_0x015c
            r5 = r10
            X.Ddj r5 = (X.C27428Ddj) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x015c
            int r3 = r3 - r2
            r5.label = r3
        L_0x0149:
            java.lang.Object r3 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x016b
            if (r0 == r8) goto L_0x018e
            if (r0 != r7) goto L_0x0166
            java.lang.Object r2 = r5.L$0
            X.1du r2 = (X.C30421du) r2
            goto L_0x0162
        L_0x015c:
            X.Ddj r5 = new X.Ddj
            r5.<init>(r9, r10)
            goto L_0x0149
        L_0x0162:
            X.C30691eM.A01(r3)     // Catch:{ all -> 0x01c2 }
            goto L_0x01be
        L_0x0166:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x016b:
            X.C30691eM.A01(r3)
            X.1Dh r0 = new X.1Dh
            r0.<init>()
            r0.element = r8
            java.lang.Object r4 = r9.A02
            X.1Fz r4 = (X.C23421Fz) r4
            r3 = 5
            X.DXu r2 = new X.DXu
            r2.<init>(r11, r0, r3)
            r5.L$0 = r9
            r5.L$1 = r11
            r5.L$2 = r0
            r5.label = r8
            java.lang.Object r2 = r4.BFC(r5, r2)
            if (r2 != r6) goto L_0x019d
            return r6
        L_0x018e:
            java.lang.Object r0 = r5.L$2
            X.1Dh r0 = (X.C22811Dh) r0
            java.lang.Object r11 = r5.L$1
            X.1G2 r11 = (X.AnonymousClass1G2) r11
            java.lang.Object r1 = r5.L$0
            X.DXs r1 = (X.C27183DXs) r1
            X.C30691eM.A01(r3)
        L_0x019d:
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x0240
            X.0wh r0 = r5.getContext()
            X.Ddr r2 = new X.Ddr
            r2.<init>(r0, r11)
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x01c2 }
            X.1OS r1 = (X.AnonymousClass1OS) r1     // Catch:{ all -> 0x01c2 }
            r5.L$0 = r2     // Catch:{ all -> 0x01c2 }
            r0 = 0
            r5.L$1 = r0     // Catch:{ all -> 0x01c2 }
            r5.L$2 = r0     // Catch:{ all -> 0x01c2 }
            r5.label = r7     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r1.invoke(r2, r5)     // Catch:{ all -> 0x01c2 }
            if (r0 != r6) goto L_0x01be
            return r6
        L_0x01be:
            r2.releaseIntercepted()
            goto L_0x0240
        L_0x01c2:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L_0x01c7:
            r1 = r9
            boolean r0 = r10 instanceof X.C27412DdT
            if (r0 == 0) goto L_0x01f1
            r4 = r10
            X.DdT r4 = (X.C27412DdT) r4
            int r3 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01f1
            int r3 = r3 - r2
            r4.label = r3
        L_0x01da:
            java.lang.Object r8 = r4.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r7 = 3
            r5 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x020f
            if (r0 == r2) goto L_0x0203
            if (r0 == r5) goto L_0x01fb
            if (r0 != r7) goto L_0x025f
            java.lang.Object r2 = r4.L$0
            X.1du r2 = (X.C30421du) r2
            goto L_0x01f7
        L_0x01f1:
            X.DdT r4 = new X.DdT
            r4.<init>(r9, r10)
            goto L_0x01da
        L_0x01f7:
            X.C30691eM.A01(r8)     // Catch:{ all -> 0x0243 }
            goto L_0x023d
        L_0x01fb:
            java.lang.Object r0 = r4.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.C30691eM.A01(r8)
            throw r0
        L_0x0203:
            java.lang.Object r11 = r4.L$1
            X.1G2 r11 = (X.AnonymousClass1G2) r11
            java.lang.Object r1 = r4.L$0
            X.DXs r1 = (X.C27183DXs) r1
            X.C30691eM.A01(r8)     // Catch:{ all -> 0x0248 }
            goto L_0x0223
        L_0x020f:
            X.C30691eM.A01(r8)
            java.lang.Object r0 = r9.A02     // Catch:{ all -> 0x0248 }
            X.1Fz r0 = (X.C23421Fz) r0     // Catch:{ all -> 0x0248 }
            r4.L$0 = r9     // Catch:{ all -> 0x0248 }
            r4.L$1 = r11     // Catch:{ all -> 0x0248 }
            r4.label = r2     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r0.BFC(r4, r11)     // Catch:{ all -> 0x0248 }
            if (r0 != r6) goto L_0x0223
            return r6
        L_0x0223:
            X.0wh r0 = r4.getContext()
            X.Ddr r2 = new X.Ddr
            r2.<init>(r0, r11)
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x0243 }
            X.1nB r0 = (X.C36001nB) r0     // Catch:{ all -> 0x0243 }
            r4.L$0 = r2     // Catch:{ all -> 0x0243 }
            r4.L$1 = r3     // Catch:{ all -> 0x0243 }
            r4.label = r7     // Catch:{ all -> 0x0243 }
            java.lang.Object r0 = r0.invoke(r2, r3, r4)     // Catch:{ all -> 0x0243 }
            if (r0 != r6) goto L_0x023d
            return r6
        L_0x023d:
            r2.releaseIntercepted()
        L_0x0240:
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        L_0x0243:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L_0x0248:
            r0 = move-exception
            X.4sv r2 = new X.4sv
            r2.<init>(r0)
            java.lang.Object r1 = r1.A01
            X.1nB r1 = (X.C36001nB) r1
            r4.L$0 = r0
            r4.L$1 = r3
            r4.label = r5
            java.lang.Object r1 = X.C24641CDb.A00(r0, r4, r1, r2)
            if (r1 != r6) goto L_0x0263
            return r6
        L_0x025f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
        L_0x0263:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27183DXs.BFC(X.1dr, X.1G2):java.lang.Object");
    }

    public C27183DXs(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
