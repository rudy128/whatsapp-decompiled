package X;

import android.os.Build;
import java.util.Set;

public final class A1B {
    public Integer A00 = AnonymousClass00R.A00;
    public Set A01 = C17880vN.A14();
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public final void A02() {
        this.A05 = true;
    }

    public static C20078A6e A00(Integer num, Set set) {
        Set set2;
        if (Build.VERSION.SDK_INT >= 24) {
            set2 = C29431cG.A12(set);
        } else {
            set2 = C25511Om.A00;
        }
        return new C20078A6e(num, set2, -1, -1, false, false, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r11.A05 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20078A6e A01() {
        /*
            r11 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0027
            java.util.Set r0 = r11.A01
            java.util.Set r2 = X.C29431cG.A12(r0)
        L_0x000c:
            r3 = -1
            boolean r7 = r11.A03
            r0 = 23
            if (r1 < r0) goto L_0x0019
            boolean r0 = r11.A05
            r8 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            java.lang.Integer r1 = r11.A00
            boolean r9 = r11.A02
            boolean r10 = r11.A04
            X.A6e r0 = new X.A6e
            r5 = r3
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            return r0
        L_0x0027:
            X.1Om r2 = X.C25511Om.A00
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1B.A01():X.A6e");
    }
}
