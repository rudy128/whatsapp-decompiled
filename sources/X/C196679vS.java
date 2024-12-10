package X;

import android.text.TextUtils;
import java.util.AbstractMap;

/* renamed from: X.9vS  reason: invalid class name and case insensitive filesystem */
public abstract class C196679vS {
    public static Integer A01(String str, String str2) {
        AbstractMap abstractMap = (AbstractMap) AnonymousClass9U8.A00.get(str);
        if (abstractMap != null) {
            return (Integer) abstractMap.get(str2);
        }
        return null;
    }

    public static int A00(String str) {
        Integer A01;
        if (TextUtils.isEmpty(str) || !AnonymousClass9U8.A00.containsKey(str) || (A01 = A01(str, "stable_release")) == null) {
            return 1;
        }
        return A01.intValue();
    }
}
