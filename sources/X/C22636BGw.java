package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BGw  reason: case insensitive filesystem */
public class C22636BGw extends Property {
    public static final Property A00 = new Property(Float.class, "childrenAlpha");

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        Object tag = ((View) obj).getTag(2131432823);
        if (tag == null) {
            return Float.valueOf(1.0f);
        }
        return tag;
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Number number = (Number) obj2;
        float floatValue = number.floatValue();
        viewGroup.setTag(2131432823, number);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
