package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;

/* renamed from: X.3NK  reason: invalid class name */
public final class AnonymousClass3NK extends InsetDrawable {
    public int A00;
    public final Drawable A01;

    public void setTint(int i) {
        C27831Xu.A0C(this.A01, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C27831Xu.A03(colorStateList, this.A01);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A01;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        C27831Xu.A07(mode, drawable);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3NK(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r1 = X.C27831Xu.A02(r3)
            r0 = 0
            r2.<init>(r1, r0)
            r2.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NK.<init>(android.graphics.drawable.Drawable):void");
    }

    public static void A00(Drawable drawable, View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        view.setBackground(drawable);
        view.setPadding(paddingLeft, 0, paddingRight, 0);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.A01;
        drawable.setBounds(bounds.left, bounds.top + this.A00, bounds.right, bounds.bottom);
        drawable.draw(canvas);
    }
}
