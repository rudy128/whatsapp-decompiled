package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.3OT  reason: invalid class name */
public final class AnonymousClass3OT extends Animation {
    public final int A00;
    public final ViewGroup A01;

    public AnonymousClass3OT(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 1);
        this.A01 = viewGroup;
        this.A00 = i;
    }

    public boolean willChangeBounds() {
        return false;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.A00) * f);
        Drawable background = this.A01.getBackground();
        if (background instanceof AnonymousClass3NK) {
            AnonymousClass3NK r1 = (AnonymousClass3NK) background;
            r1.A00 = i;
            r1.invalidateSelf();
        }
    }
}
