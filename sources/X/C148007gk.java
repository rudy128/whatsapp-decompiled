package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.7gk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148007gk extends AnonymousClass1JJ implements C22821Di {
    public static final C148007gk A00 = new C148007gk();

    public C148007gk() {
        super(1, AnonymousClass204.class, "getOvalPath", "getOvalPath(Landroid/graphics/RectF;)Landroid/graphics/Path;", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Path path = new Path();
        path.addOval((RectF) obj, Path.Direction.CW);
        path.close();
        return path;
    }
}
