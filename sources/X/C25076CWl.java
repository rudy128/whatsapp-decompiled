package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.CWl  reason: case insensitive filesystem */
public class C25076CWl {
    public C37911qO A00;
    public final E3b A01 = new D6Y(this, 1);
    public final E3b A02 = new D6Y(this, 0);
    public final /* synthetic */ ViewPager2 A03;
    public final /* synthetic */ ViewPager2 A04;

    public C25076CWl(ViewPager2 viewPager2) {
        this.A04 = viewPager2;
        this.A03 = viewPager2;
    }

    public void A00() {
        int A0Q;
        ViewPager2 viewPager2 = this.A04;
        int i = 16908360;
        AnonymousClass1HF.A0b(viewPager2, 16908360);
        AnonymousClass1HF.A0b(viewPager2, 16908361);
        AnonymousClass1HF.A0b(viewPager2, 16908358);
        AnonymousClass1HF.A0b(viewPager2, 16908359);
        C38391rD r0 = viewPager2.A04.A0B;
        if (r0 != null && (A0Q = r0.A0Q()) != 0 && viewPager2.A09) {
            LinearLayoutManager linearLayoutManager = viewPager2.A02;
            if (linearLayoutManager.A01 == 0) {
                int i2 = 16908361;
                if (linearLayoutManager.A07.getLayoutDirection() == 1) {
                    i2 = 16908360;
                    i = 16908361;
                }
                if (viewPager2.A00 < A0Q - 1) {
                    AnonymousClass1HF.A0m(viewPager2, new C26137Ct0(i2, (CharSequence) null), this.A02, (CharSequence) null);
                }
                if (viewPager2.A00 > 0) {
                    AnonymousClass1HF.A0m(viewPager2, new C26137Ct0(i, (CharSequence) null), this.A01, (CharSequence) null);
                    return;
                }
                return;
            }
            if (viewPager2.A00 < A0Q - 1) {
                AnonymousClass1HF.A0m(viewPager2, new C26137Ct0(16908359, (CharSequence) null), this.A02, (CharSequence) null);
            }
            if (viewPager2.A00 > 0) {
                AnonymousClass1HF.A0m(viewPager2, new C26137Ct0(16908358, (CharSequence) null), this.A01, (CharSequence) null);
            }
        }
    }
}
