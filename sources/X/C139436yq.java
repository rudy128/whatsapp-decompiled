package X;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: X.6yq  reason: invalid class name and case insensitive filesystem */
public final class C139436yq {
    public final C130506jX A00;

    public C139436yq(Context context, int i) {
        AnonymousClass6UY r0;
        C130506jX r3 = new C130506jX();
        this.A00 = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AnonymousClass1Y0.A03);
        int i2 = obtainStyledAttributes.getInt(2, -1);
        if (i2 == 0) {
            r0 = AnonymousClass4AH.A00;
        } else if (i2 != 1) {
            if (i2 == 2) {
                r0 = new AnonymousClass6P4((C18090vk) null, (AnonymousClass1Y1) null, 1);
            }
            r3.A06 = obtainStyledAttributes.getBoolean(3, false);
            r3.A02 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            r3.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        } else {
            r0 = AnonymousClass4AI.A00;
        }
        r3.A04 = r0;
        r3.A06 = obtainStyledAttributes.getBoolean(3, false);
        r3.A02 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        r3.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final void A00(AnonymousClass6UY r2) {
        this.A00.A04 = r2;
    }

    public final void A01(boolean z) {
        this.A00.A06 = z;
    }

    public C139436yq() {
        this.A00 = new C130506jX();
    }
}
