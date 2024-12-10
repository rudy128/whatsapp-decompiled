package X;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: X.6VZ  reason: invalid class name */
public abstract class AnonymousClass6VZ {
    public static final int A00(Context context, int i) {
        C18070vi.A0d(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            return typedValue.data;
        }
        return C19740yt.A00(context, i2);
    }
}
