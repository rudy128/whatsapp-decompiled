package X;

import android.view.WindowInsets;

/* renamed from: X.1Za  reason: invalid class name and case insensitive filesystem */
public class C28141Za extends AnonymousClass1ZZ {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28141Za)) {
            return false;
        }
        AnonymousClass1ZY r4 = (AnonymousClass1ZY) obj;
        return AnonymousClass026.A00(this.A04, r4.A04) && AnonymousClass026.A00(this.A00, r4.A00);
    }

    public Cn4 A07() {
        return Cn4.A00(this.A04.getDisplayCutout());
    }

    public AnonymousClass1HO A08() {
        WindowInsets consumeDisplayCutout = this.A04.consumeDisplayCutout();
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(consumeDisplayCutout);
        return new AnonymousClass1HO(consumeDisplayCutout);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public C28141Za(AnonymousClass1HO r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
        this.A00 = null;
    }
}
