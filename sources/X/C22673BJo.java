package X;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.BJo  reason: case insensitive filesystem */
public class C22673BJo extends C25251Cbq {
    public final WindowInsetsAnimation A00;

    public C22673BJo(int i, Interpolator interpolator, long j) {
        this(new WindowInsetsAnimation(i, interpolator, j));
    }

    public static WindowInsetsAnimation.Bounds A00(C26000CqH cqH) {
        return new WindowInsetsAnimation.Bounds(cqH.A00.A03(), cqH.A01.A03());
    }

    public static void A03(View view, C25247Cbm cbm) {
        BHt bHt;
        if (cbm != null) {
            bHt = new BHt(cbm);
        } else {
            bHt = null;
        }
        view.setWindowInsetsAnimationCallback(bHt);
    }

    public float A05() {
        return this.A00.getInterpolatedFraction();
    }

    public int A06() {
        return this.A00.getTypeMask();
    }

    public long A07() {
        return this.A00.getDurationMillis();
    }

    public void A08(float f) {
        this.A00.setFraction(f);
    }

    public static C33321id A01(WindowInsetsAnimation.Bounds bounds) {
        return C33321id.A01(bounds.getUpperBound());
    }

    public static C33321id A02(WindowInsetsAnimation.Bounds bounds) {
        return C33321id.A01(bounds.getLowerBound());
    }

    public C22673BJo(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.A00 = windowInsetsAnimation;
    }
}
