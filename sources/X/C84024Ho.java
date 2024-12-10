package X;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: X.4Ho  reason: invalid class name and case insensitive filesystem */
public abstract class C84024Ho {
    public static final int A00(Context context, C63312sr r5) {
        C18070vi.A0d(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130970023, typedValue, true);
        int[] intArray = context.getResources().getIntArray(typedValue.resourceId);
        C18070vi.A0X(intArray);
        return intArray[r5.A00 % intArray.length];
    }
}
