package X;

import android.view.View;

/* renamed from: X.78F  reason: invalid class name */
public class AnonymousClass78F implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public AnonymousClass78F(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = z;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x01de;
                case 1: goto L_0x019b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r1.A01
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r4 = r1.A02
            X.6Gl r4 = (X.C120896Gl) r4
            boolean r10 = r1.A05
            java.lang.Object r8 = r1.A03
            X.4rF r8 = (X.C98494rF) r8
            java.lang.Object r9 = r1.A04
            X.4rF r9 = (X.C98494rF) r9
            r2 = 0
            X.C18070vi.A0d(r7, r2)
            r6 = 1
            X.C108985cd.A1D(r8, r9)
            boolean r0 = r7.isSelected()
            if (r0 == 0) goto L_0x0070
            X.1iW r3 = r4.A03
            X.206 r0 = r4.A07
            X.205 r1 = r0.A0v
            java.lang.String r0 = ""
            r3.A0j(r1, r0)
            r3 = 8
            if (r10 == 0) goto L_0x005d
            java.lang.Object r1 = r8.element
            X.1bI r1 = (X.C28931bI) r1
            if (r1 == 0) goto L_0x005d
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x005d
            android.view.View r0 = r1.A02()
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r0.A02()
            java.lang.Object r0 = r8.element
            X.1bI r0 = (X.C28931bI) r0
            r0.A04(r3)
        L_0x0050:
            r7.setVisibility(r2)
        L_0x0053:
            boolean r0 = r7.isSelected()
            r0 = r0 ^ 1
            r7.setSelected(r0)
            return
        L_0x005d:
            java.lang.Object r0 = r9.element
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            if (r0 == 0) goto L_0x0066
            r0.A02()
        L_0x0066:
            java.lang.Object r0 = r9.element
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0050
            r0.setVisibility(r3)
            goto L_0x0050
        L_0x0070:
            if (r10 == 0) goto L_0x0094
            java.lang.Object r0 = r8.element
            X.1bI r0 = (X.C28931bI) r0
            if (r0 == 0) goto L_0x0094
            android.view.View r3 = r0.A02()
            com.airbnb.lottie.LottieAnimationView r3 = (com.airbnb.lottie.LottieAnimationView) r3
            if (r3 == 0) goto L_0x0094
            java.lang.Object r0 = r8.element
            X.1bI r0 = (X.C28931bI) r0
            android.view.View r0 = X.AnonymousClass3MX.A0D(r0)
            X.CxR r1 = new X.CxR
            r1.<init>(r0, r7, r6)
            X.1rd r0 = r3.A09
            X.1rf r0 = r0.A0d
            r0.addListener(r1)
        L_0x0094:
            X.1iW r1 = r4.A03
            X.206 r5 = r4.A07
            X.205 r3 = r5.A0v
            java.lang.String r0 = "💚"
            r1.A0j(r3, r0)
            X.11C r0 = r4.A0J
            X.AnonymousClass4a5.A04(r0)
            if (r10 == 0) goto L_0x010b
            java.lang.Object r0 = r8.element
            X.1bI r0 = (X.C28931bI) r0
            if (r0 == 0) goto L_0x00ce
            android.view.View r0 = r0.A02()
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00ce
            java.lang.Object r0 = r8.element
            X.1bI r0 = (X.C28931bI) r0
            r0.A04(r2)
            java.lang.Object r0 = r8.element
            X.1bI r0 = (X.C28931bI) r0
            android.view.View r0 = r0.A02()
        L_0x00c9:
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r0.A04()
        L_0x00ce:
            X.1i1 r0 = r4.A04
            r0.A0H(r6)
            X.0ve r2 = r4.A0L
            r1 = 8728(0x2218, float:1.223E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0053
            X.1hg r9 = r4.A05
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.71S r0 = r9.A01
            if (r0 == 0) goto L_0x0120
            java.util.Map r0 = r0.A0D
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x0120
            java.util.Iterator r1 = r0.iterator()
        L_0x00f5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r1.next()
            X.2gk r0 = (X.C56012gk) r0
            java.util.Map r0 = r0.A08
            java.util.Collection r0 = r0.values()
            r2.addAll(r0)
            goto L_0x00f5
        L_0x010b:
            java.lang.Object r1 = r9.element
            r0 = r1
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00ce
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r2)
            java.lang.Object r0 = r9.element
            goto L_0x00c9
        L_0x0120:
            java.util.Iterator r2 = r2.iterator()
        L_0x0124:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r10 = r2.next()
            r0 = r10
            X.6xZ r0 = (X.C138716xZ) r0
            java.lang.String r1 = r0.A0T
            java.lang.String r0 = r3.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0124
        L_0x013b:
            X.6xZ r10 = (X.C138716xZ) r10
            if (r10 == 0) goto L_0x0053
            long r0 = r10.A09
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            boolean r0 = r10.A0R
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            java.lang.String r4 = r10.A0T
            com.whatsapp.jid.UserJid r12 = r10.A0S
            java.lang.Integer r0 = r10.A0J
            r11 = 1
            if (r0 == 0) goto L_0x0167
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x015e
            r0 = 3
            if (r1 != r0) goto L_0x0167
        L_0x015e:
            long r2 = r10.A08
            long r0 = r10.A06
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0167
            r11 = 0
        L_0x0167:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)
            int r0 = r10.A02
            int r0 = X.C138716xZ.A00(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            X.00H r0 = r9.A0O
            java.lang.Object r13 = r0.get()
            X.71A r13 = (X.AnonymousClass71A) r13
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = r5.A11(r0)
            if (r0 != r6) goto L_0x0053
            r18 = r4
            X.643 r1 = X.AnonymousClass71A.A01(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A06 = r0
            X.18K r0 = r13.A01
            X.C108965cb.A1E(r1, r0)
            goto L_0x0053
        L_0x0199:
            r10 = 0
            goto L_0x013b
        L_0x019b:
            java.lang.Object r5 = r1.A01
            X.6z8 r5 = (X.C139606z8) r5
            java.lang.Object r4 = r1.A02
            X.77B r4 = (X.AnonymousClass77B) r4
            java.lang.Object r8 = r1.A03
            java.util.List r8 = (java.util.List) r8
            boolean r12 = r1.A05
            java.lang.Object r3 = r1.A04
            X.ADd r3 = (X.C20245ADd) r3
            X.0ve r2 = r5.A08
            r1 = 8798(0x225e, float:1.2329E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01d2
            int r10 = r5.A03
            int r11 = r5.A00
            java.lang.String r7 = r4.A00
            X.ADd r6 = r5.A01
            X.82j r9 = new X.82j
            r9.<init>(r3, r5, r4)
            com.whatsapp.biz.catalog.view.variants.v2.TextVariantsBottomSheetV2 r2 = X.C137146uz.A00(r6, r7, r8, r9, r10, r11, r12)
            X.1GP r1 = r5.A05
            java.lang.String r0 = "VariantDropDownBottomSheet"
            r2.A2C(r1, r0)
            return
        L_0x01d2:
            X.1GP r1 = r5.A05
            int r0 = r5.A00
            com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet r0 = X.C137136uy.A00(r3, r4, r0, r12)
            X.C20098A7b.A01(r0, r1)
            return
        L_0x01de:
            java.lang.Object r0 = r1.A01
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r0
            java.lang.Object r2 = r1.A02
            X.4DE r2 = (X.AnonymousClass4DE) r2
            java.lang.Object r3 = r1.A03
            X.5aj r3 = (X.C107855aj) r3
            java.lang.Object r4 = r1.A04
            java.lang.Float r4 = (java.lang.Float) r4
            boolean r5 = r1.A05
            android.content.Context r1 = X.AnonymousClass3MY.A04(r20)
            r0.A0d(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78F.onClick(android.view.View):void");
    }
}
