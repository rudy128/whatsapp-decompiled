package X;

import android.graphics.Rect;
import androidx.transition.FragmentTransitionSupport;

public class BMU extends AnonymousClass2S1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BMU(Rect rect, FragmentTransitionSupport fragmentTransitionSupport, int i) {
        this.A00 = i;
        this.A01 = fragmentTransitionSupport;
        this.A02 = rect;
    }

    public Rect A00() {
        int i = this.A00;
        Rect rect = (Rect) this.A02;
        if (i == 0 || !rect.isEmpty()) {
            return rect;
        }
        return null;
    }
}
