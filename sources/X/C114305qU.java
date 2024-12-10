package X;

import android.app.Activity;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.5qU  reason: invalid class name and case insensitive filesystem */
public final class C114305qU extends C6X {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ BottomSheetBehavior A01;
    public final /* synthetic */ AnonymousClass6ZI A02;
    public final /* synthetic */ C18090vk A03;
    public final /* synthetic */ C22811Dh A04;
    public final /* synthetic */ C98474rD A05;

    public void A02(View view, float f) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r9.A04.element != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            r6 = 3
            r7 = 1
            if (r11 != r7) goto L_0x0025
            r10.getTop()
            X.4rD r1 = r9.A05
            int r0 = r10.getTop()
            r1.element = r0
            X.0vk r0 = r9.A03
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0024
        L_0x001f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r9.A01
            r0.A0W(r6)
        L_0x0024:
            return
        L_0x0025:
            r0 = 2
            r5 = 5
            if (r11 != r0) goto L_0x0063
            X.4rD r2 = r9.A05
            int r1 = r2.element
            r0 = -1
            if (r1 == r0) goto L_0x0024
            int r1 = r10.getTop()
            int r0 = r2.element
            int r1 = r1 - r0
            float r8 = (float) r1
            int r0 = r10.getMeasuredHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            X.6ZI r0 = r9.A02
            X.0ve r2 = r0.A00
            r1 = 2305(0x901, float:3.23E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            float r0 = (float) r0
            double r3 = (double) r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r0
            double r1 = (double) r8
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            X.1Dh r0 = r9.A04
            r0.element = r7
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r9.A01
            r0.A0W(r5)
        L_0x005d:
            android.app.Activity r0 = r9.A00
            r0.finish()
            return
        L_0x0063:
            if (r11 != r5) goto L_0x0024
            X.1Dh r0 = r9.A04
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x001f
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114305qU.A03(android.view.View, int):void");
    }

    public C114305qU(Activity activity, BottomSheetBehavior bottomSheetBehavior, AnonymousClass6ZI r3, C18090vk r4, C22811Dh r5, C98474rD r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = bottomSheetBehavior;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = activity;
    }
}
