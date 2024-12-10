package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* renamed from: X.2qk  reason: invalid class name and case insensitive filesystem */
public final class C62072qk {
    public final int A00;
    public final ColorStateList A01;
    public final ColorStateList A02;
    public final ColorStateList A03;
    public final Rect A04;
    public final C28011Ym A05;

    public static C62072qk A00(Context context, int i) {
        if (AnonymousClass000.A1O(i)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C27781Xn.A0O);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList A012 = AnonymousClass1YT.A01(context, obtainStyledAttributes, 4);
            ColorStateList A013 = AnonymousClass1YT.A01(context, obtainStyledAttributes, 9);
            ColorStateList A014 = AnonymousClass1YT.A01(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            C28011Ym r9 = new C28011Ym(C28011Ym.A02(context, new AnonymousClass1Ys(0.0f), obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
            obtainStyledAttributes.recycle();
            return new C62072qk(A012, A013, A014, rect, r9, dimensionPixelSize);
        }
        throw AnonymousClass000.A0k(String.valueOf("Cannot create a CalendarItemStyle with a styleResId of 0"));
    }

    public void A01(TextView textView) {
        C27801Xq r3 = new C27801Xq();
        C27801Xq r2 = new C27801Xq();
        C28011Ym r0 = this.A05;
        r3.setShapeAppearanceModel(r0);
        r2.setShapeAppearanceModel(r0);
        r3.A0F(this.A01);
        r3.A0H(this.A02, (float) this.A00);
        ColorStateList colorStateList = this.A03;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), r3, r2);
        Rect rect = this.A04;
        textView.setBackground(new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public C62072qk(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Rect rect, C28011Ym r6, int i) {
        C28111Yx.A00(rect.left);
        C28111Yx.A00(rect.top);
        C28111Yx.A00(rect.right);
        C28111Yx.A00(rect.bottom);
        this.A04 = rect;
        this.A03 = colorStateList2;
        this.A01 = colorStateList;
        this.A02 = colorStateList3;
        this.A00 = i;
        this.A05 = r6;
    }
}
