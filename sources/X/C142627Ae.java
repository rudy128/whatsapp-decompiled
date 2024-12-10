package X;

import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Ae  reason: invalid class name and case insensitive filesystem */
public final class C142627Ae implements AnonymousClass3LW, C218317o {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final C39711tW A04 = new C112735lx(this, 13);
    public final RecyclerView A05;
    public final AnonymousClass1KB A06;
    public final Runnable A07 = new C146777Qo((Object) this, 5);

    public static final void A02(C142627Ae r2) {
        r2.A03 = false;
        r2.A00(r2.A00, false);
        r2.A06.A0I(r2.A07);
    }

    private final void A00(int i, boolean z) {
        C42061xY r1;
        C42011xT A0P = this.A05.A0P(i, false);
        if ((A0P instanceof C42061xY) && (r1 = (C42061xY) A0P) != null) {
            r1.A0F(z);
        }
    }

    public static final void A01(C142627Ae r4) {
        if (!r4.A03) {
            r4.A03 = true;
            r4.A06.A0K(r4.A07, 2000);
        }
    }

    public static final void A03(C142627Ae r2) {
        LinearLayoutManager linearLayoutManager;
        C38251qy layoutManager = r2.A05.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            A01(r2);
            return;
        }
        r2.A01 = linearLayoutManager.A1N();
        r2.A02 = linearLayoutManager.A1P();
    }

    public static final void A04(C142627Ae r4, int i) {
        C42061xY r1;
        if (r4.A01 > 0 || r4.A02 > 0) {
            r4.A00(r4.A00, false);
            int max = Math.max(i, r4.A01);
            int i2 = r4.A02;
            if (max > i2) {
                max = i2;
            }
            int i3 = max;
            do {
                C42011xT A0P = r4.A05.A0P(i3, false);
                if (!(A0P instanceof C42061xY) || (r1 = (C42061xY) A0P) == null || !r1.A0G()) {
                    i3++;
                    int i4 = r4.A02;
                    if (i3 > i4) {
                        i3 = r4.A01;
                    }
                    if (max == i3) {
                        break;
                    } else if (i3 > i4) {
                        break;
                    }
                } else {
                    r4.A00(i3, true);
                    r4.A00 = i3;
                    return;
                }
            } while (i3 < r4.A01);
        }
        A02(r4);
    }

    public C142627Ae(RecyclerView recyclerView, AnonymousClass1KB r4) {
        C18070vi.A0j(r4, recyclerView);
        this.A06 = r4;
        this.A05 = recyclerView;
    }

    public void Boc(View view) {
        A03(this);
        A01(this);
    }

    @OnLifecycleEvent(C27581Wq.ON_START)
    public final void onStart() {
        A01(this);
    }

    @OnLifecycleEvent(C27581Wq.ON_STOP)
    public final void onStop() {
        A02(this);
    }

    public void Bod(View view) {
        A03(this);
    }
}
