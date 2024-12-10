package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.2mx  reason: invalid class name and case insensitive filesystem */
public abstract class C59832mx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1418377d A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public Context A00() {
        return ((C49012Ov) this).A00;
    }

    public void A01(Drawable drawable, AnonymousClass1KB r6) {
        C49012Ov r3 = (C49012Ov) this;
        if (drawable != null) {
            drawable.setBounds(0, 0, r3.A03, r3.A00);
            r3.A01.C6o(drawable);
        }
    }

    public C59832mx(C1418377d r1, Integer num, String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A04 = r1;
        this.A06 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A07 = z;
        this.A02 = i3;
        this.A09 = z2;
        this.A05 = num;
        this.A01 = i4;
        this.A08 = z3;
    }

    public boolean A02() {
        return true;
    }
}
