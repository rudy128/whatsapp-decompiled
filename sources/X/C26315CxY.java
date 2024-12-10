package X;

import android.animation.ValueAnimator;

/* renamed from: X.CxY  reason: case insensitive filesystem */
public class C26315CxY implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26315CxY(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if (r0 == 0) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationUpdate(android.animation.ValueAnimator r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0125;
                case 5: goto L_0x00f2;
                case 6: goto L_0x0161;
                case 7: goto L_0x0155;
                case 8: goto L_0x0070;
                case 9: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            X.9zJ r2 = X.C108985cd.A0K(r11)
            java.lang.Object r1 = r10.A02
            X.E8A r1 = (X.E8A) r1
            java.lang.Object r0 = r10.A01
            X.Boh r0 = (X.C23736Boh) r0
            X.C25974Cph.A00(r0, r2, r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r6 = r10.A01
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            java.lang.Object r4 = r10.A02
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            r0 = 2
            float r5 = X.C72483Me.A00(r11, r0)
            if (r6 == 0) goto L_0x003d
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0063
            r3 = 0
        L_0x0036:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r0 = (int) r3
            r6.setAlpha(r0)
        L_0x003d:
            if (r4 == 0) goto L_0x0018
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x004e:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r0 = (int) r3
            r4.setAlpha(r0)
            return
        L_0x0056:
            float r5 = r5 - r1
            float r0 = r2 - r1
            float r5 = r5 / r0
            float r0 = X.C28851b7.A02(r5, r3, r2)
            float r3 = X.C17880vN.A00(r2, r3, r0)
            goto L_0x004e
        L_0x0063:
            float r0 = r5 - r2
            float r1 = r1 - r2
            float r0 = r0 / r1
            float r0 = X.C28851b7.A02(r0, r2, r3)
            float r3 = X.C17880vN.A00(r2, r3, r0)
            goto L_0x0036
        L_0x0070:
            java.lang.Object r0 = r10.A01
            android.transition.TransitionValues r0 = (android.transition.TransitionValues) r0
            java.lang.Object r1 = r10.A02
            X.BGs r1 = (X.C22632BGs) r1
            boolean r2 = X.AnonymousClass8BU.A1X(r11)
            android.view.View r4 = r0.view
            boolean r0 = r4 instanceof com.whatsapp.mediaview.PhotoView
            if (r0 != 0) goto L_0x0086
            boolean r0 = r4 instanceof com.whatsapp.components.button.ThumbnailButton
            if (r0 == 0) goto L_0x0018
        L_0x0086:
            X.C18070vi.A0W(r4)
            java.lang.Object r3 = r11.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.C18070vi.A0z(r3, r0)
            float r7 = X.AnonymousClass000.A04(r3)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x009e
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = r0 - r7
        L_0x009e:
            int[] r0 = r1.A04
            r4.getLocationOnScreen(r0)
            r8 = r0[r2]
            int r9 = r4.getHeight()
            int r9 = r9 + r8
            android.graphics.Rect r5 = r1.A02
            r6 = 0
            r5.left = r6
            int r0 = r4.getWidth()
            r5.right = r0
            int r0 = r1.A00
            r3 = 0
            if (r2 > r0) goto L_0x00ed
            if (r0 >= r9) goto L_0x00ed
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            int r2 = r4.getHeight()
            int r0 = r1.A00
            int r9 = r9 - r0
            float r0 = (float) r9
            float r0 = r0 * r7
            int r0 = (int) r0
            int r2 = r2 - r0
        L_0x00cb:
            r5.bottom = r2
            int r1 = r1.A01
            if (r8 >= r1) goto L_0x00ea
            if (r1 <= 0) goto L_0x00ea
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            int r1 = r1 - r8
            float r0 = (float) r1
            float r7 = r7 * r0
            int r0 = (int) r7
            r5.top = r0
            if (r0 != 0) goto L_0x0187
        L_0x00df:
            int r0 = r4.getHeight()
            if (r2 != r0) goto L_0x0187
            r0 = 0
            r4.setClipBounds(r0)
            return
        L_0x00ea:
            r5.top = r6
            goto L_0x00df
        L_0x00ed:
            int r2 = r4.getHeight()
            goto L_0x00cb
        L_0x00f2:
            java.lang.Object r1 = r10.A01
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            java.lang.Object r3 = r10.A02
            X.1Xq r3 = (X.C27801Xq) r3
            float r0 = X.C108985cd.A00(r11)
            int r2 = (int) r0
            r3.setAlpha(r2)
            java.util.List r0 = r1.A0N
            java.util.Iterator r1 = r0.iterator()
        L_0x0108:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            r1.next()
            X.1Yz r0 = r3.A01
            android.content.res.ColorStateList r0 = r0.A0B
            if (r0 == 0) goto L_0x0108
            android.content.res.ColorStateList r0 = r0.withAlpha(r2)
            r0.getDefaultColor()
            java.lang.String r0 = "onUpdate"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0125:
            java.lang.Object r3 = r10.A01
            com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
            java.lang.Object r0 = r10.A02
            X.1Xq r0 = (X.C27801Xq) r0
            float r2 = X.C108985cd.A00(r11)
            r0.A0C(r2)
            android.graphics.drawable.Drawable r1 = r3.A04
            boolean r0 = r1 instanceof X.C27801Xq
            if (r0 == 0) goto L_0x013f
            X.1Xq r1 = (X.C27801Xq) r1
            r1.A0C(r2)
        L_0x013f:
            java.util.List r0 = r3.A0N
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            r1.next()
            java.lang.String r0 = "onUpdate"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0155:
            java.lang.Object r1 = r10.A01
            com.whatsapp.glasses.layouts.SupToggle r1 = (com.whatsapp.glasses.layouts.SupToggle) r1
            java.lang.Object r0 = r10.A02
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            com.whatsapp.glasses.layouts.SupToggle.setTrackHeight$lambda$2$lambda$1(r1, r0, r11)
            return
        L_0x0161:
            float r1 = X.C108985cd.A00(r11)
            java.lang.Object r0 = r10.A02
            android.view.View r0 = (android.view.View) r0
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x0170:
            float r3 = X.C108985cd.A00(r11)
            java.lang.Object r2 = r10.A01
            X.BFC r2 = (X.BFC) r2
            java.lang.Object r1 = r10.A02
            X.CUQ r1 = (X.CUQ) r1
            r2.A01(r1, r3)
            r0 = 0
            r2.A02(r1, r3, r0)
            r2.invalidateSelf()
            return
        L_0x0187:
            r4.setClipBounds(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26315CxY.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
