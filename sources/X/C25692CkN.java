package X;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;

/* renamed from: X.CkN  reason: case insensitive filesystem */
public final class C25692CkN {
    public static final Property A0B = new C22637BGx(4);
    public static final Property A0C = new C22637BGx(5);
    public static final int[] A0D = {667, 2017, 3367, 4717};
    public static final int[] A0E = {0, 1350, 2700, 4050};
    public static final int[] A0F = {1000, 2350, 3700, 5050};
    public float A00;
    public float A01;
    public int A02 = 0;
    public ObjectAnimator A03;
    public ObjectAnimator A04;
    public C6Y A05 = null;
    public BiZ A06;
    public final AnonymousClass1YX A07;
    public final C24468C5i A08;
    public final float[] A09 = C108945cZ.A1V();
    public final int[] A0A = new int[1];

    public C25692CkN(C24468C5i c5i) {
        this.A08 = c5i;
        this.A07 = new AnonymousClass1YX();
    }

    public void A00() {
        if (this.A03 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A0B, new float[]{0.0f, 1.0f});
            this.A03 = ofFloat;
            ofFloat.setDuration(5400);
            this.A03.setInterpolator((TimeInterpolator) null);
            this.A03.setRepeatCount(-1);
            BEQ.A00(this.A03, this, 9);
        }
        if (this.A04 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, A0C, new float[]{0.0f, 1.0f});
            this.A04 = ofFloat2;
            ofFloat2.setDuration(333);
            this.A04.setInterpolator(this.A07);
            BEQ.A00(this.A04, this, 10);
        }
        this.A02 = 0;
        this.A0A[0] = BEA.A04(this.A08.A08[0], this.A06.A01);
        this.A01 = 0.0f;
        this.A03.start();
    }
}
