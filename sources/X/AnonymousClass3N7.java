package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.3N7  reason: invalid class name */
public class AnonymousClass3N7 extends Drawable {
    public final /* synthetic */ AnonymousClass3uP A00;

    public void draw(Canvas canvas) {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onLevelChange(int i) {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass3N7(AnonymousClass3uP r1) {
        this.A00 = r1;
    }

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }
}
