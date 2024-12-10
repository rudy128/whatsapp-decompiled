package X;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.053  reason: invalid class name */
public class AnonymousClass053 extends Property {
    public AnonymousClass053() {
        super(Float.class, "thumbPos");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).mThumbPosition);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).setThumbPosition(AnonymousClass000.A04(obj2));
    }
}
