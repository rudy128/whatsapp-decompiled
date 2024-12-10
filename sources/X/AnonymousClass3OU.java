package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OU  reason: invalid class name */
public class AnonymousClass3OU extends Animation {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass3OU(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        View view;
        int i;
        int i2;
        Object obj;
        switch (this.A00) {
            case 0:
                AnonymousClass4VR r3 = (AnonymousClass4VR) this.A02;
                ViewGroup.LayoutParams layoutParams = r3.A02.getLayoutParams();
                int i3 = this.A01;
                layoutParams.height = i3 - ((int) (((float) i3) * f));
                view = r3.A02;
                break;
            case 1:
                if (f < 1.0f) {
                    int i4 = this.A01;
                    i = i4 - ((int) (((float) i4) * f));
                } else {
                    i = 0;
                }
                obj = this.A02;
                break;
            default:
                if (f == 1.0f) {
                    i2 = this.A01;
                } else {
                    i2 = (int) (f * ((float) this.A01));
                }
                obj = ((C90664eR) this.A02).A01;
                break;
        }
        view = (View) obj;
        AnonymousClass3MX.A1F(view, i2);
        view.requestLayout();
    }

    public boolean willChangeBounds() {
        return true;
    }
}
