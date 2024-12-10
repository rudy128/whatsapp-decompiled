package androidx.compose.foundation.gestures;

import X.C17720v7;
import X.C28644ECa;
import X.C35911n2;
import X.C35991nA;

public final class PressGestureScopeImpl implements C28644ECa, C17720v7 {
    public boolean A00;
    public boolean A01;
    public final C35911n2 A02 = C35991nA.A00();
    public final /* synthetic */ C28644ECa A03;

    public final void A03() {
        this.A00 = true;
        this.A02.CQ9((Object) null);
    }

    public final void A04() {
        this.A01 = true;
        this.A02.CQ9((Object) null);
    }

    public float BQU() {
        return this.A03.BQU();
    }

    public float BRu() {
        return this.A03.BRu();
    }

    public int CG9(float f) {
        return this.A03.CG9(f);
    }

    public float CPE(long j) {
        return this.A03.CPE(j);
    }

    public float CPF(float f) {
        return this.A03.CPF(f);
    }

    public float CPG(int i) {
        return this.A03.CPG(i);
    }

    public long CPH(long j) {
        return this.A03.CPH(j);
    }

    public float CPP(long j) {
        return this.A03.CPP(j);
    }

    public float CPQ(float f) {
        return this.A03.CPQ(f);
    }

    public long CPT(long j) {
        return this.A03.CPT(j);
    }

    public long CPU(float f) {
        return this.A03.CPU(f);
    }

    public long CPV(float f) {
        return this.A03.CPV(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass0b7
            if (r0 == 0) goto L_0x0040
            r4 = r6
            X.0b7 r4 = (X.AnonymousClass0b7) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0040
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.AnonymousClass3F6.A03()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r1) goto L_0x0046
            java.lang.Object r1 = r4.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r1
            X.C30691eM.A01(r3)
        L_0x0026:
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002e:
            X.C30691eM.A01(r3)
            X.1n2 r0 = r5.A02
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.Bhx(r4)
            if (r0 != r2) goto L_0x003e
            return r2
        L_0x003e:
            r1 = r5
            goto L_0x0026
        L_0x0040:
            X.0b7 r4 = new X.0b7
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0046:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.A02(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CPu(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass0b8
            if (r0 == 0) goto L_0x004e
            r4 = r6
            X.0b8 r4 = (X.AnonymousClass0b8) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.AnonymousClass3F6.A03()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x0054
            java.lang.Object r1 = r4.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r1
            X.C30691eM.A01(r3)
        L_0x0026:
            X.1n2 r0 = r1.A02
            r0.CQ9((java.lang.Object) null)
        L_0x002b:
            boolean r0 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0032:
            X.C30691eM.A01(r3)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x004c
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x004c
            X.1n2 r0 = r5.A02
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.Bhx(r4)
            if (r0 != r2) goto L_0x004a
            return r2
        L_0x004a:
            r1 = r5
            goto L_0x0026
        L_0x004c:
            r1 = r5
            goto L_0x002b
        L_0x004e:
            X.0b8 r4 = new X.0b8
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.CPu(X.1dr):java.lang.Object");
    }

    public PressGestureScopeImpl(C28644ECa eCa) {
        this.A03 = eCa;
    }
}
