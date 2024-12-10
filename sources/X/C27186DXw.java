package X;

/* renamed from: X.DXw  reason: case insensitive filesystem */
public class C27186DXw implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C27186DXw(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0196, code lost:
        X.C30691eM.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019b, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BJt(java.lang.Object r9, X.C30391dr r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x013c;
                case 1: goto L_0x00bf;
                case 2: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r8
            boolean r1 = r10 instanceof X.C27418DdZ
            if (r1 == 0) goto L_0x002b
            r7 = r10
            X.DdZ r7 = (X.C27418DdZ) r7
            int r3 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x002b
            int r3 = r3 - r2
            r7.label = r3
        L_0x0018:
            java.lang.Object r1 = r7.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r7.label
            r6 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r5) goto L_0x004b
            if (r2 == r6) goto L_0x0196
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002b:
            X.DdZ r7 = new X.DdZ
            r7.<init>(r8, r10)
            goto L_0x0018
        L_0x0031:
            X.C30691eM.A01(r1)
            java.lang.Object r3 = r8.A01
            X.4rF r3 = (X.C98494rF) r3
            java.lang.Object r2 = r8.A02
            X.1nB r2 = (X.C36001nB) r2
            java.lang.Object r1 = r3.element
            r7.L$0 = r8
            r7.L$1 = r3
            r7.label = r5
            java.lang.Object r1 = r2.invoke(r1, r9, r7)
            if (r1 != r4) goto L_0x0056
            return r4
        L_0x004b:
            java.lang.Object r3 = r7.L$1
            X.4rF r3 = (X.C98494rF) r3
            java.lang.Object r0 = r7.L$0
            X.DXw r0 = (X.C27186DXw) r0
            X.C30691eM.A01(r1)
        L_0x0056:
            r3.element = r1
            java.lang.Object r2 = r0.A03
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r0 = r0.A01
            X.4rF r0 = (X.C98494rF) r0
            java.lang.Object r1 = r0.element
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.label = r6
            java.lang.Object r0 = r2.BJt(r1, r7)
            goto L_0x0193
        L_0x006f:
            boolean r0 = r10 instanceof X.C27372Dcl
            if (r0 == 0) goto L_0x0094
            r5 = r10
            X.Dcl r5 = (X.C27372Dcl) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0094
            int r2 = r2 - r1
            r5.label = r2
        L_0x0081:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x009a
            if (r0 == r2) goto L_0x0196
            if (r0 == r3) goto L_0x0196
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0094:
            X.Dcl r5 = new X.Dcl
            r5.<init>(r8, r10)
            goto L_0x0081
        L_0x009a:
            X.C30691eM.A01(r1)
            java.lang.Object r1 = r8.A01
            X.4rD r1 = (X.C98474rD) r1
            int r0 = r1.element
            int r0 = r0 + 1
            r1.element = r0
            java.lang.Object r1 = r8.A02
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            if (r0 >= r2) goto L_0x00b5
            r5.label = r2
            java.lang.Object r0 = r1.BJt(r9, r5)
            goto L_0x0193
        L_0x00b5:
            java.lang.Object r0 = r8.A03
            r5.label = r3
            X.1g4 r0 = X.C24643CDd.A00(r9, r0, r5, r1)
            goto L_0x0193
        L_0x00bf:
            r1 = r8
            boolean r0 = r10 instanceof X.C27414DdV
            if (r0 == 0) goto L_0x00e8
            r6 = r10
            X.DdV r6 = (X.C27414DdV) r6
            int r3 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00e8
            int r3 = r3 - r2
            r6.label = r3
        L_0x00d2:
            java.lang.Object r7 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00f3
            if (r0 == r2) goto L_0x00ee
            if (r0 == r3) goto L_0x011b
            if (r0 == r5) goto L_0x00ee
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00e8:
            X.DdV r6 = new X.DdV
            r6.<init>(r8, r10)
            goto L_0x00d2
        L_0x00ee:
            X.C30691eM.A01(r7)
            goto L_0x0199
        L_0x00f3:
            X.C30691eM.A01(r7)
            java.lang.Object r0 = r8.A01
            X.1Dh r0 = (X.C22811Dh) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r8.A03
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            r6.label = r2
        L_0x0104:
            java.lang.Object r0 = r1.BJt(r9, r6)
            goto L_0x0193
        L_0x010a:
            java.lang.Object r0 = r8.A02
            X.1OS r0 = (X.AnonymousClass1OS) r0
            r6.L$0 = r8
            r6.L$1 = r9
            r6.label = r3
            java.lang.Object r7 = r0.invoke(r9, r6)
            if (r7 != r4) goto L_0x0124
            return r4
        L_0x011b:
            java.lang.Object r9 = r6.L$1
            java.lang.Object r1 = r6.L$0
            X.DXw r1 = (X.C27186DXw) r1
            X.C30691eM.A01(r7)
        L_0x0124:
            boolean r0 = X.AnonymousClass000.A1Y(r7)
            if (r0 != 0) goto L_0x0199
            java.lang.Object r0 = r1.A01
            X.1Dh r0 = (X.C22811Dh) r0
            r0.element = r2
            java.lang.Object r1 = r1.A03
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r5
            goto L_0x0104
        L_0x013c:
            boolean r0 = r10 instanceof X.C27365Dce
            if (r0 == 0) goto L_0x015e
            r7 = r10
            X.Dce r7 = (X.C27365Dce) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x015e
            int r2 = r2 - r1
            r7.label = r2
        L_0x014e:
            java.lang.Object r1 = r7.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L_0x0164
            if (r0 == r6) goto L_0x0196
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x015e:
            X.Dce r7 = new X.Dce
            r7.<init>(r8, r10)
            goto L_0x014e
        L_0x0164:
            X.C30691eM.A01(r1)
            java.lang.Object r5 = r8.A03
            X.DXq r5 = (X.C27181DXq) r5
            X.1Di r0 = r5.A00
            java.lang.Object r3 = r0.invoke(r9)
            java.lang.Object r2 = r8.A02
            X.4rF r2 = (X.C98494rF) r2
            java.lang.Object r1 = r2.element
            X.1I8 r0 = X.AnonymousClass4IV.A01
            if (r1 == r0) goto L_0x0187
            X.1OS r0 = r5.A01
            java.lang.Object r0 = r0.invoke(r1, r3)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0199
        L_0x0187:
            r2.element = r3
            java.lang.Object r0 = r8.A01
            X.1G2 r0 = (X.AnonymousClass1G2) r0
            r7.label = r6
            java.lang.Object r0 = r0.BJt(r9, r7)
        L_0x0193:
            if (r0 != r4) goto L_0x0199
            return r4
        L_0x0196:
            X.C30691eM.A01(r1)
        L_0x0199:
            X.1Wu r4 = X.C27621Wu.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27186DXw.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }
}
