package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.26i  reason: invalid class name */
public final class AnonymousClass26i extends Drawable.ConstantState {
    public int A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = AnonymousClass26s.A07;
    public Drawable.ConstantState A03;

    public int getChangingConfigurations() {
        int i;
        int i2 = this.A00;
        Drawable.ConstantState constantState = this.A03;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.26s, android.graphics.drawable.Drawable] */
    public Drawable newDrawable(Resources resources) {
        ? drawable = new Drawable();
        drawable.A01 = this;
        Drawable.ConstantState constantState = this.A03;
        if (constantState != null) {
            drawable.CLU(constantState.newDrawable(resources));
        }
        AnonymousClass26s.A00();
        return drawable;
    }

    public AnonymousClass26i(AnonymousClass26i r2) {
        if (r2 != null) {
            this.A00 = r2.A00;
            this.A03 = r2.A03;
            this.A01 = r2.A01;
            this.A02 = r2.A02;
        }
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }
}
