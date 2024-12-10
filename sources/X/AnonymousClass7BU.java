package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.7BU  reason: invalid class name */
public class AnonymousClass7BU implements C43011z6 {
    public final int A00;

    public AnonymousClass7BU(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        Path path = new Path();
        path.addOval((RectF) obj, Path.Direction.CW);
        path.close();
        return path;
    }
}
