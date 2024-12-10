package X;

import android.view.WindowInsets;

/* renamed from: X.1Zb  reason: invalid class name and case insensitive filesystem */
public class C28151Zb extends C28141Za {
    public C33321id A00 = null;
    public C33321id A01 = null;
    public C33321id A02 = null;

    public void A0B(C33321id r1) {
    }

    public C33321id A00() {
        C33321id r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C33321id A012 = C33321id.A01(this.A04.getMandatorySystemGestureInsets());
        this.A00 = A012;
        return A012;
    }

    public C33321id A02() {
        C33321id r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C33321id A012 = C33321id.A01(this.A04.getSystemGestureInsets());
        this.A01 = A012;
        return A012;
    }

    public C33321id A04() {
        C33321id r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C33321id A012 = C33321id.A01(this.A04.getTappableElementInsets());
        this.A02 = A012;
        return A012;
    }

    public AnonymousClass1HO A09(int i, int i2, int i3, int i4) {
        WindowInsets inset = this.A04.inset(i, i2, i3, i4);
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(inset);
        return new AnonymousClass1HO(inset);
    }

    public C28151Zb(AnonymousClass1HO r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }
}
