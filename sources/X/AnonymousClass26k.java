package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.26k  reason: invalid class name */
public class AnonymousClass26k extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable(Resources resources) {
        C454028v r2 = new C454028v();
        Drawable newDrawable = this.A00.newDrawable(resources);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A04);
        return r2;
    }

    public AnonymousClass26k(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C454028v r2 = new C454028v();
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A04);
        return r2;
    }

    public Drawable newDrawable() {
        C454028v r2 = new C454028v();
        Drawable newDrawable = this.A00.newDrawable();
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A04);
        return r2;
    }
}
