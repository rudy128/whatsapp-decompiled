package X;

import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.7Ak  reason: invalid class name and case insensitive filesystem */
public class C142687Ak implements C23521Gp {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public C142687Ak(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void Bzw(int i) {
        if (i == 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            PagerSlidingTabStrip.A01(pagerSlidingTabStrip, pagerSlidingTabStrip.A04.getCurrentItem(), 0);
        }
        C23521Gp r0 = this.A00.A03;
        if (r0 != null) {
            r0.Bzw(i);
        }
    }

    public void Bzx(int i, float f, int i2) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
        pagerSlidingTabStrip.A01 = i;
        pagerSlidingTabStrip.A00 = f;
        PagerSlidingTabStrip.A01(pagerSlidingTabStrip, i, (int) (C108945cZ.A03(pagerSlidingTabStrip.A0M.getChildAt(i)) * f));
        pagerSlidingTabStrip.invalidate();
        C23521Gp r0 = pagerSlidingTabStrip.A03;
        if (r0 != null) {
            r0.Bzx(i, f, i2);
        }
    }

    public void Bzy(int i) {
        C23521Gp r0 = this.A00.A03;
        if (r0 != null) {
            r0.Bzy(i);
        }
    }
}
