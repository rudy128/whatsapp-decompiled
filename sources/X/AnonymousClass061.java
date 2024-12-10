package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.061  reason: invalid class name */
public class AnonymousClass061 extends AnonymousClass04V {
    public AnonymousClass063 A00;
    public boolean A01;

    public boolean isStateful() {
        return true;
    }

    /* renamed from: A0A */
    public AnonymousClass063 A08() {
        return new AnonymousClass063((Resources) null, this.A00, this);
    }

    public void A0B(int[] iArr, Drawable drawable) {
        AnonymousClass063 r0 = this.A00;
        r0.A00[r0.A02(drawable)] = iArr;
        onStateChange(getState());
    }

    public Drawable mutate() {
        if (!this.A01) {
            super.mutate();
            this.A00.A05();
            this.A01 = true;
        }
        return this;
    }

    public AnonymousClass061(Resources resources, AnonymousClass063 r3) {
        A09(new AnonymousClass063(resources, r3, this));
        onStateChange(getState());
    }

    public void A09(AnonymousClass04Q r2) {
        super.A09(r2);
        if (r2 instanceof AnonymousClass063) {
            this.A00 = (AnonymousClass063) r2;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A0A = this.A00.A0A(iArr);
        if (A0A < 0) {
            A0A = this.A00.A0A(StateSet.WILD_CARD);
        }
        if (A07(A0A) || onStateChange) {
            return true;
        }
        return false;
    }

    public AnonymousClass061() {
        this((Resources) null, (AnonymousClass063) null);
    }
}
