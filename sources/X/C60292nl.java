package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.2nl  reason: invalid class name and case insensitive filesystem */
public abstract class C60292nl {
    public static void A00(View view, C29341c3 r3) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        r3.setBounds(rect);
        r3.A08(view, (FrameLayout) null);
        WeakReference weakReference = r3.A06;
        if (weakReference == null || weakReference.get() == null) {
            view.getOverlay().add(r3);
        } else {
            ((FrameLayout) weakReference.get()).setForeground(r3);
        }
    }

    public static void A01(View view, C29341c3 r3) {
        if (r3 != null) {
            WeakReference weakReference = r3.A06;
            if (weakReference == null || weakReference.get() == null) {
                view.getOverlay().remove(r3);
            } else {
                ((FrameLayout) weakReference.get()).setForeground((Drawable) null);
            }
        }
    }
}
