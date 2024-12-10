package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.062  reason: invalid class name */
public class AnonymousClass062 extends AnonymousClass063 {
    public C001100p A00;
    public AnonymousClass04B A01;

    public void A05() {
        this.A00 = this.A00.clone();
        this.A01 = this.A01.clone();
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass060(resources, this);
    }

    public AnonymousClass062(Resources resources, AnonymousClass062 r3, AnonymousClass060 r4) {
        super(resources, r3, r4);
        AnonymousClass04B r0;
        if (r3 != null) {
            this.A00 = r3.A00;
            r0 = r3.A01;
        } else {
            this.A00 = new C001100p();
            r0 = new AnonymousClass04B();
        }
        this.A01 = r0;
    }

    public int A0B(int[] iArr) {
        int A0A = super.A0A(iArr);
        if (A0A < 0) {
            return super.A0A(StateSet.WILD_CARD);
        }
        return A0A;
    }

    public Drawable newDrawable() {
        return new AnonymousClass060((Resources) null, this);
    }
}
