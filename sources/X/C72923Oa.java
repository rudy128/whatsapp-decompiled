package X;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3Oa  reason: invalid class name and case insensitive filesystem */
public class C72923Oa extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C90524eD A02;
    public final /* synthetic */ AnonymousClass3NK A03;

    public boolean willChangeBounds() {
        return false;
    }

    public C72923Oa(Drawable drawable, C90524eD r2, AnonymousClass3NK r3, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = r3;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        if (f == 1.0f) {
            AnonymousClass3NK.A00(this.A01, this.A02.A03.A27.A02);
            return;
        }
        AnonymousClass3NK r0 = this.A03;
        r0.A00 = i2;
        r0.invalidateSelf();
    }
}
