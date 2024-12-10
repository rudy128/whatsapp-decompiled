package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.2wa  reason: invalid class name and case insensitive filesystem */
public class C65492wa implements C43011z6 {
    public final int A00;

    public C65492wa(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        Path path = new Path();
        path.addOval((RectF) obj, Path.Direction.CW);
        path.close();
        return path;
    }
}
