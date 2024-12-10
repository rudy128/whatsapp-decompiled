package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OW  reason: invalid class name */
public final class AnonymousClass3OW extends Animation {
    public final int A00;
    public final Drawable A01;
    public final ViewGroup A02;

    public AnonymousClass3OW(Drawable drawable, ViewGroup viewGroup, int i) {
        C18070vi.A0d(drawable, 3);
        this.A02 = viewGroup;
        this.A00 = i;
        this.A01 = drawable;
    }

    public boolean willChangeBounds() {
        return false;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i - ((int) (((float) i) * f));
        ViewGroup viewGroup = this.A02;
        Drawable background = viewGroup.getBackground();
        if (!(background instanceof AnonymousClass3NK)) {
            return;
        }
        if (f == 1.0f) {
            AnonymousClass3NK.A00(this.A01, viewGroup);
            return;
        }
        AnonymousClass3NK r1 = (AnonymousClass3NK) background;
        r1.A00 = i2;
        r1.invalidateSelf();
    }
}
