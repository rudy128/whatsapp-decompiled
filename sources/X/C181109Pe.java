package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.9Pe  reason: invalid class name and case insensitive filesystem */
public abstract class C181109Pe {
    public static Object A00(Object obj, int i, boolean z) {
        if (obj != null) {
            boolean z2 = false;
            if (i != 1) {
                if (i == 2) {
                    return AnonymousClass8BT.A0o((Number) obj);
                }
                if (i == 3) {
                    return Float.valueOf(AnonymousClass000.A04(obj));
                }
                if (i != 4) {
                    if (i != 5) {
                        Log.d("Whatsapp", AnonymousClass001.A1I("BloksFieldStatParser/parseValue/unknown type/type=", AnonymousClass000.A10(), i));
                        return null;
                    }
                    String str = (String) obj;
                    if (str != null) {
                        String[] split = TextUtils.split(str, "\\|");
                        int length = split.length;
                        if (length != 2) {
                            Log.d("Whatsapp", AnonymousClass001.A1I("BloksFieldStatParser/parseValue/invalid enum format/length=", AnonymousClass000.A10(), length));
                            return null;
                        } else if (z) {
                            return split[1];
                        } else {
                            return Integer.valueOf(C196539vE.A00(split[0]));
                        }
                    }
                }
            } else if (!(obj instanceof Boolean)) {
                if (1 == AnonymousClass000.A0M(obj)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
            return obj;
        }
        return null;
    }
}
