package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.Arrays;

/* renamed from: X.5gg  reason: invalid class name and case insensitive filesystem */
public final class C110655gg extends PopupWindow {
    public static final C1401870h A0C = new Object();
    public int A00 = -1;
    public int A01 = -1;
    public final Resources A02;
    public final C139466yt A03;
    public final C107375Zl A04;
    public final AnonymousClass1KW A05;
    public final C18100vl A06 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148077gr(this));
    public final int[] A07;
    public final Context A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110655gg(android.view.View r25, X.C107375Zl r26, X.AnonymousClass1KW r27, int[] r28, boolean r29) {
        /*
            r24 = this;
            r6 = 1
            r15 = r25
            r2 = r27
            int r5 = X.C72453Mb.A0G(r2, r15, r6)
            r10 = 3
            r3 = r28
            X.C18070vi.A0d(r3, r10)
            android.content.Context r0 = r15.getContext()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r0 = -2
            r4 = r24
            r4.<init>(r1, r0, r0)
            r4.A05 = r2
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.7gr r0 = new X.7gr
            r0.<init>(r4)
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r4.A06 = r0
            r0 = -1
            r4.A00 = r0
            r4.A01 = r0
            android.content.Context r2 = X.AnonymousClass3MY.A04(r15)
            r4.A08 = r2
            android.content.res.Resources r0 = X.C108955ca.A0D(r2)
            r4.A02 = r0
            java.lang.Object r1 = r3.clone()
            int[] r1 = (int[]) r1
            int[] r3 = X.AnonymousClass74I.A05(r3)
            X.6yt r0 = new X.6yt
            r0.<init>(r3)
            java.util.List r3 = r0.A01
            java.util.ArrayList r8 = X.AnonymousClass000.A14(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x0057:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r7.next()
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C108965cb.A00(r0)
            if (r0 <= 0) goto L_0x0057
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r8.add(r0)
            goto L_0x0057
        L_0x0071:
            int r0 = r8.size()
            r14 = 0
            if (r0 != r5) goto L_0x009c
            int r0 = r3.size()
            if (r14 >= r0) goto L_0x01d0
            java.lang.Object r0 = r3.get(r14)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C108965cb.A00(r0)
        L_0x0088:
            r4.A00 = r0
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x01cd
            java.lang.Object r0 = r3.get(r6)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C108965cb.A00(r0)
        L_0x009a:
            r4.A01 = r0
        L_0x009c:
            int[] r0 = X.AnonymousClass74I.A08(r1)
            r4.A07 = r0
            int[] r1 = X.AnonymousClass74I.A05(r0)
            X.6yt r0 = new X.6yt
            r0.<init>(r1)
            r4.A03 = r0
            r0 = r26
            r4.A04 = r0
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r9 = X.AnonymousClass11C.A02(r2, r0)
            android.view.LayoutInflater r9 = (android.view.LayoutInflater) r9
            X.C17960vV.A07(r9)
            X.C18070vi.A0X(r9)
            r1 = 2131626106(0x7f0e087a, float:1.8879439E38)
            X.0vl r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9.inflate(r1, r0, r6)
            X.0vl r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setOrientation(r6)
            X.0vl r0 = r4.A06
            android.view.View r1 = X.AnonymousClass3MW.A0A(r0)
            r0 = 2131435470(0x7f0b1fce, float:1.8492783E38)
            android.view.ViewGroup r8 = X.AnonymousClass3MW.A0D(r1, r0)
            X.C17960vV.A05(r8)
            int[] r17 = X.AnonymousClass74I.A05
            r0 = r17[r14]
            android.graphics.drawable.BitmapDrawable r2 = r4.A00(r0)
            if (r2 != 0) goto L_0x01b6
            r2 = 0
        L_0x00f3:
            r4.A0A = r2
            r0 = r17[r14]
            android.graphics.drawable.BitmapDrawable r3 = r4.A01(r0)
            if (r3 != 0) goto L_0x019f
            r0 = 0
        L_0x00fe:
            r4.A0B = r0
            X.C17960vV.A07(r2)
            X.C17960vV.A07(r0)
            X.6yt r0 = r4.A03
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r14)
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = X.C25336Cdv.A01(r0)
            X.5z5 r7 = new X.5z5
            r7.<init>(r0)
            long r0 = X.C43291zZ.A00(r7, r14)
            X.1KW r3 = r4.A05
            android.content.res.Resources r2 = r4.A02
            android.graphics.drawable.BitmapDrawable r0 = r3.A07(r2, r7, r0)
            r4.A09 = r0
            r12 = 5
            java.util.ArrayList r11 = X.C17880vN.A0z(r12)
            r7 = 0
        L_0x012d:
            java.lang.String r13 = "null cannot be cast to non-null type com.whatsapp.WaImageButton"
            if (r7 >= r12) goto L_0x01d3
            r3 = r17[r7]
            r0 = 2131626107(0x7f0e087b, float:1.887944E38)
            android.view.View r2 = r9.inflate(r0, r8, r14)
            X.C18070vi.A0z(r2, r13)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.BitmapDrawable r1 = r4.A00(r3)
            X.C17960vV.A07(r1)
            android.graphics.drawable.Drawable r0 = r4.A09
            if (r0 != 0) goto L_0x0194
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r5]
            r13[r14] = r1
            android.graphics.drawable.Drawable r0 = r4.A0B
            r13[r6] = r0
        L_0x0152:
            android.content.Context r14 = r4.A08
            int[] r1 = r4.A07
            r0 = -1
            java.lang.String r14 = X.C1401870h.A01(r14, r1, r3, r0)
            android.content.res.Resources r1 = r4.A02
            int r0 = r13.length
            android.graphics.drawable.BitmapDrawable r0 = A02(r1, r13, r0)
            r2.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r0)
            r2.setContentDescription(r14)
            int r0 = r4.A00
            boolean r0 = X.AnonymousClass000.A1T(r3, r0)
            r2.setSelected(r0)
            r23 = 0
            X.6LB r0 = new X.6LB
            r22 = r3
            r18 = r0
            r19 = r4
            r20 = r11
            r21 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            r2.setOnClickListener(r0)
            r8.addView(r2)
            r11.add(r2)
            int r7 = r7 + 1
            r14 = 0
            goto L_0x012d
        L_0x0194:
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r10]
            r13[r14] = r1
            android.graphics.drawable.Drawable r1 = r4.A0B
            r13[r6] = r1
            r13[r5] = r0
            goto L_0x0152
        L_0x019f:
            X.0vl r0 = r4.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131100417(0x7f060301, float:1.7813215E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A08(r3, r0)
            goto L_0x00fe
        L_0x01b6:
            X.0vl r0 = r4.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131100417(0x7f060301, float:1.7813215E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A08(r2, r0)
            goto L_0x00f3
        L_0x01cd:
            r0 = -1
            goto L_0x009a
        L_0x01d0:
            r0 = -1
            goto L_0x0088
        L_0x01d3:
            java.util.ArrayList r12 = X.C17880vN.A0z(r12)
            r11 = 0
        L_0x01d8:
            r7 = r17[r11]
            r0 = 2131626107(0x7f0e087b, float:1.887944E38)
            r14 = 0
            android.view.View r3 = r9.inflate(r0, r8, r14)
            X.C18070vi.A0z(r3, r13)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.BitmapDrawable r16 = r4.A01(r7)
            X.C17960vV.A07(r16)
            android.graphics.drawable.Drawable r1 = r4.A09
            if (r1 != 0) goto L_0x02d8
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r5]
            android.graphics.drawable.Drawable r0 = r4.A0A
            r2[r14] = r0
            r2[r6] = r16
        L_0x01fa:
            android.content.Context r14 = r4.A08
            int[] r1 = r4.A07
            r0 = -1
            java.lang.String r14 = X.C1401870h.A01(r14, r1, r0, r7)
            android.content.res.Resources r1 = r4.A02
            int r0 = r2.length
            android.graphics.drawable.BitmapDrawable r0 = A02(r1, r2, r0)
            r3.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.setScaleType(r0)
            r3.setContentDescription(r14)
            int r0 = r4.A01
            boolean r0 = X.AnonymousClass000.A1T(r7, r0)
            r3.setSelected(r0)
            X.6LB r0 = new X.6LB
            r19 = r4
            r20 = r12
            r21 = r3
            r22 = r7
            r23 = r6
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r3.setOnClickListener(r0)
            r8.addView(r3)
            r12.add(r3)
            int r11 = r11 + 1
            r0 = 5
            if (r11 < r0) goto L_0x01d8
            X.0vl r0 = r4.A06
            android.view.View r1 = X.AnonymousClass3MW.A0A(r0)
            r0 = 2131429853(0x7f0b09dd, float:1.848139E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0H(r1, r0)
            X.C17960vV.A05(r1)
            X.1KW r7 = r4.A05
            android.content.res.Resources r8 = X.AnonymousClass3MX.A05(r15)
            int[] r0 = r4.A07
            X.5z5 r9 = new X.5z5
            r9.<init>(r0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = -1
            android.graphics.drawable.Drawable r0 = r7.A08(r8, r9, r10, r11)
            r1.setImageDrawable(r0)
            int[] r0 = r4.A07
            java.lang.String r0 = X.C137176v2.A01(r0)
            r1.setContentDescription(r0)
            X.9Aa r0 = new X.9Aa
            r0.<init>(r4, r6)
            r1.setOnClickListener(r0)
            A03(r4)
            X.0vl r0 = r4.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setFocusableInTouchMode(r6)
            X.0vl r0 = r4.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.setFocusable(r6)
            X.0vl r0 = r4.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            X.C72463Mc.A12(r0)
            r4.setTouchable(r6)
            r4.setFocusable(r6)
            r4.setOutsideTouchable(r6)
            r4.setInputMethodMode(r5)
            android.content.Context r5 = r15.getContext()
            if (r29 == 0) goto L_0x02c6
            r0 = 2131231376(0x7f080290, float:1.8078831E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r5, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r4.setElevation(r0)
        L_0x02b2:
            r4.setBackgroundDrawable(r1)
            X.0vl r0 = r4.A06
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            r0.requestFocus()
            android.view.ViewParent r0 = r15.getParent()
            r0.requestDisallowInterceptTouchEvent(r6)
            return
        L_0x02c6:
            r3 = 2131232770(0x7f080802, float:1.8081659E38)
            android.content.Context r2 = r15.getContext()
            r1 = 2130971297(0x7f040aa1, float:1.7551328E38)
            r0 = 2131102558(0x7f060b5e, float:1.7817557E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A04(r2, r5, r1, r0, r3)
            goto L_0x02b2
        L_0x02d8:
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r10]
            android.graphics.drawable.Drawable r0 = r4.A0A
            r2[r14] = r0
            r2[r6] = r16
            r2[r5] = r1
            goto L_0x01fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110655gg.<init>(android.view.View, X.5Zl, X.1KW, int[], boolean):void");
    }

    private final BitmapDrawable A00(int i) {
        C139466yt A002 = this.A03.A00(1, i);
        String str = C43271zX.A00;
        C117025z5 r4 = new C117025z5(A002.A01());
        return this.A05.A07(this.A02, r4, C43291zZ.A00(r4, false));
    }

    private final BitmapDrawable A01(int i) {
        C139466yt A002 = this.A03.A00(2, i);
        String str = C43271zX.A00;
        C117025z5 r4 = new C117025z5(A002.A01());
        return this.A05.A07(this.A02, r4, C43291zZ.A00(r4, false));
    }

    public static final void A03(C110655gg r9) {
        Drawable A002;
        Drawable A012;
        String A013;
        int i;
        ImageView A0H = AnonymousClass3MW.A0H(AnonymousClass3MW.A0A(r9.A06), 2131435107);
        C17960vV.A05(A0H);
        Drawable drawable = r9.A09;
        int i2 = 2;
        if (drawable != null) {
            i2 = 3;
        }
        Drawable[] drawableArr = new Drawable[i2];
        int i3 = r9.A00;
        if (i3 == -1) {
            A002 = r9.A0A;
        } else {
            A002 = r9.A00(i3);
        }
        drawableArr[0] = A002;
        int i4 = r9.A01;
        if (i4 == -1) {
            A012 = r9.A0B;
        } else {
            A012 = r9.A01(i4);
        }
        drawableArr[1] = A012;
        if (drawable != null) {
            drawableArr[2] = drawable;
        }
        A0H.setImageDrawable(A02(r9.A02, drawableArr, i2));
        A0H.setBackgroundResource(2131232706);
        int i5 = r9.A00;
        if (i5 == -1 || (i = r9.A01) == -1) {
            A0H.setOnClickListener((View.OnClickListener) null);
            A013 = C1401870h.A01(r9.A08, r9.A07, r9.A00, r9.A01);
        } else {
            int[] A014 = r9.A03.A00(1, i5).A00(2, i).A01();
            A0H.setOnClickListener(new AnonymousClass48j(A0H, r9, A014, 0));
            A013 = C137176v2.A01(A014);
        }
        A0H.setContentDescription(A013);
    }

    public static BitmapDrawable A02(Resources resources, Object[] objArr, int i) {
        Bitmap A002 = AnonymousClass6WI.A00((Drawable[]) Arrays.copyOf(objArr, i));
        if (A002 != null) {
            return new BitmapDrawable(resources, A002);
        }
        return null;
    }
}
