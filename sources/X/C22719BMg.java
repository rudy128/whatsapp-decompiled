package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.BMg  reason: case insensitive filesystem */
public class C22719BMg extends C6T {
    public final int A00;
    public final Object A01;

    public C22719BMg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(int i) {
        switch (this.A00) {
            case 0:
                ((CX4) this.A01).A00(false);
                return;
            case 1:
                if (i == 0) {
                    ((ViewPager2) this.A01).A02();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
