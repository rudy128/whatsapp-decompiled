package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1YU  reason: invalid class name */
public abstract class AnonymousClass1YU {
    public static PorterDuff.Mode A01(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static ViewGroup A02(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static float A00(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.1bj] */
    public static void A03(View view, C29151bh r6) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        ? obj = new Object();
        obj.A02 = paddingStart;
        obj.A03 = paddingTop;
        obj.A01 = paddingEnd;
        obj.A00 = paddingBottom;
        AnonymousClass1HF.A0h(view, new C64912vX(r6, obj));
        if (view.isAttachedToWindow()) {
            AnonymousClass1HF.A0U(view);
        } else {
            view.addOnAttachStateChangeListener(new C29181bk());
        }
    }
}
