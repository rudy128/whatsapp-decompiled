package X;

import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.CtZ  reason: case insensitive filesystem */
public class C26161CtZ {
    public static Bundle A00(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            return bundle.deepCopy();
        }
        Parcel obtain = Parcel.obtain();
        try {
            int dataPosition = obtain.dataPosition();
            obtain.writeBundle(bundle);
            obtain.setDataPosition(dataPosition);
            Bundle A0K = BE8.A0K(obtain, C26161CtZ.class);
            C199610h.A04(A0K);
            return A0K;
        } finally {
            obtain.recycle();
        }
    }

    public static void A02(Class cls, Object obj, String str) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Expecting: ");
            A10.append(cls);
            A10.append(" under key ");
            A10.append(str);
            throw AnonymousClass8BX.A0V(cls2, " but was: ", A10);
        }
    }

    public static void A03(String str, Bundle bundle) {
        Class<byte[]> cls = byte[].class;
        Object obj = bundle.get(str);
        if (obj != null) {
            A02(cls, obj, str);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Missing required key: ");
        throw AnonymousClass001.A12(str, A10);
    }

    public static void A01(BaseBundle baseBundle, Class cls, String str) {
        A02(cls, baseBundle.get(str), str);
    }
}
