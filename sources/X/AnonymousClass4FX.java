package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.4FX  reason: invalid class name */
public abstract class AnonymousClass4FX {
    public static final void A00(Bundle bundle, String str, String str2, Object[] objArr) {
        int length;
        int A0h;
        if (objArr != null && (length = objArr.length) != 0) {
            ArrayList A0z = C17880vN.A0z(length);
            ArrayList A0z2 = C17880vN.A0z(length);
            int i = 0;
            do {
                Object obj = objArr[i];
                C18070vi.A0d(obj, 0);
                if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
                    A0h = C17880vN.A0h();
                } else {
                    A0h = 2;
                }
                A0z2.add(A0h);
                A0z.add(obj.toString());
                i++;
            } while (i < length);
            bundle.putStringArrayList(str, A0z);
            bundle.putIntegerArrayList(str2, A0z2);
        }
    }
}
