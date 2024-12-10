package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6KQ  reason: invalid class name */
public final class AnonymousClass6KQ extends C113585nK implements C161008Az {
    public AnonymousClass6JP A00;
    public boolean A01;
    public final C113845nr A02 = new C113845nr(this, 4);
    public final ViewPager2 A03;
    public final AnonymousClass2L7 A04;
    public final AnonymousClass8AU A05;
    public final C112475lX A06 = new C112475lX(this);
    public final TabLayout A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KQ(View view, AnonymousClass2L7 r6, AnonymousClass8AU r7) {
        super(view);
        RecyclerView recyclerView;
        C38391rD r72;
        C18070vi.A0d(view, 1);
        C18070vi.A0d(r6, 3);
        this.A05 = r7;
        this.A04 = r6;
        View findViewById = view.findViewById(2131435661);
        ViewPager2 viewPager2 = (ViewPager2) findViewById;
        viewPager2.setOffscreenPageLimit(2);
        if ((r7 instanceof BLs) && (r72 = (C38391rD) r7) != null) {
            viewPager2.setAdapter(r72);
        }
        C18070vi.A0X(findViewById);
        this.A03 = viewPager2;
        TabLayout tabLayout = (TabLayout) AnonymousClass3MX.A0C(view, 2131435662);
        this.A07 = tabLayout;
        new C134026pt(viewPager2, tabLayout, new AnonymousClass7BT()).A00();
        if (viewPager2.getChildCount() > 0) {
            View childAt = viewPager2.getChildAt(0);
            if ((childAt instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt) != null) {
                recyclerView.A12.add(new C142657Ah(AnonymousClass00R.A00));
            }
        }
    }

    public void ByX(AnonymousClass206 r3, int i) {
        C161008Az r1;
        C18070vi.A0d(r3, 0);
        AnonymousClass8AU r12 = this.A05;
        if ((r12 instanceof C161008Az) && (r1 = (C161008Az) r12) != null) {
            r1.ByX(r3, i);
        }
    }

    public static final void A01(AnonymousClass6KQ r4) {
        TabLayout tabLayout = r4.A07;
        int i = 0;
        if (r4.A05.BTZ().size() <= 1) {
            i = 8;
        }
        tabLayout.setVisibility(i);
    }

    public void BIZ() {
        C161008Az r2;
        AnonymousClass8AU r22 = this.A05;
        if ((r22 instanceof C161008Az) && (r2 = (C161008Az) r22) != null) {
            r2.BIZ();
        }
        this.A03.setAdapter((C38391rD) null);
    }
}
