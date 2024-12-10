package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.1z7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C43021z7 implements C43011z6 {
    public final Object apply(Object obj) {
        Path path = new Path();
        path.addOval((RectF) obj, Path.Direction.CW);
        path.close();
        return path;
    }
}
