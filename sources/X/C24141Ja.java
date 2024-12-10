package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.1Ja  reason: invalid class name and case insensitive filesystem */
public abstract class C24141Ja {
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C60212na.A00(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (!cls.isInstance(parcelable)) {
            return null;
        }
        return parcelable;
    }

    public static ArrayList A01(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C60212na.A01(bundle, cls, str);
        }
        return bundle.getParcelableArrayList(str);
    }
}
