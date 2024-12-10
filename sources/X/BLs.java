package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;

public abstract class BLs extends C38391rD implements E0N {
    public boolean A00;
    public boolean A01;
    public CX4 A02;
    public final C001100p A03;
    public final C001100p A04;
    public final C001100p A05;
    public final AnonymousClass1GP A06;
    public final C23381Fv A07;

    private Long A01(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            C001100p r1 = this.A04;
            if (i2 >= r1.A00()) {
                return l;
            }
            if (AnonymousClass000.A0M(r1.A04(i2)) == i) {
                if (l == null) {
                    l = Long.valueOf(r1.A02(i2));
                } else {
                    throw AnonymousClass000.A0n("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public long A0M(int i) {
        return (long) i;
    }

    public abstract Fragment A0U(int i);

    private void A02(long j) {
        ViewParent parent;
        C001100p r4 = this.A03;
        Fragment fragment = (Fragment) r4.A05(j);
        if (fragment != null) {
            View view = fragment.A0B;
            if (!(view == null || (parent = view.getParent()) == null)) {
                ((ViewGroup) parent).removeAllViews();
            }
            if (!A0X(j)) {
                this.A05.A08(j);
            }
            if (fragment.A1b()) {
                AnonymousClass1GP r2 = this.A06;
                if (r2.A0z()) {
                    this.A00 = true;
                    return;
                }
                if (A0X(j)) {
                    this.A05.A0A(j, r2.A0N(fragment));
                }
                C34001jj r0 = new C34001jj(r2);
                r0.A07(fragment);
                r0.A03();
            }
            r4.A08(j);
        }
    }

    public /* bridge */ /* synthetic */ void A0N(C42011xT r1) {
        A0W((C73713Xa) r1);
        A0V();
    }

    public /* bridge */ /* synthetic */ boolean A0O() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r4) {
        Long A012 = A01(r4.A0H.getId());
        if (A012 != null) {
            long longValue = A012.longValue();
            A02(longValue);
            this.A04.A08(longValue);
        }
    }

    public void A0S(RecyclerView recyclerView) {
        if (this.A02 == null) {
            CX4 cx4 = new CX4(this);
            this.A02 = cx4;
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                ViewPager2 viewPager2 = (ViewPager2) parent;
                cx4.A03 = viewPager2;
                C22719BMg bMg = new C22719BMg(cx4, 0);
                cx4.A02 = bMg;
                viewPager2.A04(bMg);
                C22710BLv bLv = new C22710BLv(cx4, 0);
                cx4.A01 = bLv;
                BLs bLs = cx4.A05;
                bLs.CDq(bLv);
                C91424ff r1 = new C91424ff(cx4, 0);
                cx4.A00 = r1;
                bLs.A07.A05(r1);
                return;
            }
            throw BEA.A0c(parent, "Expected ViewPager2 instance. Got: ", AnonymousClass000.A10());
        }
        throw BE6.A0j();
    }

    public void A0T(RecyclerView recyclerView) {
        CX4 cx4 = this.A02;
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ((ViewPager2) parent).A05.A00.remove(cx4.A02);
            BLs bLs = cx4.A05;
            bLs.A01.unregisterObserver(cx4.A01);
            bLs.A07.A06(cx4.A00);
            cx4.A03 = null;
            this.A02 = null;
            return;
        }
        throw BEA.A0c(parent, "Expected ViewPager2 instance. Got: ", AnonymousClass000.A10());
    }

    public void A0V() {
        C001100p r5;
        Fragment fragment;
        View view;
        if (this.A00 && !this.A06.A0z()) {
            AnonymousClass016 r4 = new AnonymousClass016(0);
            int i = 0;
            while (true) {
                r5 = this.A03;
                if (i >= r5.A00()) {
                    break;
                }
                long A022 = r5.A02(i);
                if (!A0X(A022)) {
                    r4.add(Long.valueOf(A022));
                    this.A04.A08(A022);
                }
                i++;
            }
            if (!this.A01) {
                this.A00 = false;
                for (int i2 = 0; i2 < r5.A00(); i2++) {
                    long A023 = r5.A02(i2);
                    if (this.A04.A01(A023) < 0 && ((fragment = (Fragment) r5.A05(A023)) == null || (view = fragment.A0B) == null || view.getParent() == null)) {
                        r4.add(Long.valueOf(A023));
                    }
                }
            }
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                A02(C17880vN.A05(it.next()));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(X.C73713Xa r7) {
        /*
            r6 = this;
            X.00p r2 = r6.A03
            long r0 = r7.A07
            java.lang.Object r5 = r2.A05(r0)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.String r2 = "Design assumption violated."
            if (r5 == 0) goto L_0x008b
            android.view.View r3 = r7.A0H
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            android.view.View r1 = r5.A0B
            boolean r0 = r5.A1b()
            if (r0 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x003f
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
            throw r0
        L_0x0021:
            if (r1 != 0) goto L_0x002f
            X.1GP r2 = r6.A06
            X.BLQ r1 = new X.BLQ
            r1.<init>(r3, r5, r6)
            r0 = 0
            r2.A0q(r1, r0)
            return
        L_0x002f:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x003f
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == r3) goto L_0x007a
        L_0x003b:
            A03(r1, r3)
            return
        L_0x003f:
            boolean r0 = r5.A1b()
            if (r0 != 0) goto L_0x003b
            X.1GP r1 = r6.A06
            boolean r0 = r1.A0z()
            if (r0 != 0) goto L_0x007b
            X.BLQ r0 = new X.BLQ
            r0.<init>(r3, r5, r6)
            r4 = 0
            r1.A0q(r0, r4)
            X.1jj r3 = new X.1jj
            r3.<init>(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "f"
            r2.append(r0)
            long r0 = r7.A07
            java.lang.String r0 = X.C17880vN.A0u(r2, r0)
            r3.A0B(r5, r0)
            X.1Fx r0 = X.C23401Fx.STARTED
            r3.A0A(r5, r0)
            r3.A03()
            X.CX4 r0 = r6.A02
            r0.A00(r4)
        L_0x007a:
            return
        L_0x007b:
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x007a
            X.1Fv r2 = r6.A07
            r1 = 3
            X.4fg r0 = new X.4fg
            r0.<init>(r6, r7, r1)
            r2.A05(r0)
            return
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLs.A0W(X.3Xa):void");
    }

    public boolean A0X(long j) {
        if (j < 0 || j >= ((long) A0Q())) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        long j = r8.A07;
        View view = r8.A0H;
        int id = view.getId();
        Long A012 = A01(id);
        if (A012 != null) {
            long longValue = A012.longValue();
            if (longValue != j) {
                A02(longValue);
                this.A04.A08(longValue);
            }
        }
        this.A04.A0A(j, Integer.valueOf(id));
        long j2 = (long) i;
        C001100p r5 = this.A03;
        if (r5.A01(j2) < 0) {
            Fragment A0U = A0U(i);
            A0U.A1U((C26550D3n) this.A05.A05(j2));
            r5.A0A(j2, A0U);
        }
        if (view.isAttachedToWindow()) {
            if (view.getParent() == null) {
                view.addOnLayoutChangeListener(new C90214di(view, this, r8, 0));
            } else {
                throw AnonymousClass000.A0n("Design assumption violated.");
            }
        }
        A0V();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        List list = C42011xT.A0I;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C42011xT(frameLayout);
    }

    public BLs(AnonymousClass1GP r2, C23381Fv r3) {
        this.A03 = new C001100p();
        this.A05 = new C001100p();
        this.A04 = new C001100p();
        this.A01 = false;
        this.A00 = false;
        this.A06 = r2;
        this.A07 = r3;
        super.A0K(true);
    }

    public static void A03(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw AnonymousClass000.A0n("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public BLs(AnonymousClass1FL r3) {
        this(r3.getSupportFragmentManager(), r3.getLifecycle());
    }
}
