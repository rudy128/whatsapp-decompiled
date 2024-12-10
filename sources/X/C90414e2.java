package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4e2  reason: invalid class name and case insensitive filesystem */
public class C90414e2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C90414e2(AnonymousClass4aY r1, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        if (r0 <= 0) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r6 = this;
            int r0 = r6.A00
            java.lang.Object r2 = r6.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            if (r0 == 0) goto L_0x0034
            com.whatsapp.expressionstray.ExpressionsTrayView r1 = r2.A3D
            if (r1 == 0) goto L_0x0033
            X.1BI r0 = r2.A3R
            r1.setCurrentChatJid(r0)
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r2.A3D
            X.AnonymousClass3MY.A1D(r0, r6)
            r0 = 0
            r2.A6e = r0
            boolean r0 = r2.A73
            if (r0 != 0) goto L_0x0020
            X.AnonymousClass4aY.A1B(r2)
        L_0x0020:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0027
            r2.A2N()
        L_0x0027:
            com.whatsapp.expressionstray.ExpressionsTrayView r2 = r2.A3D
            r1 = 43
            X.4rj r0 = new X.4rj
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.post(r0)
        L_0x0033:
            return
        L_0x0034:
            com.whatsapp.LockableCoodinatorLayout r0 = r2.A1N
            X.AnonymousClass3MY.A1D(r0, r6)
            int r1 = X.AnonymousClass4aY.A02(r2)
            com.whatsapp.LockableCoodinatorLayout r0 = r2.A1N
            int r4 = r0.getHeight()
            r0 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r4 = r4 + r0
            if (r4 <= 0) goto L_0x0033
            X.4Ov r0 = r2.A27
            android.widget.FrameLayout r0 = r0.A04
            int r1 = r0.getHeight()
            X.4Ov r0 = r2.A27
            android.view.View r0 = r0.A02
            X.1sv r0 = X.C43531zx.A01(r0)
            int r0 = r0.A00
            int r3 = r4 - r1
            int r3 = r3 - r0
            X.0ve r1 = r2.A3F
            r5 = 0
            X.C18070vi.A0d(r1, r5)
            r0 = 11370(0x2c6a, float:1.5933E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x0078
            float r1 = (float) r4
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r3 = java.lang.Math.min(r3, r0)
        L_0x0078:
            int r1 = X.C72473Md.A08(r2)
            r0 = 1
            if (r1 == r0) goto L_0x00c8
            r0 = 2
            if (r1 != r0) goto L_0x0088
            X.0z4 r0 = r2.A2j
            int r5 = r0.A07()
        L_0x0088:
            int r1 = X.C72473Md.A08(r2)
            r0 = 1
            if (r1 == r0) goto L_0x00c1
            r0 = 2
            if (r1 != r0) goto L_0x009a
            X.0z4 r0 = r2.A2j
            int r0 = r0.A07()
        L_0x0098:
            if (r0 > 0) goto L_0x00a7
        L_0x009a:
            android.view.View r0 = r2.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166738(0x7f070612, float:1.794773E38)
            int r5 = r1.getDimensionPixelOffset(r0)
        L_0x00a7:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0i
            if (r1 == 0) goto L_0x00b9
            r1.A0C = r3
            if (r3 >= r5) goto L_0x00b5
            int r0 = r4 / 2
            int r5 = java.lang.Math.min(r3, r0)
        L_0x00b5:
            r0 = 0
            r1.A0Y(r5, r0)
        L_0x00b9:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0033
            X.AnonymousClass4aY.A0Z(r2)
            return
        L_0x00c1:
            X.0z4 r0 = r2.A2j
            int r0 = r0.A08()
            goto L_0x0098
        L_0x00c8:
            X.0z4 r0 = r2.A2j
            int r5 = r0.A08()
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90414e2.onGlobalLayout():void");
    }
}
