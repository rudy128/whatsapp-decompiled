package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.5ep  reason: invalid class name and case insensitive filesystem */
public class C110035ep extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C132406mj A02;

    public boolean willChangeBounds() {
        return true;
    }

    public C110035ep(View view, C132406mj r3, int i) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        C132406mj r1 = this.A02;
        View view = r1.A01;
        AnonymousClass3MX.A1F(view, i2);
        view.requestLayout();
        r1.A00((float) i2);
    }
}
