package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.2wb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65502wb implements C43011z6 {
    public final /* synthetic */ float A00;

    public final Object apply(Object obj) {
        RectF rectF = (RectF) obj;
        if (this.A00 == -2.14748365E9f) {
            return AnonymousClass204.A07(rectF);
        }
        Path path = new Path();
        path.addOval(rectF, Path.Direction.CW);
        path.close();
        return path;
    }

    public /* synthetic */ C65502wb(float f) {
        this.A00 = f;
    }
}
