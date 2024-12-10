package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OP  reason: invalid class name */
public class AnonymousClass3OP extends Animation {
    public final /* synthetic */ AnonymousClass4XZ A00;

    public AnonymousClass3OP(AnonymousClass4XZ r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass4XZ r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.A0A.invalidate();
    }
}
