package X;

/* renamed from: X.2vV  reason: invalid class name and case insensitive filesystem */
public class C64892vV implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;

    public C64892vV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[LOOP:1: B:11:0x003c->B:14:0x004c, LOOP_START, PHI: r1 
      PHI: (r1v9 boolean) = (r1v8 boolean), (r1v11 boolean) binds: [B:10:0x002d, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00be;
                case 3: goto L_0x008e;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x006e;
                case 7: goto L_0x005d;
                case 8: goto L_0x002d;
                case 9: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A01
            X.1GP r1 = (X.AnonymousClass1GP) r1
            boolean r0 = X.AnonymousClass1GP.A0I(r1)
            if (r0 == 0) goto L_0x00ed
            X.1GR r0 = r1.A0U
            java.util.List r0 = r0.A04()
            java.util.Iterator r1 = r0.iterator()
        L_0x0019:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            r1.next()
            goto L_0x0019
        L_0x0023:
            java.lang.Object r0 = r4.A01
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            X.2nR r5 = (X.C60132nR) r5
            r0.A0K(r5)
            return
        L_0x002d:
            java.lang.Object r3 = r4.A01
            X.1Fk r3 = (X.C23281Fk) r3
            java.util.List r5 = (java.util.List) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            java.util.Iterator r2 = r5.iterator()
            r1 = 0
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r2.next()
            X.Cam r0 = (X.C25195Cam) r0
            boolean r1 = X.CD7.A00(r0)
            if (r1 == 0) goto L_0x003c
        L_0x004e:
            r3.A0D = r1
            boolean r0 = X.C23281Fk.A03(r3)
            if (r0 == 0) goto L_0x00ed
            r3.A4j()
            r3.A4h()
            return
        L_0x005d:
            java.lang.Object r1 = r4.A01
            X.1Fk r1 = (X.C23281Fk) r1
            boolean r0 = X.C23281Fk.A03(r1)
            if (r0 == 0) goto L_0x00ed
            r1.A4j()
            r1.A4h()
            return
        L_0x006e:
            java.lang.Object r2 = r4.A01
            X.1Fh r2 = (X.C23251Fh) r2
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r1 = r5.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r1.next()
            X.Cam r0 = (X.C25195Cam) r0
            boolean r0 = X.CD7.A00(r0)
            r2.A09 = r0
            X.C23251Fh.A0Q(r2)
            return
        L_0x008e:
            java.lang.Object r2 = r4.A01
            X.1GP r2 = (X.AnonymousClass1GP) r2
            java.lang.Number r5 = (java.lang.Number) r5
            boolean r0 = X.AnonymousClass1GP.A0I(r2)
            if (r0 == 0) goto L_0x00ed
            int r1 = r5.intValue()
            r0 = 80
            if (r1 != r0) goto L_0x00ed
            X.1GR r0 = r2.A0U
            java.util.List r0 = r0.A04()
            java.util.Iterator r1 = r0.iterator()
        L_0x00ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r1.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x00ac
            r0.onLowMemory()
            goto L_0x00ac
        L_0x00be:
            java.lang.Object r1 = r4.A01
            X.1GP r1 = (X.AnonymousClass1GP) r1
            android.content.res.Configuration r5 = (android.content.res.Configuration) r5
            boolean r0 = X.AnonymousClass1GP.A0I(r1)
            if (r0 == 0) goto L_0x00ed
            X.1GR r0 = r1.A0U
            java.util.List r0 = r0.A04()
            java.util.Iterator r1 = r0.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r1.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x00d4
            r0.onConfigurationChanged(r5)
            goto L_0x00d4
        L_0x00e6:
            java.lang.Object r0 = r4.A01
            X.1FL r0 = (X.AnonymousClass1FL) r0
            r0.A2c()
        L_0x00ed:
            return
        L_0x00ee:
            java.lang.Object r0 = r4.A01
            X.1FL r0 = (X.AnonymousClass1FL) r0
            r0.A2d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64892vV.accept(java.lang.Object):void");
    }
}
