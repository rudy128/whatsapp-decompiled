package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: X.1YG  reason: invalid class name */
public abstract class AnonymousClass1YG {
    public static void A01(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i) {
        View view2 = view;
        int[] iArr2 = iArr;
        view2.saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArray, i, 0);
    }

    public static View.AccessibilityDelegate A00(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void A02(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }
}
