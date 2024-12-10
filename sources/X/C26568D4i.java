package X;

import android.view.View;

/* renamed from: X.D4i  reason: case insensitive filesystem */
public class C26568D4i implements View.OnApplyWindowInsetsListener {
    public AnonymousClass1HO A00;
    public final C25247Cbm A01;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r25, android.view.WindowInsets r26) {
        /*
            r24 = this;
            r6 = r25
            r5 = r26
            boolean r0 = r6.isLaidOut()
            r4 = r24
            if (r0 != 0) goto L_0x0022
            X.1HO r0 = X.AnonymousClass1HO.A01(r6, r5)
            r4.A00 = r0
        L_0x0012:
            android.view.animation.Interpolator r0 = X.C22672BJn.A00
            r0 = 2131436010(0x7f0b21ea, float:1.8493878E38)
            java.lang.Object r0 = r6.getTag(r0)
            if (r0 != 0) goto L_0x0021
            android.view.WindowInsets r5 = r6.onApplyWindowInsets(r5)
        L_0x0021:
            return r5
        L_0x0022:
            X.1HO r3 = X.AnonymousClass1HO.A01(r6, r5)
            X.1HO r0 = r4.A00
            if (r0 != 0) goto L_0x0035
            X.1HO r0 = X.AnonymousClass1HF.A0C(r6)
            r4.A00 = r0
            if (r0 != 0) goto L_0x0035
        L_0x0032:
            r4.A00 = r3
            goto L_0x0012
        L_0x0035:
            X.Cbm r0 = X.C22672BJn.A00(r6)
            if (r0 == 0) goto L_0x0044
            android.view.WindowInsets r0 = r0.A00
            boolean r0 = X.AnonymousClass026.A00(r0, r5)
            if (r0 == 0) goto L_0x0044
            goto L_0x0012
        L_0x0044:
            X.1HO r8 = r4.A00
            r7 = 0
            r2 = 1
        L_0x0048:
            X.1id r1 = r3.A07(r2)
            X.1id r0 = r8.A07(r2)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0057
            r7 = r7 | r2
        L_0x0057:
            int r2 = r2 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r2 <= r0) goto L_0x0048
            if (r7 == 0) goto L_0x0012
            X.1HO r0 = r4.A00
            r19 = r0
            r0 = r7 & 8
            if (r0 == 0) goto L_0x012b
            r0 = 8
            r2 = 8
            X.1id r0 = r3.A07(r0)
            int r1 = r0.A00
            r0 = r19
            X.1id r0 = r0.A07(r2)
            int r0 = r0.A00
            if (r1 <= r0) goto L_0x0127
            android.view.animation.Interpolator r8 = X.C22672BJn.A02
        L_0x007d:
            r0 = 160(0xa0, double:7.9E-322)
            X.Cpf r2 = new X.Cpf
            r2.<init>(r7, r8, r0)
            r1 = 0
            X.Cbq r0 = r2.A00
            r0.A08(r1)
            float[] r0 = X.C108945cZ.A1V()
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r0)
            X.Cbq r0 = r2.A00
            long r0 = r0.A07()
            android.animation.ValueAnimator r16 = r8.setDuration(r0)
            X.1id r12 = r3.A07(r7)
            r0 = r19
            X.1id r13 = r0.A07(r7)
            int r0 = r12.A01
            r18 = r0
            int r0 = r13.A01
            r17 = r0
            r1 = r18
            int r15 = java.lang.Math.min(r1, r0)
            int r11 = r12.A03
            int r10 = r13.A03
            int r14 = java.lang.Math.min(r11, r10)
            int r9 = r12.A02
            int r8 = r13.A02
            int r1 = java.lang.Math.min(r9, r8)
            int r12 = r12.A00
            int r13 = r13.A00
            int r0 = java.lang.Math.min(r12, r13)
            X.1id r15 = X.C33321id.A00(r15, r14, r1, r0)
            r1 = r18
            r0 = r17
            int r14 = java.lang.Math.max(r1, r0)
            int r10 = java.lang.Math.max(r11, r10)
            int r1 = java.lang.Math.max(r9, r8)
            int r0 = java.lang.Math.max(r12, r13)
            X.1id r1 = X.C33321id.A00(r14, r10, r1, r0)
            X.CqH r9 = new X.CqH
            r9.<init>(r15, r1)
            r8 = 0
            X.C22672BJn.A01(r6, r5, r2, r8)
            X.Cxf r1 = new X.Cxf
            r22 = r19
            r23 = r7
            r18 = r6
            r19 = r4
            r20 = r2
            r21 = r3
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r0 = r16
            r0.addUpdateListener(r1)
            X.BEL r1 = new X.BEL
            r1.<init>(r6, r2, r4, r8)
            r0.addListener(r1)
            X.AkZ r0 = new X.AkZ
            r10 = r0
            r11 = r6
            r12 = r4
            r13 = r9
            r14 = r2
            r15 = r16
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.C1420577z.A00(r6, r0)
            goto L_0x0032
        L_0x0127:
            android.view.animation.Interpolator r8 = X.C22672BJn.A01
            goto L_0x007d
        L_0x012b:
            android.view.animation.Interpolator r8 = X.C22672BJn.A00
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26568D4i.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }

    public C26568D4i(View view, C25247Cbm cbm) {
        AnonymousClass1HO r0;
        this.A01 = cbm;
        AnonymousClass1HO A0C = AnonymousClass1HF.A0C(view);
        if (A0C != null) {
            r0 = new C28171Zd(A0C).A00();
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
