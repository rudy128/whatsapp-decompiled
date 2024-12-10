package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.25S  reason: invalid class name */
public abstract class AnonymousClass25S {
    public Path A00(RectF rectF) {
        if (!(this instanceof AnonymousClass25T)) {
            return AnonymousClass204.A07(rectF);
        }
        Path path = new Path();
        float width = rectF.width() / 2.0f;
        path.addCircle(rectF.left + width, rectF.top + width, width, Path.Direction.CW);
        return path;
    }
}
