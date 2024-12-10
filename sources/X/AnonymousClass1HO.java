package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.1HO  reason: invalid class name */
public class AnonymousClass1HO {
    public static final AnonymousClass1HO A01;
    public final AnonymousClass1ZX A00;

    static {
        AnonymousClass1HO r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = C28161Zc.A00;
        } else {
            r0 = AnonymousClass1ZX.A01;
        }
        A01 = r0;
    }

    public static C33321id A00(C33321id r5, int i, int i2, int i3, int i4) {
        int max = Math.max(0, r5.A01 - i);
        int max2 = Math.max(0, r5.A03 - i2);
        int max3 = Math.max(0, r5.A02 - i3);
        int max4 = Math.max(0, r5.A00 - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return r5;
        }
        return C33321id.A00(max, max2, max3, max4);
    }

    @Deprecated
    public int A02() {
        return this.A00.A03().A00;
    }

    @Deprecated
    public int A03() {
        return this.A00.A03().A01;
    }

    @Deprecated
    public int A04() {
        return this.A00.A03().A02;
    }

    @Deprecated
    public int A05() {
        return this.A00.A03().A03;
    }

    public WindowInsets A06() {
        AnonymousClass1ZX r1 = this.A00;
        if (r1 instanceof AnonymousClass1ZY) {
            return ((AnonymousClass1ZY) r1).A04;
        }
        return null;
    }

    public C33321id A07(int i) {
        return this.A00.A05(i);
    }

    public C33321id A08(int i) {
        return this.A00.A06(i);
    }

    public Cn4 A09() {
        return this.A00.A07();
    }

    @Deprecated
    public AnonymousClass1HO A0A() {
        return this.A00.A08();
    }

    @Deprecated
    public AnonymousClass1HO A0B() {
        AnonymousClass1ZX r1 = this.A00;
        if (!(r1 instanceof AnonymousClass1ZZ)) {
            return r1.A00;
        }
        WindowInsets consumeStableInsets = ((AnonymousClass1ZY) r1).A04.consumeStableInsets();
        C28111Yx.A02(consumeStableInsets);
        return new AnonymousClass1HO(consumeStableInsets);
    }

    @Deprecated
    public AnonymousClass1HO A0C() {
        AnonymousClass1ZX r1 = this.A00;
        if (!(r1 instanceof AnonymousClass1ZZ)) {
            return r1.A00;
        }
        WindowInsets consumeSystemWindowInsets = ((AnonymousClass1ZY) r1).A04.consumeSystemWindowInsets();
        C28111Yx.A02(consumeSystemWindowInsets);
        return new AnonymousClass1HO(consumeSystemWindowInsets);
    }

    public AnonymousClass1HO A0D(int i, int i2, int i3, int i4) {
        return this.A00.A09(i, i2, i3, i4);
    }

    @Deprecated
    public AnonymousClass1HO A0E(int i, int i2, int i3, int i4) {
        C28171Zd r1 = new C28171Zd(this);
        r1.A01(C33321id.A00(i, i2, i3, i4));
        return r1.A00.A00();
    }

    public boolean A0F(int i) {
        return this.A00.A0D(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1HO)) {
            return false;
        }
        return AnonymousClass026.A00(this.A00, ((AnonymousClass1HO) obj).A00);
    }

    public int hashCode() {
        AnonymousClass1ZX r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1Zc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.1Zc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.1Zb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.1Zc} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.1ZZ, X.1ZY] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1HO(android.view.WindowInsets r3) {
        /*
            r2 = this;
            r2.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0011
            X.1Zc r1 = new X.1Zc
            r1.<init>(r2, r3)
        L_0x000e:
            r2.A00 = r1
            return
        L_0x0011:
            r0 = 29
            if (r1 < r0) goto L_0x001b
            X.1Zb r1 = new X.1Zb
            r1.<init>(r2, r3)
            goto L_0x000e
        L_0x001b:
            r0 = 28
            if (r1 < r0) goto L_0x0025
            X.1Za r1 = new X.1Za
            r1.<init>(r2, r3)
            goto L_0x000e
        L_0x0025:
            X.1ZZ r1 = new X.1ZZ
            r1.<init>(r2, r3)
            r0 = 0
            r1.A00 = r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HO.<init>(android.view.WindowInsets):void");
    }

    public static AnonymousClass1HO A01(View view, WindowInsets windowInsets) {
        C28111Yx.A02(windowInsets);
        AnonymousClass1HO r3 = new AnonymousClass1HO(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            AnonymousClass1HO A0C = AnonymousClass1HF.A0C(view);
            AnonymousClass1ZX r1 = r3.A00;
            if (r1 instanceof AnonymousClass1ZY) {
                ((AnonymousClass1ZY) r1).A02 = A0C;
            }
            r1.A0A(view.getRootView());
        }
        return r3;
    }

    public AnonymousClass1HO() {
        this.A00 = new AnonymousClass1ZX(this);
    }
}
