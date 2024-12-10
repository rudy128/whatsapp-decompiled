package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog$Builder;

/* renamed from: X.3Ri  reason: invalid class name and case insensitive filesystem */
public final class C73193Ri extends AlertDialog$Builder {
    public int A00;
    public Drawable A01;
    public final Rect A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73193Ri(android.content.Context r20, int r21) {
        /*
            r19 = this;
            r3 = 1
            r4 = r20
            X.C18070vi.A0d(r4, r3)
            r0 = 2130970415(0x7f04072f, float:1.754954E38)
            android.util.TypedValue r0 = X.AnonymousClass1Z9.A01(r4, r0)
            if (r0 != 0) goto L_0x010a
            r2 = 0
        L_0x0010:
            r7 = 2130968655(0x7f04004f, float:1.754597E38)
            r1 = 2132083455(0x7f1502ff, float:1.9807053E38)
            r0 = 0
            android.content.Context r1 = X.C27771Xm.A00(r4, r0, r7, r1)
            if (r2 == 0) goto L_0x0023
            X.01k r0 = new X.01k
            r0.<init>(r1, r2)
            r1 = r0
        L_0x0023:
            r2 = r19
            r0 = r21
            r2.<init>(r1, r0)
            android.content.Context r13 = r2.getContext()
            android.content.res.Resources$Theme r6 = r13.getTheme()
            r8 = 2132083455(0x7f1502ff, float:1.9807053E38)
            int[] r15 = X.C27781Xn.A0J
            r0 = 0
            int[] r0 = new int[r0]
            r14 = 0
            r18 = r8
            r17 = r7
            r16 = r0
            android.content.res.TypedArray r11 = X.C27791Xo.A00(r13, r14, r15, r16, r17, r18)
            r5 = 2
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167758(0x7f070a0e, float:1.7949799E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r10 = r11.getDimensionPixelSize(r5, r0)
            r5 = 3
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167759(0x7f070a0f, float:1.79498E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r9 = r11.getDimensionPixelSize(r5, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167757(0x7f070a0d, float:1.7949797E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r5 = r11.getDimensionPixelSize(r3, r0)
            r12 = 0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167756(0x7f070a0c, float:1.7949795E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r11.getDimensionPixelSize(r12, r0)
            r11.recycle()
            android.content.res.Resources r0 = r13.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            if (r0 != r3) goto L_0x0098
            r0 = r5
            r5 = r10
            r10 = r0
        L_0x0098:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r10, r9, r5, r1)
            r2.A02 = r0
            r1 = 2130969148(0x7f04023c, float:1.754697E38)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            int r0 = X.AnonymousClass1ZA.A02(r13, r0, r1)
            X.1Xq r5 = new X.1Xq
            r5.<init>(r13, r14, r7, r8)
            r5.A0E(r13)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r5.A0F(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00ef
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r6.resolveAttribute(r0, r1, r3)
            android.content.res.Resources r0 = r13.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = r1.getDimension(r0)
            int r1 = r1.type
            r0 = 5
            if (r1 != r0) goto L_0x00ef
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ef
            X.1Yz r0 = r5.A01
            X.1Ym r0 = r0.A0K
            X.1Ym r0 = r0.A03(r3)
            r5.setShapeAppearanceModel(r0)
        L_0x00ef:
            r2.A01 = r5
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.Class<X.00c> r0 = X.C000100c.class
            java.lang.Object r0 = X.C000400h.A00(r0, r1)
            X.00c r0 = (X.C000100c) r0
            X.0ve r1 = r0.BAL()
            r0 = 4496(0x1190, float:6.3E-42)
            boolean r0 = X.AnonymousClass1J8.A0A(r1, r14, r0)
            r2.A03 = r0
            return
        L_0x010a:
            int r2 = r0.data
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73193Ri.<init>(android.content.Context, int):void");
    }

    public static void A01(C73193Ri r1, int i, int i2) {
        super.setNegativeButton(i2, new C1411874q(i));
    }

    public static C73193Ri A00(Context context) {
        return new C73193Ri(context, 2132084403);
    }

    public /* bridge */ /* synthetic */ void A0D(int i) {
        super.A0D(i);
    }

    public /* bridge */ /* synthetic */ void A0E(int i) {
        super.A0E(i);
    }

    public /* bridge */ /* synthetic */ void A0F(int i) {
        super.A0F(i);
    }

    public /* bridge */ /* synthetic */ void A0G(DialogInterface.OnCancelListener onCancelListener) {
        super.A0G(onCancelListener);
    }

    public /* bridge */ /* synthetic */ void A0O(DialogInterface.OnDismissListener onDismissListener) {
        super.A0O(onDismissListener);
    }

    public /* bridge */ /* synthetic */ void A0P(DialogInterface.OnKeyListener onKeyListener) {
        super.A0P(onKeyListener);
    }

    public /* bridge */ /* synthetic */ void A0R(View view) {
        super.A0R(view);
    }

    public /* bridge */ /* synthetic */ void A0S(CharSequence charSequence) {
        super.A0S(charSequence);
    }

    public /* bridge */ /* synthetic */ void A0T(boolean z) {
        super.A0T(z);
    }

    public void A0U(int i) {
        super.A0D(i);
    }

    public void A0V(int i) {
        super.A0E(i);
    }

    public void A0b(DialogInterface.OnDismissListener onDismissListener) {
        super.A0O(onDismissListener);
    }

    public void A0c(View view) {
        super.setView(view);
    }

    public void A0d(CharSequence charSequence) {
        super.A0S(charSequence);
    }

    public void A0e(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public void A0f(boolean z) {
        super.A0T(z);
    }

    public C010105w create() {
        View decorView;
        C010105w create = super.create();
        Window window = create.getWindow();
        View decorView2 = window.getDecorView();
        Drawable drawable = this.A01;
        if (drawable instanceof C27801Xq) {
            ((C27801Xq) drawable).A0C(AnonymousClass1Xr.A00(decorView2));
        }
        Rect rect = this.A02;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView2.setOnTouchListener(new C20293AFb(create, rect));
        Window window2 = create.getWindow();
        if (!(window2 == null || (decorView = window2.getDecorView()) == null)) {
            C43531zx.A06(new C99134sK(this, decorView, 18), decorView);
        }
        return create;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setView(View view) {
        super.setView(view);
        return this;
    }

    public /* bridge */ /* synthetic */ void A0H(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        super.A0H(onClickListener, listAdapter);
    }

    public /* bridge */ /* synthetic */ void A0J(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0J(onClickListener, charSequence);
    }

    public /* bridge */ /* synthetic */ void A0K(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0K(onClickListener, charSequence);
    }

    public /* bridge */ /* synthetic */ void A0L(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0L(onClickListener, charSequence);
    }

    public /* bridge */ /* synthetic */ void A0M(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        super.A0M(onClickListener, charSequenceArr);
    }

    public void A0W(DialogInterface.OnClickListener onClickListener, int i) {
        super.setNegativeButton(i, onClickListener);
    }

    public void A0X(DialogInterface.OnClickListener onClickListener, int i) {
        super.setPositiveButton(i, onClickListener);
    }

    public void A0Y(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0J(onClickListener, charSequence);
    }

    public void A0Z(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0K(onClickListener, charSequence);
    }

    public void A0a(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0L(onClickListener, charSequence);
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    public /* bridge */ /* synthetic */ void A0I(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        super.A0I(onClickListener, listAdapter, i);
    }

    public /* bridge */ /* synthetic */ void A0N(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        super.A0N(onClickListener, charSequenceArr, i);
    }

    public /* bridge */ /* synthetic */ void A0Q(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        super.A0Q(onMultiChoiceClickListener, charSequenceArr, zArr);
    }
}
