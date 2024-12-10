package X;

import java.io.IOException;

/* renamed from: X.1Bz  reason: invalid class name */
public abstract class AnonymousClass1Bz extends AnonymousClass1By {
    public static AnonymousClass1Bz A01(byte[] bArr) {
        C24178Bwo bwo = new C24178Bwo(bArr);
        try {
            AnonymousClass1Bz A05 = bwo.A05();
            if (bwo.available() == 0) {
                return A05;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public int A0D() {
        int length = AnonymousClass1C0.A04((AnonymousClass1C0) this).length;
        return C26084Cs1.A00(length) + 1 + length;
    }

    public AnonymousClass1Bz A0E() {
        return this;
    }

    public AnonymousClass1Bz A0F() {
        return this;
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(AnonymousClass1C0.A04((AnonymousClass1C0) this), 6, z);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        AnonymousClass1C0 r1 = (AnonymousClass1C0) this;
        if (r3 == r1) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass1C0)) {
            return false;
        }
        return r1.A01.equals(((AnonymousClass1C0) r3).A01);
    }

    public final boolean A0J(AnonymousClass1Bz r3) {
        return this == r3 || A0I(r3);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1Bx) && A0I(((AnonymousClass1Bx) obj).CP9()));
    }

    public abstract int hashCode();

    public boolean A0H() {
        return false;
    }
}
