package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.CxS  reason: case insensitive filesystem */
public class C26309CxS implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final C42011xT A0C;
    public final /* synthetic */ int A0D;
    public final /* synthetic */ BM5 A0E;
    public final /* synthetic */ C42011xT A0F;

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public C26309CxS(BM5 bm5, C42011xT r4, C42011xT r5, float f, float f2, float f3, float f4, int i, int i2) {
        this.A0E = bm5;
        this.A0D = i2;
        this.A0F = r5;
        this.A0A = i;
        this.A0C = r4;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        this.A0B = ofFloat;
        C26323Cxg.A00(ofFloat, this, 0);
        ofFloat.setTarget(r4.A0H);
        ofFloat.addListener(this);
        this.A00 = 0.0f;
    }

    public void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    public void onAnimationEnd(Animator animator) {
        C42011xT r3;
        if (!this.A05) {
            this.A0C.A09(true);
        }
        this.A05 = true;
        if (!this.A04) {
            int i = this.A0D;
            BM5 bm5 = this.A0E;
            if (i <= 0) {
                C25848Cn6 cn6 = bm5.A0F;
                RecyclerView recyclerView = bm5.A0I;
                r3 = this.A0F;
                cn6.A04(r3, recyclerView);
            } else {
                List list = bm5.A0Q;
                r3 = this.A0F;
                list.add(r3.A0H);
                this.A03 = true;
                bm5.A0I.post(new C21470Akb((Object) bm5, i, 4, (Object) this));
            }
            if (bm5.A0D == r3.A0H) {
                bm5.A0D = null;
            }
        }
    }
}
