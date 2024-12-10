package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OX  reason: invalid class name */
public class AnonymousClass3OX extends Animation {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass3OX(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass4VR r3;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (this.A00 != 0) {
            if (i == 0) {
                r3 = (AnonymousClass4VR) ((C90644eP) this.A03).A02;
                r3.A02.getLayoutParams().height = this.A02;
            } else {
                C90644eP r1 = (C90644eP) this.A03;
                r3 = (AnonymousClass4VR) r1.A02;
                ViewGroup.LayoutParams layoutParams = r3.A02.getLayoutParams();
                int i2 = r1.A01;
                layoutParams.height = i2 + ((int) (((float) (this.A01 - i2)) * f));
            }
            r3.A02.requestLayout();
        } else if (i != 0) {
            AnonymousClass3NI r2 = (AnonymousClass3NI) this.A03;
            int i3 = this.A02;
            r2.A00 = i3 + ((int) (((float) (this.A01 - i3)) * f));
            r2.invalidateSelf();
        }
    }

    public boolean willChangeBounds() {
        if (1 - this.A00 != 0) {
            return super.willChangeBounds();
        }
        return true;
    }
}
