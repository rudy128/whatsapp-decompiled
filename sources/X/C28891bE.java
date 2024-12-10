package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: X.1bE  reason: invalid class name and case insensitive filesystem */
public abstract class C28891bE {
    public static final float A00(Context context) {
        C18070vi.A0d(context, 0);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130968628, typedValue, true)) {
            return TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attribute ");
        sb.append(2130968628);
        sb.append(" could not be resolved");
        throw new Resources.NotFoundException(sb.toString());
    }
}
