package X;

import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;

/* renamed from: X.5es  reason: invalid class name and case insensitive filesystem */
public class C110065es extends RotateAnimation {
    public long A00;
    public boolean A01;

    public C110065es() {
        super(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
    }

    public boolean getTransformation(long j, Transformation transformation) {
        if (this.A01) {
            long j2 = this.A00;
            if (j2 == 0) {
                j2 = j - getStartTime();
                this.A00 = j2;
            }
            setStartTime(j - j2);
        }
        return super.getTransformation(j, transformation);
    }
}
