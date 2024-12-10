package X;

import android.view.View;
import android.view.WindowInsets;
import java.util.Arrays;

/* renamed from: X.1ZX  reason: invalid class name */
public class AnonymousClass1ZX {
    public static final AnonymousClass1HO A01;
    public final AnonymousClass1HO A00;

    public Cn4 A07() {
        return null;
    }

    public void A0A(View view) {
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        boolean z2 = false;
        if (!(obj instanceof AnonymousClass1ZX)) {
            return false;
        }
        AnonymousClass1ZX r5 = (AnonymousClass1ZX) obj;
        if (this instanceof AnonymousClass1ZY) {
            z = ((AnonymousClass1ZY) this).A04.isRound();
        } else {
            z = false;
        }
        if (r5 instanceof AnonymousClass1ZY) {
            z2 = ((AnonymousClass1ZY) r5).A04.isRound();
        }
        return z == z2 && A0C() == r5.A0C() && AnonymousClass026.A00(A03(), r5.A03()) && AnonymousClass026.A00(A01(), r5.A01()) && AnonymousClass026.A00(A07(), r5.A07());
    }

    public int hashCode() {
        boolean z;
        Object[] objArr = new Object[5];
        if (this instanceof AnonymousClass1ZY) {
            z = ((AnonymousClass1ZY) this).A04.isRound();
        } else {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Boolean.valueOf(A0C());
        objArr[2] = A03();
        objArr[3] = A01();
        objArr[4] = A07();
        return Arrays.hashCode(objArr);
    }

    static {
        AnonymousClass1HO r0;
        AnonymousClass1HO r02;
        AnonymousClass1ZX r1 = new C28171Zd().A00.A00().A00.A08().A00;
        if (r1 instanceof AnonymousClass1ZZ) {
            WindowInsets consumeStableInsets = ((AnonymousClass1ZY) r1).A04.consumeStableInsets();
            C28111Yx.A02(consumeStableInsets);
            r0 = new AnonymousClass1HO(consumeStableInsets);
        } else {
            r0 = r1.A00;
        }
        AnonymousClass1ZX r12 = r0.A00;
        if (r12 instanceof AnonymousClass1ZZ) {
            WindowInsets consumeSystemWindowInsets = ((AnonymousClass1ZY) r12).A04.consumeSystemWindowInsets();
            C28111Yx.A02(consumeSystemWindowInsets);
            r02 = new AnonymousClass1HO(consumeSystemWindowInsets);
        } else {
            r02 = r12.A00;
        }
        A01 = r02;
    }

    public C33321id A01() {
        if (!(this instanceof AnonymousClass1ZZ)) {
            return C33321id.A04;
        }
        AnonymousClass1ZZ r4 = (AnonymousClass1ZZ) this;
        C33321id r0 = r4.A00;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = r4.A04;
        C33321id A002 = C33321id.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        r4.A00 = A002;
        return A002;
    }

    public C33321id A03() {
        if (!(this instanceof AnonymousClass1ZY)) {
            return C33321id.A04;
        }
        AnonymousClass1ZY r4 = (AnonymousClass1ZY) this;
        C33321id r0 = r4.A01;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = r4.A04;
        C33321id A002 = C33321id.A00(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        r4.A01 = A002;
        return A002;
    }

    public C33321id A05(int i) {
        if (!(this instanceof AnonymousClass1ZY)) {
            return C33321id.A04;
        }
        AnonymousClass1ZY r4 = (AnonymousClass1ZY) this;
        C33321id r2 = C33321id.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                r2 = C33321id.A02(r2, r4.A0E(i2, false));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return r2;
    }

    public C33321id A06(int i) {
        if (this instanceof AnonymousClass1ZY) {
            AnonymousClass1ZY r4 = (AnonymousClass1ZY) this;
            C33321id r2 = C33321id.A04;
            int i2 = 1;
            do {
                if ((i & i2) != 0) {
                    r2 = C33321id.A02(r2, r4.A0E(i2, true));
                }
                i2 <<= 1;
            } while (i2 <= 256);
            return r2;
        } else if ((i & 8) == 0) {
            return C33321id.A04;
        } else {
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
    }

    public AnonymousClass1HO A09(int i, int i2, int i3, int i4) {
        if (!(this instanceof AnonymousClass1ZY)) {
            return A01;
        }
        AnonymousClass1ZY r3 = (AnonymousClass1ZY) this;
        WindowInsets windowInsets = r3.A04;
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        C28111Yx.A02(windowInsets);
        C28171Zd r2 = new C28171Zd(new AnonymousClass1HO(windowInsets));
        r2.A01(AnonymousClass1HO.A00(r3.A03(), i, i2, i3, i4));
        C33321id A002 = AnonymousClass1HO.A00(r3.A01(), i, i2, i3, i4);
        C28181Ze r02 = r2.A00;
        r02.A03(A002);
        return r02.A00();
    }

    public void A0B(C33321id r2) {
        if (this instanceof AnonymousClass1ZZ) {
            ((AnonymousClass1ZZ) this).A00 = r2;
        }
    }

    public boolean A0C() {
        if (this instanceof AnonymousClass1ZZ) {
            return ((AnonymousClass1ZY) this).A04.isConsumed();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r2 != 128) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass1ZY
            if (r0 == 0) goto L_0x0035
            r4 = r5
            X.1ZY r4 = (X.AnonymousClass1ZY) r4
            r3 = 1
            r2 = 1
        L_0x0009:
            r0 = r6 & r2
            if (r0 == 0) goto L_0x001e
            r1 = 0
            if (r2 == r3) goto L_0x0025
            r0 = 2
            if (r2 == r0) goto L_0x0025
            r0 = 4
            if (r2 == r0) goto L_0x0033
            r0 = 8
            if (r2 == r0) goto L_0x0025
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x0025
        L_0x001e:
            int r2 = r2 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r2 > r0) goto L_0x0035
            goto L_0x0009
        L_0x0025:
            X.1id r1 = r4.A0E(r2, r1)
            X.1id r0 = X.C33321id.A04
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001e
        L_0x0033:
            r0 = 0
            return r0
        L_0x0035:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZX.A0D(int):boolean");
    }

    public AnonymousClass1ZX(AnonymousClass1HO r1) {
        this.A00 = r1;
    }

    public C33321id A00() {
        return A03();
    }

    public C33321id A02() {
        return A03();
    }

    public C33321id A04() {
        return A03();
    }

    public AnonymousClass1HO A08() {
        return this.A00;
    }
}
