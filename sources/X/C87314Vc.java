package X;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.4Vc  reason: invalid class name and case insensitive filesystem */
public abstract class C87314Vc {
    public static Object A00(Intent intent, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C87304Vb.A00(intent, cls, str);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (!cls.isInstance(parcelableExtra)) {
            return null;
        }
        return parcelableExtra;
    }

    public static ArrayList A01(Intent intent, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C87304Vb.A01(intent, cls, str);
        }
        return intent.getParcelableArrayListExtra(str);
    }
}
