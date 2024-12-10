package X;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6pt  reason: invalid class name and case insensitive filesystem */
public final class C134026pt {
    public C38391rD A00;
    public C37911qO A01;
    public AnonymousClass8B5 A02;
    public C113855ns A03;
    public boolean A04;
    public final ViewPager2 A05;
    public final TabLayout A06;
    public final AnonymousClass86N A07;

    public void A00() {
        if (!this.A04) {
            ViewPager2 viewPager2 = this.A05;
            C38391rD r0 = viewPager2.A04.A0B;
            this.A00 = r0;
            if (r0 != null) {
                this.A04 = true;
                TabLayout tabLayout = this.A06;
                C113855ns r02 = new C113855ns(tabLayout);
                this.A03 = r02;
                viewPager2.A04(r02);
                AnonymousClass7BS r03 = new AnonymousClass7BS(viewPager2);
                this.A02 = r03;
                tabLayout.A0E(r03);
                C112465lW r1 = new C112465lW(this);
                this.A01 = r1;
                this.A00.CDq(r1);
                A01();
                tabLayout.A0B(0.0f, viewPager2.A00, true, true);
                return;
            }
            throw AnonymousClass000.A0n("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw AnonymousClass000.A0n("TabLayoutMediator is already attached");
    }

    public void A01() {
        int min;
        TabLayout tabLayout = this.A06;
        tabLayout.A0A();
        C38391rD r0 = this.A00;
        if (r0 != null) {
            int A0Q = r0.A0Q();
            for (int i = 0; i < A0Q; i++) {
                C136836uU A072 = tabLayout.A07();
                this.A07.BpX(A072, i);
                tabLayout.A0H(A072, C108945cZ.A07(tabLayout), false);
            }
            if (A0Q > 0 && (min = Math.min(this.A05.A00, AnonymousClass000.A0Q(tabLayout.A0h))) != tabLayout.getSelectedTabPosition()) {
                tabLayout.A0G(tabLayout.A08(min));
            }
        }
    }

    public C134026pt(ViewPager2 viewPager2, TabLayout tabLayout, AnonymousClass86N r3) {
        this.A06 = tabLayout;
        this.A05 = viewPager2;
        this.A07 = r3;
    }
}
