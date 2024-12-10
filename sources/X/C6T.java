package X;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ConcurrentModificationException;

public abstract class C6T {
    public void A00(int i) {
    }

    public void A02(int i, float f, int i2) {
    }

    public void A01(int i) {
        if (this instanceof C22720BMh) {
            return;
        }
        if (this instanceof C22719BMg) {
            C22719BMg bMg = (C22719BMg) this;
            int i2 = bMg.A00;
            Object obj = bMg.A01;
            switch (i2) {
                case 0:
                    ((CX4) obj).A00(false);
                    return;
                case 1:
                    ViewPager2 viewPager2 = (ViewPager2) obj;
                    if (viewPager2.A00 != i) {
                        viewPager2.A00 = i;
                        viewPager2.A07.A00();
                        return;
                    }
                    return;
                default:
                    ViewPager2 viewPager22 = (ViewPager2) obj;
                    viewPager22.clearFocus();
                    if (viewPager22.hasFocus()) {
                        viewPager22.A04.requestFocus(2);
                        return;
                    }
                    return;
            }
        } else {
            try {
                for (C6T A01 : ((C22721BMi) this).A00) {
                    A01.A01(i);
                }
            } catch (ConcurrentModificationException e) {
                throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
            }
        }
    }
}
