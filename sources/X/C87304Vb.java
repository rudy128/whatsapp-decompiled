package X;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.4Vb  reason: invalid class name and case insensitive filesystem */
public abstract class C87304Vb {
    public static Object A00(Intent intent, Class cls, String str) {
        return intent.getParcelableExtra(str, cls);
    }

    public static ArrayList A01(Intent intent, Class cls, String str) {
        return intent.getParcelableArrayListExtra(str, cls);
    }
}
