package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class CX4 {
    public AnonymousClass1GC A00;
    public C37911qO A01;
    public C6T A02;
    public ViewPager2 A03;
    public long A04 = -1;
    public final /* synthetic */ BLs A05;

    public CX4(BLs bLs) {
        this.A05 = bLs;
    }

    public void A00(boolean z) {
        int i;
        Fragment fragment;
        BLs bLs = this.A05;
        AnonymousClass1GP r6 = bLs.A06;
        if (!r6.A0z() && this.A03.A06.A02 == 0) {
            C001100p r7 = bLs.A03;
            if (r7.A00() != 0 && bLs.A0Q() != 0 && (i = this.A03.A00) < bLs.A0Q()) {
                long j = (long) i;
                if ((j != this.A04 || z) && (fragment = (Fragment) r7.A05(j)) != null && fragment.A1b()) {
                    this.A04 = j;
                    C34001jj r5 = new C34001jj(r6);
                    Fragment fragment2 = null;
                    for (int i2 = 0; i2 < r7.A00(); i2++) {
                        long A022 = r7.A02(i2);
                        Fragment fragment3 = (Fragment) r7.A04(i2);
                        if (fragment3.A1b()) {
                            if (A022 != this.A04) {
                                r5.A0A(fragment3, C23401Fx.STARTED);
                            } else {
                                fragment2 = fragment3;
                            }
                            fragment3.A1a(AnonymousClass000.A1P((A022 > this.A04 ? 1 : (A022 == this.A04 ? 0 : -1))));
                        }
                    }
                    if (fragment2 != null) {
                        r5.A0A(fragment2, C23401Fx.RESUMED);
                    }
                    if (!r5.A0C.isEmpty()) {
                        r5.A03();
                    }
                }
            }
        }
    }
}
