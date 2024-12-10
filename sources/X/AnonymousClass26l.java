package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.26l  reason: invalid class name */
public class AnonymousClass26l extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable(Resources resources) {
        C24291Jp r1 = new C24291Jp();
        r1.A00 = this.A00.newDrawable(resources);
        return r1;
    }

    public AnonymousClass26l(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C24291Jp r1 = new C24291Jp();
        r1.A00 = this.A00.newDrawable(resources, theme);
        return r1;
    }

    public Drawable newDrawable() {
        C24291Jp r1 = new C24291Jp();
        r1.A00 = this.A00.newDrawable();
        return r1;
    }
}
