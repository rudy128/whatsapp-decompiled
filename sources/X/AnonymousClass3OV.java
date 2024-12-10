package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OV  reason: invalid class name */
public class AnonymousClass3OV extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4aY A01;
    public final /* synthetic */ AnonymousClass3NK A02;

    public boolean willChangeBounds() {
        return false;
    }

    public AnonymousClass3OV(AnonymousClass4aY r1, AnonymousClass3NK r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        AnonymousClass3NK r0 = this.A02;
        r0.A00 = i;
        r0.invalidateSelf();
    }
}
