package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.CoD  reason: case insensitive filesystem */
public abstract class C25901CoD {
    public static final Handler A00 = new C22613BFt(Looper.getMainLooper());

    public static GradientDrawable A00(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof GradientDrawable) {
                return (GradientDrawable) drawable;
            }
            if (drawable instanceof ScaleDrawable) {
                return A00(((ScaleDrawable) drawable).getDrawable());
            }
            if ((drawable instanceof StateListDrawable) && drawable.getConstantState() != null) {
                DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
                for (int i = 0; i < drawableContainerState.getChildCount(); i++) {
                    GradientDrawable A002 = A00(drawableContainerState.getChild(i));
                    if (A002 != null) {
                        return A002;
                    }
                }
            }
        }
        return null;
    }

    public static void A01(CUL cul, int i) {
        GradientDrawable gradientDrawable = cul.A09;
        if (gradientDrawable != null && cul.A0A != null && cul.A0B != null) {
            gradientDrawable.setSize(-1, i);
            cul.A0A.setSize(-1, i);
            cul.A0B.setSize(-1, i);
        }
    }
}
