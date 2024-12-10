package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.BMf  reason: case insensitive filesystem */
public class C22718BMf extends C22708BLt {
    public final int A00;
    public final Object A01;

    public C22718BMf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A01() {
        if (this.A00 != 0) {
            ((C25076CWl) this.A01).A00();
            return;
        }
        ViewPager2 viewPager2 = (ViewPager2) this.A01;
        viewPager2.A08 = true;
        viewPager2.A06.A06 = true;
    }
}
