package X;

import android.graphics.Typeface;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1zm  reason: invalid class name and case insensitive filesystem */
public abstract class C43421zm {
    public static final Map A00 = new LinkedHashMap();

    public static final void A04(TextView textView) {
        C18070vi.A0d(textView, 0);
        textView.getContext();
        textView.setTypeface(A03(), 0);
    }

    public static final Typeface A00() {
        Map map = A00;
        Object obj = map.get("sans_serif_bold");
        if (obj == null) {
            obj = Typeface.create(A01(), 1);
            C18070vi.A0X(obj);
            map.put("sans_serif_bold", obj);
        }
        return (Typeface) obj;
    }

    public static final Typeface A01() {
        Map map = A00;
        Object obj = map.get("sans_serif");
        if (obj == null) {
            obj = Typeface.SANS_SERIF;
            if (obj == null) {
                obj = Typeface.create("sans-serif", 0);
            }
            C18070vi.A0b(obj);
            map.put("sans_serif", obj);
        }
        return (Typeface) obj;
    }

    public static final Typeface A02() {
        Map map = A00;
        Object obj = map.get("sans_serif_light");
        if (obj == null) {
            obj = Typeface.create("sans-serif-light", 0);
            C18070vi.A0b(obj);
            map.put("sans_serif_light", obj);
        }
        return (Typeface) obj;
    }

    public static final Typeface A03() {
        Map map = A00;
        Object obj = map.get("sans_serif_medium");
        if (obj == null) {
            obj = Typeface.create("sans-serif-medium", 0);
            C18070vi.A0b(obj);
            map.put("sans_serif_medium", obj);
        }
        return (Typeface) obj;
    }
}
