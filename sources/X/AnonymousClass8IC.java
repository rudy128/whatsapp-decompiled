package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8IC  reason: invalid class name */
public class AnonymousClass8IC extends C39711tW {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final BM0 A03;
    public final boolean A04;

    public void A03(RecyclerView recyclerView, int i) {
        if (this.A04) {
            return;
        }
        if (i == 0) {
            C21471Akc akc = new C21471Akc((Object) this, (Object) recyclerView, 32);
            this.A01 = akc;
            recyclerView.postDelayed(akc, 1500);
            return;
        }
        recyclerView.removeCallbacks(this.A01);
        if (!this.A02) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A00.cancel();
            }
            BM0 bm0 = this.A03;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{bm0.A00, 1.0f});
            ofFloat.addUpdateListener(new A9E(recyclerView, bm0));
            ofFloat.setDuration(200);
            ofFloat.start();
            this.A02 = true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass8IC r4 = (AnonymousClass8IC) obj;
            if (this.A04 == r4.A04) {
                return this.A03.equals(r4.A03);
            }
        }
        return false;
    }

    public AnonymousClass8IC(BM0 bm0, boolean z) {
        this.A03 = bm0;
        bm0.A01 = this;
        this.A02 = AnonymousClass000.A1O((bm0.A00 > 0.0f ? 1 : (bm0.A00 == 0.0f ? 0 : -1)));
        this.A04 = z;
        if (z) {
            bm0.A00 = 1.0f;
        }
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A03;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A04), A1b, 1);
    }
}
