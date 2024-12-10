package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.Coh  reason: case insensitive filesystem */
public abstract class C25923Coh {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final ThreadLocal A01 = new ThreadLocal();

    public static void A01(Rect rect, View view, ViewGroup viewGroup) {
        ThreadLocal threadLocal = A00;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = C108945cZ.A0J();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        A00(matrix, view, viewGroup);
        ThreadLocal threadLocal2 = A01;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = AnonymousClass3MW.A08();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void A00(Matrix matrix, View view, ViewParent viewParent) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            A00(matrix, view2, viewParent);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
