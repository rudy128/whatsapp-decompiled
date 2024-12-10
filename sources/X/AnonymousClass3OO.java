package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OO  reason: invalid class name */
public class AnonymousClass3OO extends Animation {
    public final /* synthetic */ C79093uR A00;

    public AnonymousClass3OO(C79093uR r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C79093uR r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.invalidate();
    }
}
