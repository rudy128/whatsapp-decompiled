package X;

import android.view.ScaleGestureDetector;
import android.view.ViewParent;

public final class BHA extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Float A04;
    public final /* synthetic */ BHG A05;

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C18070vi.A0d(scaleGestureDetector, 0);
        BHG bhg = this.A05;
        C28614EAk eAk = bhg.A0Q;
        if (eAk.isConnected() && bhg.A0C) {
            if (BE9.A1T(C25632CjI.A0e, eAk.BOK())) {
                float currentSpan = (scaleGestureDetector.getCurrentSpan() - this.A00) / C108945cZ.A03(bhg);
                Float f = this.A04;
                if (f != null) {
                    eAk.CNU(Math.min(1.0f, Math.max(-1.0f, (currentSpan * 2.0f) + f.floatValue())));
                    return true;
                }
                int i = this.A02;
                int i2 = this.A03;
                eAk.CLX((C6E) null, Math.min(i, Math.max(i2, ((int) (currentSpan * ((float) (i - i2)))) + this.A01)));
                return true;
            }
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C18070vi.A0d(scaleGestureDetector, 0);
        BHG bhg = this.A05;
        C28614EAk eAk = bhg.A0Q;
        boolean z = false;
        if (!eAk.isConnected()) {
            return false;
        }
        if (bhg.A0C) {
            if (BE9.A1T(C25632CjI.A0e, eAk.BOK())) {
                ViewParent parent = bhg.getParent();
                z = true;
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.A01 = BEA.A09(C25971Cpe.A11, eAk.BZ5());
                if (BE9.A1T(C25632CjI.A0T, eAk.BOK())) {
                    this.A04 = (Float) eAk.BZ5().A04(C25971Cpe.A0t);
                }
                this.A02 = BE9.A0B(C25632CjI.A0i, eAk.BOK());
                this.A03 = BE9.A0B(C25632CjI.A0k, eAk.BOK());
                this.A00 = scaleGestureDetector.getCurrentSpan();
            }
        }
        return z;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public BHA(BHG bhg) {
        this.A05 = bhg;
    }
}
