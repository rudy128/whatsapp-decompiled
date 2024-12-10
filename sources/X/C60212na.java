package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.2na  reason: invalid class name and case insensitive filesystem */
public abstract class C60212na {
    public static Object A00(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList A01(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArrayList(str, cls);
    }
}
