package X;

import android.content.res.Resources;

/* renamed from: X.6xx  reason: invalid class name and case insensitive filesystem */
public abstract class C138946xx {
    public final boolean A00;
    public final boolean A01;

    public static C130506jX A00(Resources resources, C139436yq r3) {
        r3.A01(true);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131169343);
        C130506jX r1 = r3.A00;
        r1.A01 = dimensionPixelSize;
        r1.A02 = resources.getDimensionPixelSize(2131169344);
        r1.A00 = resources.getDimensionPixelSize(2131169338);
        r1.A03 = 2131103368;
        return r1;
    }

    public void A01(Resources resources, C139436yq r5) {
        C130506jX A002;
        AnonymousClass6UY r0;
        if (this instanceof AnonymousClass6Pd) {
            A002 = A00(resources, r5);
            r0 = ((AnonymousClass6Pd) this).A00;
        } else if (this instanceof AnonymousClass6Pg) {
            return;
        } else {
            if (this instanceof AnonymousClass6Pe) {
                AnonymousClass6Pe r2 = (AnonymousClass6Pe) this;
                int i = -1;
                if (r2.A00.A01()) {
                    i = resources.getDimensionPixelSize(2131169343);
                }
                A002 = r5.A00;
                A002.A01 = i;
                r0 = r2.A01;
            } else {
                A002 = A00(resources, r5);
                r0 = AnonymousClass4AH.A00;
                A002.A05 = r0;
            }
        }
        r5.A00(r0);
        A002.A05 = r0;
    }

    public C138946xx(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
