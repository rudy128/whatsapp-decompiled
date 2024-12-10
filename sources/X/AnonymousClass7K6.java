package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.7K6  reason: invalid class name */
public final class AnonymousClass7K6 implements C1607589u {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public RecyclerView A07;
    public C112075kt A08;
    public C112635ln A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final FrameLayout A0H;
    public final LinearLayoutManager A0I;
    public final AnonymousClass3N6 A0J;
    public final C1607689v A0K;
    public final boolean A0L;
    public final View.OnLayoutChangeListener A0M = new C1420978d((Object) this, 12);
    public final View.OnTouchListener A0N = new C1422678u((Object) this, 19);
    public final View A0O;
    public final View A0P;
    public final C39711tW A0Q = new C112735lx(this, 7);
    public final C109425dQ A0R;
    public final C22821Di A0S = new AnonymousClass7S5(2);

    /* JADX WARNING: type inference failed for: r0v20, types: [X.1rD, X.5kt] */
    public AnonymousClass7K6(View view, C128586gM r7, boolean z) {
        C18070vi.A0d(r7, 2);
        this.A0L = z;
        Context context = view.getContext();
        this.A0G = context;
        Resources resources = context.getResources();
        FrameLayout A0P2 = C108945cZ.A0P(view, 2131434843);
        this.A0H = A0P2;
        this.A0D = resources.getDimensionPixelSize(2131167972);
        resources.getDimensionPixelSize(2131167971);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167976);
        this.A0E = dimensionPixelSize;
        this.A0F = AnonymousClass3MX.A00(context.getResources(), 2131167975, dimensionPixelSize);
        this.A03 = C72453Mb.A09(context);
        r7.A02.add(this);
        this.A0K = new AnonymousClass7K7(r7);
        View A062 = AnonymousClass1HF.A06(A0P2, 2131434844);
        this.A0O = A062;
        AnonymousClass3N6 r0 = new AnonymousClass3N6(context);
        this.A0J = r0;
        A062.setBackground(r0);
        View A063 = AnonymousClass1HF.A06(A0P2, 2131434845);
        this.A0P = A063;
        C109425dQ r02 = new C109425dQ(context);
        this.A0R = r02;
        A063.setBackground(r02);
        this.A0I = new LinearLayoutManager(context, 0, false);
        this.A08 = new C38391rD();
        RecyclerView A0U = C108945cZ.A0U(this.A0H, 2131434847);
        A0U.setNestedScrollingEnabled(false);
        A0U.setLayoutManager(this.A0I);
        A0U.setAdapter(this.A08);
        this.A07 = A0U;
    }

    private final void A00() {
        int i = this.A04;
        int i2 = this.A05;
        int i3 = this.A06;
        int i4 = (int) ((((double) i3) / ((double) i2)) * ((double) i));
        int i5 = i2 / i3;
        this.A0I.A1a(i4, C108995ce.A01(this.A03, this.A0D) - ((int) ((((float) (i % i5)) / ((float) i5)) * ((float) this.A0F))));
    }

    public static final void A01(AnonymousClass7K6 r4) {
        C42011xT A0O2;
        LinearLayoutManager linearLayoutManager = r4.A0I;
        int A1O = linearLayoutManager.A1O();
        int A1Q = linearLayoutManager.A1Q();
        if (A1O <= A1Q) {
            while (true) {
                RecyclerView recyclerView = r4.A07;
                if (!(recyclerView == null || (A0O2 = recyclerView.A0O(A1O)) == null)) {
                    r4.A0S.invoke(A0O2);
                }
                if (A1O != A1Q) {
                    A1O++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void A02(AnonymousClass7K6 r9, int i) {
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = r9.A07;
        if (recyclerView2 != null) {
            C1420978d.A00(recyclerView2, new C21356Ail(r9, 8), 13);
            recyclerView2.A0t(r9.A0Q);
            recyclerView2.setOnTouchListener(r9.A0N);
            recyclerView2.addOnLayoutChangeListener(r9.A0M);
        }
        C112075kt r5 = r9.A08;
        int i5 = r9.A05;
        if (r5 != null) {
            int i6 = r9.A00;
            i2 = r9.A0D;
            i3 = r9.A0F;
            r5.A02 = i5;
            r5.A00 = i6;
            r5.A01 = i2;
            r5.A03 = i3;
            r5.notifyDataSetChanged();
            i4 = r5.A0Q();
        } else {
            i2 = r9.A0D;
            int i7 = r9.A00;
            i3 = r9.A0F;
            if (i5 > 0) {
                i4 = ((i5 * i2) / i7) / i3;
            } else {
                i4 = 0;
            }
        }
        r9.A06 = i4;
        C112635ln r1 = r9.A09;
        if (!(r1 == null || (recyclerView = r9.A07) == null)) {
            recyclerView.A0s(r1);
        }
        int dimensionPixelSize = r9.A0G.getResources().getDimensionPixelSize(2131167975);
        int i8 = r9.A05;
        int i9 = r9.A0E;
        int i10 = i8 / r9.A06;
        C112635ln r12 = new C112635ln(C108995ce.A01(r9.A03, i2) + dimensionPixelSize, dimensionPixelSize, ((int) ((((double) (i8 % i10)) / ((double) i10)) * ((double) i3))) - i9, r9.A0L);
        RecyclerView recyclerView3 = r9.A07;
        if (recyclerView3 != null) {
            recyclerView3.A0r(r12);
        }
        r9.A09 = r12;
        if (r5 != null) {
            r5.notifyDataSetChanged();
        }
        r9.A00();
        r9.A0J.A00(C28851b7.A02(((float) (i - r9.A04)) / ((float) r9.A00), 0.0f, 1.0f));
    }

    public final void A03() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            List list = recyclerView2.A0L;
            if (list != null) {
                list.clear();
            }
            recyclerView2.removeOnLayoutChangeListener(this.A0M);
        }
        C112635ln r1 = this.A09;
        if (!(r1 == null || (recyclerView = this.A07) == null)) {
            recyclerView.A0s(r1);
        }
        RecyclerView recyclerView3 = this.A07;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((C38391rD) null);
        }
        this.A09 = null;
        this.A07 = null;
    }

    public void BdR(int i, int i2, int i3) {
        this.A05 = i;
        this.A00 = i2;
        this.A04 = i3;
        this.A01 = i - i2;
        A02(this, i3);
    }

    public void Byp(int i) {
        this.A02 = i;
        this.A0J.A00(C28851b7.A02(((float) (i - this.A04)) / ((float) this.A00), 0.0f, 1.0f));
    }

    public void C5r(int i) {
        this.A04 = i;
        A00();
    }
}
