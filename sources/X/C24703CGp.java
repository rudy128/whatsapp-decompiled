package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import java.util.List;

/* renamed from: X.CGp  reason: case insensitive filesystem */
public abstract class C24703CGp {
    public static List A00;
    public static List A01;

    public static void A00(Canvas canvas, Paint paint, Path path, Layout layout) {
        Path path2 = path;
        if (path != null) {
            if (A01 == null) {
                A01 = AnonymousClass000.A13();
            }
            if (A00 == null) {
                A00 = AnonymousClass000.A13();
            }
        }
        Layout layout2 = layout;
        layout2.draw(canvas, A01, A00, path2, paint, 0);
    }
}
